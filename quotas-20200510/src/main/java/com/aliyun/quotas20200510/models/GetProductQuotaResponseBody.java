// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponseBody extends TeaModel {
    // The details about the quota.
    @NameInMap("Quota")
    public GetProductQuotaResponseBodyQuota quota;

    // The ID of the request.
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
        // The unit of the calculation cycle of the quota. Valid values:
        // 
        // *   second
        // *   minute
        // *   hour
        // *   day
        // *   week
        @NameInMap("PeriodUnit")
        public String periodUnit;

        // The value of the calculation cycle of the quota.
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
        // The value of the quota.
        @NameInMap("Quota")
        public String quota;

        // The unit of the quota. 
        // 
        // >  The unit of each quota is unique. For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is Number of security groups.
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        // The category of the quota. Valid values:
        // 
        // *   BaseQuota: base quota
        // *   ReservedQuota: reserved quota
        @NameInMap("Type")
        public String type;

        // The used quota.
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

    public static class GetProductQuotaResponseBodyQuota extends TeaModel {
        // Indicates whether the quota is adjustable. Valid values:
        // 
        // *   true
        // *   false
        @NameInMap("Adjustable")
        public Boolean adjustable;

        // The range of the quota value, for example, `[802,10000]`.
        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        // The type of the adjustable value. Valid values:
        // 
        // *   continuous
        // *   discontinuous
        @NameInMap("ApplicableType")
        public String applicableType;

        // Indicates whether the system shows the used value of the quota. Valid values:
        // 
        // *   true
        // *   false
        @NameInMap("Consumable")
        public Boolean consumable;

        // The quota dimensions. Format: `{"regionId":"Region"}`.
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        // The calculation cycle of the quota.
        @NameInMap("Period")
        public GetProductQuotaResponseBodyQuotaPeriod period;

        // The abbreviation of the Alibaba Cloud service name.
        @NameInMap("ProductCode")
        public String productCode;

        // The ID of the quota.
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        // The Alibaba Cloud Resource Name (ARN) of the quota.
        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("QuotaCategory")
        public String quotaCategory;

        // The description of the quota.
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        // The details about the quota.
        @NameInMap("QuotaItems")
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems;

        // The name of the quota.
        @NameInMap("QuotaName")
        public String quotaName;

        // The type of the quota. Valid values:
        // 
        // - privilege
        // - normal (default value)
        @NameInMap("QuotaType")
        public String quotaType;

        // The unit of the quota.
        // 
        // >  The unit of each quota is unique. For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        // The range of the quota value that can be requested for the current quota item. When you configure a quota template, you can use the range as a reference.  
        // 
        // - If the value of the ApplicableType parameter is continuous and the value of the ApplicableRange parameter is [802,1000], the quota value ranges from 802 to 1,000.
        // - If the value of the ApplicableType parameter is discontinuous and the value of the ApplicableRange parameter is [10,20,50,100], the quota value is 10, 20, 50, or 100.
        @NameInMap("SupportedRange")
        public java.util.List<Float> supportedRange;

        // The value of the quota.
        @NameInMap("TotalQuota")
        public Float totalQuota;

        // The used quota.
        @NameInMap("TotalUsage")
        public Float totalUsage;

        // The reason why the quota is not adjustable. Valid values:
        // 
        // *   nonactivated: The service is not activated.
        // *   applicationProcess: The application is being processed.
        // *   limitReached: The quota limit is reached.
        // *   supportTicketRequired: The quota can be increased only by submitting a ticket.
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

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

    }

}
