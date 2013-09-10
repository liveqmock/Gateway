/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import java.math.BigDecimal;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 用户资金
 *
 * @author rooseek
 */
public class UserFund extends BaseObject {

    @Id
    private final String userId;

    /**
     * 可用余额
     */
    @NotNull
    @Min(0)
    private final BigDecimal availableAmount;

    /**
     * 冻结金额
     */
    @NotNull
    @Min(0)
    private final BigDecimal frozenAmount;

    /**
     * 待收总额
     */
    @NotNull
    @Min(0)
    private final BigDecimal dueInAmount;

    /**
     * 待还总额
     */
    @NotNull
    @Min(0)
    private final BigDecimal dueOutAmount;

    /**
     * 充值总额
     */
    @Min(0)
    @NotNull
    private final BigDecimal rechargeAmount;

    /**
     * 提现总额
     */
    @Min(0)
    @NotNull
    private final BigDecimal withdrawAmount;

    public UserFund(String userId,
                    BigDecimal availableAmount,
                    BigDecimal frozenAmount,
                    BigDecimal dueInAmount,
                    BigDecimal dueOutAmount,
                    BigDecimal rechargeAmount,
                    BigDecimal withdrawAmount) {
        this.userId = userId;
        this.availableAmount = availableAmount;
        this.frozenAmount = frozenAmount;
        this.dueInAmount = dueInAmount;
        this.dueOutAmount = dueOutAmount;
        this.rechargeAmount = rechargeAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public BigDecimal getDueInAmount() {
        return dueInAmount;
    }

    public BigDecimal getDueOutAmount() {
        return dueOutAmount;
    }

    public String getUserId() {
        return userId;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }
}