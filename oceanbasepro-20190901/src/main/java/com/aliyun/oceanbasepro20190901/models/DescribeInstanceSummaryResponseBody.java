// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSummaryResponseBody extends TeaModel {
    /**
     * <p>The overview information about OceanBase instances.</p>
     */
    @NameInMap("InstanceSummary")
    public DescribeInstanceSummaryResponseBodyInstanceSummary instanceSummary;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The number of expired instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredInstancesCount")
        public Long expiredInstancesCount;

        /**
         * <p>The number of instances about to expire.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImmediatelyExpiredInstancesCount")
        public Long immediatelyExpiredInstancesCount;

        /**
         * <p>The number of recently created instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecentCreatedInstancesCount")
        public Long recentCreatedInstancesCount;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The total number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstancesCount")
        public Long runningInstancesCount;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalInstancesCount")
        public Long totalInstancesCount;

        public static DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList self = new DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setExpiredInstancesCount(Long expiredInstancesCount) {
            this.expiredInstancesCount = expiredInstancesCount;
            return this;
        }
        public Long getExpiredInstancesCount() {
            return this.expiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setImmediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
            this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
            return this;
        }
        public Long getImmediatelyExpiredInstancesCount() {
            return this.immediatelyExpiredInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRecentCreatedInstancesCount(Long recentCreatedInstancesCount) {
            this.recentCreatedInstancesCount = recentCreatedInstancesCount;
            return this;
        }
        public Long getRecentCreatedInstancesCount() {
            return this.recentCreatedInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setRunningInstancesCount(Long runningInstancesCount) {
            this.runningInstancesCount = runningInstancesCount;
            return this;
        }
        public Long getRunningInstancesCount() {
            return this.runningInstancesCount;
        }

        public DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList setTotalInstancesCount(Long totalInstancesCount) {
            this.totalInstancesCount = totalInstancesCount;
            return this;
        }
        public Long getTotalInstancesCount() {
            return this.totalInstancesCount;
        }

    }

    public static class DescribeInstanceSummaryResponseBodyInstanceSummary extends TeaModel {
        /**
         * <p>The total number of alerts during the query period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmSummaryCount")
        public Long alarmSummaryCount;

        /**
         * <p>The total number of abnormal SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnomalySQLCount")
        public Long anomalySQLCount;

        /**
         * <p>The number of cluster instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterInstancesCount")
        public Long clusterInstancesCount;

        /**
         * <p>The number of expired instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpiredInstancesCount")
        public Long expiredInstancesCount;

        /**
         * <p>The total number of expired instances to be released.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImmediatelyExpiredInstancesCount")
        public Long immediatelyExpiredInstancesCount;

        /**
         * <p>The total number of clusters with capacity risks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InsufficientDiskInstancesCount")
        public Long insufficientDiskInstancesCount;

        /**
         * <p>The number of overloaded instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OverLoadInstancesCount")
        public Long overLoadInstancesCount;

        /**
         * <p>A list of regional instances.</p>
         */
        @NameInMap("RegionalInstanceSummaryList")
        public java.util.List<DescribeInstanceSummaryResponseBodyInstanceSummaryRegionalInstanceSummaryList> regionalInstanceSummaryList;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstancesCount")
        public Long runningInstancesCount;

        /**
         * <p>The number of tenant instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantInstancesCount")
        public Long tenantInstancesCount;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalInstancesCount")
        public Long totalInstancesCount;

        /**
         * <p>The number of data transmission instances.</p>
         * 
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
