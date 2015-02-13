/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
public class NetSaveRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @Size(max = 6)
    private String GateBusiId;

    /**
     * 当 GateBusiId =QP--快捷支付时有效
     * 
     * 若不为空,则快捷绑卡页面不需要再填银行卡号
     * 若为空,则快捷绑卡页面需要填银行卡号银行
     */
    @Size(max = 32)
    private String OpenAcctId;
    
    @Size(max = 8)
    private String OpenBankId;

    @NotNull
    private String DcFlag;

    @NotNull
    private String TransAmt;

    @PnRReturnURL
    private String RetUrl;

    @NotNull
    @PnRReturnURL
    private String BgRetUrl;

    public NetSaveRequest() {
    }

    public NetSaveRequest(String MerCustId,
                          String UsrCustId,
                          String OrdId,
                          String OrdDate,
                          String GateBusiId,
                          String OpenBankId,
                          String DcFlag,
                          String TransAmt,
                          String RetUrl,
                          String BgRetUrl) {
        super(PnRConstant.Version, CmdIdType.NetSave, MerCustId);
        this.UsrCustId = UsrCustId;
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.GateBusiId = GateBusiId;
        this.OpenBankId = OpenBankId;
        this.DcFlag = DcFlag;
        this.TransAmt = TransAmt;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getGateBusiId()))
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getDcFlag()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getGateBusiId() {
        return GateBusiId;
    }

    public void setGateBusiId(String GateBusiId) {
        this.GateBusiId = GateBusiId;
    }

    public String getOpenBankId() {
        return OpenBankId;
    }

    public void setOpenBankId(String OpenBankId) {
        this.OpenBankId = OpenBankId;
    }

    public String getDcFlag() {
        return DcFlag;
    }

    public void setDcFlag(String DcFlag) {
        this.DcFlag = DcFlag;
    }

    public String getTransAmt() {
        return TransAmt;
    }

    public void setTransAmt(String TransAmt) {
        this.TransAmt = TransAmt;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public void setOpenAcctId(String OpenAcctId) {
        this.OpenAcctId = OpenAcctId;
    }
    
    
}
