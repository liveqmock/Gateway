package com.creditcloud.chinapay.api.model.pojo.response;

import java.util.List;

import com.creditcloud.chinapay.api.model.pojo.POJO;
import com.creditcloud.chinapay.api.utils.StringUtils;

public class SinglePayQueryResult extends POJO {
	protected String code = "";// 应答信息 数字 定长，3位 000表示成功。001表示没有记录。002表示查询出错。查询频率超限也为002
	protected String merId = "";// 商户号 数字 定长，15位 同请求报文参数中商户号
	protected String merDate = "";// 商户日期 数字 定长，8位 原始订单交易日期
	protected String merSeqId = "";// 流水号 数字 变长，16位 交易记录流水号，同商户日期，商户号一起唯一标识报文中的一笔交易(merId + merDate
									// +
									// merSeqId唯一确定一条记录)
	protected String cpDate = "";// Cp日期 数字 定长，8位 ChinaPay接收到交易的日期
	protected String cpSeqId = "";// Cp流水 数字 定长，6位 ChinaPay系统内部流水
	protected String bankName = "";// 开户银行 字符 变长，50位 原始订单参数中的开户银行
	protected String cardNo = "";// 收款账号 数字 只取后5位 原始订单参数中的收款账号，仅显示后5位
	protected String usrName = "";// 收款人姓名 字符 变长，100位 原始订单参数中收款人姓名
	protected String transAmt = "";// 金额 数字 变长，12位 原始订单参数中的金额
	protected String feeAmt = "";// 手续费 数字 变长，12位 整数，以分为单位
	protected String prov = "";// 省份 字符 变长，20位 原始订单参数中的省份
	protected String city = "";// 城市 字符 变长，40位 原始订单参数中的城市
	protected String purpose = "";// 用途 字符 变长，25位 原始订单参数中的用途
	protected String stat = "";// 交易状态 数字 定长，1位 交易状态码，具体请参看附录6.1.2
	protected String backDate = "";// 退单日期 数字 定长，8位 银行退单日期
	protected String chkValue = "";// 签名值 字符 定长，256位 除了报文尾部的256位以上的都是作为签名的明文。明文需进行BASE64编码，具体见下方。

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMerDate() {
		return merDate;
	}

	public void setMerDate(String merDate) {
		this.merDate = merDate;
	}

	public String getMerSeqId() {
		return merSeqId;
	}

	public void setMerSeqId(String merSeqId) {
		this.merSeqId = merSeqId;
	}

	public String getCpDate() {
		return cpDate;
	}

	public void setCpDate(String cpDate) {
		this.cpDate = cpDate;
	}

	public String getCpSeqId() {
		return cpSeqId;
	}

	public void setCpSeqId(String cpSeqId) {
		this.cpSeqId = cpSeqId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getProv() {
		return prov;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getBackDate() {
		return backDate;
	}

	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}

	public String getChkValue() {
		return chkValue;
	}

	public void setChkValue(String chkValue) {
		this.chkValue = chkValue;
	}

	public static SinglePayQueryResult parse(String responseText) {
		final String TOKEN_DELIMITER = "\\|";
		final boolean trimToken = true;
		List<String> tokens = StringUtils.parseTokens(responseText, TOKEN_DELIMITER, trimToken);

		SinglePayQueryResult result = new SinglePayQueryResult();
		result.code = tokens.get(0);
		if (tokens.size() > 1)
			result.merId = tokens.get(1);
		if (tokens.size() > 2)
			result.merDate = tokens.get(2);
		if (tokens.size() > 3)
			result.merSeqId = tokens.get(3);
		if (tokens.size() > 4)
			result.cpDate = tokens.get(4);
		if (tokens.size() > 5)
			result.cpSeqId = tokens.get(5);
		if (tokens.size() > 6)
			result.bankName = tokens.get(6);
		if (tokens.size() > 7)
			result.cardNo = tokens.get(7);
		if (tokens.size() > 8)
			result.usrName = tokens.get(8);
		if (tokens.size() > 9)
			result.transAmt = tokens.get(9);
		if (tokens.size() > 10)
			result.feeAmt = tokens.get(10);
		if (tokens.size() > 11)
			result.prov = tokens.get(11);
		if (tokens.size() > 12)
			result.city = tokens.get(12);
		if (tokens.size() > 13)
			result.purpose = tokens.get(13);
		if (tokens.size() > 14)
			result.stat = tokens.get(14);
		if (tokens.size() > 15)
			result.backDate = tokens.get(15);
		return result;
	}
}