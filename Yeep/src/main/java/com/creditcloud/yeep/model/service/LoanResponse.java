/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.BaseResponse;
/**
 *
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class LoanResponse extends BaseResponse{
    
    public LoanResponse(String platfromNo,
                        String code,
                        String description) {
        super(platfromNo,code,description);
    }   
}