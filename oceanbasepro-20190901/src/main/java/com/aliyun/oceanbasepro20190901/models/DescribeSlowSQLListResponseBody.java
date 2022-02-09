// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 慢SQL列表信息
    @NameInMap("SlowSQLList")
    public java.util.List<DescribeSlowSQLListResponseBodySlowSQLList> slowSQLList;

    // 总数量
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
        @NameInMap("AffectedRows")
        public Long affectedRows;

        @NameInMap("AppWaitTime")
        public Float appWaitTime;

        @NameInMap("BlockCacheHit")
        public Long blockCacheHit;

        @NameInMap("BlockIndexCacheHit")
        public Long blockIndexCacheHit;

        @NameInMap("BloomFilterCacheHit")
        public Long bloomFilterCacheHit;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ConcurrencyWaitTime")
        public Float concurrencyWaitTime;

        @NameInMap("CpuTime")
        public Float cpuTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DecodeTime")
        public Float decodeTime;

        @NameInMap("DiskRead")
        public Long diskRead;

        @NameInMap("ElapsedTime")
        public Float elapsedTime;

        @NameInMap("Event")
        public String event;

        @NameInMap("ExecPerSecond")
        public Float execPerSecond;

        @NameInMap("ExecuteTime")
        public Float executeTime;

        @NameInMap("Executions")
        public Long executions;

        @NameInMap("FailTimes")
        public Long failTimes;

        @NameInMap("GetPlanTime")
        public Float getPlanTime;

        @NameInMap("IOWaitTime")
        public Float IOWaitTime;

        @NameInMap("Key")
        public Long key;

        @NameInMap("LogicalRead")
        public Long logicalRead;

        @NameInMap("MaxCpuTime")
        public Float maxCpuTime;

        @NameInMap("MaxElapsedTime")
        public Float maxElapsedTime;

        @NameInMap("MemstoreReadRowCount")
        public Long memstoreReadRowCount;

        @NameInMap("MissPlans")
        public Long missPlans;

        @NameInMap("NetWaitTime")
        public Float netWaitTime;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("QueueTime")
        public Float queueTime;

        @NameInMap("RPCCount")
        public Long RPCCount;

        @NameInMap("RemotePlans")
        public Long remotePlans;

        @NameInMap("RetryCount")
        public Long retryCount;

        @NameInMap("ReturnRows")
        public Long returnRows;

        @NameInMap("RowCacheHit")
        public Long rowCacheHit;

        @NameInMap("SQLId")
        public String SQLId;

        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("SQLType")
        public Long SQLType;

        @NameInMap("ScheduleTime")
        public Float scheduleTime;

        @NameInMap("SsstoreReadRowCount")
        public Long ssstoreReadRowCount;

        @NameInMap("TotalWaitTime")
        public Float totalWaitTime;

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
