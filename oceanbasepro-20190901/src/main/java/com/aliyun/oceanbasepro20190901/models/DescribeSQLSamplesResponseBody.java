// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLSamplesResponseBody extends TeaModel {
    /**
     * <p>The list of sample data of slow query execution details.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSQLSamplesResponseBodyData> data;

    /**
     * <p>Request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLSamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLSamplesResponseBody self = new DescribeSQLSamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLSamplesResponseBody setData(java.util.List<DescribeSQLSamplesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSQLSamplesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSQLSamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLSamplesResponseBodyData extends TeaModel {
        /**
         * <p>Average updated rows during the execution period.</p>
         */
        @NameInMap("AffectedRows")
        public Double affectedRows;

        /**
         * <p>Application event waiting time (in milliseconds).</p>
         */
        @NameInMap("ApplicationWaitTime")
        public Double applicationWaitTime;

        /**
         * <p>BlockCache hit count</p>
         */
        @NameInMap("BlockCacheHit")
        public Double blockCacheHit;

        /**
         * <p>BlockIndexCache hit count</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Double blockIndexCacheHit;

        /**
         * <p>BloomFilterCache hit count.</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Double bloomFilterCacheHit;

        /**
         * <p>Client IP.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>Client port.</p>
         */
        @NameInMap("ClientPort")
        public String clientPort;

        /**
         * <p>Concurrency event waiting time (in milliseconds).</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Double concurrencyWaitTime;

        /**
         * <p>Consistency level.</p>
         */
        @NameInMap("ConsistencyLevel")
        public String consistencyLevel;

        /**
         * <p>CPU time (in milliseconds).</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>Database name.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Syntax parsing time (in milliseconds).</p>
         */
        @NameInMap("DecodeTime")
        public Double decodeTime;

        /**
         * <p>Disk read count.</p>
         */
        @NameInMap("DiskReads")
        public Double diskReads;

        /**
         * <p>Response time (in milliseconds).</p>
         */
        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        /**
         * <p>Plan execution time (in milliseconds).</p>
         */
        @NameInMap("ExecuteTime")
        public Double executeTime;

        /**
         * <p>Whether to initiate RPC.</p>
         */
        @NameInMap("ExecutorRpc")
        public Boolean executorRpc;

        /**
         * <p>Degree of parallelism.</p>
         */
        @NameInMap("ExpectedWorkerCount")
        public Double expectedWorkerCount;

        @NameInMap("FullSqlText")
        public String fullSqlText;

        /**
         * <p>Plan generation time (in milliseconds).</p>
         */
        @NameInMap("GetPlanTime")
        public Double getPlanTime;

        /**
         * <p>Whether to hit the execution plan.</p>
         */
        @NameInMap("HitPlan")
        public Boolean hitPlan;

        /**
         * <p>Whether an internal SQL.</p>
         */
        @NameInMap("Inner")
        public Boolean inner;

        /**
         * <p>Memstore read row count.</p>
         */
        @NameInMap("MemstoreReadRows")
        public Double memstoreReadRows;

        /**
         * <p>Network transmission time (in milliseconds).</p>
         */
        @NameInMap("NetTime")
        public Double netTime;

        /**
         * <p>Network enqueue time (in milliseconds).</p>
         */
        @NameInMap("NetWaitTime")
        public Double netWaitTime;

        /**
         * <p>Database ID.</p>
         */
        @NameInMap("ObDbId")
        public Double obDbId;

        /**
         * <p>Server  ID.</p>
         */
        @NameInMap("ObServerId")
        public Double obServerId;

        /**
         * <p>User ID.</p>
         */
        @NameInMap("ObUserId")
        public Double obUserId;

        /**
         * <p>Average number of partition accessed during the execution period.</p>
         */
        @NameInMap("PartitionCount")
        public Double partitionCount;

        /**
         * <p>The execution plan ID.</p>
         */
        @NameInMap("PlanId")
        public Double planId;

        /**
         * <p>Plan type.</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>Queueing time (in milliseconds).</p>
         */
        @NameInMap("QueueTime")
        public Double queueTime;

        /**
         * <p>Request ID.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>SQL request time.</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>Result code.</p>
         */
        @NameInMap("RetCode")
        public Double retCode;

        /**
         * <p>Retry count.</p>
         */
        @NameInMap("RetryCount")
        public Double retryCount;

        /**
         * <p>Average returned rows during the execution period.</p>
         */
        @NameInMap("ReturnRows")
        public Double returnRows;

        /**
         * <p>RowCache hit count.</p>
         */
        @NameInMap("RowCacheHit")
        public Double rowCacheHit;

        /**
         * <p>Number of RPC sent.</p>
         */
        @NameInMap("RpcCount")
        public Double rpcCount;

        /**
         * <p>Schedule event waiting time (in milliseconds).</p>
         */
        @NameInMap("ScheduleTime")
        public Double scheduleTime;

        /**
         * <p>The server where the SQL is executed.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>SQL type.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>Ssstore read row count.</p>
         */
        @NameInMap("SsstoreReadRows")
        public Double ssstoreReadRows;

        /**
         * <p>Parameterized SQL text.</p>
         */
        @NameInMap("Statement")
        public String statement;

        /**
         * <p>Whether to perform full table scan.</p>
         */
        @NameInMap("TableScan")
        public Boolean tableScan;

        /**
         * <p>Trace ID.</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>Transaction hash.</p>
         */
        @NameInMap("TransHash")
        public String transHash;

        /**
         * <p>Actual number of SQL execution threads.</p>
         */
        @NameInMap("UsedWorkerCount")
        public Double usedWorkerCount;

        /**
         * <p>UserIO event waiting time (in milliseconds).</p>
         */
        @NameInMap("UserIoWaitTime")
        public Double userIoWaitTime;

        /**
         * <p>Username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>Wait count.</p>
         */
        @NameInMap("WaitCount")
        public Double waitCount;

        /**
         * <p>Longest wait event during the execution period.</p>
         */
        @NameInMap("WaitEvent")
        public String waitEvent;

        /**
         * <p>Wait time (in milliseconds).</p>
         */
        @NameInMap("WaitTime")
        public Double waitTime;

        public static DescribeSQLSamplesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLSamplesResponseBodyData self = new DescribeSQLSamplesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSQLSamplesResponseBodyData setAffectedRows(Double affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Double getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeSQLSamplesResponseBodyData setApplicationWaitTime(Double applicationWaitTime) {
            this.applicationWaitTime = applicationWaitTime;
            return this;
        }
        public Double getApplicationWaitTime() {
            return this.applicationWaitTime;
        }

        public DescribeSQLSamplesResponseBodyData setBlockCacheHit(Double blockCacheHit) {
            this.blockCacheHit = blockCacheHit;
            return this;
        }
        public Double getBlockCacheHit() {
            return this.blockCacheHit;
        }

        public DescribeSQLSamplesResponseBodyData setBlockIndexCacheHit(Double blockIndexCacheHit) {
            this.blockIndexCacheHit = blockIndexCacheHit;
            return this;
        }
        public Double getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        public DescribeSQLSamplesResponseBodyData setBloomFilterCacheHit(Double bloomFilterCacheHit) {
            this.bloomFilterCacheHit = bloomFilterCacheHit;
            return this;
        }
        public Double getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        public DescribeSQLSamplesResponseBodyData setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSQLSamplesResponseBodyData setClientPort(String clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public String getClientPort() {
            return this.clientPort;
        }

        public DescribeSQLSamplesResponseBodyData setConcurrencyWaitTime(Double concurrencyWaitTime) {
            this.concurrencyWaitTime = concurrencyWaitTime;
            return this;
        }
        public Double getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        public DescribeSQLSamplesResponseBodyData setConsistencyLevel(String consistencyLevel) {
            this.consistencyLevel = consistencyLevel;
            return this;
        }
        public String getConsistencyLevel() {
            return this.consistencyLevel;
        }

        public DescribeSQLSamplesResponseBodyData setCpuTime(Double cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Double getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSQLSamplesResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSQLSamplesResponseBodyData setDecodeTime(Double decodeTime) {
            this.decodeTime = decodeTime;
            return this;
        }
        public Double getDecodeTime() {
            return this.decodeTime;
        }

        public DescribeSQLSamplesResponseBodyData setDiskReads(Double diskReads) {
            this.diskReads = diskReads;
            return this;
        }
        public Double getDiskReads() {
            return this.diskReads;
        }

        public DescribeSQLSamplesResponseBodyData setElapsedTime(Double elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSQLSamplesResponseBodyData setExecuteTime(Double executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Double getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLSamplesResponseBodyData setExecutorRpc(Boolean executorRpc) {
            this.executorRpc = executorRpc;
            return this;
        }
        public Boolean getExecutorRpc() {
            return this.executorRpc;
        }

        public DescribeSQLSamplesResponseBodyData setExpectedWorkerCount(Double expectedWorkerCount) {
            this.expectedWorkerCount = expectedWorkerCount;
            return this;
        }
        public Double getExpectedWorkerCount() {
            return this.expectedWorkerCount;
        }

        public DescribeSQLSamplesResponseBodyData setFullSqlText(String fullSqlText) {
            this.fullSqlText = fullSqlText;
            return this;
        }
        public String getFullSqlText() {
            return this.fullSqlText;
        }

        public DescribeSQLSamplesResponseBodyData setGetPlanTime(Double getPlanTime) {
            this.getPlanTime = getPlanTime;
            return this;
        }
        public Double getGetPlanTime() {
            return this.getPlanTime;
        }

        public DescribeSQLSamplesResponseBodyData setHitPlan(Boolean hitPlan) {
            this.hitPlan = hitPlan;
            return this;
        }
        public Boolean getHitPlan() {
            return this.hitPlan;
        }

        public DescribeSQLSamplesResponseBodyData setInner(Boolean inner) {
            this.inner = inner;
            return this;
        }
        public Boolean getInner() {
            return this.inner;
        }

        public DescribeSQLSamplesResponseBodyData setMemstoreReadRows(Double memstoreReadRows) {
            this.memstoreReadRows = memstoreReadRows;
            return this;
        }
        public Double getMemstoreReadRows() {
            return this.memstoreReadRows;
        }

        public DescribeSQLSamplesResponseBodyData setNetTime(Double netTime) {
            this.netTime = netTime;
            return this;
        }
        public Double getNetTime() {
            return this.netTime;
        }

        public DescribeSQLSamplesResponseBodyData setNetWaitTime(Double netWaitTime) {
            this.netWaitTime = netWaitTime;
            return this;
        }
        public Double getNetWaitTime() {
            return this.netWaitTime;
        }

        public DescribeSQLSamplesResponseBodyData setObDbId(Double obDbId) {
            this.obDbId = obDbId;
            return this;
        }
        public Double getObDbId() {
            return this.obDbId;
        }

        public DescribeSQLSamplesResponseBodyData setObServerId(Double obServerId) {
            this.obServerId = obServerId;
            return this;
        }
        public Double getObServerId() {
            return this.obServerId;
        }

        public DescribeSQLSamplesResponseBodyData setObUserId(Double obUserId) {
            this.obUserId = obUserId;
            return this;
        }
        public Double getObUserId() {
            return this.obUserId;
        }

        public DescribeSQLSamplesResponseBodyData setPartitionCount(Double partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Double getPartitionCount() {
            return this.partitionCount;
        }

        public DescribeSQLSamplesResponseBodyData setPlanId(Double planId) {
            this.planId = planId;
            return this;
        }
        public Double getPlanId() {
            return this.planId;
        }

        public DescribeSQLSamplesResponseBodyData setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeSQLSamplesResponseBodyData setQueueTime(Double queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Double getQueueTime() {
            return this.queueTime;
        }

        public DescribeSQLSamplesResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeSQLSamplesResponseBodyData setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public DescribeSQLSamplesResponseBodyData setRetCode(Double retCode) {
            this.retCode = retCode;
            return this;
        }
        public Double getRetCode() {
            return this.retCode;
        }

        public DescribeSQLSamplesResponseBodyData setRetryCount(Double retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Double getRetryCount() {
            return this.retryCount;
        }

        public DescribeSQLSamplesResponseBodyData setReturnRows(Double returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Double getReturnRows() {
            return this.returnRows;
        }

        public DescribeSQLSamplesResponseBodyData setRowCacheHit(Double rowCacheHit) {
            this.rowCacheHit = rowCacheHit;
            return this;
        }
        public Double getRowCacheHit() {
            return this.rowCacheHit;
        }

        public DescribeSQLSamplesResponseBodyData setRpcCount(Double rpcCount) {
            this.rpcCount = rpcCount;
            return this;
        }
        public Double getRpcCount() {
            return this.rpcCount;
        }

        public DescribeSQLSamplesResponseBodyData setScheduleTime(Double scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Double getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeSQLSamplesResponseBodyData setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeSQLSamplesResponseBodyData setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSQLSamplesResponseBodyData setSsstoreReadRows(Double ssstoreReadRows) {
            this.ssstoreReadRows = ssstoreReadRows;
            return this;
        }
        public Double getSsstoreReadRows() {
            return this.ssstoreReadRows;
        }

        public DescribeSQLSamplesResponseBodyData setStatement(String statement) {
            this.statement = statement;
            return this;
        }
        public String getStatement() {
            return this.statement;
        }

        public DescribeSQLSamplesResponseBodyData setTableScan(Boolean tableScan) {
            this.tableScan = tableScan;
            return this;
        }
        public Boolean getTableScan() {
            return this.tableScan;
        }

        public DescribeSQLSamplesResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeSQLSamplesResponseBodyData setTransHash(String transHash) {
            this.transHash = transHash;
            return this;
        }
        public String getTransHash() {
            return this.transHash;
        }

        public DescribeSQLSamplesResponseBodyData setUsedWorkerCount(Double usedWorkerCount) {
            this.usedWorkerCount = usedWorkerCount;
            return this;
        }
        public Double getUsedWorkerCount() {
            return this.usedWorkerCount;
        }

        public DescribeSQLSamplesResponseBodyData setUserIoWaitTime(Double userIoWaitTime) {
            this.userIoWaitTime = userIoWaitTime;
            return this;
        }
        public Double getUserIoWaitTime() {
            return this.userIoWaitTime;
        }

        public DescribeSQLSamplesResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSQLSamplesResponseBodyData setWaitCount(Double waitCount) {
            this.waitCount = waitCount;
            return this;
        }
        public Double getWaitCount() {
            return this.waitCount;
        }

        public DescribeSQLSamplesResponseBodyData setWaitEvent(String waitEvent) {
            this.waitEvent = waitEvent;
            return this;
        }
        public String getWaitEvent() {
            return this.waitEvent;
        }

        public DescribeSQLSamplesResponseBodyData setWaitTime(Double waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Double getWaitTime() {
            return this.waitTime;
        }

    }

}
