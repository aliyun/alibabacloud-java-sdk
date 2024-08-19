// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSummaryResponseBody extends TeaModel {
    @NameInMap("InstanceSummary")
    public DescribeInstanceSummaryResponseBodyInstanceSummary instanceSummary;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
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

    public static class DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredInstancesCount")
        public String expiredInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImmediatelyExpiredInstancesCount")
        public String immediatelyExpiredInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecentCreatedInstancesCount")
        public String recentCreatedInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstancesCount")
        public String runningInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalInstancesCount")
        public String totalInstancesCount;

        public static DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList self = new DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setExpiredInstancesCount(String expiredInstancesCount) {
            this.expiredInstancesCount = expiredInstancesCount;
            return this;
        }
        public String getExpiredInstancesCount() {
            return this.expiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setImmediatelyExpiredInstancesCount(String immediatelyExpiredInstancesCount) {
            this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
            return this;
        }
        public String getImmediatelyExpiredInstancesCount() {
            return this.immediatelyExpiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRecentCreatedInstancesCount(String recentCreatedInstancesCount) {
            this.recentCreatedInstancesCount = recentCreatedInstancesCount;
            return this;
        }
        public String getRecentCreatedInstancesCount() {
            return this.recentCreatedInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRunningInstancesCount(String runningInstancesCount) {
            this.runningInstancesCount = runningInstancesCount;
            return this;
        }
        public String getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setTotalInstancesCount(String totalInstancesCount) {
            this.totalInstancesCount = totalInstancesCount;
            return this;
        }
        public String getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

    }

    public static class DescribeInstanceSummaryResponseBodyInstanceSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmSummaryCount")
        public Long alarmSummaryCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnomalySQLCount")
        public Long anomalySQLCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterInstancesCount")
        public Long clusterInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredInstancesCount")
        public Long expiredInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImmediatelyExpiredInstancesCount")
        public Long immediatelyExpiredInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InsufficientDiskInstancesCount")
        public Long insufficientDiskInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OverLoadInstancesCount")
        public Long overLoadInstancesCount;

        @NameInMap("RegionalInstanceSummaryList")
        public java.util.List<DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList> regionalInstanceSummaryList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstancesCount")
        public Long runningInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantInstancesCount")
        public Long tenantInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalInstancesCount")
        public Long totalInstancesCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalOmsInstancesCount")
        public Long totalOmsInstancesCount;

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

        public DescribeInstanceSummaryResponseBodyInstanceSummary setClusterInstancesCount(Long clusterInstancesCount) {
            this.clusterInstancesCount = clusterInstancesCount;
            return this;
        }
        public Long getClusterInstancesCount() {
            return this.clusterInstancesCount;
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

        public DescribeInstanceSummaryResponseBodyInstanceSummary setRegionalInstanceSummaryList(java.util.List<DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList> regionalInstanceSummaryList) {
            this.regionalInstanceSummaryList = regionalInstanceSummaryList;
            return this;
        }
        public java.util.List<DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList> getRegionalInstanceSummaryList() {
            return this.regionalInstanceSummaryList;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setRunningInstancesCount(Long runningInstancesCount) {
            this.runningInstancesCount = runningInstancesCount;
            return this;
        }
        public Long getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setTenantInstancesCount(Long tenantInstancesCount) {
            this.tenantInstancesCount = tenantInstancesCount;
            return this;
        }
        public Long getTenantInstancesCount() {
            return this.tenantInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setTotalInstancesCount(Long totalInstancesCount) {
            this.totalInstancesCount = totalInstancesCount;
            return this;
        }
        public Long getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummary setTotalOmsInstancesCount(Long totalOmsInstancesCount) {
            this.totalOmsInstancesCount = totalOmsInstancesCount;
            return this;
        }
        public Long getTotalOmsInstancesCount() {
            return this.totalOmsInstancesCount;
        }

    }

}
