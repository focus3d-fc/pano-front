$(function(){
	
	$("#validateOrder").click(function(){
		submitOrder();
	});
	
	$("#submitOrder").click(function(){
		submitOrder();
	});
	
	$("#readContract").click(function(){
		$('.wrap').hide();
		$("#readContractTick").attr("status", 1);
		$("#readContractTick").attr("src", "/images/choose3.png");
	});
	
	$("#readContractTick").click(function(){
		var status = $(this).attr("status");
		if(!status || status == 0){
			$(this).attr("status", 1);
			$(this).attr("src", "/images/choose3.png");
		} else {
			$(this).attr("status", 0);
			$(this).attr("src", "/images/choose4.png");
		}
	});
});

function submitOrder(){
	var isReadContract = $("#readContractTick").attr("status");
	if(isReadContract != 1){
		alert("请阅读并同意合同条款");
	} else {
		var mobilePhone = $("#j_phone").val();
		var verifyCode = $("#verifycode").val();
		if($("#regMobile").val() == "true" || (mobilePhone && verifyCode)){
			var totalPayMoney = $("#totalPayMoney").text();
			if(totalPayMoney){
				if(parseFloat(totalPayMoney).toFixed(2) <= 0){
					alert("订单有误，请联系客服。");
				} else {
					create_order();
				}
			}
		} else {
			$('.wrap1').show();
			$("#submitOrder").removeAttr("status");
		}
	}
}