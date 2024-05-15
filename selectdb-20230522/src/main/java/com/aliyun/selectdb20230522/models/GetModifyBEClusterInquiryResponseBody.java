// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetModifyBEClusterInquiryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetModifyBEClusterInquiryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetModifyBEClusterInquiryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModifyBEClusterInquiryResponseBody self = new GetModifyBEClusterInquiryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModifyBEClusterInquiryResponseBody setData(GetModifyBEClusterInquiryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModifyBEClusterInquiryResponseBodyData getData() {
        return this.data;
    }

    public GetModifyBEClusterInquiryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModifyBEClusterInquiryResponseBodyData extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static GetModifyBEClusterInquiryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModifyBEClusterInquiryResponseBodyData self = new GetModifyBEClusterInquiryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModifyBEClusterInquiryResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetModifyBEClusterInquiryResponseBodyData setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
