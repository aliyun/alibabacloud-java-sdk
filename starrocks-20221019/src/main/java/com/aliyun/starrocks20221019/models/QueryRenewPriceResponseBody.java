// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryRenewPriceResponseBody extends TeaModel {
    /**
     * <p>Response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryRenewPriceResponseBodyData> data;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRenewPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceResponseBody self = new QueryRenewPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceResponseBody setData(java.util.List<QueryRenewPriceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRenewPriceResponseBodyData> getData() {
        return this.data;
    }

    public QueryRenewPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryRenewPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryRenewPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryRenewPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRenewPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRenewPriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <p>Discount rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <p>Total official price after discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <p>Indicates whether the discount amount is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>Original total official price.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryRenewPriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataDepreciateInfo self = new QueryRenewPriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryRenewPriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryRenewPriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryRenewPriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryRenewPriceResponseBodyDataOptionalPromotions extends TeaModel {
        /**
         * <p>Coupon description.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_desc</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>Coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>Coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_12378dfj6</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static QueryRenewPriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataOptionalPromotions self = new QueryRenewPriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryRenewPriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryRenewPriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryRenewPriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>Resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_8syh2j121ns</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8su2i3hsdf128</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryRenewPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataRules self = new QueryRenewPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryRenewPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRenewPriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryRenewPriceResponseBodyData extends TeaModel {
        /**
         * <p>Billing instance ID. For the default compute group (FE compute group and default BE compute group), this value is the instance ID. Otherwise, it is the compute group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("BillingInstanceId")
        public String billingInstanceId;

        /**
         * <p>Currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>Total official price after discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryRenewPriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <p>Discount amount = original amount − billable amount (including coupon discounts).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>Coupon ID.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryRenewPriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <p>Original amount = catalog price × usage.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>Data structure of the response.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryRenewPriceResponseBodyDataRules> rules;

        /**
         * <p>Discounted price based on the official discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <p>Official discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <p>Amount.</p>
         * 
         * <strong>example:</strong>
         * <p>9812</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryRenewPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyData self = new QueryRenewPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyData setBillingInstanceId(String billingInstanceId) {
            this.billingInstanceId = billingInstanceId;
            return this;
        }
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        public QueryRenewPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryRenewPriceResponseBodyData setDepreciateInfo(QueryRenewPriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryRenewPriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryRenewPriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryRenewPriceResponseBodyData setOptionalPromotions(java.util.List<QueryRenewPriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryRenewPriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryRenewPriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryRenewPriceResponseBodyData setRules(java.util.List<QueryRenewPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryRenewPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryRenewPriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryRenewPriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryRenewPriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
