// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetCreateBEClusterInquiryResponseBody extends TeaModel {
    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Data")
    public GetCreateBEClusterInquiryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
     */
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
        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount of money.</p>
         * 
         * <strong>example:</strong>
         * <p>1.76</p>
         */
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
