package com.example.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Food;
import com.example.entity.Reply;
import com.example.entity.Stay;
import com.example.repository.ReplyRepository;
import com.example.repository.StayRepository;

@Controller
@RequestMapping(value="/")
public class StayController {
	
	@Autowired(required = false)
	private StayRepository sRepository;
	
	@Autowired(required = false)
	private ReplyRepository rRepository;
	
	@RequestMapping(value="/stay")
	public String stayGET(Model model) {
		List<Stay> vo  = sRepository.findAll();
		model.addAttribute("vo", vo);
		
		return "Stay/stay";
	}
	
	// 카테고리별 숙박업소 list
	@RequestMapping(value="/staykate_list")
	public String StayKatelistGET(Model model, @RequestParam(value="name") String name) {
		List<Stay> stay = sRepository.findByKate(name);
		
		for(Stay vo : stay) {
			if(vo.getImage() != null) {
				String tmp = Base64.getEncoder().encodeToString(vo.getImage());
				vo.setBase64(tmp);
				vo.setImage(null);
			}
		}
		model.addAttribute("stay", stay);
		return "Stay/staykate_list";
	}

	
	@RequestMapping(value="/stay_details")
	public String staydetailGET(Model model, @RequestParam(value="id") Integer id) {
		Optional<Stay> staylist = sRepository.findById(id);
//		List<Reply> replylist = rRepository.findById(id);
//		int cntReply = rRepository.countByName(name);
//		
		model.addAttribute("staylist" , staylist);
		System.out.println("test : " + staylist.get().getName());
//		model.addAttribute("replylist", replylist);
//		model.addAttribute("cntReply", cntReply);
		
		return "Stay/stay_details";
	}
	
	@RequestMapping(value="/stay_details", method = RequestMethod.POST)
	public String staydetailPOST(
			@RequestParam(value="reply") String reply,
			HttpServletResponse response,
			Authentication auth,
			@RequestParam(value = "id", defaultValue = "", required = false) Integer id) throws IOException {
		
		try {
			User user = (User) auth.getPrincipal();
			if(user!=null) {
//				String id = user.getUsername();
				
				Optional<Stay> staylist = sRepository.findById(id);
				// 저장할 댓글에 필요한건 로그인된 userid, 게시글 name, 댓글 reply 정보.
				Reply vo = new Reply();
//				vo.setStay(stay_name);
				vo.setReply(reply);

				rRepository.save(vo);
			}
		}
		catch(Exception e){
			
			String str = "<script>alert('로그인 후 이용해주세요.'); location.href='http://127.0.0.1:9098/ROOT/stay_details?id="+  id +"'</script>";
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(str);
			out.flush();
			return "redirect:/stay_details?id="+ id;
		}
		return "redirect:/stay_details?id="+ id;
	}
}
