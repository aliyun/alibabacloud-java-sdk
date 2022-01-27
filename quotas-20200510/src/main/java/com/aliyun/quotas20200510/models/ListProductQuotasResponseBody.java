// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotasResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Quotas")
    public java.util.List<ListProductQuotasResponseBodyQuotas> quotas;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PeriodUnit")
        public String periodUnit;

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
        @NameInMap("Quota")
        public String quota;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Adjustable")
        public Boolean adjustable;

        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        @NameInMap("ApplicableType")
        public String applicableType;

        @NameInMap("Consumable")
        public Boolean consumable;

        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        @NameInMap("Period")
        public ListProductQuotasResponseBodyQuotasPeriod period;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("QuotaItems")
        public java.util.List<ListProductQuotasResponseBodyQuotasQuotaItems> quotaItems;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("QuotaType")
        public String quotaType;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("TotalQuota")
        public Float totalQuota;

        @NameInMap("TotalUsage")
        public Float totalUsage;

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
