// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskNumberPriceResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public QueryModifyDiskNumberPriceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryModifyDiskNumberPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskNumberPriceResponseBody self = new QueryModifyDiskNumberPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskNumberPriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifyDiskNumberPriceResponseBody setData(QueryModifyDiskNumberPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifyDiskNumberPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifyDiskNumberPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifyDiskNumberPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifyDiskNumberPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifyDiskNumberPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyDiskNumberPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyDiskNumberPriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyDiskNumberPriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskNumberPriceResponseBodyDataComponentPrices self = new QueryModifyDiskNumberPriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskNumberPriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo self = new QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>youhuiquan_desc</p>
         */
        @NameInMap("PromotionDesc")
        public String promotionDesc;

        /**
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>youhuiquan_12378dfj6</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions self = new QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifyDiskNumberPriceResponseBodyDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>rule_12hus92</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>6yhsi10223</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifyDiskNumberPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskNumberPriceResponseBodyDataRules self = new QueryModifyDiskNumberPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskNumberPriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifyDiskNumberPriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifyDiskNumberPriceResponseBodyData extends TeaModel {
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <strong>example:</strong>
         * <p>17629</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyDiskNumberPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyDiskNumberPriceResponseBodyData self = new QueryModifyDiskNumberPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifyDiskNumberPriceResponseBodyData setComponentPrices(java.util.List<QueryModifyDiskNumberPriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setDepreciateInfo(QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyDiskNumberPriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setRules(java.util.List<QueryModifyDiskNumberPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyDiskNumberPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyDiskNumberPriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
