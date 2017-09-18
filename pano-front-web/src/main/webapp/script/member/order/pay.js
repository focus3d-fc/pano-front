$(function(){
	$("#deleteBankcard").click(function(){
		var bankCardSn = $("#user_bankcard_sn").val();
		if(bankCardSn){
			$.ajax({
				type: 'get',
				async: false,
				data: {
					bankCardSn : bankCardSn
				},
				url: '/bankCard/delete',
				dataType: 'json',
				success: function (data) {
					
				},
				error:function(xhr,textStatus){
					
				}
			});
		}
		$("#user_bankcard_username").val("");
		$("#user_bankcard_certno").val("");
		$("#user_bankcard_cartno").val("");
		$("#user_bankcard_sn").val("");
	});
});