// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponseBody extends TeaModel {
    /**
     * <p>The quota details.</p>
     */
    @NameInMap("Quota")
    public GetProductQuotaResponseBodyQuota quota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FF8CAF0-29D9-4F11-B6A4-FD2CBCA016D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProductQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaResponseBody self = new GetProductQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaResponseBody setQuota(GetProductQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetProductQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public GetProductQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductQuotaResponseBodyQuotaPeriod extends TeaModel {
        /**
         * <p>The unit of the quota period. Valid values:</p>
         * <ul>
         * <li><p>second: Seconds.</p>
         * </li>
         * <li><p>minute: Minutes.</p>
         * </li>
         * <li><p>hour: Hours.</p>
         * </li>
         * <li><p>day: Days.</p>
         * </li>
         * <li><p>week: Weeks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the quota period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodValue")
        public Integer periodValue;

        public static GetProductQuotaResponseBodyQuotaPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuotaPeriod self = new GetProductQuotaResponseBodyQuotaPeriod();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuotaPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetProductQuotaResponseBodyQuotaPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

    }

    public static class GetProductQuotaResponseBodyQuotaQuotaItems extends TeaModel {
        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>801</p>
         */
        @NameInMap("Quota")
        public String quota;

        /**
         * <p>The quota unit.</p>
         * <blockquote>
         * <p>The unit varies for each quota. For example, the unit of the q_cbdch3 quota (maximum number of clusters) for Container Service for Kubernetes is Cluster, and the unit of the q_security-groups quota (maximum number of security groups) for Elastic Compute Service servers is count.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The quota item type. Valid values:</p>
         * <ul>
         * <li><p>BaseQuota: Base quota.</p>
         * </li>
         * <li><p>ReservedQuota: Reserved quota.</p>
         * </li>
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
         * <p>26</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static GetProductQuotaResponseBodyQuotaQuotaItems build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuotaQuotaItems self = new GetProductQuotaResponseBodyQuotaQuotaItems();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuotaQuotaItems setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

        public GetProductQuotaResponseBodyQuotaQuotaItems setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public GetProductQuotaResponseBodyQuotaQuotaItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProductQuotaResponseBodyQuotaQuotaItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class GetProductQuotaResponseBodyQuotaUsageMetric extends TeaModel {
        /**
         * <p>The CloudMonitor monitoring dimensions.</p>
         * <p>Format: a collection of <code>key:value</code> pairs. Example:
         * <code>{&quot;productCode&quot;:&quot;***&quot;,&quot;metricKey&quot;:&quot;***&quot;,&quot;regionId&quot;:&quot;***&quot;,&quot;label&quot;:&quot;***&quot;}</code>.</p>
         */
        @NameInMap("MetricDimensions")
        public java.util.Map<String, String> metricDimensions;

        /**
         * <p>The CloudMonitor metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>Usage</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The CloudMonitor metric namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_quotas_flowcontrol</p>
         */
        @NameInMap("MetricNamespace")
        public String metricNamespace;

        public static GetProductQuotaResponseBodyQuotaUsageMetric build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuotaUsageMetric self = new GetProductQuotaResponseBodyQuotaUsageMetric();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuotaUsageMetric setMetricDimensions(java.util.Map<String, String> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }
        public java.util.Map<String, String> getMetricDimensions() {
            return this.metricDimensions;
        }

        public GetProductQuotaResponseBodyQuotaUsageMetric setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetProductQuotaResponseBodyQuotaUsageMetric setMetricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        public String getMetricNamespace() {
            return this.metricNamespace;
        }

    }

    public static class GetProductQuotaResponseBodyQuota extends TeaModel {
        /**
         * <p>Indicates whether the quota is adjustable. Valid values:</p>
         * <ul>
         * <li><p>true: Adjustable.</p>
         * </li>
         * <li><p>false: Not adjustable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Adjustable")
        public Boolean adjustable;

        /**
         * <p>The applicable range for quota adjustment.</p>
         */
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        /**
         * <p>The type of quota adjustment. Valid values:</p>
         * <ul>
         * <li><p>continuous: Continuous.</p>
         * </li>
         * <li><p>discontinuous: Discontinuous.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>continuous</p>
         */
        @NameInMap("ApplicableType")
        public String applicableType;

        /**
         * <p>The sample reasons for applying for a quota adjustment.</p>
         * 
         * <strong>example:</strong>
         * <p>The business xxx is expected to grow by 50%.</p>
         */
        @NameInMap("ApplyReasonTips")
        public String applyReasonTips;

        /**
         * <p>Indicates whether the used quota is displayed. Valid values:</p>
         * <ul>
         * <li><p>true: The used quota is displayed.</p>
         * </li>
         * <li><p>false: The used quota is not displayed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Consumable")
        public Boolean consumable;

        /**
         * <p>The quota dimensions. Format: <code>{&quot;regionId&quot;:&quot;region&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The UTC time when the quota takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-28T06:06:00Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The UTC time when the quota expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-29T06:06:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the quota is a global quota. Valid values:</p>
         * <ul>
         * <li>true: The quota item is shared across all regions.</li>
         * <li>false: The quota item is independent for each region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalQuota")
        public Boolean globalQuota;

        /**
         * <p>The quota period.</p>
         */
        @NameInMap("Period")
        public GetProductQuotaResponseBodyQuotaPeriod period;

        /**
         * <p>The abbreviated name of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The ARN of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups/</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The quota category. Valid values:</p>
         * <ul>
         * <li><p>CommonQuota: General quota.</p>
         * </li>
         * <li><p>FlowControl: API rate limit.</p>
         * </li>
         * <li><p>WhiteListLabel: Privilege.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The quota description.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be owned by the current account.</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The quota details.</p>
         */
        @NameInMap("QuotaItems")
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems;

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Security Groups</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li><p>privilege: Privilege.</p>
         * </li>
         * <li><p>normal: Normal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The quota unit.</p>
         * <blockquote>
         * <p>The unit varies for each quota. For example, the unit of the q_cbdch3 quota (maximum number of clusters) for Container Service for Kubernetes is Cluster, and the unit of the q_security-groups quota (maximum number of security groups) for Elastic Compute Service servers is count.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The supported range of quota values for the current quota item, which can be used as a reference when configuring a quota template.</p>
         */
        @NameInMap("SupportedRange")
        public java.util.List<Float> supportedRange;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>801</p>
         */
        @NameInMap("TotalQuota")
        public Float totalQuota;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalUsage")
        public Float totalUsage;

        /**
         * <p>The reason why the quota cannot be adjusted. Valid values:</p>
         * <ul>
         * <li><p>nonactivated: The service is not activated.</p>
         * </li>
         * <li><p>applicationProcess: The quota application is being processed.</p>
         * </li>
         * <li><p>limitReached: The quota limit is reached.</p>
         * </li>
         * <li><p>supportTicketRequired: A ticket must be submitted for the application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>limitReached</p>
         */
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        /**
         * <p>The monitoring information of the quota usage in CloudMonitor.</p>
         * <blockquote>
         * <p>An empty value indicates that no monitoring data is available for this quota in CloudMonitor.</p>
         * </blockquote>
         */
        @NameInMap("UsageMetric")
        public GetProductQuotaResponseBodyQuotaUsageMetric usageMetric;

        public static GetProductQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuota self = new GetProductQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuota setAdjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        public GetProductQuotaResponseBodyQuota setApplicableRange(java.util.List<Float> applicableRange) {
            this.applicableRange = applicableRange;
            return this;
        }
        public java.util.List<Float> getApplicableRange() {
            return this.applicableRange;
        }

        public GetProductQuotaResponseBodyQuota setApplicableType(String applicableType) {
            this.applicableType = applicableType;
            return this;
        }
        public String getApplicableType() {
            return this.applicableType;
        }

        public GetProductQuotaResponseBodyQuota setApplyReasonTips(String applyReasonTips) {
            this.applyReasonTips = applyReasonTips;
            return this;
        }
        public String getApplyReasonTips() {
            return this.applyReasonTips;
        }

        public GetProductQuotaResponseBodyQuota setConsumable(Boolean consumable) {
            this.consumable = consumable;
            return this;
        }
        public Boolean getConsumable() {
            return this.consumable;
        }

        public GetProductQuotaResponseBodyQuota setDimensions(java.util.Map<String, ?> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, ?> getDimensions() {
            return this.dimensions;
        }

        public GetProductQuotaResponseBodyQuota setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public GetProductQuotaResponseBodyQuota setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetProductQuotaResponseBodyQuota setGlobalQuota(Boolean globalQuota) {
            this.globalQuota = globalQuota;
            return this;
        }
        public Boolean getGlobalQuota() {
            return this.globalQuota;
        }

        public GetProductQuotaResponseBodyQuota setPeriod(GetProductQuotaResponseBodyQuotaPeriod period) {
            this.period = period;
            return this;
        }
        public GetProductQuotaResponseBodyQuotaPeriod getPeriod() {
            return this.period;
        }

        public GetProductQuotaResponseBodyQuota setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetProductQuotaResponseBodyQuota setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetProductQuotaResponseBodyQuota setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public GetProductQuotaResponseBodyQuota setQuotaCategory(String quotaCategory) {
            this.quotaCategory = quotaCategory;
            return this;
        }
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        public GetProductQuotaResponseBodyQuota setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public GetProductQuotaResponseBodyQuota setQuotaItems(java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> getQuotaItems() {
            return this.quotaItems;
        }

        public GetProductQuotaResponseBodyQuota setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public GetProductQuotaResponseBodyQuota setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public GetProductQuotaResponseBodyQuota setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public GetProductQuotaResponseBodyQuota setSupportedRange(java.util.List<Float> supportedRange) {
            this.supportedRange = supportedRange;
            return this;
        }
        public java.util.List<Float> getSupportedRange() {
            return this.supportedRange;
        }

        public GetProductQuotaResponseBodyQuota setTotalQuota(Float totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Float getTotalQuota() {
            return this.totalQuota;
        }

        public GetProductQuotaResponseBodyQuota setTotalUsage(Float totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Float getTotalUsage() {
            return this.totalUsage;
        }

        public GetProductQuotaResponseBodyQuota setUnadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = unadjustableDetail;
            return this;
        }
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        public GetProductQuotaResponseBodyQuota setUsageMetric(GetProductQuotaResponseBodyQuotaUsageMetric usageMetric) {
            this.usageMetric = usageMetric;
            return this;
        }
        public GetProductQuotaResponseBodyQuotaUsageMetric getUsageMetric() {
            return this.usageMetric;
        }

    }

}
