/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author zhanggm
 */
@Data
@NoArgsConstructor
public class LoanPageExt extends Loan{
    
    private String loanRequestSerial;
    private String userId;
    private String loginName;
    private String purposeKey;
    private String methodKey;
    private String durationStr;
    private boolean enableAdvanceRepay;
    public LoanPageExt(Loan loan,String loginName,boolean enableAdvanceRepay){
        super.setId(loan.getId());
        super.setTitle(loan.getTitle());
        super.setBidNumber(loan.getBidNumber());
        super.setAmount(loan.getAmount());
        super.setRate(loan.getRate());
        this.loanRequestSerial = loan.getLoanRequest().getSerial();
        this.userId = loan.getLoanRequest().getUserId();
        this.loginName = loginName;
        this.purposeKey = loan.getLoanRequest().getPurpose().getKey();
        this.methodKey = loan.getMethod().getKey();
        this.durationStr = Duration.getChaDuration(loan.getDuration());
        this.enableAdvanceRepay = enableAdvanceRepay;
    }
    
}