// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasAnomalySQLListResponseBody extends TeaModel {
    /**
     * <p>The list of suspicious SQLs.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOasAnomalySQLListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOasAnomalySQLListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasAnomalySQLListResponseBody self = new DescribeOasAnomalySQLListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOasAnomalySQLListResponseBody setData(java.util.List<DescribeOasAnomalySQLListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOasAnomalySQLListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOasAnomalySQLListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOasAnomalySQLListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOasAnomalySQLListResponseBodyDataSqlList extends TeaModel {
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        @NameInMap("CpuTime")
        public Double cpuTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DiagTypes")
        public java.util.List<String> diagTypes;

        @NameInMap("Diagnosis")
        public String diagnosis;

        @NameInMap("Executions")
        public Double executions;

        @NameInMap("LastExecutedTime")
        public Double lastExecutedTime;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("SumDbTime")
        public Double sumDbTime;

        @NameInMap("SumElapsedTime")
        public String sumElapsedTime;

        @NameInMap("UserName")
        public String userName;

        public static DescribeOasAnomalySQLListResponseBodyDataSqlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasAnomalySQLListResponseBodyDataSqlList self = new DescribeOasAnomalySQLListResponseBodyDataSqlList();
            return TeaModel.build(map, self);
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgDbTime(Double avgDbTime) {
            this.avgDbTime = avgDbTime;
            return this;
        }
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgGetPlanTime(Double avgGetPlanTime) {
            this.avgGetPlanTime = avgGetPlanTime;
            return this;
        }
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setCpuTime(Double cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Double getCpuTime() {
            return this.cpuTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setDiagTypes(java.util.List<String> diagTypes) {
            this.diagTypes = diagTypes;
            return this;
        }
        public java.util.List<String> getDiagTypes() {
            return this.diagTypes;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public String getDiagnosis() {
            return this.diagnosis;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setExecutions(Double executions) {
            this.executions = executions;
            return this;
        }
        public Double getExecutions() {
            return this.executions;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setLastExecutedTime(Double lastExecutedTime) {
            this.lastExecutedTime = lastExecutedTime;
            return this;
        }
        public Double getLastExecutedTime() {
            return this.lastExecutedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSqlTextShort(String sqlTextShort) {
            this.sqlTextShort = sqlTextShort;
            return this;
        }
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSumDbTime(Double sumDbTime) {
            this.sumDbTime = sumDbTime;
            return this;
        }
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSumElapsedTime(String sumElapsedTime) {
            this.sumElapsedTime = sumElapsedTime;
            return this;
        }
        public String getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeOasAnomalySQLListResponseBodyData extends TeaModel {
        /**
         * <p>Average CPU time of the suspicious SQL.</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        /**
         * <p>Average response time of the suspicious SQL.</p>
         */
        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        /**
         * <p>Average time to obtain the execution plan of the suspicious SQL.</p>
         */
        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        /**
         * <p>CPU time of the suspicious SQL.</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The type of the diagnosis.</p>
         */
        @NameInMap("DiagTypes")
        public java.util.List<String> diagTypes;

        /**
         * <p>The details of diagnosis.</p>
         */
        @NameInMap("Diagnosis")
        public String diagnosis;

        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

        /**
         * <p>Total execution count of the suspicious SQL.</p>
         */
        @NameInMap("Executions")
        public Double executions;

        /**
         * <p>Last execution time of the suspicious SQL.</p>
         */
        @NameInMap("LastExecutedTime")
        public Double lastExecutedTime;

        /**
         * <p>Risk level.</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>SQL ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlList")
        public java.util.List<DescribeOasAnomalySQLListResponseBodyDataSqlList> sqlList;

        /**
         * <p>Prefix of the SQL text.</p>
         */
        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        /**
         * <p>Suggestion for the suspicious SQL.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("SumDbTime")
        public Double sumDbTime;

        /**
         * <p>Total response time of the suspicious SQL.</p>
         */
        @NameInMap("SumElapsedTime")
        public String sumElapsedTime;

        /**
         * <p>Username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeOasAnomalySQLListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasAnomalySQLListResponseBodyData self = new DescribeOasAnomalySQLListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOasAnomalySQLListResponseBodyData setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setAvgDbTime(Double avgDbTime) {
            this.avgDbTime = avgDbTime;
            return this;
        }
        public Double getAvgDbTime() {
            return this.avgDbTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setAvgElapsedTime(Double avgElapsedTime) {
            this.avgElapsedTime = avgElapsedTime;
            return this;
        }
        public Double getAvgElapsedTime() {
            return this.avgElapsedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setAvgGetPlanTime(Double avgGetPlanTime) {
            this.avgGetPlanTime = avgGetPlanTime;
            return this;
        }
        public Double getAvgGetPlanTime() {
            return this.avgGetPlanTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setCpuTime(Double cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Double getCpuTime() {
            return this.cpuTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasAnomalySQLListResponseBodyData setDiagTypes(java.util.List<String> diagTypes) {
            this.diagTypes = diagTypes;
            return this;
        }
        public java.util.List<String> getDiagTypes() {
            return this.diagTypes;
        }

        public DescribeOasAnomalySQLListResponseBodyData setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public String getDiagnosis() {
            return this.diagnosis;
        }

        public DescribeOasAnomalySQLListResponseBodyData setDynamicSql(Boolean dynamicSql) {
            this.dynamicSql = dynamicSql;
            return this;
        }
        public Boolean getDynamicSql() {
            return this.dynamicSql;
        }

        public DescribeOasAnomalySQLListResponseBodyData setExecutions(Double executions) {
            this.executions = executions;
            return this;
        }
        public Double getExecutions() {
            return this.executions;
        }

        public DescribeOasAnomalySQLListResponseBodyData setLastExecutedTime(Double lastExecutedTime) {
            this.lastExecutedTime = lastExecutedTime;
            return this;
        }
        public Double getLastExecutedTime() {
            return this.lastExecutedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSqlList(java.util.List<DescribeOasAnomalySQLListResponseBodyDataSqlList> sqlList) {
            this.sqlList = sqlList;
            return this;
        }
        public java.util.List<DescribeOasAnomalySQLListResponseBodyDataSqlList> getSqlList() {
            return this.sqlList;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSqlTextShort(String sqlTextShort) {
            this.sqlTextShort = sqlTextShort;
            return this;
        }
        public String getSqlTextShort() {
            return this.sqlTextShort;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSumDbTime(Double sumDbTime) {
            this.sumDbTime = sumDbTime;
            return this;
        }
        public Double getSumDbTime() {
            return this.sumDbTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setSumElapsedTime(String sumElapsedTime) {
            this.sumElapsedTime = sumElapsedTime;
            return this;
        }
        public String getSumElapsedTime() {
            return this.sumElapsedTime;
        }

        public DescribeOasAnomalySQLListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
