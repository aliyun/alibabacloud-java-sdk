// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProcessStatsCompositionResponseBody extends TeaModel {
    /**
     * <p>The return result.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeProcessStatsCompositionResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessStatsCompositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatsCompositionResponseBody self = new DescribeProcessStatsCompositionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatsCompositionResponseBody setData(java.util.List<DescribeProcessStatsCompositionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeProcessStatsCompositionResponseBodyData> getData() {
        return this.data;
    }

    public DescribeProcessStatsCompositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessStatsCompositionResponseBodyDataAllProcessList extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The type of command executed on the current session.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The CPU time.</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The execution time.</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The ID of the plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The ID of the proxy session.</p>
         */
        @NameInMap("ProxySessId")
        public String proxySessId;

        /**
         * <p>The IP address of the server.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The ID of the session.</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <p>The ID of the SQL statement.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The state of the session.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the trace.</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The username that you use to log in to the database.</p>
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

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeProcessStatsCompositionResponseBodyDataAllProcessList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
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
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The value of the database metric.</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The type of the database statistics.</p>
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
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The value of the data source metric.</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The type of the data source.</p>
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
         */
        @NameInMap("ActiveCount")
        public Long activeCount;

        /**
         * <p>The value of the user metric.</p>
         */
        @NameInMap("MetricValue")
        public String metricValue;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The type of the user.</p>
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
         * <p>The database statistics.</p>
         */
        @NameInMap("DataBaseStatistics")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsDataBaseStatistics> dataBaseStatistics;

        /**
         * <p>The data source statistics.</p>
         */
        @NameInMap("SourceStatistics")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataSessionStatisticsSourceStatistics> sourceStatistics;

        /**
         * <p>The user statistics.</p>
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
         */
        @NameInMap("ActiveSessionCount")
        public Integer activeSessionCount;

        /**
         * <p>The list of all processes in the system.</p>
         */
        @NameInMap("AllProcessList")
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> allProcessList;

        /**
         * <p>The number of idle sessions.</p>
         */
        @NameInMap("IdleSessionCount")
        public Integer idleSessionCount;

        /**
         * <p>The version of OceanBase Database.</p>
         */
        @NameInMap("ObVersion")
        public String obVersion;

        /**
         * <p>The session statistics.</p>
         */
        @NameInMap("SessionStatistics")
        public DescribeProcessStatsCompositionResponseBodyDataSessionStatistics sessionStatistics;

        /**
         * <p>The total number of sessions.</p>
         */
        @NameInMap("TotalSessionCount")
        public Integer totalSessionCount;

        public static DescribeProcessStatsCompositionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessStatsCompositionResponseBodyData self = new DescribeProcessStatsCompositionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessStatsCompositionResponseBodyData setActiveSessionCount(Integer activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Integer getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public DescribeProcessStatsCompositionResponseBodyData setAllProcessList(java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> allProcessList) {
            this.allProcessList = allProcessList;
            return this;
        }
        public java.util.List<DescribeProcessStatsCompositionResponseBodyDataAllProcessList> getAllProcessList() {
            return this.allProcessList;
        }

        public DescribeProcessStatsCompositionResponseBodyData setIdleSessionCount(Integer idleSessionCount) {
            this.idleSessionCount = idleSessionCount;
            return this;
        }
        public Integer getIdleSessionCount() {
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

        public DescribeProcessStatsCompositionResponseBodyData setTotalSessionCount(Integer totalSessionCount) {
            this.totalSessionCount = totalSessionCount;
            return this;
        }
        public Integer getTotalSessionCount() {
            return this.totalSessionCount;
        }

    }

}
