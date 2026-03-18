// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyChargeTypePriceResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public QueryModifyChargeTypePriceResponseBodyData data;

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

    public static QueryModifyChargeTypePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyChargeTypePriceResponseBody self = new QueryModifyChargeTypePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModifyChargeTypePriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryModifyChargeTypePriceResponseBody setData(QueryModifyChargeTypePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModifyChargeTypePriceResponseBodyData getData() {
        return this.data;
    }

    public QueryModifyChargeTypePriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryModifyChargeTypePriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryModifyChargeTypePriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryModifyChargeTypePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModifyChargeTypePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryModifyChargeTypePriceResponseBodyDataComponentPrices extends TeaModel {
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

        public static QueryModifyChargeTypePriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyDataComponentPrices self = new QueryModifyChargeTypePriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryModifyChargeTypePriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyChargeTypePriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyChargeTypePriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo extends TeaModel {
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

        public static QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo self = new QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryModifyChargeTypePriceResponseBodyDataModuleInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <strong>example:</strong>
         * <p>cu_num</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("TotalProductFee")
        public String totalProductFee;

        public static QueryModifyChargeTypePriceResponseBodyDataModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyDataModuleInstance self = new QueryModifyChargeTypePriceResponseBodyDataModuleInstance();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyDataModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryModifyChargeTypePriceResponseBodyDataModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryModifyChargeTypePriceResponseBodyDataModuleInstance setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyChargeTypePriceResponseBodyDataModuleInstance setTotalProductFee(String totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public String getTotalProductFee() {
            return this.totalProductFee;
        }

    }

    public static class QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions extends TeaModel {
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
         * <p>youhuiquan_1238293</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        public static QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions self = new QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryModifyChargeTypePriceResponseBodyDataRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>rule1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rule-12iudfj</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryModifyChargeTypePriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyDataRules self = new QueryModifyChargeTypePriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryModifyChargeTypePriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryModifyChargeTypePriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryModifyChargeTypePriceResponseBodyData extends TeaModel {
        @NameInMap("ComponentPrices")
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DepreciateInfo")
        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("ModuleInstance")
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataModuleInstance> moduleInstance;

        @NameInMap("OptionalPromotions")
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <strong>example:</strong>
         * <p>7986</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("Rules")
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataRules> rules;

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

        public static QueryModifyChargeTypePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModifyChargeTypePriceResponseBodyData self = new QueryModifyChargeTypePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModifyChargeTypePriceResponseBodyData setComponentPrices(java.util.List<QueryModifyChargeTypePriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryModifyChargeTypePriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryModifyChargeTypePriceResponseBodyData setDepreciateInfo(QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryModifyChargeTypePriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryModifyChargeTypePriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryModifyChargeTypePriceResponseBodyData setModuleInstance(java.util.List<QueryModifyChargeTypePriceResponseBodyDataModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public QueryModifyChargeTypePriceResponseBodyData setOptionalPromotions(java.util.List<QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryModifyChargeTypePriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryModifyChargeTypePriceResponseBodyData setRules(java.util.List<QueryModifyChargeTypePriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryModifyChargeTypePriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryModifyChargeTypePriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryModifyChargeTypePriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryModifyChargeTypePriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
