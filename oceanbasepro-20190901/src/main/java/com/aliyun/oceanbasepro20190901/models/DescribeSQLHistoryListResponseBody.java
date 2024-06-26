// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLHistoryListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution history of the SQL statement.</p>
     */
    @NameInMap("SQLHistoryList")
    public DescribeSQLHistoryListResponseBodySQLHistoryList SQLHistoryList;

    public static DescribeSQLHistoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLHistoryListResponseBody self = new DescribeSQLHistoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLHistoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLHistoryListResponseBody setSQLHistoryList(DescribeSQLHistoryListResponseBodySQLHistoryList SQLHistoryList) {
        this.SQLHistoryList = SQLHistoryList;
        return this;
    }
    public DescribeSQLHistoryListResponseBodySQLHistoryList getSQLHistoryList() {
        return this.SQLHistoryList;
    }

    public static class DescribeSQLHistoryListResponseBodySQLHistoryListList extends TeaModel {
        /**
         * <p>The number of rows affected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The wait time of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        /**
         * <p>The number of block cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        /**
         * <p>The number of block index cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        /**
         * <p>The number of Bloom filter cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1<em>2.</em><strong>.1<em>3.</em></strong></p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The wait time in concurrent execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        /**
         * <p>The average CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>50.13</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The time to wait for decoding.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("DecodeTime")
        public Float decodeTime;

        /**
         * <p>The number of physical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiskRead")
        public Long diskRead;

        /**
         * <p>The average response time.</p>
         * 
         * <strong>example:</strong>
         * <p>76.382</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-28T02:08:18Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The end time in UTC +0.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-28T02:08:18Z</p>
         */
        @NameInMap("EndTimeUTCString")
        public String endTimeUTCString;

        /**
         * <p>The wait event.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql response wait client</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The number of executions per second.</p>
         * 
         * <strong>example:</strong>
         * <p>163.0</p>
         */
        @NameInMap("ExecPerSecond")
        public Long execPerSecond;

        /**
         * <p>The internal execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>61.044</p>
         */
        @NameInMap("ExecuteTime")
        public Float executeTime;

        /**
         * <p>The number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>89403</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>The number of failures.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailTimes")
        public Long failTimes;

        /**
         * <p>The time spent in hard parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>0.052</p>
         */
        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        /**
         * <p>The I/O wait time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The maximum CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>257.967</p>
         */
        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        /**
         * <p>The maximum response time.</p>
         * 
         * <strong>example:</strong>
         * <p>260.44</p>
         */
        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        /**
         * <p>The number of rows read from the memory.</p>
         * 
         * <strong>example:</strong>
         * <p>527</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        /**
         * <p>The number of plan misses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>The network latency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp18qljorblo8es*****</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The queuing time.</p>
         * 
         * <strong>example:</strong>
         * <p>15.275</p>
         */
        @NameInMap("QueueTime")
        public Float queueTime;

        /**
         * <p>The number of RPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RPCCount")
        public Long RPCCount;

        /**
         * <p>The number of remote plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The number of row cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        /**
         * <p>The scheduling duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        /**
         * <p>The number of rows read from the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>43086</p>
         */
        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        /**
         * <p>The internal wait time.</p>
         * 
         * <strong>example:</strong>
         * <p>10.966</p>
         */
        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>tester</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSQLHistoryListResponseBodySQLHistoryListList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLHistoryListResponseBodySQLHistoryListList self = new DescribeSQLHistoryListResponseBodySQLHistoryListList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setAffectedRows(Long affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setAppWaitTime(Float appWaitTime) {
            this.appWaitTime = appWaitTime;
            return this;
        }
        public Float getAppWaitTime() {
            return this.appWaitTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setBlockCacheHit(Long blockCacheHit) {
            this.blockCacheHit = blockCacheHit;
            return this;
        }
        public Long getBlockCacheHit() {
            return this.blockCacheHit;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setBlockIndexCacheHit(Long blockIndexCacheHit) {
            this.blockIndexCacheHit = blockIndexCacheHit;
            return this;
        }
        public Long getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setBloomFilterCacheHit(Long bloomFilterCacheHit) {
            this.bloomFilterCacheHit = bloomFilterCacheHit;
            return this;
        }
        public Long getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setConcurrencyWaitTime(Float concurrencyWaitTime) {
            this.concurrencyWaitTime = concurrencyWaitTime;
            return this;
        }
        public Float getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setCpuTime(Float cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Float getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setDecodeTime(Float decodeTime) {
            this.decodeTime = decodeTime;
            return this;
        }
        public Float getDecodeTime() {
            return this.decodeTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setDiskRead(Long diskRead) {
            this.diskRead = diskRead;
            return this;
        }
        public Long getDiskRead() {
            return this.diskRead;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setEndTimeUTCString(String endTimeUTCString) {
            this.endTimeUTCString = endTimeUTCString;
            return this;
        }
        public String getEndTimeUTCString() {
            return this.endTimeUTCString;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setExecPerSecond(Long execPerSecond) {
            this.execPerSecond = execPerSecond;
            return this;
        }
        public Long getExecPerSecond() {
            return this.execPerSecond;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setExecuteTime(Float executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Float getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setFailTimes(Long failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Long getFailTimes() {
            return this.failTimes;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setGetPlanTime(Float getPlanTime) {
            this.getPlanTime = getPlanTime;
            return this;
        }
        public Float getGetPlanTime() {
            return this.getPlanTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setIOWaitTime(Float IOWaitTime) {
            this.IOWaitTime = IOWaitTime;
            return this;
        }
        public Float getIOWaitTime() {
            return this.IOWaitTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setLogicalRead(Long logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setMaxCpuTime(Float maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Float getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setMaxElapsedTime(Float maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Float getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setMemstoreReadRowCount(Long memstoreReadRowCount) {
            this.memstoreReadRowCount = memstoreReadRowCount;
            return this;
        }
        public Long getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setMissPlans(Long missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Long getMissPlans() {
            return this.missPlans;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setNetWaitTime(Float netWaitTime) {
            this.netWaitTime = netWaitTime;
            return this;
        }
        public Float getNetWaitTime() {
            return this.netWaitTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setQueueTime(Float queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Float getQueueTime() {
            return this.queueTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setRPCCount(Long RPCCount) {
            this.RPCCount = RPCCount;
            return this;
        }
        public Long getRPCCount() {
            return this.RPCCount;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setRemotePlans(Long remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setRowCacheHit(Long rowCacheHit) {
            this.rowCacheHit = rowCacheHit;
            return this;
        }
        public Long getRowCacheHit() {
            return this.rowCacheHit;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setScheduleTime(Float scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Float getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setSsstoreReadRowCount(Long ssstoreReadRowCount) {
            this.ssstoreReadRowCount = ssstoreReadRowCount;
            return this;
        }
        public Long getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setTotalWaitTime(Float totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Float getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryListList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSQLHistoryListResponseBodySQLHistoryList extends TeaModel {
        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        @NameInMap("List")
        public java.util.List<DescribeSQLHistoryListResponseBodySQLHistoryListList> list;

        public static DescribeSQLHistoryListResponseBodySQLHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLHistoryListResponseBodySQLHistoryList self = new DescribeSQLHistoryListResponseBodySQLHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSQLHistoryListResponseBodySQLHistoryList setList(java.util.List<DescribeSQLHistoryListResponseBodySQLHistoryListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSQLHistoryListResponseBodySQLHistoryListList> getList() {
            return this.list;
        }

    }

}
