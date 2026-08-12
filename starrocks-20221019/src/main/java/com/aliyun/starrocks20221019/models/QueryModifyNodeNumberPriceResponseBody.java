// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyNodeNumberPriceResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The order information.</p>
     */
    @NameInMap("Data")
    public QueryModifyNodeNumberPriceResponseBodyData data;

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
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryModifyNodeNumberPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyNodeNumberPriceResponseBody self = new QueryModifyNodeNumberPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyNodeNumberPriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifyNodeNumberPriceResponseBody setData(QueryModifyNodeNumberPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifyNodeNumberPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifyNodeNumberPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifyNodeNumberPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifyNodeNumberPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifyNodeNumberPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyNodeNumberPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyNodeNumberPriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>RangerUserSync</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The actual transaction price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyNodeNumberPriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyNodeNumberPriceResponseBodyDataComponentPrices self = new QueryModifyNodeNumberPriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifyNodeNumberPriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <p>The total price on the official website after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction range.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The original total price on the official website.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo self = new QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions extends TeaModel {
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

        public static QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions self = new QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifyNodeNumberPriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The price for purchasing a batch of Elastic Compute Service (ECS) instances with a specific configuration. Valid values: 1 to 1000.</p>
         * <p>Default value: 1.</p>
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
         * <p>rule_923su2sf</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8uy3sh12sa</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifyNodeNumberPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyNodeNumberPriceResponseBodyDataRules self = new QueryModifyNodeNumberPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyNodeNumberPriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifyNodeNumberPriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifyNodeNumberPriceResponseBodyData extends TeaModel {
        /**
         * <p>The component prices.</p>
         */
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li><p>CNY: Chinese Yuan.</p>
         * </li>
         * <li><p>USD: US Dollar.</p>
         * </li>
         * <li><p>JPY: Japanese Yen.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The price reduction ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount is the difference between the original amount and the amount payable. The amount payable is the final cost after any coupon deductions.</p>
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
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price. This is calculated as: List Price × Billable Usage.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The returned data structure.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataRules> rules;

        /**
         * <p>The discounted price based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <p>The official website discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <p>The payable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>26710</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyNodeNumberPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyNodeNumberPriceResponseBodyData self = new QueryModifyNodeNumberPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifyNodeNumberPriceResponseBodyData setComponentPrices(java.util.List<QueryModifyNodeNumberPriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setDepreciateInfo(QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyNodeNumberPriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setRules(java.util.List<QueryModifyNodeNumberPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyNodeNumberPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyNodeNumberPriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
