// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryPriceV1ResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public QueryPriceV1ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
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
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPriceV1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceV1ResponseBody self = new QueryPriceV1ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPriceV1ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPriceV1ResponseBody setData(QueryPriceV1ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPriceV1ResponseBodyData getData() {
        return this.data;
    }

    public QueryPriceV1ResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryPriceV1ResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryPriceV1ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryPriceV1ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPriceV1ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPriceV1ResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FE</p>
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
         * <p>3192</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <strong>example:</strong>
         * <p>3192</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryPriceV1ResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyDataComponentPrices self = new QueryPriceV1ResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryPriceV1ResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryPriceV1ResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryPriceV1ResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryPriceV1ResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <strong>example:</strong>
         * <p>8094</p>
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
         * <p>8094</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryPriceV1ResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyDataDepreciateInfo self = new QueryPriceV1ResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryPriceV1ResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryPriceV1ResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryPriceV1ResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryPriceV1ResponseBodyDataModuleInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cu_num</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <strong>example:</strong>
         * <p>CU</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>1622</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <strong>example:</strong>
         * <p>1622</p>
         */
        @NameInMap("TotalProductFee")
        public String totalProductFee;

        public static QueryPriceV1ResponseBodyDataModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyDataModuleInstance self = new QueryPriceV1ResponseBodyDataModuleInstance();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyDataModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryPriceV1ResponseBodyDataModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryPriceV1ResponseBodyDataModuleInstance setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryPriceV1ResponseBodyDataModuleInstance setTotalProductFee(String totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public String getTotalProductFee() {
            return this.totalProductFee;
        }

    }

    public static class QueryPriceV1ResponseBodyDataOptionalPromotions extends TeaModel {
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

        public static QueryPriceV1ResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyDataOptionalPromotions self = new QueryPriceV1ResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryPriceV1ResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryPriceV1ResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryPriceV1ResponseBodyDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>rule_8usi12321sa</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>7u22yshaasds</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryPriceV1ResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyDataRules self = new QueryPriceV1ResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryPriceV1ResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPriceV1ResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryPriceV1ResponseBodyData extends TeaModel {
        @NameInMap("ComponentPrices")
        public java.util.List<QueryPriceV1ResponseBodyDataComponentPrices> componentPrices;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DepreciateInfo")
        public QueryPriceV1ResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("ModuleInstance")
        public java.util.List<QueryPriceV1ResponseBodyDataModuleInstance> moduleInstance;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryPriceV1ResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <strong>example:</strong>
         * <p>8094</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryPriceV1ResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>8094</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <strong>example:</strong>
         * <p>8094</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <strong>example:</strong>
         * <p>8094</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryPriceV1ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1ResponseBodyData self = new QueryPriceV1ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1ResponseBodyData setComponentPrices(java.util.List<QueryPriceV1ResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryPriceV1ResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryPriceV1ResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryPriceV1ResponseBodyData setDepreciateInfo(QueryPriceV1ResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryPriceV1ResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryPriceV1ResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryPriceV1ResponseBodyData setModuleInstance(java.util.List<QueryPriceV1ResponseBodyDataModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<QueryPriceV1ResponseBodyDataModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public QueryPriceV1ResponseBodyData setOptionalPromotions(java.util.List<QueryPriceV1ResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryPriceV1ResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryPriceV1ResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryPriceV1ResponseBodyData setRules(java.util.List<QueryPriceV1ResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryPriceV1ResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryPriceV1ResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryPriceV1ResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryPriceV1ResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
