// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLHistoryListResponseBody extends TeaModel {
    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of Bloom filter cache hits.</p>
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
         * <p>The wait time of the client.</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        /**
         * <p>The number of block index cache hits.</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        /**
         * <p>The username.</p>
         */
        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        /**
         * <p>The number of remote plans.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The number of block cache hits.</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The number of retries.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The number of rows read from the disk.</p>
         */
        @NameInMap("DecodeTime")
        public Float decodeTime;

        /**
         * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
         */
        @NameInMap("DiskRead")
        public Long diskRead;

        /**
         * <p>The number of row cache hits.</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The maximum CPU time.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of rows read from the memory.</p>
         */
        @NameInMap("EndTimeUTCString")
        public String endTimeUTCString;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The queuing time.</p>
         */
        @NameInMap("ExecPerSecond")
        public Long execPerSecond;

        /**
         * <p>The execution history of the SQL statement.</p>
         */
        @NameInMap("ExecuteTime")
        public Float executeTime;

        /**
         * <p>The wait time in concurrent execution.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("FailTimes")
        public Long failTimes;

        /**
         * <p>The number of RPCs.</p>
         */
        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        /**
         * <p>The number of rows affected.</p>
         */
        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The number of row cache hits.</p>
         */
        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        /**
         * <p>The scheduling duration.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        /**
         * <p>The operation that you want to perform.   </p>
         * <p>Set the value to **DescribeSQLHistoryList**.</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        /**
         * <p>The number of Bloom filter cache hits.</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        /**
         * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("QueueTime")
        public Float queueTime;

        /**
         * <p>The quantity.</p>
         */
        @NameInMap("RPCCount")
        public Long RPCCount;

        /**
         * <p>The list.</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The I/O wait time.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>{"name":"DescribeSQLHistoryList","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"POST|GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeSQLHistoryList\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"StartTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-06-13T15:40:43Z\"},{\"name\":\"EndTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-09-13T15:40:43Z\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"},{\"name\":\"PageNumber\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"PageSize\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"10\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\"},{\"name\":\"SQLHistoryList\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Object\",\"children\":[{\"name\":\"List\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"description\":\"  \",\"children\":[{\"name\":\"ExecPerSecond\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"163.0\"},{\"name\":\"MaxCpuTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"257.967\"},{\"name\":\"BlockCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"14\"},{\"name\":\"DecodeTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"RemotePlans\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"RPCCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"NetWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"DiskRead\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"NodeIp\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"i-bp18qljorblo8es*****\"},{\"name\":\"ConcurrencyWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"DbName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"MemstoreReadRowCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"527\"},{\"name\":\"AppWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"ElapsedTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"76.382\"},{\"name\":\"MissPlans\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"AffectedRows\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"ScheduleTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"Event\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"mysql response wait client\"},{\"name\":\"TotalWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"10.966\"},{\"name\":\"ReturnRows\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"ExecuteTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"61.044\"},{\"name\":\"UserName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"tester\"},{\"name\":\"Executions\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"89403\"},{\"name\":\"GetPlanTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.052\"},{\"name\":\"CpuTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"50.13\"},{\"name\":\"MaxElapsedTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"260.44\"},{\"name\":\"BlockIndexCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"4\"},{\"name\":\"EndTimeUTCString\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-12-28T02:08:18Z\"},{\"name\":\"EndTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-12-28T02:08:18Z\"},{\"name\":\"RetryCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"ClientIp\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"1*2.***.1*3.***\"},{\"name\":\"BloomFilterCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"IOWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"FailTimes\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"QueueTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"15.275\"},{\"name\":\"RowCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"LogicalRead\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"19\"},{\"name\":\"SsstoreReadRowCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"43086\"}],\"title\":\"\"},{\"name\":\"Count\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"}],\"title\":\"\",\"description\":\"\"}],\"title\":\"\",\"description\":\"\"}","errors":"{\"2014\":[{\"code\":\"2014\",\"defaultError\":false,\"errorCode\":\"InternalError\",\"errorMessage\":\"The request processing has failed due to some unknown error.\",\"errorMessageCn\":\"\",\"type\":\"user\"}]}"}</p>
         */
        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        /**
         * <p>The end time of the time range for querying the SQL execution history.   </p>
         * <p>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
         */
        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        /**
         * <p>The average response time.</p>
         */
        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

        /**
         * <p>The network latency.</p>
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
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The I/O wait time.</p>
         */
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
