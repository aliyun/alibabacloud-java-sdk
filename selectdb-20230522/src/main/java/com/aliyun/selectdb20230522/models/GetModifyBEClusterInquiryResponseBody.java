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

    public static class GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CanPromFee")
        public String canPromFee;

        /**
         * <strong>example:</strong>
         * <p>789asdf</p>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <strong>example:</strong>
         * <p>通用优惠券可抵扣100</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>通用优惠券</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>732211480132</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions self = new GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions setCanPromFee(String canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public String getCanPromFee() {
            return this.canPromFee;
        }

        public GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

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

        @NameInMap("OptionalPromotions")
        public java.util.List<GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions> optionalPromotions;

        @NameInMap("PricingRules")
        public java.util.Map<String, String> pricingRules;

        /**
         * <p>The estimated refund amount when the subscription cluster of a subscription instance is changed to a pay-as-you-go cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>-100</p>
         */
        @NameInMap("RefundAmount")
        public String refundAmount;

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

        public GetModifyBEClusterInquiryResponseBodyData setOptionalPromotions(java.util.List<GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<GetModifyBEClusterInquiryResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public GetModifyBEClusterInquiryResponseBodyData setPricingRules(java.util.Map<String, String> pricingRules) {
            this.pricingRules = pricingRules;
            return this;
        }
        public java.util.Map<String, String> getPricingRules() {
            return this.pricingRules;
        }

        public GetModifyBEClusterInquiryResponseBodyData setRefundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public String getRefundAmount() {
            return this.refundAmount;
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
