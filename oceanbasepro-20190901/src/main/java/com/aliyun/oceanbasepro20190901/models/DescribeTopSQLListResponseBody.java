// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopSQLList")
    public java.util.List<DescribeTopSQLListResponseBodyTopSQLList> topSQLList;

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
