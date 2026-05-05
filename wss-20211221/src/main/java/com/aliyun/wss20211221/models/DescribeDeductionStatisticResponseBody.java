// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeductionStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDeductionStatisticResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A1B2C3D4-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeductionStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductionStatisticResponseBody self = new DescribeDeductionStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeductionStatisticResponseBody setData(DescribeDeductionStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDeductionStatisticResponseBodyData getData() {
        return this.data;
    }

    public DescribeDeductionStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDeductionStatisticResponseBodyDataAvailableCorePackages extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-12-31 23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2024-12-31 23:59:59</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>g-xxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>CoreHour</p>
         */
        @NameInMap("GroupResourceType")
        public String groupResourceType;

        @NameInMap("NoLx")
        public Boolean noLx;

        @NameInMap("NoLxSource")
        public String noLxSource;

        /**
         * <strong>example:</strong>
         * <p>res-xxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>CoreHour</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalTime")
        public Long totalTime;

        @NameInMap("UsedTime")
        public Long usedTime;

        public static DescribeDeductionStatisticResponseBodyDataAvailableCorePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductionStatisticResponseBodyDataAvailableCorePackages self = new DescribeDeductionStatisticResponseBodyDataAvailableCorePackages();
            return TeaModel.build(map, self);
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setGroupResourceType(String groupResourceType) {
            this.groupResourceType = groupResourceType;
            return this;
        }
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setNoLx(Boolean noLx) {
            this.noLx = noLx;
            return this;
        }
        public Boolean getNoLx() {
            return this.noLx;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setNoLxSource(String noLxSource) {
            this.noLxSource = noLxSource;
            return this;
        }
        public String getNoLxSource() {
            return this.noLxSource;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeDeductionStatisticResponseBodyDataAvailableCorePackages setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

    }

    public static class DescribeDeductionStatisticResponseBodyDataDeductions extends TeaModel {
        @NameInMap("ConsumeSecond")
        public Long consumeSecond;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("DeductionDate")
        public String deductionDate;

        /**
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeDeductionStatisticResponseBodyDataDeductions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductionStatisticResponseBodyDataDeductions self = new DescribeDeductionStatisticResponseBodyDataDeductions();
            return TeaModel.build(map, self);
        }

        public DescribeDeductionStatisticResponseBodyDataDeductions setConsumeSecond(Long consumeSecond) {
            this.consumeSecond = consumeSecond;
            return this;
        }
        public Long getConsumeSecond() {
            return this.consumeSecond;
        }

        public DescribeDeductionStatisticResponseBodyDataDeductions setDeductionDate(String deductionDate) {
            this.deductionDate = deductionDate;
            return this;
        }
        public String getDeductionDate() {
            return this.deductionDate;
        }

        public DescribeDeductionStatisticResponseBodyDataDeductions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeDeductionStatisticResponseBodyDataUsages extends TeaModel {
        @NameInMap("ConsumeSecond")
        public Long consumeSecond;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeDeductionStatisticResponseBodyDataUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductionStatisticResponseBodyDataUsages self = new DescribeDeductionStatisticResponseBodyDataUsages();
            return TeaModel.build(map, self);
        }

        public DescribeDeductionStatisticResponseBodyDataUsages setConsumeSecond(Long consumeSecond) {
            this.consumeSecond = consumeSecond;
            return this;
        }
        public Long getConsumeSecond() {
            return this.consumeSecond;
        }

        public DescribeDeductionStatisticResponseBodyDataUsages setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeDeductionStatisticResponseBodyDataUsages setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeDeductionStatisticResponseBodyData extends TeaModel {
        @NameInMap("AvailableCorePackages")
        public java.util.List<DescribeDeductionStatisticResponseBodyDataAvailableCorePackages> availableCorePackages;

        @NameInMap("Deductions")
        public java.util.List<DescribeDeductionStatisticResponseBodyDataDeductions> deductions;

        @NameInMap("Usages")
        public java.util.List<DescribeDeductionStatisticResponseBodyDataUsages> usages;

        public static DescribeDeductionStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeductionStatisticResponseBodyData self = new DescribeDeductionStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDeductionStatisticResponseBodyData setAvailableCorePackages(java.util.List<DescribeDeductionStatisticResponseBodyDataAvailableCorePackages> availableCorePackages) {
            this.availableCorePackages = availableCorePackages;
            return this;
        }
        public java.util.List<DescribeDeductionStatisticResponseBodyDataAvailableCorePackages> getAvailableCorePackages() {
            return this.availableCorePackages;
        }

        public DescribeDeductionStatisticResponseBodyData setDeductions(java.util.List<DescribeDeductionStatisticResponseBodyDataDeductions> deductions) {
            this.deductions = deductions;
            return this;
        }
        public java.util.List<DescribeDeductionStatisticResponseBodyDataDeductions> getDeductions() {
            return this.deductions;
        }

        public DescribeDeductionStatisticResponseBodyData setUsages(java.util.List<DescribeDeductionStatisticResponseBodyDataUsages> usages) {
            this.usages = usages;
            return this;
        }
        public java.util.List<DescribeDeductionStatisticResponseBodyDataUsages> getUsages() {
            return this.usages;
        }

    }

}
