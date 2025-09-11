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

    public static class GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CanPromFee")
        public String canPromFee;

        /**
         * <strong>example:</strong>
         * <p>7afs9d</p>
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
         * <p>775735400028</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions self = new GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions setCanPromFee(String canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public String getCanPromFee() {
            return this.canPromFee;
        }

        public GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

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

        @NameInMap("OptionalPromotions")
        public java.util.List<GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions> optionalPromotions;

        @NameInMap("PricingRules")
        public java.util.Map<String, String> pricingRules;

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

        public GetCreateBEClusterInquiryResponseBodyData setOptionalPromotions(java.util.List<GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<GetCreateBEClusterInquiryResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public GetCreateBEClusterInquiryResponseBodyData setPricingRules(java.util.Map<String, String> pricingRules) {
            this.pricingRules = pricingRules;
            return this;
        }
        public java.util.Map<String, String> getPricingRules() {
            return this.pricingRules;
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
