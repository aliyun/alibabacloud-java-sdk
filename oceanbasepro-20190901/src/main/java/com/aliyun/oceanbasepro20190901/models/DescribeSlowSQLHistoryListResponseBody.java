// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLHistoryListResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 慢SQL历史列表
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
        @NameInMap("AffectedRows")
        public Double affectedRows;

        @NameInMap("AppWaitTime")
        public Double appWaitTime;

        @NameInMap("BlockCacheHit")
        public Double blockCacheHit;

        @NameInMap("BlockIndexCacheHit")
        public Double blockIndexCacheHit;

        @NameInMap("BloomFilterCacheHit")
        public Double bloomFilterCacheHit;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ConcurrencyWaitTime")
        public Double concurrencyWaitTime;

        @NameInMap("CpuTime")
        public Double cpuTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DecodeTime")
        public Double decodeTime;

        @NameInMap("DiskRead")
        public Double diskRead;

        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        @NameInMap("EndTimeUTCString")
        public String endTimeUTCString;

        @NameInMap("Event")
        public String event;

        @NameInMap("ExecPerSecond")
        public Double execPerSecond;

        @NameInMap("ExecuteTime")
        public Double executeTime;

        @NameInMap("Executions")
        public Double executions;

        @NameInMap("FailTimes")
        public Double failTimes;

        @NameInMap("GetplanTime")
        public Double getplanTime;

        @NameInMap("IOWaitTime")
        public Double IOWaitTime;

        @NameInMap("LogicalRead")
        public Double logicalRead;

        @NameInMap("MaxCpuTime")
        public Double maxCpuTime;

        @NameInMap("MaxElapsedTime")
        public Double maxElapsedTime;

        @NameInMap("MemstoreReadRowCount")
        public Double memstoreReadRowCount;

        @NameInMap("MissPlans")
        public Double missPlans;

        @NameInMap("NetwaitTime")
        public Double netwaitTime;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("QueueTime")
        public Double queueTime;

        @NameInMap("RPCCount")
        public Double RPCCount;

        @NameInMap("RemotePlans")
        public Double remotePlans;

        @NameInMap("RetryCount")
        public Double retryCount;

        @NameInMap("ReturnRows")
        public Double returnRows;

        @NameInMap("RowCacheHit")
        public Double rowCacheHit;

        @NameInMap("ScheduleTime")
        public Double scheduleTime;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("SsstoreReadRowCount")
        public Double ssstoreReadRowCount;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("TotalWaitTime")
        public Double totalWaitTime;

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

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setGetplanTime(Double getplanTime) {
            this.getplanTime = getplanTime;
            return this;
        }
        public Double getGetplanTime() {
            return this.getplanTime;
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

        public DescribeSlowSQLHistoryListResponseBodySlowSQLHistoryListList setNetwaitTime(Double netwaitTime) {
            this.netwaitTime = netwaitTime;
            return this;
        }
        public Double getNetwaitTime() {
            return this.netwaitTime;
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
        @NameInMap("Count")
        public Long count;

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
