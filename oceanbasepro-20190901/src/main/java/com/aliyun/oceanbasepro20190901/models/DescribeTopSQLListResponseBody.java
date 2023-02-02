// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of top SQL statements.</p>
     */
    @NameInMap("TopSQLList")
    public java.util.List<DescribeTopSQLListResponseBodyTopSQLList> topSQLList;

    /**
     * <p>The total count.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeTopSQLListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopSQLListResponseBody self = new DescribeTopSQLListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopSQLListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopSQLListResponseBody setTopSQLList(java.util.List<DescribeTopSQLListResponseBodyTopSQLList> topSQLList) {
        this.topSQLList = topSQLList;
        return this;
    }
    public java.util.List<DescribeTopSQLListResponseBodyTopSQLList> getTopSQLList() {
        return this.topSQLList;
    }

    public DescribeTopSQLListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTopSQLListResponseBodyTopSQLList extends TeaModel {
        /**
         * <p>The number of rows affected.</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The wait time of the client, in ms.</p>
         */
        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        /**
         * <p>The number of block cache hits.</p>
         */
        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        /**
         * <p>The number of block index cache hits.</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        /**
         * <p>The number of Bloom filter cache hits.</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The wait time in concurrent execution, in ms.</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        /**
         * <p>The average CPU time, in ms.</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The time to wait for decoding, in ms.</p>
         */
        @NameInMap("DecodeTime")
        public Float decodeTime;

        /**
         * <p>The number of physical reads.</p>
         */
        @NameInMap("DiskRead")
        public Long diskRead;

        /**
         * <p>The average response time, in ms.</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The wait event.</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The number of executions per second.</p>
         */
        @NameInMap("ExecPerSecond")
        public Float execPerSecond;

        /**
         * <p>The internal execution time, in ms.</p>
         */
        @NameInMap("ExecuteTime")
        public Float executeTime;

        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>The number of failures.</p>
         */
        @NameInMap("FailTimes")
        public Long failTimes;

        /**
         * <p>The time spent in hard parsing, in ms.</p>
         */
        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        /**
         * <p>The I/O wait time, in ms.</p>
         */
        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        /**
         * <p>The sequence number of the returned SQL statement.</p>
         */
        @NameInMap("Key")
        public Long key;

        /**
         * <p>The average number of logical reads of the SQL statement during the specified period of time.   </p>
         * <p>The value covers the numbers of reads of different caches and the number of disk I/Os. It is an important metric for measuring the SQL filtering performance.   </p>
         * <br>
         * <p>> <br> A higher ratio of the number of logical reads to the number of returned rows indicates poorer filtering performance. General causes include non-standard content written by SQL statements, non-standard table indexes created, and non-standard SQL execution plans.</p>
         */
        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The maximum CPU time, in ms.</p>
         */
        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        /**
         * <p>The maximum response time, in ms.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        /**
         * <p>The number of rows read from the memory.</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        /**
         * <p>The number of plan misses.</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>The network latency, in ms.</p>
         */
        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The queuing time, in ms.</p>
         */
        @NameInMap("QueueTime")
        public Float queueTime;

        /**
         * <p>The number of RPCs.</p>
         */
        @NameInMap("RPCCount")
        public Long RPCCount;

        /**
         * <p>The number of remote plans.</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>The number of retries.</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The number of row cache hits.</p>
         */
        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        /**
         * <p>SQLID.</p>
         */
        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>The SQL text.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The SQL type.</p>
         */
        @NameInMap("SQLType")
        public Long SQLType;

        /**
         * <p>The scheduling duration, in ms.</p>
         */
        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        /**
         * <p>The number of rows read from the disk.</p>
         */
        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        /**
         * <p>The internal wait time, in ms.</p>
         */
        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

        /**
         * <p>The username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeTopSQLListResponseBodyTopSQLList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopSQLListResponseBodyTopSQLList self = new DescribeTopSQLListResponseBodyTopSQLList();
            return TeaModel.build(map, self);
        }

        public DescribeTopSQLListResponseBodyTopSQLList setAffectedRows(Long affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setAppWaitTime(Float appWaitTime) {
            this.appWaitTime = appWaitTime;
            return this;
        }
        public Float getAppWaitTime() {
            return this.appWaitTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setBlockCacheHit(Long blockCacheHit) {
            this.blockCacheHit = blockCacheHit;
            return this;
        }
        public Long getBlockCacheHit() {
            return this.blockCacheHit;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setBlockIndexCacheHit(Long blockIndexCacheHit) {
            this.blockIndexCacheHit = blockIndexCacheHit;
            return this;
        }
        public Long getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setBloomFilterCacheHit(Long bloomFilterCacheHit) {
            this.bloomFilterCacheHit = bloomFilterCacheHit;
            return this;
        }
        public Long getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setConcurrencyWaitTime(Float concurrencyWaitTime) {
            this.concurrencyWaitTime = concurrencyWaitTime;
            return this;
        }
        public Float getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setCpuTime(Float cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Float getCpuTime() {
            return this.cpuTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setDecodeTime(Float decodeTime) {
            this.decodeTime = decodeTime;
            return this;
        }
        public Float getDecodeTime() {
            return this.decodeTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setDiskRead(Long diskRead) {
            this.diskRead = diskRead;
            return this;
        }
        public Long getDiskRead() {
            return this.diskRead;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setExecPerSecond(Float execPerSecond) {
            this.execPerSecond = execPerSecond;
            return this;
        }
        public Float getExecPerSecond() {
            return this.execPerSecond;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setExecuteTime(Float executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Float getExecuteTime() {
            return this.executeTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setFailTimes(Long failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Long getFailTimes() {
            return this.failTimes;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setGetPlanTime(Float getPlanTime) {
            this.getPlanTime = getPlanTime;
            return this;
        }
        public Float getGetPlanTime() {
            return this.getPlanTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setIOWaitTime(Float IOWaitTime) {
            this.IOWaitTime = IOWaitTime;
            return this;
        }
        public Float getIOWaitTime() {
            return this.IOWaitTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setKey(Long key) {
            this.key = key;
            return this;
        }
        public Long getKey() {
            return this.key;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setLogicalRead(Long logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setMaxCpuTime(Float maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Float getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setMaxElapsedTime(Float maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Float getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setMemstoreReadRowCount(Long memstoreReadRowCount) {
            this.memstoreReadRowCount = memstoreReadRowCount;
            return this;
        }
        public Long getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setMissPlans(Long missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Long getMissPlans() {
            return this.missPlans;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setNetWaitTime(Float netWaitTime) {
            this.netWaitTime = netWaitTime;
            return this;
        }
        public Float getNetWaitTime() {
            return this.netWaitTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setQueueTime(Float queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Float getQueueTime() {
            return this.queueTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setRPCCount(Long RPCCount) {
            this.RPCCount = RPCCount;
            return this;
        }
        public Long getRPCCount() {
            return this.RPCCount;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setRemotePlans(Long remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setRowCacheHit(Long rowCacheHit) {
            this.rowCacheHit = rowCacheHit;
            return this;
        }
        public Long getRowCacheHit() {
            return this.rowCacheHit;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setSQLId(String SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public String getSQLId() {
            return this.SQLId;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setSQLType(Long SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public Long getSQLType() {
            return this.SQLType;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setScheduleTime(Float scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Float getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setSsstoreReadRowCount(Long ssstoreReadRowCount) {
            this.ssstoreReadRowCount = ssstoreReadRowCount;
            return this;
        }
        public Long getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setTotalWaitTime(Float totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Float getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeTopSQLListResponseBodyTopSQLList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
