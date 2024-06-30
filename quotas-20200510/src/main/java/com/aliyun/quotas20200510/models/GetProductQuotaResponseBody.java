// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponseBody extends TeaModel {
    /**
     * <p>The details of the quota.</p>
     */
    @NameInMap("Quota")
    public GetProductQuotaResponseBodyQuota quota;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The unit of the calculation cycle of the quota. Valid values:</p>
         * <ul>
         * <li>second</li>
         * <li>minute</li>
         * <li>hour</li>
         * <li>day</li>
         * <li>week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle of the quota.</p>
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
         * <p>The value of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>801</p>
         */
        @NameInMap("Quota")
        public String quota;

        /**
         * <p>The unit of the quota.</p>
         * <blockquote>
         * <p> The unit of each quota is unique. For example, the quota whose ID is <code>q_cbdch3</code> represents the maximum number of ACK clusters. The unit of this quota is clusters. The quota whose ID is <code>q_security-groups</code> represents the maximum number of security groups. The unit of this quota is security groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The category of the quota. Valid values:</p>
         * <ul>
         * <li>BaseQuota: base quota.</li>
         * <li>ReservedQuota: reserved quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BaseQuota</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The used quota.</p>
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
        @NameInMap("MetricDimensions")
        public java.util.Map<String, String> metricDimensions;

        @NameInMap("MetricName")
        public String metricName;

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
         * <p>The range of the quota value.</p>
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
         * <p>continuous</p>
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
         * <p>The quota dimension. Format: <code>{&quot;regionId&quot;:&quot;Region&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. Specify the value in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-28T06:06:00Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The end time of the validity period of the quota. Specify the value in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-29T06:06:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the quota is a global quota. Valid values:</p>
         * <ul>
         * <li>true: The quota is shared in all regions.</li>
         * <li>false: The quota is independently used in a region.</li>
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
        public GetProductQuotaResponseBodyQuotaPeriod period;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups/</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota</li>
         * <li>FlowControl: API rate limit</li>
         * <li>WhiteListLabel: whitelist quota</li>
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
         * <p>The maximum number of security groups that can be owned by the current account</p>
         */
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        /**
         * <p>The details of the quotas.</p>
         */
        @NameInMap("QuotaItems")
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Security Groups</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li>privilege</li>
         * <li>normal (default value)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The unit of the new quota value.</p>
         * <blockquote>
         * <p>The unit of each quota is unique.** For example, the quota whose ID is <code>q_cbdch3</code> represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is <code>q_security-groups</code> represents the maximum number of security groups. The unit of this quota is security groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The range of the quota value.</p>
         */
        @NameInMap("SupportedRange")
        public java.util.List<Float> supportedRange;

        /**
         * <p>The value of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>801</p>
         */
        @NameInMap("TotalQuota")
        public Float totalQuota;

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalUsage")
        public Float totalUsage;

        /**
         * <p>The reason why the quota is not adjustable. Valid values:</p>
         * <ul>
         * <li>nonactivated: The service is not activated.</li>
         * <li>applicationProcess: The application is being processed.</li>
         * <li>limitReached: The quota limit is reached.</li>
         * <li>supportTicketRequired: The quota can be increased only by submitting a ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>limitReached</p>
         */
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

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
