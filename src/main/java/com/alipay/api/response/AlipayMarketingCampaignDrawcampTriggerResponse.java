package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 14:15:00
 */
public class AlipayMarketingCampaignDrawcampTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 7623292678927731398L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动流水id
	 */
	@ApiField("camp_log_id")
	private String campLogId;

	/** 
	 * logonId的脱敏显示
	 */
	@ApiField("display_name")
	private String displayName;

	/** 
	 * 拓展字段, 常用key有: prize_amount(奖品金额,单位为元); prize_type(奖品类型); mobile_send_flag(拉新活动发放凭证标识，标识为true且接口返回错误码CERTIFICATE_SEND_SUCCESS时，表示新用户发凭证成功，引导用户使用该手机号注册支付宝账号); errorMsg(错误信息描述); errorMsgType(错误信息类型，包括：CAMP_NOT_VALID--活动未生效，FREQ_OR_COUNT_LIMIT--频率或次数超限，RULE_NOT_PASS--规则未通过，NOT_WIN--未中奖); ruleErrorCode(规则验证不通过的错误码，值为AE0111709606 且返回的errorMsg为“00005000-规则中心规则不通过”时，表示用户已领取过奖品)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 奖品唯一标识
	 */
	@ApiField("prize_flag")
	private String prizeFlag;

	/** 
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/** 
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/** 
	 * 是否中奖结果状态，如果为true时返回的结果中的其他字段非空，否则返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setCampLogId(String campLogId) {
		this.campLogId = campLogId;
	}
	public String getCampLogId( ) {
		return this.campLogId;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDisplayName( ) {
		return this.displayName;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setPrizeFlag(String prizeFlag) {
		this.prizeFlag = prizeFlag;
	}
	public String getPrizeFlag( ) {
		return this.prizeFlag;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeName( ) {
		return this.prizeName;
	}

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
