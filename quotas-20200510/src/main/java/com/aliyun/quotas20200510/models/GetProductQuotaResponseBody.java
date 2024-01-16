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
         * <br>
         * <p>*   second</p>
         * <p>*   minute</p>
         * <p>*   hour</p>
         * <p>*   day</p>
         * <p>*   week</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The value of the calculation cycle of the quota.</p>
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
         */
        @NameInMap("Quota")
        public String quota;

        /**
         * <p>The unit of the quota.</p>
         * <br>
         * <p>>  The unit of each quota is unique. For example, the quota whose ID is `q_cbdch3` represents the maximum number of ACK clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.</p>
         */
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        /**
         * <p>The category of the quota. Valid values:</p>
         * <br>
         * <p>*   BaseQuota: base quota.</p>
         * <p>*   ReservedQuota: reserved quota.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The used quota.</p>
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

    public static class GetProductQuotaResponseBodyQuota extends TeaModel {
        /**
         * <p>Indicates whether the quota is adjustable. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
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
         * <br>
         * <p>*   continuous</p>
         * <p>*   discontinuous</p>
         */
        @NameInMap("ApplicableType")
        public String applicableType;

        /**
         * <p>The reason for submitting a quota increase request.</p>
         */
        @NameInMap("ApplyReasonTips")
        public String applyReasonTips;

        /**
         * <p>Indicates whether the system shows the used value of the quota. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Consumable")
        public Boolean consumable;

        /**
         * <p>The quota dimension. Format: `{"regionId":"Region"}`.</p>
         */
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        /**
         * <p>The start time of the validity period of the quota. Specify the value in UTC.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The end time of the validity period of the quota. Specify the value in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the quota is a global quota. Valid values:</p>
         * <br>
         * <p>*   true: The quota is shared in all regions.</p>
         * <p>*   false: The quota is independently used in a region.</p>
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
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         */
        @NameInMap("QuotaArn")
        public String quotaArn;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <br>
         * <p>*   CommonQuota: general quota</p>
         * <p>*   FlowControl: API rate limit</p>
         * <p>*   WhiteListLabel: whitelist quota</p>
         */
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        /**
         * <p>The description of the quota.</p>
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
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The type of the quota. Valid values:</p>
         * <br>
         * <p>*   privilege</p>
         * <p>*   normal (default value)</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The unit of the new quota value.</p>
         * <br>
         * <p>> The unit of each quota is unique.** For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.</p>
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
         */
        @NameInMap("TotalQuota")
        public Float totalQuota;

        /**
         * <p>The used quota.</p>
         */
        @NameInMap("TotalUsage")
        public Float totalUsage;

        /**
         * <p>The reason why the quota is not adjustable. Valid values:</p>
         * <br>
         * <p>*   nonactivated: The service is not activated.</p>
         * <p>*   applicationProcess: The application is being processed.</p>
         * <p>*   limitReached: The quota limit is reached.</p>
         * <p>*   supportTicketRequired: The quota can be increased only by submitting a ticket.</p>
         */
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

    }

}
