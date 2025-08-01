// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProcessStatsCompositionResponseBody extends TeaModel {
    /**
     * <p>The return result.</p>
     */
    @NameInMap("Data")
    public DescribeProcessStatsCompositionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessStatsCompositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatsCompositionResponseBody self = new DescribeProcessStatsCompositionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatsCompositionResponseBody setData(DescribeProcessStatsCompositionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProcessStatsCompositionResponseBodyData getData() {
        return this.data;
    }

    public DescribeProcessStatsCompositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Command")
        public String command;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("Database")
        public String database;

        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("PlanId")
        public Long planId;

        @NameInMap("ProxySessId")
        public String proxySessId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("SessionId")
        public Long sessionId;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("User")
        public String user;

        public static DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList self = new DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setDynamicSql(Boolean dynamicSql) {
            this.dynamicSql = dynamicSql;
            return this;
        }
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setProxySessId(String proxySessId) {
            this.proxySessId = proxySessId;
            return this;
        }
        public String getProxySessId() {
            return this.proxySessId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Command")
        public String command;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("Database")
        public String database;

        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("PlanId")
        public Long planId;

        @NameInMap("ProcessSqlList")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList> processSqlList;

        @NameInMap("ProxySessId")
        public String proxySessId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("SessionId")
        public Long sessionId;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("User")
        public String user;

        public static DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists self = new DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setDynamicSql(Boolean dynamicSql) {
            this.dynamicSql = dynamicSql;
            return this;
        }
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setProcessSqlList(java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList> processSqlList) {
            this.processSqlList = processSqlList;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlListsProcessSqlList> getProcessSqlList() {
            return this.processSqlList;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setProxySessId(String proxySessId) {
            this.proxySessId = proxySessId;
            return this;
        }
        public String getProxySessId() {
            return this.proxySessId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataAllProcessList extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The type of the SQL statement being executed in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Query</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The CPU time spent on executing the current SQL statement, in seconds. </p>
         * <blockquote>
         * <p>This parameter is introduced since OceanBase Database V3.2.4 BP5.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>c1</p>
         */
        @NameInMap("Database")
        public String database;

        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

        /**
         * <p>The definition of this parameter varies based on whether the SQL statement is executed.</p>
         * <ul>
         * <li>When the request is accepted and the result is not returned to the client, this parameter indicates the time interval between the time when the request is accepted and the current time, in seconds.</li>
         * <li>When the request is not accepted, this parameter indicates the duration for which the current status lasts, in seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The ID of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1898</p>
         */
        @NameInMap("PlanId")
        public Long planId;

        @NameInMap("ProcessSqlLists")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists> processSqlLists;

        /**
         * <p>The session ID of the client. If an OceanBase Database Proxy (ODP) is used for connection, the session ID of the ODP is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7521015416********</p>
         */
        @NameInMap("ProxySessId")
        public String proxySessId;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerSn")
        public String serverSn;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>322441****</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <p>The ID of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>45CCBDC7DEBDCDAXXXXAFC********</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL text.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from c1 where id = 100;</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The status of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>test_mysql</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the trace.</p>
         * 
         * <strong>example:</strong>
         * <p>YB420XXX128-00062XXXX8313XXX1-X-X</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The user to which the session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeProcessStatsCompositionResponseBodyDataAllProcessList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataAllProcessList self = new DescribeProcessStatsCompositionResponseBodyDataAllProcessList();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setDynamicSql(Boolean dynamicSql) {
            this.dynamicSql = dynamicSql;
            return this;
        }
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setProcessSqlLists(java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists> processSqlLists) {
            this.processSqlLists = processSqlLists;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessListProcessSqlLists> getProcessSqlLists() {
            return this.processSqlLists;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setProxySessId(String proxySessId) {
            this.proxySessId = proxySessId;
            return this;
        }
        public String getProxySessId() {
            return this.proxySessId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setServerSn(String serverSn) {
            this.serverSn = serverSn;
            return this;
        }
        public String getServerSn() {
            return this.serverSn;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics extends TeaModel {
        /**
         * <p>The number of active sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_database</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The dimension. This value is fixed to database.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics self = new DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics setMetricValue(String metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public String getMetricValue() {
            return this.metricValue;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics extends TeaModel {
        /**
         * <p>The number of active sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The dimension. This value is fixed to client.</p>
         * 
         * <strong>example:</strong>
         * <p>client</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics self = new DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics setMetricValue(String metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public String getMetricValue() {
            return this.metricValue;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics extends TeaModel {
        /**
         * <p>The number of active sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The dimension. This value is fixed to user.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics self = new DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics setMetricValue(String metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public String getMetricValue() {
            return this.metricValue;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyDataSessionStatistics extends TeaModel {
        /**
         * <p>The session data in the database dimension.</p>
         */
        @NameInMap("DataBaseStatistics")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics> dataBaseStatistics;

        /**
         * <p>The session data in the client dimension.</p>
         */
        @NameInMap("SourceStatistics")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics> sourceStatistics;

        /**
         * <p>The session data in the user dimension.</p>
         */
        @NameInMap("UserStatistics")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics> userStatistics;

        public static DescribeProcessStatsCompositionResponseBodyDataSessionStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyDataSessionStatistics self = new DescribeProcessStatsCompositionResponseBodyDataSessionStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics setDataBaseStatistics(java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics> dataBaseStatistics) {
            this.dataBaseStatistics = dataBaseStatistics;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics> getDataBaseStatistics() {
            return this.dataBaseStatistics;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics setSourceStatistics(java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics> sourceStatistics) {
            this.sourceStatistics = sourceStatistics;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics> getSourceStatistics() {
            return this.sourceStatistics;
        }

        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics setUserStatistics(java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics> userStatistics) {
            this.userStatistics = userStatistics;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsUserStatistics> getUserStatistics() {
            return this.userStatistics;
        }

    }

    public static class DescribeProcessStatsCompositionResponseBodyData extends TeaModel {
        /**
         * <p>The number of active sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ActiveSessionCount")
        public Long activeSessionCount;

        /**
         * <p>The details of all sessions.</p>
         */
        @NameInMap("AllProcessList")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> allProcessList;

        /**
         * <p>The number of sessions in the SLEEP state.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IdleSessionCount")
        public Long idleSessionCount;

        /**
         * <p>The version of OceanBase Database.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.4</p>
         */
        @NameInMap("ObVersion")
        public String obVersion;

        /**
         * <p>The session data in different dimensions.</p>
         */
        @NameInMap("SessionStatistics")
        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics sessionStatistics;

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalSessionCount")
        public Long totalSessionCount;

        public static DescribeProcessStatsCompositionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyData self = new DescribeProcessStatsCompositionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyData setActiveSessionCount(Long activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Long getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public DescribeProcessStatsCompositionResponseBodyData setAllProcessList(java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> allProcessList) {
            this.allProcessList = allProcessList;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> getAllProcessList() {
            return this.allProcessList;
        }

        public DescribeProcessStatsCompositionResponseBodyData setIdleSessionCount(Long idleSessionCount) {
            this.idleSessionCount = idleSessionCount;
            return this;
        }
        public Long getIdleSessionCount() {
            return this.idleSessionCount;
        }

        public DescribeProcessStatsCompositionResponseBodyData setObVersion(String obVersion) {
            this.obVersion = obVersion;
            return this;
        }
        public String getObVersion() {
            return this.obVersion;
        }

        public DescribeProcessStatsCompositionResponseBodyData setSessionStatistics(DescribeProcessStatsCompositionResponseBodyDataSessionStatistics sessionStatistics) {
            this.sessionStatistics = sessionStatistics;
            return this;
        }
        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics getSessionStatistics() {
            return this.sessionStatistics;
        }

        public DescribeProcessStatsCompositionResponseBodyData setTotalSessionCount(Long totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            return this;
        }
        public Long getTotalSessionCount() {
            return this.totalSessionCount;
        }

    }

}
