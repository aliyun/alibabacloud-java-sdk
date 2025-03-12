// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasAnomalySQLListResponseBody extends TeaModel {
    /**
     * <p>The information about suspicious SQL statements.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOasAnomalySQLListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469**-AA6F-4D**-B3DB-A***********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
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
        /**
         * <p>The average CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>100.24</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>The average DB time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        /**
         * <p>The average response time.</p>
         * 
         * <strong>example:</strong>
         * <p>100.28</p>
         */
        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        /**
         * <p>The average plan generation time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        /**
         * <p>The average number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("AvgLogicalReads")
        public Float avgLogicalReads;

        /**
         * <p>The average number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AvgRetryCount")
        public Float avgRetryCount;

        /**
         * <p>The total CPU time.</p>
         * 
         * <strong>example:</strong>
         * <p>100.23</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_hsp****eway</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The diagnostic types.</p>
         */
        @NameInMap("DiagTypes")
        public java.util.List<String> diagTypes;

        /**
         * <p>The diagnostic details. </p>
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Diagnosis")
        public String diagnosis;

        /**
         * <p>The total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Executions")
        public Double executions;

        /**
         * <p>The last execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T04:38:38Z</p>
         */
        @NameInMap("LastExecutedTime")
        public String lastExecutedTime;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The ID of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>3A645<strong><strong>789F13DE0CF6D084FF9</strong></strong></p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The prefix of the SQL text.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        /**
         * <p>The suggestion on the suspicious SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Role\&quot;: \&quot;eSG\&quot;, \&quot;Result\&quot;: \&quot;100\&quot;, \&quot;Suggestion\&quot;: \&quot;TRACER_OTHER_ERR\&quot;}</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The total DB time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SumDbTime")
        public Double sumDbTime;

        /**
         * <p>The total response time.</p>
         * 
         * <strong>example:</strong>
         * <p>11452126.36</p>
         */
        @NameInMap("SumElapsedTime")
        public String sumElapsedTime;

        /**
         * <p>The total number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SumRetryCount")
        public Float sumRetryCount;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
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

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgLogicalReads(Float avgLogicalReads) {
            this.avgLogicalReads = avgLogicalReads;
            return this;
        }
        public Float getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setAvgRetryCount(Float avgRetryCount) {
            this.avgRetryCount = avgRetryCount;
            return this;
        }
        public Float getAvgRetryCount() {
            return this.avgRetryCount;
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

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setLastExecutedTime(String lastExecutedTime) {
            this.lastExecutedTime = lastExecutedTime;
            return this;
        }
        public String getLastExecutedTime() {
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

        public DescribeOasAnomalySQLListResponseBodyDataSqlList setSumRetryCount(Float sumRetryCount) {
            this.sumRetryCount = sumRetryCount;
            return this;
        }
        public Float getSumRetryCount() {
            return this.sumRetryCount;
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
         * 
         * <strong>example:</strong>
         * <p>100.24</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>The average DB time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgDbTime")
        public Double avgDbTime;

        /**
         * <p>Average response time of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>100.28</p>
         */
        @NameInMap("AvgElapsedTime")
        public Double avgElapsedTime;

        /**
         * <p>Average time to obtain the execution plan of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgGetPlanTime")
        public Double avgGetPlanTime;

        /**
         * <p>The average number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("AvgLogicalReads")
        public Float avgLogicalReads;

        /**
         * <p>The average number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AvgRetryCount")
        public Float avgRetryCount;

        /**
         * <p>CPU time of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>100.23</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_***</p>
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
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Diagnosis")
        public String diagnosis;

        /**
         * <p>是否动态SQL</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DynamicSql")
        public Boolean dynamicSql;

        /**
         * <p>Total execution count of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Executions")
        public Double executions;

        /**
         * <p>Last execution time of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12T04:38:38Z</p>
         */
        @NameInMap("LastExecutedTime")
        public Double lastExecutedTime;

        /**
         * <p>Risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>SQL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The list of SQL statements.</p>
         */
        @NameInMap("SqlList")
        public java.util.List<DescribeOasAnomalySQLListResponseBodyDataSqlList> sqlList;

        /**
         * <p>Prefix of the SQL text.</p>
         */
        @NameInMap("SqlTextShort")
        public String sqlTextShort;

        /**
         * <p>Suggestion for the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The total DB time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SumDbTime")
        public Double sumDbTime;

        /**
         * <p>Total response time of the suspicious SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>11452126.36</p>
         */
        @NameInMap("SumElapsedTime")
        public String sumElapsedTime;

        /**
         * <p>The total number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SumRetryCount")
        public Float sumRetryCount;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
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

        public DescribeOasAnomalySQLListResponseBodyData setAvgLogicalReads(Float avgLogicalReads) {
            this.avgLogicalReads = avgLogicalReads;
            return this;
        }
        public Float getAvgLogicalReads() {
            return this.avgLogicalReads;
        }

        public DescribeOasAnomalySQLListResponseBodyData setAvgRetryCount(Float avgRetryCount) {
            this.avgRetryCount = avgRetryCount;
            return this;
        }
        public Float getAvgRetryCount() {
            return this.avgRetryCount;
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

        public DescribeOasAnomalySQLListResponseBodyData setSumRetryCount(Float sumRetryCount) {
            this.sumRetryCount = sumRetryCount;
            return this;
        }
        public Float getSumRetryCount() {
            return this.sumRetryCount;
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
