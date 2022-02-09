// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListResponseBody extends TeaModel {
    // 可疑SQL列表
    @NameInMap("AnomalySQLList")
    public java.util.List<DescribeAnomalySQLListResponseBodyAnomalySQLList> anomalySQLList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总数量
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
        // 平均CPU时间
        @NameInMap("CpuTime")
        public Long cpuTime;

        // 数据库名
        @NameInMap("DbName")
        public String dbName;

        // 诊断信息
        @NameInMap("Diagnosis")
        public String diagnosis;

        // 诊断规则
        @NameInMap("DiagnosisRule")
        public String diagnosisRule;

        // 执行次数
        @NameInMap("Executions")
        public Long executions;

        // 返回数据序号
        @NameInMap("Key")
        public Long key;

        // 请求时间
        @NameInMap("RequestTime")
        public Long requestTime;

        // 请求时间（零时区）
        @NameInMap("RequestTimeUTCString")
        public String requestTimeUTCString;

        // SQLID
        @NameInMap("SQLId")
        public String SQLId;

        // sql文本
        @NameInMap("SQLText")
        public String SQLText;

        // 建议
        @NameInMap("Suggestion")
        public String suggestion;

        // 用户名
        @NameInMap("UserName")
        public String userName;

        public static DescribeAnomalySQLListResponseBodyAnomalySQLList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLListResponseBodyAnomalySQLList self = new DescribeAnomalySQLListResponseBodyAnomalySQLList();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
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

        public DescribeAnomalySQLListResponseBodyAnomalySQLList setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
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
