// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasResponseBody extends TeaModel {
    // The maximum number of records that are returned for the query.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position at which the query ends. An empty value indicates that all data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The details of the quotas.
    @NameInMap("Quotas")
    public java.util.List<ListProductQuotasResponseBodyQuotas> quotas;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of records that are returned for the query.
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
        // The unit of the calculation cycle. Valid values:
        // 
        // *   second
        // *   minute
        // *   hour
        // *   day
        // *   week
        @NameInMap("PeriodUnit")
        public String periodUnit;

        // The value of the calculation cycle.
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
        // The value of the quota.
        @NameInMap("Quota")
        public String quota;

        // The unit of the new quota value.
        // 
        // **
        // 
        // **The unit of each quota is unique.** For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.
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

    public static class ListProductQuotasResponseBodyQuotas extends TeaModel {
        // Indicates whether the quota is adjustable. Valid values:
        // 
        // *   true: The quota is adjustable.
        // *   false: The quota is not adjustable.
        @NameInMap("Adjustable")
        public Boolean adjustable;

        // None.
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
        // *   true: The system shows the used value of the quota.
        // *   false: The system does not show the used value of the quota.
        @NameInMap("Consumable")
        public Boolean consumable;

        // The quota dimensions. Format: `{"regionId":"Region"}`.
        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        // The start time of the validity period of the quota. The value is displayed in UTC.
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        // The end time of the validity period of the quota. The value is displayed in UTC.
        @NameInMap("ExpireTime")
        public String expireTime;

        // The calculation cycle of the quota.
        @NameInMap("Period")
        public ListProductQuotasResponseBodyQuotasPeriod period;

        // The abbreviation of the Alibaba Cloud service name.
        @NameInMap("ProductCode")
        public String productCode;

        // The ID of the quota.
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        // The Alibaba Cloud Resource Name (ARN) of the quota.
        @NameInMap("QuotaArn")
        public String quotaArn;

        // The type of the quota.
        // 
        // *   CommonQuota: general quota
        // *   FlowControl: API rate limit
        // *   WhiteListLabel: whitelist quota
        @NameInMap("QuotaCategory")
        public String quotaCategory;

        // The description of the quota.
        @NameInMap("QuotaDescription")
        public String quotaDescription;

        // The details of the quotas.
        @NameInMap("QuotaItems")
        public java.util.List<ListProductQuotasResponseBodyQuotasQuotaItems> quotaItems;

        // The name of the quota.
        @NameInMap("QuotaName")
        public String quotaName;

        // The type of the quota. Valid values:
        // 
        // *   privilege
        // *   normal
        @NameInMap("QuotaType")
        public String quotaType;

        // The unit of the new quota value.
        // 
        // **
        // 
        // **The unit of each quota is unique.** For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        // None.
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
        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

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

    }

}
