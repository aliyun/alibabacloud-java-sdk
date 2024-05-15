// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetCreateBEClusterInquiryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCreateBEClusterInquiryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCreateBEClusterInquiryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateBEClusterInquiryResponseBody self = new GetCreateBEClusterInquiryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateBEClusterInquiryResponseBody setData(GetCreateBEClusterInquiryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCreateBEClusterInquiryResponseBodyData getData() {
        return this.data;
    }

    public GetCreateBEClusterInquiryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCreateBEClusterInquiryResponseBodyData extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static GetCreateBEClusterInquiryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCreateBEClusterInquiryResponseBodyData self = new GetCreateBEClusterInquiryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCreateBEClusterInquiryResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetCreateBEClusterInquiryResponseBodyData setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
