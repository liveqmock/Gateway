/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model.lion.response;

import com.creditcloud.investmentfund.model.lion.FundTradingRequestRecord;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 交易申请记录结果返回
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class QueryTradeRecordResponse extends BaseResponse {

    private List<FundTradingRequestRecord> resultlist;
    
}