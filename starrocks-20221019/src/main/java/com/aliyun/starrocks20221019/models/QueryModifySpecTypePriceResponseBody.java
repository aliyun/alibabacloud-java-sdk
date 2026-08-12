// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifySpecTypePriceResponseBody extends TeaModel {
    /**
     * <p>Details about access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryModifySpecTypePriceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryModifySpecTypePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifySpecTypePriceResponseBody self = new QueryModifySpecTypePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifySpecTypePriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifySpecTypePriceResponseBody setData(QueryModifySpecTypePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifySpecTypePriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifySpecTypePriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifySpecTypePriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifySpecTypePriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifySpecTypePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifySpecTypePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifySpecTypePriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>node_type</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The final price. The final price is the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifySpecTypePriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifySpecTypePriceResponseBodyDataComponentPrices self = new QueryModifySpecTypePriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifySpecTypePriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifySpecTypePriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifySpecTypePriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifySpecTypePriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifySpecTypePriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <p>The total official website price after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The original total official website price.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryModifySpecTypePriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifySpecTypePriceResponseBodyDataDepreciateInfo self = new QueryModifySpecTypePriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifySpecTypePriceResponseBodyDataOptionalPromotions extends TeaModel {
        /**
         * <p>The coupon description.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_desc</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_12378dfj6</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static QueryModifySpecTypePriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifySpecTypePriceResponseBodyDataOptionalPromotions self = new QueryModifySpecTypePriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifySpecTypePriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifySpecTypePriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifySpecTypePriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifySpecTypePriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_827231sg1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7usy32gs01</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifySpecTypePriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifySpecTypePriceResponseBodyDataRules self = new QueryModifySpecTypePriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifySpecTypePriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifySpecTypePriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifySpecTypePriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifySpecTypePriceResponseBodyData extends TeaModel {
        /**
         * <p>The component prices.</p>
         */
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The name of the campaign.</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount. Formula: Original amount - Payable amount on the bill. The payable amount includes the amount deducted by coupons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The coupon information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price. Formula: List price × Billed usage.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The price calculation rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataRules> rules;

        /**
         * <p>The discounted price that is based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <p>The official website discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>5612</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifySpecTypePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifySpecTypePriceResponseBodyData self = new QueryModifySpecTypePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifySpecTypePriceResponseBodyData setComponentPrices(java.util.List<QueryModifySpecTypePriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifySpecTypePriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifySpecTypePriceResponseBodyData setDepreciateInfo(QueryModifySpecTypePriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifySpecTypePriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifySpecTypePriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifySpecTypePriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifySpecTypePriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifySpecTypePriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifySpecTypePriceResponseBodyData setRules(java.util.List<QueryModifySpecTypePriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifySpecTypePriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifySpecTypePriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifySpecTypePriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifySpecTypePriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
