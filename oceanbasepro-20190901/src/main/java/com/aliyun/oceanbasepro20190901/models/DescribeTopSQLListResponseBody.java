// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListResponseBody extends TeaModel {
    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The I/O wait time, in ms.</p>
     */
    @NameInMap("TopSQLList")
    public java.util.List<DescribeTopSQLListResponseBodyTopSQLList> topSQLList;

    /**
     * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
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
         * <p>The internal wait time, in ms.</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The wait time in concurrent execution, in ms.</p>
         */
        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        /**
         * <p>The average CPU time, in ms.</p>
         */
        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        /**
         * <p>$.parameters[16].schema.example</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        /**
         * <p>$.parameters[14].schema.enumValueTitles</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        /**
         * <p>$.parameters[14].schema.description</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        /**
         * <p>The maximum CPU time, in ms.</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The number of remote plans.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The number of rows to return on each page.   </p>
         * <p>- Maximum value: 100   </p>
         * <p>- Default value: 10</p>
         */
        @NameInMap("DecodeTime")
        public Float decodeTime;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("DiskRead")
        public Long diskRead;

        /**
         * <p>The sorting rule.</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The number of rows read from the disk.</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The operation that you want to perform.   </p>
         * <p>Set the value to **DescribeTopSQLList**.</p>
         */
        @NameInMap("ExecPerSecond")
        public Float execPerSecond;

        /**
         * <p>The number of rows read from the memory.</p>
         */
        @NameInMap("ExecuteTime")
        public Float executeTime;

        /**
         * <p>The number of executions per second.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>$.parameters[12].schema.description</p>
         */
        @NameInMap("FailTimes")
        public Long failTimes;

        /**
         * <p>The queuing time, in ms.</p>
         */
        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        /**
         * <p>$.parameters[15].schema.example</p>
         */
        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Key")
        public Long key;

        /**
         * <p>You can call this operation to query SQL execution performance data collected by the diagnostic system.</p>
         */
        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>SQLID.</p>
         */
        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        /**
         * <p>The sequence number of the returned SQL statement.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        /**
         * <p>The total count.</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>The end time of the time range for querying TOP SQL statements.   </p>
         * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
         */
        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        /**
         * <p>The username.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>$.parameters[12].schema.enumValueTitles</p>
         */
        @NameInMap("QueueTime")
        public Float queueTime;

        /**
         * <p>The start time of the time range for querying TOP SQL statements.   </p>
         * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
         */
        @NameInMap("RPCCount")
        public Long RPCCount;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>$.parameters[13].schema.description</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The wait event.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=DescribeTopSQLList</p>
         * <p>&TenantId=t2mr3oae0****</p>
         * <p>&StartTime=2021-06-13 15:40:43</p>
         * <p>&EndTime=2021-09-13 15:40:43</p>
         * <p>&DbName=testdb</p>
         * <p>&SearchKeyWord=update</p>
         * <p>&SearchParameter=cputime</p>
         * <p>&SearchRule=></p>
         * <p>&SearchValue=0.01</p>
         * <p>&SQLId=8D6E84****0B8FB1823D199E2CA1****</p>
         * <p>&NodeIp=i-bp19y05uq6xpacyqnlrc</p>
         * <p>&PageNumber=1</p>
         * <p>&PageSize=10</p>
         * <p>&SortColumn=cputime</p>
         * <p>&SortOrder=desc</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        /**
         * <p>$.parameters[13].schema.example</p>
         */
        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>The list of top SQL statements.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("SQLType")
        public Long SQLType;

        /**
         * <p>The search keyword.</p>
         */
        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        /**
         * <p>-</p>
         */
        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

        /**
         * <p>The number of Bloom filter cache hits.</p>
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
