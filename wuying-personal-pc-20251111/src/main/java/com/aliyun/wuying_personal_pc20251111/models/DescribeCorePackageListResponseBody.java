// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeCorePackageListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CorePackageInfo")
    public DescribeCorePackageListResponseBodyCorePackageInfo corePackageInfo;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeCorePackageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCorePackageListResponseBody self = new DescribeCorePackageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCorePackageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCorePackageListResponseBody setCorePackageInfo(DescribeCorePackageListResponseBodyCorePackageInfo corePackageInfo) {
        this.corePackageInfo = corePackageInfo;
        return this;
    }
    public DescribeCorePackageListResponseBodyCorePackageInfo getCorePackageInfo() {
        return this.corePackageInfo;
    }

    public DescribeCorePackageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCorePackageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCorePackageListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods extends TeaModel {
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        @NameInMap("RemainingCoreHours")
        public Float remainingCoreHours;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCoreHours")
        public Float totalCoreHours;

        @NameInMap("UsedCoreHours")
        public Float usedCoreHours;

        public static DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods self = new DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods();
            return TeaModel.build(map, self);
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setRemainingCoreHours(Float remainingCoreHours) {
            this.remainingCoreHours = remainingCoreHours;
            return this;
        }
        public Float getRemainingCoreHours() {
            return this.remainingCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setTotalCoreHours(Float totalCoreHours) {
            this.totalCoreHours = totalCoreHours;
            return this;
        }
        public Float getTotalCoreHours() {
            return this.totalCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods setUsedCoreHours(Float usedCoreHours) {
            this.usedCoreHours = usedCoreHours;
            return this;
        }
        public Float getUsedCoreHours() {
            return this.usedCoreHours;
        }

    }

    public static class DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList extends TeaModel {
        @NameInMap("AssignedCoreHours")
        public Float assignedCoreHours;

        @NameInMap("DeductionInstanceList")
        public java.util.List<?> deductionInstanceList;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RemainingCoreHours")
        public Float remainingCoreHours;

        @NameInMap("RemainingPeriods")
        public java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods> remainingPeriods;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCoreHours")
        public Float totalCoreHours;

        @NameInMap("UnassignedCoreHours")
        public Float unassignedCoreHours;

        @NameInMap("UsedCoreHours")
        public Float usedCoreHours;

        public static DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList self = new DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList();
            return TeaModel.build(map, self);
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setAssignedCoreHours(Float assignedCoreHours) {
            this.assignedCoreHours = assignedCoreHours;
            return this;
        }
        public Float getAssignedCoreHours() {
            return this.assignedCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setDeductionInstanceList(java.util.List<?> deductionInstanceList) {
            this.deductionInstanceList = deductionInstanceList;
            return this;
        }
        public java.util.List<?> getDeductionInstanceList() {
            return this.deductionInstanceList;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setRemainingCoreHours(Float remainingCoreHours) {
            this.remainingCoreHours = remainingCoreHours;
            return this;
        }
        public Float getRemainingCoreHours() {
            return this.remainingCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setRemainingPeriods(java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods> remainingPeriods) {
            this.remainingPeriods = remainingPeriods;
            return this;
        }
        public java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageListRemainingPeriods> getRemainingPeriods() {
            return this.remainingPeriods;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setTotalCoreHours(Float totalCoreHours) {
            this.totalCoreHours = totalCoreHours;
            return this;
        }
        public Float getTotalCoreHours() {
            return this.totalCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setUnassignedCoreHours(Float unassignedCoreHours) {
            this.unassignedCoreHours = unassignedCoreHours;
            return this;
        }
        public Float getUnassignedCoreHours() {
            return this.unassignedCoreHours;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList setUsedCoreHours(Float usedCoreHours) {
            this.usedCoreHours = usedCoreHours;
            return this;
        }
        public Float getUsedCoreHours() {
            return this.usedCoreHours;
        }

    }

    public static class DescribeCorePackageListResponseBodyCorePackageInfo extends TeaModel {
        @NameInMap("CorePackageList")
        public java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList> corePackageList;

        @NameInMap("SummaryRemainingCoreHours")
        public Float summaryRemainingCoreHours;

        public static DescribeCorePackageListResponseBodyCorePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCorePackageListResponseBodyCorePackageInfo self = new DescribeCorePackageListResponseBodyCorePackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCorePackageListResponseBodyCorePackageInfo setCorePackageList(java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList> corePackageList) {
            this.corePackageList = corePackageList;
            return this;
        }
        public java.util.List<DescribeCorePackageListResponseBodyCorePackageInfoCorePackageList> getCorePackageList() {
            return this.corePackageList;
        }

        public DescribeCorePackageListResponseBodyCorePackageInfo setSummaryRemainingCoreHours(Float summaryRemainingCoreHours) {
            this.summaryRemainingCoreHours = summaryRemainingCoreHours;
            return this;
        }
        public Float getSummaryRemainingCoreHours() {
            return this.summaryRemainingCoreHours;
        }

    }

}
