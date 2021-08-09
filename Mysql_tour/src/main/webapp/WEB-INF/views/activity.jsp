<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title> 액티비티 </title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/x-icon"
	href="resources/img/favicon.ico">
<!-- CSS here -->
<link rel="stylesheet" href="resources/css/search.css">
<link rel="stylesheet" href="resources/css/blog.css">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/owl.carousel.min.css">
<link rel="stylesheet" href="resources/css/slicknav.css">
<link rel="stylesheet" href="resources/css/animate.min.css">
<link rel="stylesheet" href="resources/css/magnific-popup.css">
<link rel="stylesheet" href="resources/css/fontawesome-all.min.css">
<link rel="stylesheet" href="resources/css/themify-icons.css">
<link rel="stylesheet" href="resources/css/themify-icons.css">
<link rel="stylesheet" href="resources/css/slick.css">
<link rel="stylesheet" href="resources/css/nice-select.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/responsive.css">
<style>
. img {
    height: 300px !important;
}


</style>
		
		
		
		

	<script>
	var start = false; // on, off
	var check = false; // start check
	var url = document.location.href.split('?start=');
	if(url[1]){
	   start = true;
	   check = true;
	}
	var i = -1;
	var j = -1;
	var a = 0;
	var b = 0;
	var MAX_NUM = 9;

	var flag = false; // 어느 메뉴인지 판단
	var flag1 = false; // Enter키 사용 유무
	var flag2 = false; // Enter키 눌렀을시 ESC를 제외한 키 작동 X
	var flag3 = false;

	var select = new Audio('resources/sounds/선택하시겠습니까_.mp3')
	var cancel = new Audio('resources/sounds/취소하셨습니다.mp3')
	var starts = new Audio('resources/sounds/기능을+시작합니다.mp3')
	var stop = new Audio('resources/sounds/기능을+종료합니다.mp3')
	
	var audioFile = [
	      new Audio('resources/sounds/숙소.mp3'), 
	      new Audio('resources/sounds/인기+Top+eight.mp3'), // 추가
	      new Audio('resources/sounds/인스타그램+인기순위.mp3'), // 추가
	      new Audio('resources/sounds/맛집.mp3'),
	      new Audio('resources/sounds/액티비티.mp3')
	]

	var audioFile1 = [
	   new Audio('resources/sounds/대둔산짚핑_가격+오만오천원.mp3'),
	   new Audio('resources/sounds/대천짚라인_가격+만팔천원.mp3'),
	   new Audio('resources/sounds/영인산자연휴양림_가격+만원.mp3'),
	   new Audio('resources/sounds/강경수상레저_가격+웨이크+보드+체험+삼만원.mp3'),
	   
	   
	   new Audio('resources/sounds/해양레저체험교실_가격+플라이보드+육만원.mp3'),
	   new Audio('resources/sounds/천안케이블워터파크_가격+주말+한시간+사만원.mp3'),
	   new Audio('resources/sounds/스카이바이크_가격+이인+이만이천원+.mp3'),
	   new Audio('resources/sounds/대천레일바이크_가격+일인+이만원.mp3'),
	   
	   new Audio('resources/sounds/아산레일바이크_가격+이인승+이만오천원.mp3')
	]

	window.addEventListener("keydown", (e) => {
		  const key = document.getElementById(e.key);
		  
		  if(start){
		  if(!flag2){
		  if(e.key == "1"){ 
		     flag = false;
		     flag3 = true;
			 
		     console.log(i);
		     if (key) {
		        i++;
		        if (i <= 4){
		        	if(j != -1){
		        	audioFile1[j].pause();
		        	audioFile1[j].currentTime = 0;
		        	}
		        	key.classList.add(audioFile[i].play());
		        }
		           
		        if (i == 5){
		        	if(j != -1){
		        	audioFile1[j].pause();
		        	audioFile1[j].currentTime = 0;
		        	}
		           i = 0;
		           key.classList.add(audioFile[i].play());
		        }
		        else
		           i = 0;
		     }
		  }
		  else if(e.key == "2"){
		     flag = false;
		     flag3 = true;
		     if(key){
		        	i--;
		        if(i == -2 || i == -1){
		        	if(j != -1){
		        	audioFile1[j].pause();
		        	audioFile1[j].currentTime = 0;
		        	}
		           i = 4;
		           key.classList.add(audioFile[i].play());
		        }
		        if(i >= 0){
		        	if(j != -1){
		        	audioFile1[j].pause();
		        	audioFile1[j].currentTime = 0;
		        	}
		           key.classList.add(audioFile[i].play());
		        }
		     }
		  }
		  else if(e.key == "q"){ 
			     flag = true;
			     flag3 = false;
			     if (key) {
			        j++;
			        console.log(j);
			        if (j <= MAX_NUM - 1){
			        	if(j != 0){
				        	audioFile1[j-1].pause();
				        	audioFile1[j-1].currentTime = 0;
				        }
			           key.classList.add(audioFile1[j].play());
			        }
			        if (j == MAX_NUM){
			        	 audioFile1[j-1].pause();
				           audioFile1[j-1].currentTime = 0;
			           j = 0;
			           key.classList.add(audioFile1[j].play());
			        }
			        else
			           j = 0;
			     }
			  }
			  else if(e.key == "w"){
			     flag = true;
			     flag3 = false;
			     if(key){
			        	j--;
			        if(j == -2 || j == -1){
			        	if(j != -2){
			        	audioFile1[j+1].pause();
			        	audioFile1[j+1].currentTime = 0;
			        	}
			           j = MAX_NUM - 1;
			           key.classList.add(audioFile1[j].play());
			        }
			        if(j >= 0){
			        	audioFile1[j+1].pause();
			        	audioFile1[j+1].currentTime = 0;
			           key.classList.add(audioFile1[j].play());
			        }
			     }
			  }
			  }
		  
		  if(flag3){
			  if(e.key == "Enter"){
				     console.log(flag);
				     if(key){
				        if (a == 0){
				           flag1 = true;
				           flag2 = true;
				           a++;
				           if(j != -1){
				           audioFile1[j].pause();
				        	audioFile1[j].currentTime = 0;
				           }
				              key.classList.add(select.play()); // 선택하시겠습니까?
				        }
				        if (a == 1){
				           move();
				        }
				     }
				  }
			  else if(e.key == "Escape"){
				  
			     if(key){
			        if(flag1){
			           flag1 = false;
			           flag2 = false;
			           a = 0;
			           if(j != -1){
			           audioFile1[j].pause();
			        	audioFile1[j].currentTime = 0;
			           }
			           key.classList.add(cancel.play()); // 취소하셨습니다.
			        }
			     }
			  }
		  }
		  
		  
		  if(check){
		  if(e.key == "F2"){
			  if(j != -1){
				  audioFile1[j].pause();
			      audioFile1[j].currentTime = 0;
				  }
		     check = false;
		     i = -1;
		     j = -1;
		     history.replaceState({}, null, location.pathname);
		     if(key) {
		    	 start = false;
		     	key.classList.add(stop.play()); // 기능을 종료합니다.
		  	}
		  }
		  }
		  
		  }
		  if (!check){
		  if(e.key == "F2"){
		        check = true;
		     if(key) {
		    	 start = true;
		     key.classList.add(starts.play()); // 기능을 시작합니다.
		     }
		  }
		  }
		});
	
	function move(){
	   console.log(flag);
	   if(!flag){
	      
	   if (i == 0)
	      location.href = "/ROOT/stay?start="  + start
	   else if (i == 1)
	      location.href = "/ROOT/popular?start="  + start
	   else if (i == 2)
	      location.href = "/ROOT/instagram?start="  + start
	   else if (i == 3)
	      location.href = "/ROOT/food?start="  + start
	   else if (i == 4)
	      location.href = "/ROOT/activity?start="  + start
	   }

	}
 </script>
