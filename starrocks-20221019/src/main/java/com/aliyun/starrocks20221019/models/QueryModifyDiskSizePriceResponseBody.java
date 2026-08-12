// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskSizePriceResponseBody extends TeaModel {
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
    public QueryModifyDiskSizePriceResponseBodyData data;

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
     * <p>null</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP request status code.</p>
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
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryModifyDiskSizePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskSizePriceResponseBody self = new QueryModifyDiskSizePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskSizePriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifyDiskSizePriceResponseBody setData(QueryModifyDiskSizePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifyDiskSizePriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifyDiskSizePriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifyDiskSizePriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifyDiskSizePriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifyDiskSizePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyDiskSizePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyDiskSizePriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <p>The component name. Defaults to the component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>disk_size</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The order discount amount.</p>
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
         * <p>9872</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The final price, which is the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyDiskSizePriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskSizePriceResponseBodyDataComponentPrices self = new QueryModifyDiskSizePriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskSizePriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifyDiskSizePriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyDiskSizePriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyDiskSizePriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo extends TeaModel {
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
         * <p>9872</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <p>Indicates whether to display the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The original total official website price.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo self = new QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions extends TeaModel {
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

        public static QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions self = new QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifyDiskSizePriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The quantity.</p>
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
         * <p>rule-083ja12</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ysj12ksaa</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifyDiskSizePriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskSizePriceResponseBodyDataRules self = new QueryModifyDiskSizePriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskSizePriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifyDiskSizePriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifyDiskSizePriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifyDiskSizePriceResponseBodyData extends TeaModel {
        /**
         * <p>The component prices.</p>
         */
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataComponentPrices> componentPrices;

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
         * <p>Indicates whether to display the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount. Discount amount = original amount - billable amount (including coupon deductions).</p>
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
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price. Original amount = catalog price × billing usage.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The price calculation rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataRules> rules;

        /**
         * <p>The discounted price based on the official website discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <p>The official website discount price.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>9872</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyDiskSizePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskSizePriceResponseBodyData self = new QueryModifyDiskSizePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskSizePriceResponseBodyData setComponentPrices(java.util.List<QueryModifyDiskSizePriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifyDiskSizePriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyDiskSizePriceResponseBodyData setDepreciateInfo(QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyDiskSizePriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyDiskSizePriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyDiskSizePriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyDiskSizePriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyDiskSizePriceResponseBodyData setRules(java.util.List<QueryModifyDiskSizePriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyDiskSizePriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifyDiskSizePriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyDiskSizePriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyDiskSizePriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
