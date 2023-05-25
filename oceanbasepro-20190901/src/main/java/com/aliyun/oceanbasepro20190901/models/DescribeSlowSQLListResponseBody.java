// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListResponseBody extends TeaModel {
    /**
     * <p>The SQL text.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting rule.</p>
     */
    @NameInMap("SlowSQLList")
    public java.util.List<DescribeSlowSQLListResponseBodySlowSQLList> slowSQLList;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSlowSQLListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLListResponseBody self = new DescribeSlowSQLListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowSQLListResponseBody setSlowSQLList(java.util.List<DescribeSlowSQLListResponseBodySlowSQLList> slowSQLList) {
        this.slowSQLList = slowSQLList;
        return this;
    }
    public java.util.List<DescribeSlowSQLListResponseBodySlowSQLList> getSlowSQLList() {
        return this.slowSQLList;
    }

    public DescribeSlowSQLListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSlowSQLListResponseBodySlowSQLList extends TeaModel {
        /**
         * <p>The username.</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The average response time.</p>
         */
        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        /**
         * <p>The wait time in concurrent execution.</p>
         */
        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=DescribeSlowSQLList</p>
         * <p>&TenantId=t2mr3oae0****</p>
         * <p>&StartTime=2021-06-13 15:40:43</p>
         * <p>&EndTime=2021-09-13 15:40:43</p>
         * <p>&DbName=testdb</p>
         * <p>&SearchKeyWord=update</p>
         * <p>&SearchParameter=cputime</p>
         * <p>&SearchRule=></p>
         * <p>&SearchValue=0.01</p>
         * <p>&SQLId=8D6E84****0B8FB1823D199E2CA1****</p>
         * <p>&NodeIp=i-bp18qljorblo8es*****</p>
         * <p>&PageNumber=10</p>
         * <p>&PageSize=1</p>
         * <p>&SortColumn=cputime</p>
         * <p>&SortOrder=desc</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The sorted column.</p>
         */
        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        /**
         * <p>The wait event.</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The search value.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The time spent in hard parsing.</p>
         */
        @NameInMap("DecodeTime")
        public Float decodeTime;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("DiskRead")
        public Long diskRead;

        /**
         * <p>The search rule.</p>
         */
        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        /**
         * <p>The number of row cache hits.</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The total count.</p>
         */
        @NameInMap("ExecPerSecond")
        public Float execPerSecond;

        /**
         * <p>The number of block cache hits.</p>
         */
        @NameInMap("ExecuteTime")
        public Float executeTime;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>{"name":"DescribeSlowSQLList","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"GET|POST","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeSlowSQLList\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"StartTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-06-13T15:40:43Z\"},{\"name\":\"EndTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-09-13T15:40:43Z\"},{\"name\":\"DbName\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"SearchKeyWord\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"update\"},{\"name\":\"SearchParameter\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"cputime\"},{\"name\":\"SearchRule\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\">\"},{\"name\":\"SearchValue\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"0.01\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"},{\"name\":\"NodeIp\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"i-bp18qljorblo8es*****\"},{\"name\":\"PageNumber\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"10\"},{\"name\":\"PageSize\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"FilterCondition\",\"position\":\"Body\",\"style\":\"json\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"[dbName:sys]\"},{\"name\":\"SortColumn\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"cputime\"},{\"name\":\"SortOrder\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"desc\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"TotalCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"2\"},{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\"},{\"name\":\"SlowSQLList\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"description\":\"  \",\"children\":[{\"name\":\"Key\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"ExecPerSecond\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"163.0\"},{\"name\":\"SQLText\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC\"},{\"name\":\"MaxCpuTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"257.967\"},{\"name\":\"BlockCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"14\"},{\"name\":\"DecodeTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"RemotePlans\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"RPCCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"NetWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"DiskRead\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"NodeIp\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"i-bp18qljorblo8es*****\"},{\"name\":\"ConcurrencyWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"MemstoreReadRowCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"527\"},{\"name\":\"DbName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"AppWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"ElapsedTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"76.382\"},{\"name\":\"MissPlans\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"AffectedRows\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"ScheduleTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"Event\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"mysql response wait client\"},{\"name\":\"TotalWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"10.966\"},{\"name\":\"ReturnRows\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"ExecuteTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"61.044\"},{\"name\":\"UserName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"tester\"},{\"name\":\"Executions\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"89403\"},{\"name\":\"GetPlanTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.052\"},{\"name\":\"CpuTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"50.13\"},{\"name\":\"MaxElapsedTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"260.044\"},{\"name\":\"SQLType\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"BlockIndexCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"4\"},{\"name\":\"RetryCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"SQLId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"},{\"name\":\"ClientIp\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"1*2.***.1*3.***\"},{\"name\":\"BloomFilterCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"IOWaitTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"0.0\"},{\"name\":\"FailTimes\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"QueueTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"description\":\"\",\"example\":\"15.275\"},{\"name\":\"RowCacheHit\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"0\"},{\"name\":\"LogicalRead\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"19\"},{\"name\":\"SsstoreReadRowCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"description\":\"\",\"example\":\"43086\"}],\"title\":\"\"}],\"title\":\"\",\"description\":\"\"}","errors":"{}"}</p>
         */
        @NameInMap("FailTimes")
        public Long failTimes;

        /**
         * <p>The number of Bloom filter cache hits.</p>
         */
        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        /**
         * <p>You can call this operation to query the list of slow SQL statements</p>
         */
        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        /**
         * <p>The scheduling duration.</p>
         */
        @NameInMap("Key")
        public Long key;

        @NameInMap("LogicalRead")
        public Long logicalRead;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        /**
         * <p>The sequence number of the returned SQL statement.</p>
         */
        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        /**
         * <p>The number of RPCs.</p>
         */
        @NameInMap("MissPlans")
        public Long missPlans;

        /**
         * <p>The search parameter.</p>
         */
        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        /**
         * <p>The number of failures.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("QueueTime")
        public Float queueTime;

        /**
         * <p>The maximum response time.</p>
         */
        @NameInMap("RPCCount")
        public Long RPCCount;

        /**
         * <p>The search keyword.</p>
         */
        @NameInMap("RemotePlans")
        public Long remotePlans;

        /**
         * <p>The number of physical reads.</p>
         */
        @NameInMap("RetryCount")
        public Long retryCount;

        /**
         * <p>The wait time of the client.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>The network latency.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>SQLID.</p>
         */
        @NameInMap("SQLType")
        public Long SQLType;

        /**
         * <p>The internal execution time.</p>
         */
        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        /**
         * <p>The SQL ID, which uniquely identifies an SQL statement.</p>
         */
        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSlowSQLListResponseBodySlowSQLList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowSQLListResponseBodySlowSQLList self = new DescribeSlowSQLListResponseBodySlowSQLList();
            return TeaModel.build(map, self);
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setAffectedRows(Long affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setAppWaitTime(Float appWaitTime) {
            this.appWaitTime = appWaitTime;
            return this;
        }
        public Float getAppWaitTime() {
            return this.appWaitTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setBlockCacheHit(Long blockCacheHit) {
            this.blockCacheHit = blockCacheHit;
            return this;
        }
        public Long getBlockCacheHit() {
            return this.blockCacheHit;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setBlockIndexCacheHit(Long blockIndexCacheHit) {
            this.blockIndexCacheHit = blockIndexCacheHit;
            return this;
        }
        public Long getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setBloomFilterCacheHit(Long bloomFilterCacheHit) {
            this.bloomFilterCacheHit = bloomFilterCacheHit;
            return this;
        }
        public Long getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setConcurrencyWaitTime(Float concurrencyWaitTime) {
            this.concurrencyWaitTime = concurrencyWaitTime;
            return this;
        }
        public Float getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setCpuTime(Float cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Float getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setDecodeTime(Float decodeTime) {
            this.decodeTime = decodeTime;
            return this;
        }
        public Float getDecodeTime() {
            return this.decodeTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setDiskRead(Long diskRead) {
            this.diskRead = diskRead;
            return this;
        }
        public Long getDiskRead() {
            return this.diskRead;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setElapsedTime(Float elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setExecPerSecond(Float execPerSecond) {
            this.execPerSecond = execPerSecond;
            return this;
        }
        public Float getExecPerSecond() {
            return this.execPerSecond;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setExecuteTime(Float executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Float getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setFailTimes(Long failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Long getFailTimes() {
            return this.failTimes;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setGetPlanTime(Float getPlanTime) {
            this.getPlanTime = getPlanTime;
            return this;
        }
        public Float getGetPlanTime() {
            return this.getPlanTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setIOWaitTime(Float IOWaitTime) {
            this.IOWaitTime = IOWaitTime;
            return this;
        }
        public Float getIOWaitTime() {
            return this.IOWaitTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setKey(Long key) {
            this.key = key;
            return this;
        }
        public Long getKey() {
            return this.key;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setLogicalRead(Long logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setMaxCpuTime(Float maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Float getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setMaxElapsedTime(Float maxElapsedTime) {
            this.maxElapsedTime = maxElapsedTime;
            return this;
        }
        public Float getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setMemstoreReadRowCount(Long memstoreReadRowCount) {
            this.memstoreReadRowCount = memstoreReadRowCount;
            return this;
        }
        public Long getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setMissPlans(Long missPlans) {
            this.missPlans = missPlans;
            return this;
        }
        public Long getMissPlans() {
            return this.missPlans;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setNetWaitTime(Float netWaitTime) {
            this.netWaitTime = netWaitTime;
            return this;
        }
        public Float getNetWaitTime() {
            return this.netWaitTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setQueueTime(Float queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Float getQueueTime() {
            return this.queueTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setRPCCount(Long RPCCount) {
            this.RPCCount = RPCCount;
            return this;
        }
        public Long getRPCCount() {
            return this.RPCCount;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setRemotePlans(Long remotePlans) {
            this.remotePlans = remotePlans;
            return this;
        }
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setRetryCount(Long retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Long getRetryCount() {
            return this.retryCount;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setRowCacheHit(Long rowCacheHit) {
            this.rowCacheHit = rowCacheHit;
            return this;
        }
        public Long getRowCacheHit() {
            return this.rowCacheHit;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setSQLId(String SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public String getSQLId() {
            return this.SQLId;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setSQLType(Long SQLType) {
            this.SQLType = SQLType;
            return this;
        }
        public Long getSQLType() {
            return this.SQLType;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setScheduleTime(Float scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Float getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setSsstoreReadRowCount(Long ssstoreReadRowCount) {
            this.ssstoreReadRowCount = ssstoreReadRowCount;
            return this;
        }
        public Long getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setTotalWaitTime(Float totalWaitTime) {
            this.totalWaitTime = totalWaitTime;
            return this;
        }
        public Float getTotalWaitTime() {
            return this.totalWaitTime;
        }

        public DescribeSlowSQLListResponseBodySlowSQLList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