</head>

<body>
	<!-- Preloader Start -->
	<div id="preloader-active">
		<div
			class="preloader d-flex align-items-center justify-content-center">
			<div class="preloader-inner position-relative">
				<div class="preloader-circle"></div>
				<div class="preloader-img pere-text">
					<img src="resources/img/logo/loder.jpg" alt="">
				</div>
			</div>
		</div>
	</div>
	<!-- Preloader Start -->
  <header>
  
   		<div id="1"></div>
		<div id="2"></div>
		<div id="3"></div>
		<div id="q"></div>
		<div id="w"></div>
		<div id="Enter"></div>
		<div id="Escape"></div>
		<div id="F2"></div>
		
		<!-- Header Start -->
		<div class="header-area header-transparent">
			<div class="main-header">
				<div class="header-bottom  header-sticky">
					<div class="container-fluid">
						<div class="row align-items-center">
							<!-- Logo -->
							<div class="col-xl-2 col-lg-2 col-md-1">
								<div class="logo">
									<a class="logo" href="${pageContext.request.contextPath}/home"> # TRIP </a>
								</div>
							</div>
							<div class="col-xl-10 col-lg-10 col-md-8">
								<!-- Main-menu -->
								<div class="main-menu d-none d-lg-block">
									<nav>
										<ul id="navigation">
											<li><a href="${pageContext.request.contextPath}/tourmap"> <i
													class="fas fa-map-marker-alt"></i> 관광지도
											</a></li>
											<li><a href="${pageContext.request.contextPath}/stay"> <i class="fas fa-home"></i> 숙소
											</a></li>
											<li><a href="#"> <i class="fas fa-map-signs"></i>
													관광코스
											</a>
												<ul class="submenu">
													<li><a href="${pageContext.request.contextPath}/contact">태안</a></li>
													<li><a href="${pageContext.request.contextPath}/contact1">아산</a></li>
													<li><a href="${pageContext.request.contextPath}/contact2">천안</a></li>
													<li><a href="${pageContext.request.contextPath}/contact3">공주</a></li>
													<li><a href="${pageContext.request.contextPath}/contact4">부여</a></li>
													<li><a href="${pageContext.request.contextPath}/contact5">보령</a></li>
												</ul></li>

											<li><a href="#"> <i class="fas fa-heart"></i> 인기 관광지
											</a>
												<ul class="submenu">
													<li><a href="${pageContext.request.contextPath}/popular">인기 Top8</a></li>
													<li><a href="${pageContext.request.contextPath}/blog2">인스타그램 인기</a></li>
												</ul></li>
											<li><a href="${pageContext.request.contextPath}/food"> <i class="fas fa-utensils"></i>
													맛집
											</a></li>
											<li><a href="${pageContext.request.contextPath}/activity"> <i class="fas fa-child"></i>
													액티비티
											</a></li>
											<security:authorize access="!isAuthenticated()">
												<li class="add-list"><a
													href="${pageContext.request.contextPath}/user/login">
														Sign in </a></li>
											</security:authorize>
											
											<security:authorize access="isAuthenticated()">
											<security:authorize access="hasAuthority('admin')">
												<li class="add-list"><a href="#"> My Page</a>
												<ul class="submenu">
													<li><a href="${pageContext.request.contextPath}/mymap">My place</a></li>
													<li><a href="${pageContext.request.contextPath}/user/admin_user">회원 관리</a></li>
													<li><a href="${pageContext.request.contextPath}/user/content_list">게시글 관리</a></li>
													<li><a href="${pageContext.request.contextPath}/user/logout">Logout</a></li>
												</ul></li>
											</security:authorize>
											<security:authorize access="hasAuthority('user')">
												<li class="add-list"><a href="#"> My Page</a>
												<ul class="submenu">
													<li><a href="${pageContext.request.contextPath}/mymap">My place</a></li>
													<li><a href="${pageContext.request.contextPath}/user/myreply">내 댓글 확인</a></li>
													<li><a href="${pageContext.request.contextPath}/user/myinfo">내 정보 수정</a></li>
													<li><a href="${pageContext.request.contextPath}/user/logout">Logout</a></li>
												</ul></li>
											</security:authorize>
											</security:authorize>
										</ul>

									</nav>
								</div>
							</div>
							<!-- Mobile Menu -->
							<div class="col-12">
								<div class="mobile_menu d-block d-lg-none"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Header End -->
	</header>
	
	<main>

		<!-- Hero Start-->
		<div
			class="hero-area2  slider-height2 hero-overly2 d-flex align-items-center">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center pt-50">
							<h2> 액티비티 </h2>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--Hero End -->
		<!--================Blog Area =================-->

		<div id="contents">
			<div class="wrap_contView">
				<table>
					<tr>
						<td><a href='#레일바이크'>레일바이크</a></td>
						<td><a href='#짚라인'>짚라인</a></td>
						<td><a href='#수상스포츠'>수상스포츠</a></td>						
						<td><a href='#페러글라이딩'>패러글라이딩</a></td>
						<td><a href='#카트'>카트</a></td>
					</tr>
				</table>
			</div>
		</div>
		<br/><br/>
		
		<div class="container">
		 	 <iframe src='http://127.0.0.1:9098/ROOT/ActivityMap' width=1150px, height=600px, frameborder="0" framespacing="0" marginheight="0" marginwidth="0" scrolling="no"  vspace="0"> </iframe>
		</div>
		
		<!--================Blog Area =================-->
	     <!-- listing Area Start -->
  		<div class="listing-caption">
            <div class="container">

                <!-- listing Details Stat-->
                <div class="listing-details-area">
                    <div class="container">
                    
                        <div class="row">
             				<c:forEach var="list" items="${list}">
						<div class="section-top-border" >
							<div style="margin-left:80px;">
								<div class="col-md-8" >
									<div class="card shadow-sm" style="width:350px; height:360px;">

										<img src="${pageContext.request.contextPath}/activity_image?name=${list.name}" width="100%" height="300px" />
										<div class="card-body">

											<div class="d-flex justify-content-between align-items-center">
												<div id="${list.kate}"><small class="text-muted"># ${list.kate} </small> </div><br/>
												<small class="text-muted"># 액티비티</small> <br/>
												
											</div>
										</div>
									</div>
								</div>
								
								<div class="col-md-10 mt-sm-20" style="width:500px; height:350px;">
								
								<br/><br/>
									<h2>${list.name}</h2>
									<p>가격 : ${list.bill}</p>
									<p>${list.addr}</p>
								</div>


							</div>

						</div>

					</c:forEach>
                       </div>
                   </div>
               </div>
            </div>
        </div>






	</main>
	
		
	<br/><br/><br/><br/><br/><br/>
	<footer>
		   <!-- Footer Start-->
        <div class="footer-area">
            <div class="container">
                <div class="footer-bottom">
                    <div class="row d-flex justify-content-between align-items-center">
                        <div class="col-xl-9 col-lg-8">
                          <div class="footer-copy-right">
                        		<p>@CopyRight</p>
                        	</div> 
                        </div>
                        <div class="col-xl-3 col-lg-4">
                            <!-- Footer Social -->
                            <div class="footer-social f-right">
                                <a href="https://www.facebook.com/chungnamwhere/"><i class="fab fa-facebook-f"></i></a>
                                <a href="https://tour.chungnam.go.kr"><i class="fas fa-globe"></i></a>
                                <a href="https://www.instagram.com/chungnamtour/?hl=ko"><i class="fab fa-instagram"></i></a>
                            </div>
                        </div>
                    </div>
               </div>
            </div>
        </div>
	</footer>
	<!-- Scroll Up -->
	<div id="back-top">
		<a title="Go to Top" href="#"> <i class="fas fa-level-up-alt"></i></a>
	</div>

	<!-- JS here -->

	<!-- All JS Custom Plugins Link Here here -->
	<script src="./resources/js/vendor/modernizr-3.5.0.min.js"></script>
	<!-- Jquery, Popper, Bootstrap -->
	<script src="./resources/js/vendor/jquery-1.12.4.min.js"></script>
	<script src="./resources/js/popper.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<!-- Jquery Mobile Menu -->
	<script src="./resources/js/jquery.slicknav.min.js"></script>

	<!-- Jquery Slick , Owl-Carousel Plugins -->
	<script src="./resources/js/owl.carousel.min.js"></script>
	<script src="./resources/js/slick.min.js"></script>
	<!-- One Page, Animated-HeadLin -->
	<script src="./resources/js/wow.min.js"></script>
	<script src="./resources/js/animated.headline.js"></script>

	<!-- Nice-select, sticky -->
	<script src="./resources/js/jquery.nice-select.min.js"></script>
	<script src="./resources/js/jquery.sticky.js"></script>
	<script src="./resources/js/jquery.magnific-popup.js"></script>

	<!-- contact js -->
	<script src="./resources/js/contact.js"></script>
	<script src="./resources/js/jquery.form.js"></script>
	<script src="./resources/js/jquery.validate.min.js"></script>
	<script src="./resources/js/mail-script.js"></script>
	<script src="./resources/js/jquery.ajaxchimp.min.js"></script>

	<!-- Jquery Plugins, main Jquery -->
	<script src="./resources/js/plugins.js"></script>
	<script src="./resources/js/main.js"></script>

</body>
</html>