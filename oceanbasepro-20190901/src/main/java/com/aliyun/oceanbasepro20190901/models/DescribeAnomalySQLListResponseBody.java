// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListResponseBody extends TeaModel {
    /**
     * <p>The list of suspicious SQL statements.</p>
     */
    @NameInMap("AnomalySQLList")
    public java.util.List<DescribeAnomalySQLListResponseBodyAnomalySQLList> anomalySQLList;

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

    public static DescribeAnomalySQLListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLListResponseBody self = new DescribeAnomalySQLListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLListResponseBody setAnomalySQLList(java.util.List<DescribeAnomalySQLListResponseBodyAnomalySQLList> anomalySQLList) {
        this.anomalySQLList = anomalySQLList;
        return this;
    }
    public java.util.List<DescribeAnomalySQLListResponseBodyAnomalySQLList> getAnomalySQLList() {
        return this.anomalySQLList;
    }

    public DescribeAnomalySQLListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnomalySQLListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAnomalySQLListResponseBodyAnomalySQLList extends TeaModel {
        /**
         * <p>The average CPU time, in ms.</p>
         */
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The diagnosis information.</p>
         */
        @NameInMap("Diagnosis")
        public String diagnosis;

        /**
         * <p>The diagnostic rule.</p>
         */
        @NameInMap("DiagnosisRule")
        public String diagnosisRule;

        /**
         * <p>The number of executions.</p>
         */
        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>The sequence number of the returned SQL statement.</p>
         */
        @NameInMap("Key")
        public Long key;

        /**
         * <p>The request time, in ms.</p>
         */
        @NameInMap("RequestTime")
        public Float requestTime;

        /**
         * <p>The request time in UTC +0.</p>
         */
        @NameInMap("RequestTimeUTCString")
        public String requestTimeUTCString;

        /**
         * <p>SQLID.</p>
         */
        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>The SQL text.</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>The suggestions.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The username.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeAnomalySQLListResponseBodyAnomalySQLList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLListResponseBodyAnomalySQLList self = new DescribeAnomalySQLListResponseBodyAnomalySQLList();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setCpuTime(Float cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Float getCpuTime() {
            return this.cpuTime;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public String getDiagnosis() {
            return this.diagnosis;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setDiagnosisRule(String diagnosisRule) {
            this.diagnosisRule = diagnosisRule;
            return this;
        }
        public String getDiagnosisRule() {
            return this.diagnosisRule;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setExecutions(Long executions) {
            this.executions = executions;
            return this;
        }
        public Long getExecutions() {
            return this.executions;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setKey(Long key) {
            this.key = key;
            return this;
        }
        public Long getKey() {
            return this.key;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setRequestTime(Float requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Float getRequestTime() {
            return this.requestTime;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setRequestTimeUTCString(String requestTimeUTCString) {
            this.requestTimeUTCString = requestTimeUTCString;
            return this;
        }
        public String getRequestTimeUTCString() {
            return this.requestTimeUTCString;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setSQLId(String SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public String getSQLId() {
            return this.SQLId;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
