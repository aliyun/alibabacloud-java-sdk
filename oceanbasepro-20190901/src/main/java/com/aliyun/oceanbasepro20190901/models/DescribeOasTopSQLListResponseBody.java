// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasTopSQLListResponseBody extends TeaModel {
    /**
     * <p>The list of Top SQL.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOasTopSQLListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOasTopSQLListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasTopSQLListResponseBody self = new DescribeOasTopSQLListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOasTopSQLListResponseBody setData(java.util.List<DescribeOasTopSQLListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOasTopSQLListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOasTopSQLListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOasTopSQLListResponseBodyDataSqlList extends TeaModel {
        @NameInMap("AvgAffectedRows")
        public Double avgAffectedRows;

        @NameInMap("AvgApplicationWaitTime")
        public Double avgApplicationWaitTime;

        @NameInMap("AvgBlockCacheHit")
        public Double avgBlockCacheHit;

        @NameInMap("AvgBlockIndexCacheHit")
        public Double avgBlockIndexCacheHit;

        @NameInMap("AvgBloomFilterCacheHit")
        public Double avgBloomFilterCacheHit;

        @NameInMap("AvgConcurrencyWaitTime")
        public Double avgConcurrencyWaitTime;

        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        @NameInMap("AvgDecodeTime")
        public Double avgDecodeTime;

        @NameInMap("AvgDiskReads")
        public Double avgDiskReads;

        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        @NameInMap("AvgExecuteTime")
        public Double avgExecuteTime;

        @NameInMap("AvgExecutorRpcCount")
        public Double avgExecutorRpcCount;

        @NameInMap("AvgExpectedWorkerCount")
        public Double avgExpectedWorkerCount;

        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        @NameInMap("AvgLogicalReads")
        public Double avgLogicalReads;

        @NameInMap("AvgMemstoreReadRows")
        public Double avgMemstoreReadRows;

        @NameInMap("AvgNetTime")
        public Double avgNetTime;

        @NameInMap("AvgNetWaitTime")
        public Double avgNetWaitTime;

        @NameInMap("AvgPartitionCount")
        public Double avgPartitionCount;

        @NameInMap("AvgQueueTime")
        public Double avgQueueTime;

        @NameInMap("AvgReturnRows")
        public Double avgReturnRows;

        @NameInMap("AvgRowCacheHit")
        public Double avgRowCacheHit;

        @NameInMap("AvgRpcCount")
        public Double avgRpcCount;

        @NameInMap("AvgScheduleTime")
        public Double avgScheduleTime;

        @NameInMap("AvgSsstoreReadRows")
        public Double avgSsstoreReadRows;

        @NameInMap("AvgUsedWorkerCount")
        public Double avgUsedWorkerCount;

        @NameInMap("AvgUserIoWaitTime")
        public Double avgUserIoWaitTime;

        @NameInMap("AvgWaitCount")
        public Double avgWaitCount;

        @NameInMap("AvgWaitTime")
        public Double avgWaitTime;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("CpuPercentage")
        public Double cpuPercentage;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DistPlanPercentage")
        public Double distPlanPercentage;

        @NameInMap("ExecPs")
        public Double execPs;

        @NameInMap("Executions")
        public Long executions;

        @NameInMap("FailCount")
        public Double failCount;

        @NameInMap("FailPercentage")
        public Double failPercentage;

        @NameInMap("Inner")
        public Boolean inner;

        @NameInMap("LocalPlanPercentage")
        public Double localPlanPercentage;

        @NameInMap("MaxAffectedRows")
        public Double maxAffectedRows;

        @NameInMap("MaxApplicationWaitTime")
        public Double maxApplicationWaitTime;

        @NameInMap("MaxConcurrencyWaitTime")
        public Double maxConcurrencyWaitTime;

        @NameInMap("MaxCpuTime")
        public Double maxCpuTime;

        @NameInMap("MaxDiskReads")
        public Double maxDiskReads;

        @NameInMap("MaxElapsedTime")
        public Double maxElapsedTime;

        @NameInMap("MaxReturnRows")
        public Double maxReturnRows;

        @NameInMap("MaxUserIoWaitTime")
        public Double maxUserIoWaitTime;

        @NameInMap("MaxWaitTime")
        public Double maxWaitTime;

        @NameInMap("MissPlanPercentage")
        public Double missPlanPercentage;

        @NameInMap("MissPlans")
        public Double missPlans;

        @NameInMap("RemotePlanPercentage")
        public Double remotePlanPercentage;

        @NameInMap("RemotePlans")
        public Double remotePlans;

        @NameInMap("RetCode4012Count")
        public Long retCode4012Count;

        @NameInMap("RetCode4013Count")
        public Long retCode4013Count;

        @NameInMap("RetCode5001Count")
        public Long retCode5001Count;

        @NameInMap("RetCode5024Count")
        public Long retCode5024Count;

        @NameInMap("RetCode5167Count")
        public Long retCode5167Count;

        @NameInMap("RetCode5217Count")
        public Long retCode5217Count;

        @NameInMap("RetCode6002Count")
        public Long retCode6002Count;

        @NameInMap("RetryCount")
        public Double retryCount;

        @NameInMap("RpcCount")
        public Double rpcCount;

        @NameInMap("Server")
        public String server;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerPort")
        public Long serverPort;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("StrongConsistencyPercentage")
        public Double strongConsistencyPercentage;

        @NameInMap("SumDbTime")
        public Double sumDbTime;

        @NameInMap("SumElapsedTime")
        public Double sumElapsedTime;

        @NameInMap("SumLogicalReads")
        public Double sumLogicalReads;

        @NameInMap("SumWaitTime")
        public Double sumWaitTime;

        @NameInMap("TableScanPercentage")
        public Double tableScanPercentage;

        @NameInMap("TotalWaitTime")
        public Double totalWaitTime;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WaitEvent")
        public String waitEvent;

        @NameInMap("WeakConsistencyPercentage")
        public Double weakConsistencyPercentage;

        public static DescribeOasTopSQLListResponseBodyDataSqlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasTopSQLListResponseBodyDataSqlList self = new DescribeOasTopSQLListResponseBodyDataSqlList();
            return TeaModel.build(map, self);
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgAffectedRows(Double avgAffectedRows) {
            this.avgAffectedRows = avgAffectedRows;
            return this;
        }
        public Double getAvgAffectedRows() {
            return this.avgAffectedRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
            this.avgApplicationWaitTime = avgApplicationWaitTime;
            return this;
        }
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgBlockCacheHit(Double avgBlockCacheHit) {
            this.avgBlockCacheHit = avgBlockCacheHit;
            return this;
        }
        public Double getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgBlockIndexCacheHit(Double avgBlockIndexCacheHit) {
            this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
            return this;
        }
        public Double getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgBloomFilterCacheHit(Double avgBloomFilterCacheHit) {
            this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
            return this;
        }
        public Double getAvgBloomFilterCacheHit() {
            return this.avgBloomFilterCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
            this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
            return this;
        }
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgDbTime(Double avgDbTime) {
            this.avgDbTime = avgDbTime;
            return this;
        }
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgDecodeTime(Double avgDecodeTime) {
            this.avgDecodeTime = avgDecodeTime;
            return this;
        }
        public Double getAvgDecodeTime() {
            return this.avgDecodeTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgDiskReads(Double avgDiskReads) {
            this.avgDiskReads = avgDiskReads;
            return this;
        }
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgExecuteTime(Double avgExecuteTime) {
            this.avgExecuteTime = avgExecuteTime;
            return this;
        }
        public Double getAvgExecuteTime() {
            return this.avgExecuteTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgExecutorRpcCount(Double avgExecutorRpcCount) {
            this.avgExecutorRpcCount = avgExecutorRpcCount;
            return this;
        }
        public Double getAvgExecutorRpcCount() {
            return this.avgExecutorRpcCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgExpectedWorkerCount(Double avgExpectedWorkerCount) {
            this.avgExpectedWorkerCount = avgExpectedWorkerCount;
            return this;
        }
        public Double getAvgExpectedWorkerCount() {
            return this.avgExpectedWorkerCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgGetPlanTime(Double avgGetPlanTime) {
            this.avgGetPlanTime = avgGetPlanTime;
            return this;
        }
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgLogicalReads(Double avgLogicalReads) {
            this.avgLogicalReads = avgLogicalReads;
            return this;
        }
        public Double getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgMemstoreReadRows(Double avgMemstoreReadRows) {
            this.avgMemstoreReadRows = avgMemstoreReadRows;
            return this;
        }
        public Double getAvgMemstoreReadRows() {
            return this.avgMemstoreReadRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgNetTime(Double avgNetTime) {
            this.avgNetTime = avgNetTime;
            return this;
        }
        public Double getAvgNetTime() {
            return this.avgNetTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgNetWaitTime(Double avgNetWaitTime) {
            this.avgNetWaitTime = avgNetWaitTime;
            return this;
        }
        public Double getAvgNetWaitTime() {
            return this.avgNetWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgPartitionCount(Double avgPartitionCount) {
            this.avgPartitionCount = avgPartitionCount;
            return this;
        }
        public Double getAvgPartitionCount() {
            return this.avgPartitionCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgQueueTime(Double avgQueueTime) {
            this.avgQueueTime = avgQueueTime;
            return this;
        }
        public Double getAvgQueueTime() {
            return this.avgQueueTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgReturnRows(Double avgReturnRows) {
            this.avgReturnRows = avgReturnRows;
            return this;
        }
        public Double getAvgReturnRows() {
            return this.avgReturnRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgRowCacheHit(Double avgRowCacheHit) {
            this.avgRowCacheHit = avgRowCacheHit;
            return this;
        }
        public Double getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgRpcCount(Double avgRpcCount) {
            this.avgRpcCount = avgRpcCount;
            return this;
        }
        public Double getAvgRpcCount() {
            return this.avgRpcCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgScheduleTime(Double avgScheduleTime) {
            this.avgScheduleTime = avgScheduleTime;
            return this;
        }
        public Double getAvgScheduleTime() {
            return this.avgScheduleTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgSsstoreReadRows(Double avgSsstoreReadRows) {
            this.avgSsstoreReadRows = avgSsstoreReadRows;
            return this;
        }
        public Double getAvgSsstoreReadRows() {
            return this.avgSsstoreReadRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgUsedWorkerCount(Double avgUsedWorkerCount) {
            this.avgUsedWorkerCount = avgUsedWorkerCount;
            return this;
        }
        public Double getAvgUsedWorkerCount() {
            return this.avgUsedWorkerCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
            this.avgUserIoWaitTime = avgUserIoWaitTime;
            return this;
        }
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgWaitCount(Double avgWaitCount) {
            this.avgWaitCount = avgWaitCount;
            return this;
        }
        public Double getAvgWaitCount() {
            return this.avgWaitCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setAvgWaitTime(Double avgWaitTime) {
            this.avgWaitTime = avgWaitTime;
            return this;
        }
        public Double getAvgWaitTime() {
            return this.avgWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setCpuPercentage(Double cpuPercentage) {
            this.cpuPercentage = cpuPercentage;
            return this;
        }
        public Double getCpuPercentage() {
            return this.cpuPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setDistPlanPercentage(Double distPlanPercentage) {
            this.distPlanPercentage = distPlanPercentage;
            return this;
        }
        public Double getDistPlanPercentage() {
            return this.distPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setExecPs(Double execPs) {
            this.execPs = execPs;
            return this;
        }
        public Double getExecPs() {
            return this.execPs;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setFailCount(Double failCount) {
            this.failCount = failCount;
            return this;
        }
        public Double getFailCount() {
            return this.failCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setFailPercentage(Double failPercentage) {
            this.failPercentage = failPercentage;
            return this;
        }
        public Double getFailPercentage() {
            return this.failPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setInner(Boolean inner) {
            this.inner = inner;
            return this;
        }
        public Boolean getInner() {
            return this.inner;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setLocalPlanPercentage(Double localPlanPercentage) {
            this.localPlanPercentage = localPlanPercentage;
            return this;
        }
        public Double getLocalPlanPercentage() {
            return this.localPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxAffectedRows(Double maxAffectedRows) {
            this.maxAffectedRows = maxAffectedRows;
            return this;
        }
        public Double getMaxAffectedRows() {
            return this.maxAffectedRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxApplicationWaitTime(Double maxApplicationWaitTime) {
            this.maxApplicationWaitTime = maxApplicationWaitTime;
            return this;
        }
        public Double getMaxApplicationWaitTime() {
            return this.maxApplicationWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
            this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
            return this;
        }
        public Double getMaxConcurrencyWaitTime() {
            return this.maxConcurrencyWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxCpuTime(Double maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxDiskReads(Double maxDiskReads) {
            this.maxDiskReads = maxDiskReads;
            return this;
        }
        public Double getMaxDiskReads() {
            return this.maxDiskReads;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxElapsedTime(Double maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxReturnRows(Double maxReturnRows) {
            this.maxReturnRows = maxReturnRows;
            return this;
        }
        public Double getMaxReturnRows() {
            return this.maxReturnRows;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxUserIoWaitTime(Double maxUserIoWaitTime) {
            this.maxUserIoWaitTime = maxUserIoWaitTime;
            return this;
        }
        public Double getMaxUserIoWaitTime() {
            return this.maxUserIoWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMaxWaitTime(Double maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Double getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMissPlanPercentage(Double missPlanPercentage) {
            this.missPlanPercentage = missPlanPercentage;
            return this;
        }
        public Double getMissPlanPercentage() {
            return this.missPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setMissPlans(Double missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Double getMissPlans() {
            return this.missPlans;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRemotePlanPercentage(Double remotePlanPercentage) {
            this.remotePlanPercentage = remotePlanPercentage;
            return this;
        }
        public Double getRemotePlanPercentage() {
            return this.remotePlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRemotePlans(Double remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Double getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode4012Count(Long retCode4012Count) {
            this.retCode4012Count = retCode4012Count;
            return this;
        }
        public Long getRetCode4012Count() {
            return this.retCode4012Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode4013Count(Long retCode4013Count) {
            this.retCode4013Count = retCode4013Count;
            return this;
        }
        public Long getRetCode4013Count() {
            return this.retCode4013Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode5001Count(Long retCode5001Count) {
            this.retCode5001Count = retCode5001Count;
            return this;
        }
        public Long getRetCode5001Count() {
            return this.retCode5001Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode5024Count(Long retCode5024Count) {
            this.retCode5024Count = retCode5024Count;
            return this;
        }
        public Long getRetCode5024Count() {
            return this.retCode5024Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode5167Count(Long retCode5167Count) {
            this.retCode5167Count = retCode5167Count;
            return this;
        }
        public Long getRetCode5167Count() {
            return this.retCode5167Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode5217Count(Long retCode5217Count) {
            this.retCode5217Count = retCode5217Count;
            return this;
        }
        public Long getRetCode5217Count() {
            return this.retCode5217Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetCode6002Count(Long retCode6002Count) {
            this.retCode6002Count = retCode6002Count;
            return this;
        }
        public Long getRetCode6002Count() {
            return this.retCode6002Count;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRetryCount(Double retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Double getRetryCount() {
            return this.retryCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setRpcCount(Double rpcCount) {
            this.rpcCount = rpcCount;
            return this;
        }
        public Double getRpcCount() {
            return this.rpcCount;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setServerPort(Long serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Long getServerPort() {
            return this.serverPort;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSqlTextShort(String sqlTextShort) {
            this.sqlTextShort = sqlTextShort;
            return this;
        }
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setStrongConsistencyPercentage(Double strongConsistencyPercentage) {
            this.strongConsistencyPercentage = strongConsistencyPercentage;
            return this;
        }
        public Double getStrongConsistencyPercentage() {
            return this.strongConsistencyPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSumDbTime(Double sumDbTime) {
            this.sumDbTime = sumDbTime;
            return this;
        }
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSumElapsedTime(Double sumElapsedTime) {
            this.sumElapsedTime = sumElapsedTime;
            return this;
        }
        public Double getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSumLogicalReads(Double sumLogicalReads) {
            this.sumLogicalReads = sumLogicalReads;
            return this;
        }
        public Double getSumLogicalReads() {
            return this.sumLogicalReads;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setSumWaitTime(Double sumWaitTime) {
            this.sumWaitTime = sumWaitTime;
            return this;
        }
        public Double getSumWaitTime() {
            return this.sumWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setTableScanPercentage(Double tableScanPercentage) {
            this.tableScanPercentage = tableScanPercentage;
            return this;
        }
        public Double getTableScanPercentage() {
            return this.tableScanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setTotalWaitTime(Double totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Double getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setWaitEvent(String waitEvent) {
            this.waitEvent = waitEvent;
            return this;
        }
        public String getWaitEvent() {
            return this.waitEvent;
        }

        public DescribeOasTopSQLListResponseBodyDataSqlList setWeakConsistencyPercentage(Double weakConsistencyPercentage) {
            this.weakConsistencyPercentage = weakConsistencyPercentage;
            return this;
        }
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

    }

    public static class DescribeOasTopSQLListResponseBodyData extends TeaModel {
        /**
         * <p>Average updated rows during the execution period.</p>
         */
        @NameInMap("AvgAffectedRows")
        public Double avgAffectedRows;

        /**
         * <p>Average Application event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgApplicationWaitTime")
        public Double avgApplicationWaitTime;

        /**
         * <p>Average BlockCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBlockCacheHit")
        public Double avgBlockCacheHit;

        /**
         * <p>Average BlockIndexCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBlockIndexCacheHit")
        public Double avgBlockIndexCacheHit;

        /**
         * <p>Average BloomFilterCache hit count during the execution period.</p>
         */
        @NameInMap("AvgBloomFilterCacheHit")
        public Double avgBloomFilterCacheHit;

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

        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        /**
         * <p>Average syntax parsing time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgDecodeTime")
        public Double avgDecodeTime;

        /**
         * <p>Average physical read count during the execution period.</p>
         */
        @NameInMap("AvgDiskReads")
        public Double avgDiskReads;

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
         * <p>Average logical reads of the SQL during the execution period.</p>
         */
        @NameInMap("AvgLogicalReads")
        public Double avgLogicalReads;

        /**
         * <p>Strong consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("AvgMemstoreReadRows")
        public Double avgMemstoreReadRows;

        /**
         * <p>Average network transmission time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgNetTime")
        public Double avgNetTime;

        /**
         * <p>Average network enqueue time (in milliseconds) during the execution period.</p>
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
         * <p>Average returned rows during the execution period.</p>
         */
        @NameInMap("AvgReturnRows")
        public Double avgReturnRows;

        /**
         * <p>Average RowCache hit count during the execution period.</p>
         */
        @NameInMap("AvgRowCacheHit")
        public Double avgRowCacheHit;

        /**
         * <p>Average count of RPC sent during the execution period.</p>
         */
        @NameInMap("AvgRpcCount")
        public Double avgRpcCount;

        /**
         * <p>Average Schedule event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgScheduleTime")
        public Double avgScheduleTime;

        /**
         * <p>Eventually consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("AvgSsstoreReadRows")
        public Double avgSsstoreReadRows;

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
         * <p>Average wait count during the execution period.</p>
         */
        @NameInMap("AvgWaitCount")
        public Double avgWaitCount;

        /**
         * <p>Average wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("AvgWaitTime")
        public Double avgWaitTime;

        /**
         * <p>Client IP.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>CPU percentage.</p>
         */
        @NameInMap("CpuPercentage")
        public Double cpuPercentage;

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

        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

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
         * <p>Average number of partition accessed during the execution period.</p>
         */
        @NameInMap("FailCount")
        public Double failCount;

        /**
         * <p>Error percentage during the execution period.</p>
         */
        @NameInMap("FailPercentage")
        public Double failPercentage;

        /**
         * <p>Whether a internal SQL.</p>
         */
        @NameInMap("Inner")
        public Boolean inner;

        @NameInMap("LastFailCode")
        public Long lastFailCode;

        /**
         * <p>Local plan percentage during the execution period.</p>
         */
        @NameInMap("LocalPlanPercentage")
        public Double localPlanPercentage;

        /**
         * <p>Max affected rows during the execution period.</p>
         */
        @NameInMap("MaxAffectedRows")
        public Double maxAffectedRows;

        /**
         * <p>Max Application event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("MaxApplicationWaitTime")
        public Double maxApplicationWaitTime;

        /**
         * <p>Max Concurrency event wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("MaxConcurrencyWaitTime")
        public Double maxConcurrencyWaitTime;

        /**
         * <p>Max CPU time (in milliseconds).</p>
         */
        @NameInMap("MaxCpuTime")
        public Double maxCpuTime;

        /**
         * <p>Max physical read count during the execution period.</p>
         */
        @NameInMap("MaxDiskReads")
        public Double maxDiskReads;

        /**
         * <p>Max response time during the execution period.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Double maxElapsedTime;

        /**
         * <p>Max returned rows during the execution period.</p>
         */
        @NameInMap("MaxReturnRows")
        public Double maxReturnRows;

        /**
         * <p>Max UserIO event wait time (in milliseconds) during the execution period.</p>
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
         * <p>Missed hit count of the execution plan during the execution period.</p>
         */
        @NameInMap("MissPlans")
        public Double missPlans;

        /**
         * <p>Remote plan percentage during the execution period.</p>
         */
        @NameInMap("RemotePlanPercentage")
        public Double remotePlanPercentage;

        /**
         * <p>Remote execution count during the execution period.</p>
         */
        @NameInMap("RemotePlans")
        public Double remotePlans;

        /**
         * <p>Number of occurrences of the code 4012 during the execution period.</p>
         */
        @NameInMap("RetCode4012Count")
        public Long retCode4012Count;

        /**
         * <p>Number of occurrences of the code 4013 during the execution period.</p>
         */
        @NameInMap("RetCode4013Count")
        public Long retCode4013Count;

        /**
         * <p>Number of occurrences of the code 5001 during the execution period.</p>
         */
        @NameInMap("RetCode5001Count")
        public Long retCode5001Count;

        /**
         * <p>Number of occurrences of the code 5024 during the execution period.</p>
         */
        @NameInMap("RetCode5024Count")
        public Long retCode5024Count;

        /**
         * <p>Number of occurrences of the code 5167 during the execution period.</p>
         */
        @NameInMap("RetCode5167Count")
        public Long retCode5167Count;

        /**
         * <p>Number of occurrences of the code 5217 during the execution period.</p>
         */
        @NameInMap("RetCode5217Count")
        public Long retCode5217Count;

        /**
         * <p>Number of occurrences of the code 6002 during the execution period.</p>
         */
        @NameInMap("RetCode6002Count")
        public Long retCode6002Count;

        /**
         * <p>Total retry count during the execution period.</p>
         */
        @NameInMap("RetryCount")
        public Double retryCount;

        /**
         * <p>RPC count during the execution period.</p>
         */
        @NameInMap("RpcCount")
        public Double rpcCount;

        /**
         * <p>The server where the SQL is executed.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The server IP where the SQL is executed.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The server port where the SQL is executed.</p>
         */
        @NameInMap("ServerPort")
        public Long serverPort;

        /**
         * <p>SQL ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlList")
        public java.util.List<DescribeOasTopSQLListResponseBodyDataSqlList> sqlList;

        /**
         * <p>SQL text (the first 100 characters).</p>
         */
        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        /**
         * <p>SQL type.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>Strong consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("StrongConsistencyPercentage")
        public Double strongConsistencyPercentage;

        @NameInMap("SumDbTime")
        public Double sumDbTime;

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
         * <p>Total wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("SumWaitTime")
        public Double sumWaitTime;

        /**
         * <p>Table scan percentage during the execution period.</p>
         */
        @NameInMap("TableScanPercentage")
        public Double tableScanPercentage;

        /**
         * <p>Total wait time (in milliseconds) during the execution period.</p>
         */
        @NameInMap("TotalWaitTime")
        public Double totalWaitTime;

        /**
         * <p>Username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>Longest wait event during the execution period.</p>
         */
        @NameInMap("WaitEvent")
        public String waitEvent;

        /**
         * <p>Eventually consistent transaction percentage during the execution period.</p>
         */
        @NameInMap("WeakConsistencyPercentage")
        public Double weakConsistencyPercentage;

        public static DescribeOasTopSQLListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasTopSQLListResponseBodyData self = new DescribeOasTopSQLListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOasTopSQLListResponseBodyData setAvgAffectedRows(Double avgAffectedRows) {
            this.avgAffectedRows = avgAffectedRows;
            return this;
        }
        public Double getAvgAffectedRows() {
            return this.avgAffectedRows;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
            this.avgApplicationWaitTime = avgApplicationWaitTime;
            return this;
        }
        public Double getAvgApplicationWaitTime() {
            return this.avgApplicationWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgBlockCacheHit(Double avgBlockCacheHit) {
            this.avgBlockCacheHit = avgBlockCacheHit;
            return this;
        }
        public Double getAvgBlockCacheHit() {
            return this.avgBlockCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgBlockIndexCacheHit(Double avgBlockIndexCacheHit) {
            this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
            return this;
        }
        public Double getAvgBlockIndexCacheHit() {
            return this.avgBlockIndexCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgBloomFilterCacheHit(Double avgBloomFilterCacheHit) {
            this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
            return this;
        }
        public Double getAvgBloomFilterCacheHit() {
            return this.avgBloomFilterCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
            this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
            return this;
        }
        public Double getAvgConcurrencyWaitTime() {
            return this.avgConcurrencyWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgDbTime(Double avgDbTime) {
            this.avgDbTime = avgDbTime;
            return this;
        }
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgDecodeTime(Double avgDecodeTime) {
            this.avgDecodeTime = avgDecodeTime;
            return this;
        }
        public Double getAvgDecodeTime() {
            return this.avgDecodeTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgDiskReads(Double avgDiskReads) {
            this.avgDiskReads = avgDiskReads;
            return this;
        }
        public Double getAvgDiskReads() {
            return this.avgDiskReads;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgExecuteTime(Double avgExecuteTime) {
            this.avgExecuteTime = avgExecuteTime;
            return this;
        }
        public Double getAvgExecuteTime() {
            return this.avgExecuteTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgExecutorRpcCount(Double avgExecutorRpcCount) {
            this.avgExecutorRpcCount = avgExecutorRpcCount;
            return this;
        }
        public Double getAvgExecutorRpcCount() {
            return this.avgExecutorRpcCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgExpectedWorkerCount(Double avgExpectedWorkerCount) {
            this.avgExpectedWorkerCount = avgExpectedWorkerCount;
            return this;
        }
        public Double getAvgExpectedWorkerCount() {
            return this.avgExpectedWorkerCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgGetPlanTime(Double avgGetPlanTime) {
            this.avgGetPlanTime = avgGetPlanTime;
            return this;
        }
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgLogicalReads(Double avgLogicalReads) {
            this.avgLogicalReads = avgLogicalReads;
            return this;
        }
        public Double getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgMemstoreReadRows(Double avgMemstoreReadRows) {
            this.avgMemstoreReadRows = avgMemstoreReadRows;
            return this;
        }
        public Double getAvgMemstoreReadRows() {
            return this.avgMemstoreReadRows;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgNetTime(Double avgNetTime) {
            this.avgNetTime = avgNetTime;
            return this;
        }
        public Double getAvgNetTime() {
            return this.avgNetTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgNetWaitTime(Double avgNetWaitTime) {
            this.avgNetWaitTime = avgNetWaitTime;
            return this;
        }
        public Double getAvgNetWaitTime() {
            return this.avgNetWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgPartitionCount(Double avgPartitionCount) {
            this.avgPartitionCount = avgPartitionCount;
            return this;
        }
        public Double getAvgPartitionCount() {
            return this.avgPartitionCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgQueueTime(Double avgQueueTime) {
            this.avgQueueTime = avgQueueTime;
            return this;
        }
        public Double getAvgQueueTime() {
            return this.avgQueueTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgReturnRows(Double avgReturnRows) {
            this.avgReturnRows = avgReturnRows;
            return this;
        }
        public Double getAvgReturnRows() {
            return this.avgReturnRows;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgRowCacheHit(Double avgRowCacheHit) {
            this.avgRowCacheHit = avgRowCacheHit;
            return this;
        }
        public Double getAvgRowCacheHit() {
            return this.avgRowCacheHit;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgRpcCount(Double avgRpcCount) {
            this.avgRpcCount = avgRpcCount;
            return this;
        }
        public Double getAvgRpcCount() {
            return this.avgRpcCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgScheduleTime(Double avgScheduleTime) {
            this.avgScheduleTime = avgScheduleTime;
            return this;
        }
        public Double getAvgScheduleTime() {
            return this.avgScheduleTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgSsstoreReadRows(Double avgSsstoreReadRows) {
            this.avgSsstoreReadRows = avgSsstoreReadRows;
            return this;
        }
        public Double getAvgSsstoreReadRows() {
            return this.avgSsstoreReadRows;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgUsedWorkerCount(Double avgUsedWorkerCount) {
            this.avgUsedWorkerCount = avgUsedWorkerCount;
            return this;
        }
        public Double getAvgUsedWorkerCount() {
            return this.avgUsedWorkerCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
            this.avgUserIoWaitTime = avgUserIoWaitTime;
            return this;
        }
        public Double getAvgUserIoWaitTime() {
            return this.avgUserIoWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgWaitCount(Double avgWaitCount) {
            this.avgWaitCount = avgWaitCount;
            return this;
        }
        public Double getAvgWaitCount() {
            return this.avgWaitCount;
        }

        public DescribeOasTopSQLListResponseBodyData setAvgWaitTime(Double avgWaitTime) {
            this.avgWaitTime = avgWaitTime;
            return this;
        }
        public Double getAvgWaitTime() {
            return this.avgWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeOasTopSQLListResponseBodyData setCpuPercentage(Double cpuPercentage) {
            this.cpuPercentage = cpuPercentage;
            return this;
        }
        public Double getCpuPercentage() {
            return this.cpuPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasTopSQLListResponseBodyData setDistPlanPercentage(Double distPlanPercentage) {
            this.distPlanPercentage = distPlanPercentage;
            return this;
        }
        public Double getDistPlanPercentage() {
            return this.distPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setDynamicSql(Boolean dynamicSql) {
            this.dynamicSql = dynamicSql;
            return this;
        }
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        public DescribeOasTopSQLListResponseBodyData setExecPs(Double execPs) {
            this.execPs = execPs;
            return this;
        }
        public Double getExecPs() {
            return this.execPs;
        }

        public DescribeOasTopSQLListResponseBodyData setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeOasTopSQLListResponseBodyData setFailCount(Double failCount) {
            this.failCount = failCount;
            return this;
        }
        public Double getFailCount() {
            return this.failCount;
        }

        public DescribeOasTopSQLListResponseBodyData setFailPercentage(Double failPercentage) {
            this.failPercentage = failPercentage;
            return this;
        }
        public Double getFailPercentage() {
            return this.failPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setInner(Boolean inner) {
            this.inner = inner;
            return this;
        }
        public Boolean getInner() {
            return this.inner;
        }

        public DescribeOasTopSQLListResponseBodyData setLastFailCode(Long lastFailCode) {
            this.lastFailCode = lastFailCode;
            return this;
        }
        public Long getLastFailCode() {
            return this.lastFailCode;
        }

        public DescribeOasTopSQLListResponseBodyData setLocalPlanPercentage(Double localPlanPercentage) {
            this.localPlanPercentage = localPlanPercentage;
            return this;
        }
        public Double getLocalPlanPercentage() {
            return this.localPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxAffectedRows(Double maxAffectedRows) {
            this.maxAffectedRows = maxAffectedRows;
            return this;
        }
        public Double getMaxAffectedRows() {
            return this.maxAffectedRows;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxApplicationWaitTime(Double maxApplicationWaitTime) {
            this.maxApplicationWaitTime = maxApplicationWaitTime;
            return this;
        }
        public Double getMaxApplicationWaitTime() {
            return this.maxApplicationWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
            this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
            return this;
        }
        public Double getMaxConcurrencyWaitTime() {
            return this.maxConcurrencyWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxCpuTime(Double maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxDiskReads(Double maxDiskReads) {
            this.maxDiskReads = maxDiskReads;
            return this;
        }
        public Double getMaxDiskReads() {
            return this.maxDiskReads;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxElapsedTime(Double maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxReturnRows(Double maxReturnRows) {
            this.maxReturnRows = maxReturnRows;
            return this;
        }
        public Double getMaxReturnRows() {
            return this.maxReturnRows;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxUserIoWaitTime(Double maxUserIoWaitTime) {
            this.maxUserIoWaitTime = maxUserIoWaitTime;
            return this;
        }
        public Double getMaxUserIoWaitTime() {
            return this.maxUserIoWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMaxWaitTime(Double maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Double getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setMissPlanPercentage(Double missPlanPercentage) {
            this.missPlanPercentage = missPlanPercentage;
            return this;
        }
        public Double getMissPlanPercentage() {
            return this.missPlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setMissPlans(Double missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Double getMissPlans() {
            return this.missPlans;
        }

        public DescribeOasTopSQLListResponseBodyData setRemotePlanPercentage(Double remotePlanPercentage) {
            this.remotePlanPercentage = remotePlanPercentage;
            return this;
        }
        public Double getRemotePlanPercentage() {
            return this.remotePlanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setRemotePlans(Double remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Double getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode4012Count(Long retCode4012Count) {
            this.retCode4012Count = retCode4012Count;
            return this;
        }
        public Long getRetCode4012Count() {
            return this.retCode4012Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode4013Count(Long retCode4013Count) {
            this.retCode4013Count = retCode4013Count;
            return this;
        }
        public Long getRetCode4013Count() {
            return this.retCode4013Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode5001Count(Long retCode5001Count) {
            this.retCode5001Count = retCode5001Count;
            return this;
        }
        public Long getRetCode5001Count() {
            return this.retCode5001Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode5024Count(Long retCode5024Count) {
            this.retCode5024Count = retCode5024Count;
            return this;
        }
        public Long getRetCode5024Count() {
            return this.retCode5024Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode5167Count(Long retCode5167Count) {
            this.retCode5167Count = retCode5167Count;
            return this;
        }
        public Long getRetCode5167Count() {
            return this.retCode5167Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode5217Count(Long retCode5217Count) {
            this.retCode5217Count = retCode5217Count;
            return this;
        }
        public Long getRetCode5217Count() {
            return this.retCode5217Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetCode6002Count(Long retCode6002Count) {
            this.retCode6002Count = retCode6002Count;
            return this;
        }
        public Long getRetCode6002Count() {
            return this.retCode6002Count;
        }

        public DescribeOasTopSQLListResponseBodyData setRetryCount(Double retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Double getRetryCount() {
            return this.retryCount;
        }

        public DescribeOasTopSQLListResponseBodyData setRpcCount(Double rpcCount) {
            this.rpcCount = rpcCount;
            return this;
        }
        public Double getRpcCount() {
            return this.rpcCount;
        }

        public DescribeOasTopSQLListResponseBodyData setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeOasTopSQLListResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeOasTopSQLListResponseBodyData setServerPort(Long serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Long getServerPort() {
            return this.serverPort;
        }

        public DescribeOasTopSQLListResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeOasTopSQLListResponseBodyData setSqlList(java.util.List<DescribeOasTopSQLListResponseBodyDataSqlList> sqlList) {
            this.sqlList = sqlList;
            return this;
        }
        public java.util.List<DescribeOasTopSQLListResponseBodyDataSqlList> getSqlList() {
            return this.sqlList;
        }

        public DescribeOasTopSQLListResponseBodyData setSqlTextShort(String sqlTextShort) {
            this.sqlTextShort = sqlTextShort;
            return this;
        }
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        public DescribeOasTopSQLListResponseBodyData setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeOasTopSQLListResponseBodyData setStrongConsistencyPercentage(Double strongConsistencyPercentage) {
            this.strongConsistencyPercentage = strongConsistencyPercentage;
            return this;
        }
        public Double getStrongConsistencyPercentage() {
            return this.strongConsistencyPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setSumDbTime(Double sumDbTime) {
            this.sumDbTime = sumDbTime;
            return this;
        }
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        public DescribeOasTopSQLListResponseBodyData setSumElapsedTime(Double sumElapsedTime) {
            this.sumElapsedTime = sumElapsedTime;
            return this;
        }
        public Double getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        public DescribeOasTopSQLListResponseBodyData setSumLogicalReads(Double sumLogicalReads) {
            this.sumLogicalReads = sumLogicalReads;
            return this;
        }
        public Double getSumLogicalReads() {
            return this.sumLogicalReads;
        }

        public DescribeOasTopSQLListResponseBodyData setSumWaitTime(Double sumWaitTime) {
            this.sumWaitTime = sumWaitTime;
            return this;
        }
        public Double getSumWaitTime() {
            return this.sumWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setTableScanPercentage(Double tableScanPercentage) {
            this.tableScanPercentage = tableScanPercentage;
            return this;
        }
        public Double getTableScanPercentage() {
            return this.tableScanPercentage;
        }

        public DescribeOasTopSQLListResponseBodyData setTotalWaitTime(Double totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Double getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeOasTopSQLListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeOasTopSQLListResponseBodyData setWaitEvent(String waitEvent) {
            this.waitEvent = waitEvent;
            return this;
        }
        public String getWaitEvent() {
            return this.waitEvent;
        }

        public DescribeOasTopSQLListResponseBodyData setWeakConsistencyPercentage(Double weakConsistencyPercentage) {
            this.weakConsistencyPercentage = weakConsistencyPercentage;
            return this;
        }
        public Double getWeakConsistencyPercentage() {
            return this.weakConsistencyPercentage;
        }

    }

}
