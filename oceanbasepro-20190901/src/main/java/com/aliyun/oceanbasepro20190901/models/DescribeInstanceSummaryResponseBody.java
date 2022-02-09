// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSummaryResponseBody extends TeaModel {
    @NameInMap("InstanceSummary")
    public DescribeInstanceSummaryResponseBodyInstanceSummary instanceSummary;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSummaryResponseBody self = new DescribeInstanceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSummaryResponseBody setInstanceSummary(DescribeInstanceSummaryResponseBodyInstanceSummary instanceSummary) {
        this.instanceSummary = instanceSummary;
        return this;
    }
    public DescribeInstanceSummaryResponseBodyInstanceSummary getInstanceSummary() {
        return this.instanceSummary;
    }

    public DescribeInstanceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceSummaryResponseBodyInstanceSummary extends TeaModel {
        @NameInMap("AlarmSummaryCount")
        public Long alarmSummaryCount;

        @NameInMap("AnomalySQLCount")
        public Long anomalySQLCount;

        @NameInMap("ExpiredInstancesCount")
        public Long expiredInstancesCount;

        @NameInMap("ImmediatelyExpiredInstancesCount")
        public Long immediatelyExpiredInstancesCount;

        @NameInMap("InsufficientDiskInstancesCount")
        public Long insufficientDiskInstancesCount;

        @NameInMap("OverLoadInstancesCount")
        public Long overLoadInstancesCount;

        @NameInMap("RunningInstancesCount")
        public Long runningInstancesCount;

        @NameInMap("TotalInstancesCount")
        public Long totalInstancesCount;

        public static DescribeInstanceSummaryResponseBodyInstanceSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSummaryResponseBodyInstanceSummary self = new DescribeInstanceSummaryResponseBodyInstanceSummary();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setAlarmSummaryCount(Long alarmSummaryCount) {
            this.alarmSummaryCount = alarmSummaryCount;
            return this;
        }
        public Long getAlarmSummaryCount() {
            return this.alarmSummaryCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setAnomalySQLCount(Long anomalySQLCount) {
            this.anomalySQLCount = anomalySQLCount;
            return this;
        }
        public Long getAnomalySQLCount() {
            return this.anomalySQLCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setExpiredInstancesCount(Long expiredInstancesCount) {
            this.expiredInstancesCount = expiredInstancesCount;
            return this;
        }
        public Long getExpiredInstancesCount() {
            return this.expiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setImmediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
            this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
            return this;
        }
        public Long getImmediatelyExpiredInstancesCount() {
            return this.immediatelyExpiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setInsufficientDiskInstancesCount(Long insufficientDiskInstancesCount) {
            this.insufficientDiskInstancesCount = insufficientDiskInstancesCount;
            return this;
        }
        public Long getInsufficientDiskInstancesCount() {
            return this.insufficientDiskInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setOverLoadInstancesCount(Long overLoadInstancesCount) {
            this.overLoadInstancesCount = overLoadInstancesCount;
            return this;
        }
        public Long getOverLoadInstancesCount() {
            return this.overLoadInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setRunningInstancesCount(Long runningInstancesCount) {
            this.runningInstancesCount = runningInstancesCount;
            return this;
        }
        public Long getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setTotalInstancesCount(Long totalInstancesCount) {
            this.totalInstancesCount = totalInstancesCount;
            return this;
        }
        public Long getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

    }

}
