// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLHistoryListResponseBody extends TeaModel {
    /**
     * <p>The list of SQL execution history.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOasSQLHistoryListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOasSQLHistoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLHistoryListResponseBody self = new DescribeOasSQLHistoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLHistoryListResponseBody setData(java.util.List<DescribeOasSQLHistoryListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOasSQLHistoryListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOasSQLHistoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOasSQLHistoryListResponseBodyData extends TeaModel {
        /**
         * <p>Average updated rows during the execution period.</p>
         */
        @NameInMap("AvgAffectedRows")
        public Long avgAffectedRows;

        /**
         * <p>Average Application event wait time (in milliseconds) during the client waiting period.</p>
         */
        @NameInMap("AvgApplicationWaitTime")
        public Double avgApplicationWaitTime;

        /**
         * <p>Average BlockCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBlockCacheHit")
        public Long avgBlockCacheHit;

        /**
         * <p>Average BlockIndexCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBlockIndexCacheHit")
        public Long avgBlockIndexCacheHit;

        /**
         * <p>Average BloomFilterCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBloomFilterCacheHit")
        public Long avgBloomFilterCacheHit;

        /**
         * <p>Average Concurrency event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgConcurrencyWaitTime")
        public Double avgConcurrencyWaitTime;

        /**
         * <p>Average CPU time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>Average syntax parsing time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgDecodeTime")
        public Double avgDecodeTime;

        /**
         * <p>Average physical read count during the execution period.</p>
         */
        @NameInMap("AvgDiskReads")
        public Long avgDiskReads;

        /**
         * <p>Average response time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        /**
         * <p>Average plan execution time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgExecuteTime")
        public Double avgExecuteTime;

        /**
         * <p>Average number of RPC requests executed during the execution period.</p>
         */
        @NameInMap("AvgExecutorRpcCount")
        public Double avgExecutorRpcCount;

        /**
         * <p>Average degree of parallelism during the execution period.</p>
         */
        @NameInMap("AvgExpectedWorkerCount")
        public Double avgExpectedWorkerCount;

        /**
         * <p>Average plan generation time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        /**
         * <p>Average logical reads during the execution period.</p>
         */
        @NameInMap("AvgLogicalReads")
        public Long avgLogicalReads;

        /**
         * <p>Average Memstore read rows during the execution period.</p>
         */
        @NameInMap("AvgMemstoreReadRows")
        public Long avgMemstoreReadRows;

        /**
         * <p>Average network transmission time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgNetTime")
        public Double avgNetTime;

        /**
         * <p>Average network enqueue time (in milliseconds) during the network waiting period.</p>
         */
        @NameInMap("AvgNetWaitTime")
        public Double avgNetWaitTime;

        /**
         * <p>Average number of partition accessed during the execution period.</p>
         */
        @NameInMap("AvgPartitionCount")
        public Double avgPartitionCount;

        /**
         * <p>Average queueing time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgQueueTime")
        public Double avgQueueTime;

        /**
         * <p>Average number of rows returned during the execution period.</p>
         */
        @NameInMap("AvgReturnRows")
        public Long avgReturnRows;

        /**
         * <p>Average RowCache hit count during the execution period.</p>
         */
        @NameInMap("AvgRowCacheHit")
        public Long avgRowCacheHit;

        /**
         * <p>Average number of RPC sent during the execution.</p>
         */
        @NameInMap("AvgRpcCount")
        public Long avgRpcCount;

        /**
         * <p>Average Schedule event wait time (in milliseconds) during the scheduling period.</p>
         */
        @NameInMap("AvgScheduleTime")
        public Double avgScheduleTime;

        /**
         * <p>Average Ssstore read rows during the execution period.</p>
         */
        @NameInMap("AvgSsstoreReadRows")
        public Long avgSsstoreReadRows;

        /**
         * <p>Average number of threads used of the SQL during the execution period.</p>
         */
        @NameInMap("AvgUsedWorkerCount")
        public Double avgUsedWorkerCount;

        /**
         * <p>Average UserIO event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgUserIoWaitTime")
        public Double avgUserIoWaitTime;

        /**
         * <p>Average number of waits during the execution period.</p>
         */
        @NameInMap("AvgWaitCount")
        public Double avgWaitCount;

        /**
         * <p>Average wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgWaitTime")
        public Double avgWaitTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Distributed plan percentage during the execution period.</p>
         */
        @NameInMap("DistPlanPercentage")
        public Double distPlanPercentage;

        /**
         * <p>Average execution count per second during the execution period.</p>
         */
        @NameInMap("ExecPs")
        public Double execPs;

        /**
         * <p>Total number of executions during the execution period.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>The total number of errors during the execution period.</p>
         */
        @NameInMap("FailCount")
        public Long failCount;

        /**
         * <p>Error percentage during the execution period.</p>
         */
        @NameInMap("FailPercentage")
        public Double failPercentage;

        /**
         * <p>Local plan percentage during the execution period.</p>
         */
        @NameInMap("LocalPlanPercentage")
        public Double localPlanPercentage;

        /**
         * <p>Max updated rows during the execution period.</p>
         */
        @NameInMap("MaxAffectedRows")
        public Double maxAffectedRows;

        /**
         * <p>Max Application event wait time (in milliseconds) during the execution period</p>
         */
        @NameInMap("MaxApplicationWaitTime")
        public Double maxApplicationWaitTime;

        /**
         * <p>Max Concurrency event wait time (in milliseconds) during the execution period</p>
         */
        @NameInMap("MaxConcurrencyWaitTime")
        public Double maxConcurrencyWaitTime;

        /**
         * <p>Max CPU time.</p>
         */
        @NameInMap("MaxCpuTime")
        public Double maxCpuTime;

        /**
         * <p>Max physical read count during the execution period.</p>
         */
        @NameInMap("MaxDiskReads")
        public Double maxDiskReads;

        /**
         * <p>Max response time.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Double maxElapsedTime;

        /**
         * <p>Max returned rows during the execution period.</p>
         */
        @NameInMap("MaxReturnRows")
        public Double maxReturnRows;

        /**
         * <p>Max UserIO event wait time (in milliseconds) during the execution period</p>
         */
        @NameInMap("MaxUserIoWaitTime")
        public Double maxUserIoWaitTime;

        /**
         * <p>Max wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("MaxWaitTime")
        public Double maxWaitTime;

        /**
         * <p>Plan hit rage during the execution period.</p>
         */
        @NameInMap("MissPlanPercentage")
        public Double missPlanPercentage;

        /**
         * <p>Missed plan count.</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>Remote plan percentage during the execution period.</p>
         */
        @NameInMap("RemotePlanPercentage")
        public Double remotePlanPercentage;

        /**
         * <p>Remote plan count.</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>Number of occurrences of code 4012 during the execution period.</p>
         */
        @NameInMap("RetCode4012Count")
        public Double retCode4012Count;

        /**
         * <p>Number of occurrences of code 4013 during the execution period.</p>
         */
        @NameInMap("RetCode4013Count")
        public Double retCode4013Count;

        /**
         * <p>Number of occurrences of code 5001 during the execution period.</p>
         */
        @NameInMap("RetCode5001Count")
        public Double retCode5001Count;

        /**
         * <p>Number of occurrences of code 5024 during the execution period.</p>
         */
        @NameInMap("RetCode5024Count")
        public Double retCode5024Count;

        /**
         * <p>Number of occurrences of code 5167 during the execution period.</p>
         */
        @NameInMap("RetCode5167Count")
        public Double retCode5167Count;

        /**
         * <p>Number of occurrences of code 5217 during the execution period.</p>
         */
        @NameInMap("RetCode5217Count")
        public Double retCode5217Count;

        /**
         * <p>Number of occurrences of code 6002 during the execution period.</p>
         */
        @NameInMap("RetCode6002Count")
        public Double retCode6002Count;

        /**
         * <p>Total number of retries during the execution period.</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>SQL ID.</p>
         */
        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>The server where the SQL is executed.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>Strong consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("StrongConsistencyPercentage")
        public Double strongConsistencyPercentage;

        /**
         * <p>Total response time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("SumElapsedTime")
        public Double sumElapsedTime;

        /**
         * <p>Total logical reads.</p>
         */
        @NameInMap("SumLogicalReads")
        public Double sumLogicalReads;

        /**
         * <p>The total wait time (in milliseconds) during the internal waiting period.</p>
         */
        @NameInMap("SumWaitTime")
        public Double sumWaitTime;

        /**
         * <p>Table scan percentage during the execution period.</p>
         */
        @NameInMap("TableScanPercentage")
        public Double tableScanPercentage;

        /**
         * <p>Timestamp for the sample.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>Username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>Eventually consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("WeakConsistencyPercentage")
        public Double weakConsistencyPercentage;

        public static DescribeOasSQLHistoryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasSQLHistoryListResponseBodyData self = new DescribeOasSQLHistoryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgAffectedRows(Long avgAffectedRows) {
            this.avgAffectedRows = avgAffectedRows;
            return this;
        }
        public Long getAvgAffectedRows() {
            return this.avgAffectedRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
            this.avgApplicationWaitTime = avgApplicationWaitTime;
            return this;
        }
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgBlockCacheHit(Long avgBlockCacheHit) {
            this.avgBlockCacheHit = avgBlockCacheHit;
            return this;
        }
        public Long getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgBlockIndexCacheHit(Long avgBlockIndexCacheHit) {
            this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
            return this;
        }
        public Long getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgBloomFilterCacheHit(Long avgBloomFilterCacheHit) {
            this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
            return this;
        }
        public Long getAvgBloomFilterCacheHit() {
            return this.avgBloomFilterCacheHit;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
            this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
            return this;
        }
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgDecodeTime(Double avgDecodeTime) {
            this.avgDecodeTime = avgDecodeTime;
            return this;
        }
        public Double getAvgDecodeTime() {
            return this.avgDecodeTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgDiskReads(Long avgDiskReads) {
            this.avgDiskReads = avgDiskReads;
            return this;
        }
        public Long getAvgDiskReads() {
            return this.avgDiskReads;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgExecuteTime(Double avgExecuteTime) {
            this.avgExecuteTime = avgExecuteTime;
            return this;
        }
        public Double getAvgExecuteTime() {
            return this.avgExecuteTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgExecutorRpcCount(Double avgExecutorRpcCount) {
            this.avgExecutorRpcCount = avgExecutorRpcCount;
            return this;
        }
        public Double getAvgExecutorRpcCount() {
            return this.avgExecutorRpcCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgExpectedWorkerCount(Double avgExpectedWorkerCount) {
            this.avgExpectedWorkerCount = avgExpectedWorkerCount;
            return this;
        }
        public Double getAvgExpectedWorkerCount() {
            return this.avgExpectedWorkerCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgGetPlanTime(Double avgGetPlanTime) {
            this.avgGetPlanTime = avgGetPlanTime;
            return this;
        }
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgLogicalReads(Long avgLogicalReads) {
            this.avgLogicalReads = avgLogicalReads;
            return this;
        }
        public Long getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgMemstoreReadRows(Long avgMemstoreReadRows) {
            this.avgMemstoreReadRows = avgMemstoreReadRows;
            return this;
        }
        public Long getAvgMemstoreReadRows() {
            return this.avgMemstoreReadRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgNetTime(Double avgNetTime) {
            this.avgNetTime = avgNetTime;
            return this;
        }
        public Double getAvgNetTime() {
            return this.avgNetTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgNetWaitTime(Double avgNetWaitTime) {
            this.avgNetWaitTime = avgNetWaitTime;
            return this;
        }
        public Double getAvgNetWaitTime() {
            return this.avgNetWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgPartitionCount(Double avgPartitionCount) {
            this.avgPartitionCount = avgPartitionCount;
            return this;
        }
        public Double getAvgPartitionCount() {
            return this.avgPartitionCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgQueueTime(Double avgQueueTime) {
            this.avgQueueTime = avgQueueTime;
            return this;
        }
        public Double getAvgQueueTime() {
            return this.avgQueueTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgReturnRows(Long avgReturnRows) {
            this.avgReturnRows = avgReturnRows;
            return this;
        }
        public Long getAvgReturnRows() {
            return this.avgReturnRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgRowCacheHit(Long avgRowCacheHit) {
            this.avgRowCacheHit = avgRowCacheHit;
            return this;
        }
        public Long getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgRpcCount(Long avgRpcCount) {
            this.avgRpcCount = avgRpcCount;
            return this;
        }
        public Long getAvgRpcCount() {
            return this.avgRpcCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgScheduleTime(Double avgScheduleTime) {
            this.avgScheduleTime = avgScheduleTime;
            return this;
        }
        public Double getAvgScheduleTime() {
            return this.avgScheduleTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgSsstoreReadRows(Long avgSsstoreReadRows) {
            this.avgSsstoreReadRows = avgSsstoreReadRows;
            return this;
        }
        public Long getAvgSsstoreReadRows() {
            return this.avgSsstoreReadRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgUsedWorkerCount(Double avgUsedWorkerCount) {
            this.avgUsedWorkerCount = avgUsedWorkerCount;
            return this;
        }
        public Double getAvgUsedWorkerCount() {
            return this.avgUsedWorkerCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
            this.avgUserIoWaitTime = avgUserIoWaitTime;
            return this;
        }
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgWaitCount(Double avgWaitCount) {
            this.avgWaitCount = avgWaitCount;
            return this;
        }
        public Double getAvgWaitCount() {
            return this.avgWaitCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setAvgWaitTime(Double avgWaitTime) {
            this.avgWaitTime = avgWaitTime;
            return this;
        }
        public Double getAvgWaitTime() {
            return this.avgWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasSQLHistoryListResponseBodyData setDistPlanPercentage(Double distPlanPercentage) {
            this.distPlanPercentage = distPlanPercentage;
            return this;
        }
        public Double getDistPlanPercentage() {
            return this.distPlanPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setExecPs(Double execPs) {
            this.execPs = execPs;
            return this;
        }
        public Double getExecPs() {
            return this.execPs;
        }

        public DescribeOasSQLHistoryListResponseBodyData setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeOasSQLHistoryListResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setFailPercentage(Double failPercentage) {
            this.failPercentage = failPercentage;
            return this;
        }
        public Double getFailPercentage() {
            return this.failPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setLocalPlanPercentage(Double localPlanPercentage) {
            this.localPlanPercentage = localPlanPercentage;
            return this;
        }
        public Double getLocalPlanPercentage() {
            return this.localPlanPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxAffectedRows(Double maxAffectedRows) {
            this.maxAffectedRows = maxAffectedRows;
            return this;
        }
        public Double getMaxAffectedRows() {
            return this.maxAffectedRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxApplicationWaitTime(Double maxApplicationWaitTime) {
            this.maxApplicationWaitTime = maxApplicationWaitTime;
            return this;
        }
        public Double getMaxApplicationWaitTime() {
            return this.maxApplicationWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
            this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
            return this;
        }
        public Double getMaxConcurrencyWaitTime() {
            return this.maxConcurrencyWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxCpuTime(Double maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxDiskReads(Double maxDiskReads) {
            this.maxDiskReads = maxDiskReads;
            return this;
        }
        public Double getMaxDiskReads() {
            return this.maxDiskReads;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxElapsedTime(Double maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxReturnRows(Double maxReturnRows) {
            this.maxReturnRows = maxReturnRows;
            return this;
        }
        public Double getMaxReturnRows() {
            return this.maxReturnRows;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxUserIoWaitTime(Double maxUserIoWaitTime) {
            this.maxUserIoWaitTime = maxUserIoWaitTime;
            return this;
        }
        public Double getMaxUserIoWaitTime() {
            return this.maxUserIoWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMaxWaitTime(Double maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Double getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMissPlanPercentage(Double missPlanPercentage) {
            this.missPlanPercentage = missPlanPercentage;
            return this;
        }
        public Double getMissPlanPercentage() {
            return this.missPlanPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setMissPlans(Long missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Long getMissPlans() {
            return this.missPlans;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRemotePlanPercentage(Double remotePlanPercentage) {
            this.remotePlanPercentage = remotePlanPercentage;
            return this;
        }
        public Double getRemotePlanPercentage() {
            return this.remotePlanPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRemotePlans(Long remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode4012Count(Double retCode4012Count) {
            this.retCode4012Count = retCode4012Count;
            return this;
        }
        public Double getRetCode4012Count() {
            return this.retCode4012Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode4013Count(Double retCode4013Count) {
            this.retCode4013Count = retCode4013Count;
            return this;
        }
        public Double getRetCode4013Count() {
            return this.retCode4013Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode5001Count(Double retCode5001Count) {
            this.retCode5001Count = retCode5001Count;
            return this;
        }
        public Double getRetCode5001Count() {
            return this.retCode5001Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode5024Count(Double retCode5024Count) {
            this.retCode5024Count = retCode5024Count;
            return this;
        }
        public Double getRetCode5024Count() {
            return this.retCode5024Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode5167Count(Double retCode5167Count) {
            this.retCode5167Count = retCode5167Count;
            return this;
        }
        public Double getRetCode5167Count() {
            return this.retCode5167Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode5217Count(Double retCode5217Count) {
            this.retCode5217Count = retCode5217Count;
            return this;
        }
        public Double getRetCode5217Count() {
            return this.retCode5217Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetCode6002Count(Double retCode6002Count) {
            this.retCode6002Count = retCode6002Count;
            return this;
        }
        public Double getRetCode6002Count() {
            return this.retCode6002Count;
        }

        public DescribeOasSQLHistoryListResponseBodyData setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public DescribeOasSQLHistoryListResponseBodyData setSQLId(String SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public String getSQLId() {
            return this.SQLId;
        }

        public DescribeOasSQLHistoryListResponseBodyData setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeOasSQLHistoryListResponseBodyData setStrongConsistencyPercentage(Double strongConsistencyPercentage) {
            this.strongConsistencyPercentage = strongConsistencyPercentage;
            return this;
        }
        public Double getStrongConsistencyPercentage() {
            return this.strongConsistencyPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setSumElapsedTime(Double sumElapsedTime) {
            this.sumElapsedTime = sumElapsedTime;
            return this;
        }
        public Double getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setSumLogicalReads(Double sumLogicalReads) {
            this.sumLogicalReads = sumLogicalReads;
            return this;
        }
        public Double getSumLogicalReads() {
            return this.sumLogicalReads;
        }

        public DescribeOasSQLHistoryListResponseBodyData setSumWaitTime(Double sumWaitTime) {
            this.sumWaitTime = sumWaitTime;
            return this;
        }
        public Double getSumWaitTime() {
            return this.sumWaitTime;
        }

        public DescribeOasSQLHistoryListResponseBodyData setTableScanPercentage(Double tableScanPercentage) {
            this.tableScanPercentage = tableScanPercentage;
            return this;
        }
        public Double getTableScanPercentage() {
            return this.tableScanPercentage;
        }

        public DescribeOasSQLHistoryListResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeOasSQLHistoryListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeOasSQLHistoryListResponseBodyData setWeakConsistencyPercentage(Double weakConsistencyPercentage) {
            this.weakConsistencyPercentage = weakConsistencyPercentage;
            return this;
        }
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

    }

}
