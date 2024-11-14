// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetModifyBEClusterInquiryResponseBody extends TeaModel {
    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Data")
    public GetModifyBEClusterInquiryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
     */
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
