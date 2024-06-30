// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends. An empty value indicates that all data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAd98/tlL5GF2aM7UMKQGM8LZesIPr0CbfxASQvHV/pwcmVKNfdBbW8OPld3NvG9Cy8+dNcyFzyUttQA3IONfBhRGpXFyiVoTgK+dupBsP2mX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The queried quotas.</p>
     */
    @NameInMap("Quotas")
    public java.util.List<ListProductQuotasResponseBodyQuotas> quotas;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D0131FD5-5397-44FE-BF5A-4B7165B813CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that are returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotasResponseBody self = new ListProductQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductQuotasResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductQuotasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductQuotasResponseBody setQuotas(java.util.List<ListProductQuotasResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListProductQuotasResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListProductQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductQuotasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductQuotasResponseBodyQuotasPeriod extends TeaModel {
        /**
         * <p>The unit of the calculation cycle. Valid values:</p>
         * <ul>
         * <li>second</li>
         * <li>minute</li>
         * <li>hour</li>
         * <li>day</li>
         * <li>week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodValue")
        public Integer periodValue;

        public static ListProductQuotasResponseBodyQuotasPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotasResponseBodyQuotasPeriod self = new ListProductQuotasResponseBodyQuotasPeriod();
            return TeaModel.build(map, self);
        }

        public ListProductQuotasResponseBodyQuotasPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ListProductQuotasResponseBodyQuotasPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class ListProductQuotasResponseBodyQuotasQuotaItems extends TeaModel {
        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quota")
        public String quota;

        /**
         * <p>The unit of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>AMOUNT</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The category of the quota. Valid values:</p>
         * <ul>
         * <li>BaseQuota: base quota</li>
         * <li>ReservedQuota: reserved quota</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BaseQuota</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static ListProductQuotasResponseBodyQuotasQuotaItems build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotasResponseBodyQuotasQuotaItems self = new ListProductQuotasResponseBodyQuotasQuotaItems();
            return TeaModel.build(map, self);
        }

        public ListProductQuotasResponseBodyQuotasQuotaItems setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

        public ListProductQuotasResponseBodyQuotasQuotaItems setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public ListProductQuotasResponseBodyQuotasQuotaItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProductQuotasResponseBodyQuotasQuotaItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListProductQuotasResponseBodyQuotasUsageMetric extends TeaModel {
        @NameInMap("MetricDimensions")
        public java.util.Map<String, String> metricDimensions;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MetricNamespace")
        public String metricNamespace;

        public static ListProductQuotasResponseBodyQuotasUsageMetric build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotasResponseBodyQuotasUsageMetric self = new ListProductQuotasResponseBodyQuotasUsageMetric();
            return TeaModel.build(map, self);
        }

        public ListProductQuotasResponseBodyQuotasUsageMetric setMetricDimensions(java.util.Map<String, String> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }
        public java.util.Map<String, String> getMetricDimensions() {
            return this.metricDimensions;
        }

        public ListProductQuotasResponseBodyQuotasUsageMetric setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListProductQuotasResponseBodyQuotasUsageMetric setMetricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        public String getMetricNamespace() {
            return this.metricNamespace;
        }

    }

    public static class ListProductQuotasResponseBodyQuotas extends TeaModel {
        /**
         * <p>Indicates whether the quota is adjustable. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adjustable")
        public Boolean adjustable;

        /**
         * <p>N/A</p>
         */
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        /**
         * <p>The type of the adjustable value. Valid values:</p>
         * <ul>
         * <li>continuous</li>
         * <li>discontinuous</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discontinuous</p>
         */
        @NameInMap("ApplicableType")
        public String applicableType;

        /**
         * <p>The reason for submitting a quota increase request.</p>
         * 
         * <strong>example:</strong>
         * <p>The business xxx is expected to grow by 50%.</p>
         */
        @NameInMap("ApplyReasonTips")
        public String applyReasonTips;

        /**
         * <p>Indicates whether the system shows the used value of the quota. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Consumable")
        public Boolean consumable;

        /**
         * <p>The quota dimensions. Format: <code>{&quot;regionId&quot;:&quot;Region&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-28T06:07:00Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The end time of the validity period of the quota. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-29T06:07:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the quota is a global quota. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalQuota")
        public Boolean globalQuota;

        /**
         * <p>The calculation cycle of the quota.</p>
         */
        @NameInMap("Period")
        public ListProductQuotasResponseBodyQuotasPeriod period;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-spec</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:107992689699****:quota/ecs/ecs.g5.2xlarge/postpaid/vpc/cn-hangzhou/instancetype/cn-hangzhou-i</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota</li>
         * <li>FlowControl: API rate limit</li>
         * <li>WhiteListLabel: privilege</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The details of the quota.</p>
         */
        @NameInMap("QuotaItems")
        public java.util.List<ListProductQuotasResponseBodyQuotasQuotaItems> quotaItems;

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li>privilege</li>
         * <li>normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>privilege</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The unit of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>AMOUNT</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>N/A</p>
         */
        @NameInMap("SupportedRange")
        public java.util.List<Float> supportedRange;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalQuota")
        public Float totalQuota;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUsage")
        public Float totalUsage;

        /**
         * <p>The reason why the quota is not adjustable. Valid values:</p>
         * <ul>
         * <li>nonactivated: The service is not activated.</li>
         * <li>applicationProcess: The application is being processed.</li>
         * <li>limitReached: The quota limit is reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>applicationProcess</p>
         */
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        @NameInMap("UsageMetric")
        public ListProductQuotasResponseBodyQuotasUsageMetric usageMetric;

        public static ListProductQuotasResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotasResponseBodyQuotas self = new ListProductQuotasResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListProductQuotasResponseBodyQuotas setAdjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        public ListProductQuotasResponseBodyQuotas setApplicableRange(java.util.List<Float> applicableRange) {
            this.applicableRange = applicableRange;
            return this;
        }
        public java.util.List<Float> getApplicableRange() {
            return this.applicableRange;
        }

        public ListProductQuotasResponseBodyQuotas setApplicableType(String applicableType) {
            this.applicableType = applicableType;
            return this;
        }
        public String getApplicableType() {
            return this.applicableType;
        }

        public ListProductQuotasResponseBodyQuotas setApplyReasonTips(String applyReasonTips) {
            this.applyReasonTips = applyReasonTips;
            return this;
        }
        public String getApplyReasonTips() {
            return this.applyReasonTips;
        }

        public ListProductQuotasResponseBodyQuotas setConsumable(Boolean consumable) {
            this.consumable = consumable;
            return this;
        }
        public Boolean getConsumable() {
            return this.consumable;
        }

        public ListProductQuotasResponseBodyQuotas setDimensions(java.util.Map<String, ?> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, ?> getDimensions() {
            return this.dimensions;
        }

        public ListProductQuotasResponseBodyQuotas setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListProductQuotasResponseBodyQuotas setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListProductQuotasResponseBodyQuotas setGlobalQuota(Boolean globalQuota) {
            this.globalQuota = globalQuota;
            return this;
        }
        public Boolean getGlobalQuota() {
            return this.globalQuota;
        }

        public ListProductQuotasResponseBodyQuotas setPeriod(ListProductQuotasResponseBodyQuotasPeriod period) {
            this.period = period;
            return this;
        }
        public ListProductQuotasResponseBodyQuotasPeriod getPeriod() {
            return this.period;
        }

        public ListProductQuotasResponseBodyQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaItems(java.util.List<ListProductQuotasResponseBodyQuotasQuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }
        public java.util.List<ListProductQuotasResponseBodyQuotasQuotaItems> getQuotaItems() {
            return this.quotaItems;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListProductQuotasResponseBodyQuotas setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public ListProductQuotasResponseBodyQuotas setSupportedRange(java.util.List<Float> supportedRange) {
            this.supportedRange = supportedRange;
            return this;
        }
        public java.util.List<Float> getSupportedRange() {
            return this.supportedRange;
        }

        public ListProductQuotasResponseBodyQuotas setTotalQuota(Float totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Float getTotalQuota() {
            return this.totalQuota;
        }

        public ListProductQuotasResponseBodyQuotas setTotalUsage(Float totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Float getTotalUsage() {
            return this.totalUsage;
        }

        public ListProductQuotasResponseBodyQuotas setUnadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = unadjustableDetail;
            return this;
        }
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        public ListProductQuotasResponseBodyQuotas setUsageMetric(ListProductQuotasResponseBodyQuotasUsageMetric usageMetric) {
            this.usageMetric = usageMetric;
            return this;
        }
        public ListProductQuotasResponseBodyQuotasUsageMetric getUsageMetric() {
            return this.usageMetric;
        }

    }

}
