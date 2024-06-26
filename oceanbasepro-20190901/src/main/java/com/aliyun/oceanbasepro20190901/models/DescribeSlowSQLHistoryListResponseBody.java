// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLHistoryListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution history of the slow SQL statement.</p>
     */
    @NameInMap("SlowSQLHistoryList")
    public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList slowSQLHistoryList;

    public static DescribeSlowSQLHistoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLHistoryListResponseBody self = new DescribeSlowSQLHistoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLHistoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowSQLHistoryListResponseBody setSlowSQLHistoryList(DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList slowSQLHistoryList) {
        this.slowSQLHistoryList = slowSQLHistoryList;
        return this;
    }
    public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList getSlowSQLHistoryList() {
        return this.slowSQLHistoryList;
    }

    public static class DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList extends TeaModel {
        /**
         * <p>The number of rows affected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectedRows")
        public Double affectedRows;

        /**
         * <p>The wait time of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AppWaitTime")
        public Double appWaitTime;

        /**
         * <p>The number of block cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("BlockCacheHit")
        public Double blockCacheHit;

        /**
         * <p>The number of block index cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Double blockIndexCacheHit;

        /**
         * <p>The number of Bloom filter cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Double bloomFilterCacheHit;

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
        public Double concurrencyWaitTime;

        /**
         * <p>The average CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>50.13</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

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
        public Double decodeTime;

        /**
         * <p>The number of physical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiskRead")
        public Double diskRead;

        /**
         * <p>The average response time.</p>
         * 
         * <strong>example:</strong>
         * <p>76.382</p>
         */
        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        /**
         * <p>The end time.</p>
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
        public Double execPerSecond;

        /**
         * <p>The internal execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>61.044</p>
         */
        @NameInMap("ExecuteTime")
        public Double executeTime;

        /**
         * <p>The number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>89403</p>
         */
        @NameInMap("Executions")
        public Double executions;

        /**
         * <p>The number of failures.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailTimes")
        public Double failTimes;

        /**
         * <p>Hard parsing time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.052</p>
         */
        @NameInMap("GetPlanTime")
        public Double getPlanTime;

        /**
         * <p>The I/O wait time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("IOWaitTime")
        public Double IOWaitTime;

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("LogicalRead")
        public Double logicalRead;

        /**
         * <p>The maximum CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>257.967</p>
         */
        @NameInMap("MaxCpuTime")
        public Double maxCpuTime;

        /**
         * <p>The maximum response time.</p>
         * 
         * <strong>example:</strong>
         * <p>260.044</p>
         */
        @NameInMap("MaxElapsedTime")
        public Double maxElapsedTime;

        /**
         * <p>The number of rows read from the memory.</p>
         * 
         * <strong>example:</strong>
         * <p>527</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Double memstoreReadRowCount;

        /**
         * <p>The number of plan misses.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MissPlans")
        public Double missPlans;

        /**
         * <p>The wait time for network.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("NetWaitTime")
        public Double netWaitTime;

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
        public Double queueTime;

        /**
         * <p>The number of RPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RPCCount")
        public Double RPCCount;

        /**
         * <p>The number of remote plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemotePlans")
        public Double remotePlans;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetryCount")
        public Double retryCount;

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRows")
        public Double returnRows;

        /**
         * <p>The number of row cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowCacheHit")
        public Double rowCacheHit;

        /**
         * <p>The scheduling duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ScheduleTime")
        public Double scheduleTime;

        /**
         * <p>SQLID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The number of rows read from the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>43086</p>
         */
        @NameInMap("SsstoreReadRowCount")
        public Double ssstoreReadRowCount;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_online</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The internal wait time.</p>
         * 
         * <strong>example:</strong>
         * <p>10.966</p>
         */
        @NameInMap("TotalWaitTime")
        public Double totalWaitTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>tester</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList self = new DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList();
            return TeaModel.build(map, self);
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setAffectedRows(Double affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Double getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setAppWaitTime(Double appWaitTime) {
            this.appWaitTime = appWaitTime;
            return this;
        }
        public Double getAppWaitTime() {
            return this.appWaitTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setBlockCacheHit(Double blockCacheHit) {
            this.blockCacheHit = blockCacheHit;
            return this;
        }
        public Double getBlockCacheHit() {
            return this.blockCacheHit;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setBlockIndexCacheHit(Double blockIndexCacheHit) {
            this.blockIndexCacheHit = blockIndexCacheHit;
            return this;
        }
        public Double getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setBloomFilterCacheHit(Double bloomFilterCacheHit) {
            this.bloomFilterCacheHit = bloomFilterCacheHit;
            return this;
        }
        public Double getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setConcurrencyWaitTime(Double concurrencyWaitTime) {
            this.concurrencyWaitTime = concurrencyWaitTime;
            return this;
        }
        public Double getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setCpuTime(Double cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Double getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setDecodeTime(Double decodeTime) {
            this.decodeTime = decodeTime;
            return this;
        }
        public Double getDecodeTime() {
            return this.decodeTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setDiskRead(Double diskRead) {
            this.diskRead = diskRead;
            return this;
        }
        public Double getDiskRead() {
            return this.diskRead;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setElapsedTime(Double elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setEndTimeUTCString(String endTimeUTCString) {
            this.endTimeUTCString = endTimeUTCString;
            return this;
        }
        public String getEndTimeUTCString() {
            return this.endTimeUTCString;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setExecPerSecond(Double execPerSecond) {
            this.execPerSecond = execPerSecond;
            return this;
        }
        public Double getExecPerSecond() {
            return this.execPerSecond;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setExecuteTime(Double executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Double getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setExecutions(Double executions) {
            this.executions = executions;
            return this;
        }
        public Double getExecutions() {
            return this.executions;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setFailTimes(Double failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Double getFailTimes() {
            return this.failTimes;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setGetPlanTime(Double getPlanTime) {
            this.getPlanTime = getPlanTime;
            return this;
        }
        public Double getGetPlanTime() {
            return this.getPlanTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setIOWaitTime(Double IOWaitTime) {
            this.IOWaitTime = IOWaitTime;
            return this;
        }
        public Double getIOWaitTime() {
            return this.IOWaitTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setLogicalRead(Double logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setMaxCpuTime(Double maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Double getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setMaxElapsedTime(Double maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Double getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setMemstoreReadRowCount(Double memstoreReadRowCount) {
            this.memstoreReadRowCount = memstoreReadRowCount;
            return this;
        }
        public Double getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setMissPlans(Double missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Double getMissPlans() {
            return this.missPlans;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setNetWaitTime(Double netWaitTime) {
            this.netWaitTime = netWaitTime;
            return this;
        }
        public Double getNetWaitTime() {
            return this.netWaitTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setQueueTime(Double queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Double getQueueTime() {
            return this.queueTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setRPCCount(Double RPCCount) {
            this.RPCCount = RPCCount;
            return this;
        }
        public Double getRPCCount() {
            return this.RPCCount;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setRemotePlans(Double remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Double getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setRetryCount(Double retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Double getRetryCount() {
            return this.retryCount;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setReturnRows(Double returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Double getReturnRows() {
            return this.returnRows;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setRowCacheHit(Double rowCacheHit) {
            this.rowCacheHit = rowCacheHit;
            return this;
        }
        public Double getRowCacheHit() {
            return this.rowCacheHit;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setScheduleTime(Double scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Double getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setSsstoreReadRowCount(Double ssstoreReadRowCount) {
            this.ssstoreReadRowCount = ssstoreReadRowCount;
            return this;
        }
        public Double getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setTotalWaitTime(Double totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Double getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList extends TeaModel {
        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList> list;

        public static DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList self = new DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryList setList(java.util.List<DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList> getList() {
            return this.list;
        }

    }

}
