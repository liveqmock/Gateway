/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.model;

import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author GuohuaZhang
 */
//@Data
public class HuaAnFundAccountConfig {

    /**
     * 平台在华安的交易账号
     */
    private String platformTradingAccount;
    /**
     * 交易秘钥
     */
    private String platformTradingPrivateKey;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE, false, false);
    }
}