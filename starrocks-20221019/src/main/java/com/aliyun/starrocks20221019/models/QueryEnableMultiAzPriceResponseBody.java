// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryEnableMultiAzPriceResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
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
    public QueryEnableMultiAzPriceResponseBodyData data;

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
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEnableMultiAzPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnableMultiAzPriceResponseBody self = new QueryEnableMultiAzPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnableMultiAzPriceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryEnableMultiAzPriceResponseBody setData(QueryEnableMultiAzPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEnableMultiAzPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryEnableMultiAzPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryEnableMultiAzPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryEnableMultiAzPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryEnableMultiAzPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnableMultiAzPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnableMultiAzPriceResponseBodyDataComponentPrices extends TeaModel {
        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>multi-zone</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The discount amount for the order.</p>
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
         * <p>7641</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The final price, which is the original price minus the discount.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryEnableMultiAzPriceResponseBodyDataComponentPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyDataComponentPrices self = new QueryEnableMultiAzPriceResponseBodyDataComponentPrices();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyDataComponentPrices setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryEnableMultiAzPriceResponseBodyDataComponentPrices setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryEnableMultiAzPriceResponseBodyDataComponentPrices setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryEnableMultiAzPriceResponseBodyDataComponentPrices setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheapRate")
        public Float cheapRate;

        /**
         * <p>The total official price after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("CheapStandAmount")
        public Float cheapStandAmount;

        /**
         * <p>Indicates whether to show the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The original total official price.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("OriginalStandAmount")
        public Float originalStandAmount;

        public static QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo self = new QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo setCheapRate(Float cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Float getCheapRate() {
            return this.cheapRate;
        }

        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo setCheapStandAmount(Float cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Float getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo setOriginalStandAmount(Float originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Float getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class QueryEnableMultiAzPriceResponseBodyDataModuleInstance extends TeaModel {
        /**
         * <p>The identifier of the billing module.</p>
         * 
         * <strong>example:</strong>
         * <p>multi-zone</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <p>zone</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("StandPrice")
        public String standPrice;

        /**
         * <p>The original price of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("TotalProductFee")
        public String totalProductFee;

        public static QueryEnableMultiAzPriceResponseBodyDataModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyDataModuleInstance self = new QueryEnableMultiAzPriceResponseBodyDataModuleInstance();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyDataModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public QueryEnableMultiAzPriceResponseBodyDataModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryEnableMultiAzPriceResponseBodyDataModuleInstance setStandPrice(String standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public String getStandPrice() {
            return this.standPrice;
        }

        public QueryEnableMultiAzPriceResponseBodyDataModuleInstance setTotalProductFee(String totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public String getTotalProductFee() {
            return this.totalProductFee;
        }

    }

    public static class QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions extends TeaModel {
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

        public static QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions self = new QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions setPromotionDesc(String promotionDesc) {
            this.promotionDesc = promotionDesc;
            return this;
        }
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        public QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

    }

    public static class QueryEnableMultiAzPriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_28sdhsu2320t</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2ju2sd9dss</p>
         */
        @NameInMap("RuleDescId")
        public String ruleDescId;

        public static QueryEnableMultiAzPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyDataRules self = new QueryEnableMultiAzPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyDataRules setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public QueryEnableMultiAzPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEnableMultiAzPriceResponseBodyDataRules setRuleDescId(String ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public String getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class QueryEnableMultiAzPriceResponseBodyData extends TeaModel {
        /**
         * <p>The component prices.</p>
         */
        @NameInMap("ComponentPrices")
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataComponentPrices> componentPrices;

        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li><p>CNY: Chinese Yuan.</p>
         * </li>
         * <li><p>USD: U.S. dollar.</p>
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
         * <p>The total official price after the price reduction.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("DepreciateInfo")
        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount. This is the original amount minus the bill\&quot;s payable amount, which includes coupon deductions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The module ID.</p>
         */
        @NameInMap("ModuleInstance")
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataModuleInstance> moduleInstance;

        /**
         * <p>The coupon information.</p>
         */
        @NameInMap("OptionalPromotions")
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions> optionalPromotions;

        /**
         * <p>The original price. This is the list price multiplied by the usage.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The returned data structure.</p>
         */
        @NameInMap("Rules")
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataRules> rules;

        /**
         * <p>The discounted price based on the official discount.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("StandDiscountPrice")
        public Float standDiscountPrice;

        /**
         * <p>The official discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("StandPrice")
        public Float standPrice;

        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>7641</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static QueryEnableMultiAzPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceResponseBodyData self = new QueryEnableMultiAzPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceResponseBodyData setComponentPrices(java.util.List<QueryEnableMultiAzPriceResponseBodyDataComponentPrices> componentPrices) {
            this.componentPrices = componentPrices;
            return this;
        }
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataComponentPrices> getComponentPrices() {
            return this.componentPrices;
        }

        public QueryEnableMultiAzPriceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryEnableMultiAzPriceResponseBodyData setDepreciateInfo(QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public QueryEnableMultiAzPriceResponseBodyDataDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public QueryEnableMultiAzPriceResponseBodyData setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryEnableMultiAzPriceResponseBodyData setModuleInstance(java.util.List<QueryEnableMultiAzPriceResponseBodyDataModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

        public QueryEnableMultiAzPriceResponseBodyData setOptionalPromotions(java.util.List<QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions> optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataOptionalPromotions> getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public QueryEnableMultiAzPriceResponseBodyData setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryEnableMultiAzPriceResponseBodyData setRules(java.util.List<QueryEnableMultiAzPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryEnableMultiAzPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryEnableMultiAzPriceResponseBodyData setStandDiscountPrice(Float standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Float getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public QueryEnableMultiAzPriceResponseBodyData setStandPrice(Float standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Float getStandPrice() {
            return this.standPrice;
        }

        public QueryEnableMultiAzPriceResponseBodyData setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

}
