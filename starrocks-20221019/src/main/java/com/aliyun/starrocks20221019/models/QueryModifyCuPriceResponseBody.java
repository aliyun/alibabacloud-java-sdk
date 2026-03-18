// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyCuPriceResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public QueryModifyCuPriceResponseBodyData data;

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
     * <p>B67D142D-D54E-184F-A306-22BDC01B2XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryModifyCuPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyCuPriceResponseBody self = new QueryModifyCuPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyCuPriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifyCuPriceResponseBody setData(QueryModifyCuPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifyCuPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifyCuPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifyCuPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifyCuPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifyCuPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyCuPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyCuPriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cu_num</p>
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
         * <p>7986</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyCuPriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyCuPriceResponseBodyDataComponentPrices self = new QueryModifyCuPriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifyCuPriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifyCuPriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyCuPriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyCuPriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifyCuPriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
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
         * <p>7986</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryModifyCuPriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyCuPriceResponseBodyDataDepreciateInfo self = new QueryModifyCuPriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyCuPriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyCuPriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyCuPriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyCuPriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifyCuPriceResponseBodyDataOptionalPromotions extends TeaModel {
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

        public static QueryModifyCuPriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyCuPriceResponseBodyDataOptionalPromotions self = new QueryModifyCuPriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyCuPriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyCuPriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyCuPriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifyCuPriceResponseBodyDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>rule_123123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ak72hajsd</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifyCuPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyCuPriceResponseBodyDataRules self = new QueryModifyCuPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyCuPriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifyCuPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifyCuPriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifyCuPriceResponseBodyData extends TeaModel {
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifyCuPriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryModifyCuPriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryModifyCuPriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryModifyCuPriceResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryModifyCuPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyCuPriceResponseBodyData self = new QueryModifyCuPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifyCuPriceResponseBodyData setComponentPrices(java.util.List<QueryModifyCuPriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifyCuPriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifyCuPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyCuPriceResponseBodyData setDepreciateInfo(QueryModifyCuPriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyCuPriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyCuPriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyCuPriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifyCuPriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyCuPriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyCuPriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyCuPriceResponseBodyData setRules(java.util.List<QueryModifyCuPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyCuPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifyCuPriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyCuPriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyCuPriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
