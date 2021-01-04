// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Quota")
    public GetProductQuotaResponseBodyQuota quota;

    public static GetProductQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaResponseBody self = new GetProductQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductQuotaResponseBody setQuota(GetProductQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetProductQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public static class GetProductQuotaResponseBodyQuotaPeriod extends TeaModel {
        @NameInMap("PeriodValue")
        public Integer periodValue;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        public static GetProductQuotaResponseBodyQuotaPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuotaPeriod self = new GetProductQuotaResponseBodyQuotaPeriod();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuotaPeriod setPeriodValue(Integer periodValue) {
            this.periodValue = periodValue;
            return this;
        }
        public Integer getPeriodValue() {
            return this.periodValue;
        }

        public GetProductQuotaResponseBodyQuotaPeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

    }

    public static class GetProductQuotaResponseBodyQuotaQuotaItems extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Quota")
        public String quota;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("Usage")
        public String usage;

        public static GetProductQuotaResponseBodyQuotaQuotaItems build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuotaQuotaItems self = new GetProductQuotaResponseBodyQuotaQuotaItems();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuotaQuotaItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public GetProductQuotaResponseBodyQuotaQuotaItems setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class GetProductQuotaResponseBodyQuota extends TeaModel {
        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("TotalUsage")
        public Float totalUsage;

        @NameInMap("ApplicableRange")
        public java.util.List<Float> applicableRange;

        @NameInMap("QuotaType")
        public String quotaType;

        @NameInMap("QuotaDescription")
        public String quotaDescription;

        @NameInMap("Period")
        public GetProductQuotaResponseBodyQuotaPeriod period;

        @NameInMap("QuotaArn")
        public String quotaArn;

        @NameInMap("ApplicableType")
        public String applicableType;

        @NameInMap("QuotaItems")
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems;

        @NameInMap("Dimensions")
        public java.util.Map<String, ?> dimensions;

        @NameInMap("Adjustable")
        public Boolean adjustable;

        @NameInMap("QuotaName")
        public String quotaName;

        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        @NameInMap("Consumable")
        public Boolean consumable;

        @NameInMap("TotalQuota")
        public Float totalQuota;

        @NameInMap("ProductCode")
        public String productCode;

        public static GetProductQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaResponseBodyQuota self = new GetProductQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaResponseBodyQuota setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public GetProductQuotaResponseBodyQuota setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetProductQuotaResponseBodyQuota setTotalUsage(Float totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Float getTotalUsage() {
            return this.totalUsage;
        }

        public GetProductQuotaResponseBodyQuota setApplicableRange(java.util.List<Float> applicableRange) {
            this.applicableRange = applicableRange;
            return this;
        }
        public java.util.List<Float> getApplicableRange() {
            return this.applicableRange;
        }

        public GetProductQuotaResponseBodyQuota setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public GetProductQuotaResponseBodyQuota setQuotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        public GetProductQuotaResponseBodyQuota setPeriod(GetProductQuotaResponseBodyQuotaPeriod period) {
            this.period = period;
            return this;
        }
        public GetProductQuotaResponseBodyQuotaPeriod getPeriod() {
            return this.period;
        }

        public GetProductQuotaResponseBodyQuota setQuotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }
        public String getQuotaArn() {
            return this.quotaArn;
        }

        public GetProductQuotaResponseBodyQuota setApplicableType(String applicableType) {
            this.applicableType = applicableType;
            return this;
        }
        public String getApplicableType() {
            return this.applicableType;
        }

        public GetProductQuotaResponseBodyQuota setQuotaItems(java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }
        public java.util.List<GetProductQuotaResponseBodyQuotaQuotaItems> getQuotaItems() {
            return this.quotaItems;
        }

        public GetProductQuotaResponseBodyQuota setDimensions(java.util.Map<String, ?> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, ?> getDimensions() {
            return this.dimensions;
        }

        public GetProductQuotaResponseBodyQuota setAdjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        public GetProductQuotaResponseBodyQuota setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public GetProductQuotaResponseBodyQuota setUnadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = unadjustableDetail;
            return this;
        }
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        public GetProductQuotaResponseBodyQuota setConsumable(Boolean consumable) {
            this.consumable = consumable;
            return this;
        }
        public Boolean getConsumable() {
            return this.consumable;
        }

        public GetProductQuotaResponseBodyQuota setTotalQuota(Float totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Float getTotalQuota() {
            return this.totalQuota;
        }

        public GetProductQuotaResponseBodyQuota setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
