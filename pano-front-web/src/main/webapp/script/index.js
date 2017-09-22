var userPicker;
$(function(){
	
	$("a[id^='ad_']").click(function(){
		var lk = $(this).attr("lk");
		if(lk){
			window.location.href = lk;
		}
	});
	
	$(document).click(function(e){
		if(e.target.id != "showProjectPicker"){
			userPicker.hide();
		}
	});
	
	resizeSlider();
	
	$(function(){
		var mySwiper = new Swiper ('#guidSwiper', {
			loop: false,
			autoplay: 0
		});
	});
	
	$(window).resize(function() {
		setTimeout("resizeSlider()", 500);
	});
	
	$("#lastGuidImg").click(function(){
		$("#indexContent").show();
		$("#guidSwiper").hide();
		var mySwiper = new Swiper ('.swiper-container', {
			autoplay: 5000,//可选选项，自动滑动
			loop: true,
			pagination: '.swiper-pagination',
		})
		/*$.ajax({
		    url: panoDomain + "/shopcart/add",
		    type:'GET',
		    async:false,
		    timeout:5000,
		    dataType: "json",
		    data:{
		    	packageEncryptSn : packageSn
		    },
		    success:function(data){
		    	$("#indexContent").show();
				$("#guidSwiper").hide();
		    },
		    error:function(xhr,textStatus){
		    	
		    }
		});*/
	});
});

function resizeSlider(){
	var winW = $(window).width();
	var winH = $(window).height();
	$("#guidSwiper").css("position", "absolute");
	$("#guidSwiper").height(winH);
	$("#guidSwiper").width(winW);
	$("#guidSwiper").css("left", 0);
	$("#guidSwiper").css("top", 0);
	$("#guidSwiper img").attr("height", winH + " !important")
	$("#guidSwiper img").attr("width", winW + " !important")
}

(function($, doc, jquery) {
		$.init({
			  gestureConfig:{
				   tap: true, //默认为true
				   doubletap: true, //默认为false
				   longtap: true, //默认为false
				   swipe: true, //默认为true
				   drag: true, //默认为true
				   hold:false,//默认为false，不监听
				   release:false//默认为false，不监听
				  }
				});
		$.ready(function() {
			var _getParam = function(obj, param) {
				return obj[param] || '';
			};
			//普通示例
			userPicker = new $.PopPicker({
				layer : 4
			});
			var projectSelectData = jquery('#projectSelectData').text();
			userPicker.setData(JSON.parse(projectSelectData));
			var showProjectPickerButton = doc.getElementById('showProjectPicker');
			//var userResult = doc.getElementById('sexResult');
			var projectResultValue = doc.getElementById('projectResultValue');
			var formObj = jquery("form");
			showProjectPickerButton.addEventListener('tap', function(event) {
				if(jQuery("#projectName")){
					jQuery("#projectName").remove();
				}
				var items = userPicker.getSelectedItems();
				var projectName = _getParam(items[3], 'text');
				jQuery("<div id='projectName'>" + projectName + "</div>").insertAfter(jQuery(".mui-poppicker-btn-cancel"));
				
				userPicker.show(function(items) {
					projectResultValue.value = _getParam(items[3], 'value');
					formObj.submit();
				});
			}, false);
			
			
			doc.addEventListener('swipe', function(event) {
				if(jQuery("#projectName")){
					jQuery("#projectName").remove();
				}
				var items = userPicker.getSelectedItems();
				var projectName = _getParam(items[3], 'text');
				jQuery("<div id='projectName'>" + projectName + "</div>").insertAfter(jQuery(".mui-poppicker-btn-cancel"));
			});
		});
	})(mui, document, jQuery);
	