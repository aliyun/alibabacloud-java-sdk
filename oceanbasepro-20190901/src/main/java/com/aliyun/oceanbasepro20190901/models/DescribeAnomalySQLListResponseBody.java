// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListResponseBody extends TeaModel {
    /**
     * <p>The diagnostic rule.</p>
     */
    @NameInMap("AnomalySQLList")
    public java.util.List<DescribeAnomalySQLListResponseBodyAnomalySQLList> anomalySQLList;

    /**
     * <p>The sorting rule.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL text.</p>
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
        @NameInMap("CpuTime")
        public Float cpuTime;

        /**
         * <p>{"name":"DescribeAnomalySQLList","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"POST|GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":60000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeAnomalySQLList\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"StartTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-06-13T15:40:43Z\"},{\"name\":\"EndTime\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2021-09-13T15:40:43Z\"},{\"name\":\"DbName\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"SearchKeyWord\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"update\"},{\"name\":\"SearchParameter\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"cputime\"},{\"name\":\"SearchRule\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\">\"},{\"name\":\"SearchValue\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"0.01\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"},{\"name\":\"NodeIp\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"i-bp19y05uq6xpacyqnlrc\"},{\"name\":\"AcceptLanguage\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"zh-CN\"},{\"name\":\"PageSize\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"10\"},{\"name\":\"PageNumber\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"FilterCondition\",\"position\":\"Body\",\"style\":\"json\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"enumValueTitles\":{\"UserName\":\"UserName\",\"Event\":\"Event\",\"SQLType\":\"SQLType\",\"ClientIp\":\"ClientIp\"},\"title\":\"\",\"description\":\"\",\"example\":\"{\\n  \\\"UserName\\\":testUser\\n}\"},{\"name\":\"SortColumn\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"cputime\"},{\"name\":\"SortOrder\",\"position\":\"Body\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"enumValueTitles\":{\"{     \\\"dbname\\\":test,     \\\"SQLType\\\":null\\t\\t }\":\"{     \\\"dbname\\\":test,     \\\"SQLType\\\":null\\t\\t }\"},\"title\":\"\",\"description\":\"\",\"example\":\"desc\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"TotalCount\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"2\"},{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\"},{\"name\":\"AnomalySQLList\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"description\":\" \",\"children\":[{\"name\":\"Key\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"1\"},{\"name\":\"DiagnosisRule\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"\"},{\"name\":\"SQLText\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC\"},{\"name\":\"Suggestion\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"\"},{\"name\":\"DbName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"database1\"},{\"name\":\"RequestTimeUTCString\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"2022-01-11T07:08:00Z\"},{\"name\":\"CpuTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"50.13\"},{\"name\":\"SQLId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"99E9D3BF****B486239E6C7BC79B****\"},{\"name\":\"Diagnosis\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"\"},{\"name\":\"RequestTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Float\",\"title\":\"\",\"description\":\"\",\"example\":\"50.00\"},{\"name\":\"Executions\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Long\",\"title\":\"\",\"description\":\"\",\"example\":\"89043\"},{\"name\":\"UserName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"tester\"}],\"title\":\"\"}],\"title\":\"\",\"description\":\"\"}","errors":"{\"2014\":[{\"code\":\"2014\",\"defaultError\":false,\"errorCode\":\"InternalError\",\"errorMessage\":\"The request processing has failed due to some unknown error.\",\"errorMessageCn\":\"\",\"type\":\"user\"}]}"}</p>
         */
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Diagnosis")
        public String diagnosis;

        /**
         * <p>The list of suspicious SQL statements.</p>
         */
        @NameInMap("DiagnosisRule")
        public String diagnosisRule;

        @NameInMap("Executions")
        public Long executions;

        /**
         * <p>The average CPU time, in ms.</p>
         */
        @NameInMap("Key")
        public Long key;

        @NameInMap("RequestTime")
        public Float requestTime;

        @NameInMap("RequestTimeUTCString")
        public String requestTimeUTCString;

        @NameInMap("SQLId")
        public String SQLId;

        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=DescribeAnomalySQLList</p>
         * <p>&TenantId=t2mr3oae0****</p>
         * <p>&StartTime=2021-06-13 15:40:43</p>
         * <p>&EndTime=2021-06-13 15:40:43</p>
         * <p>&DbName=testdb</p>
         * <p>&SearchKeyWord=update</p>
         * <p>&SearchParameter=cputime</p>
         * <p>&SearchRule=></p>
         * <p>&SearchValue=0.01</p>
         * <p>&SQLId=8D6E84****0B8FB1823D199E2CA1****</p>
         * <p>&NodeIp=i-bp19y05uq6xpacyqnlrc</p>
         * <p>&AcceptLanguage=zh-CN</p>
         * <p>&PageSize=10</p>
         * <p>&PageNumber=1</p>
         * <p>&SortColumn=cputime</p>
         * <p>&SortOrder=desc</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>{</p>
         * <p>    "TotalCount": 2,</p>
         * <p>    "RequestId": "473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E",</p>
         * <p>    "AnomalySQLList": [</p>
         * <p>        {</p>
         * <p>            "Key": 1,</p>
         * <p>            "DiagnosisRule": "Utilization above threshold",</p>
         * <p>            "SQLText": "SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC",</p>
         * <p>            "Suggestion": "Check your business scenarios, data distribution changes, request surges, and execution plan changes.",</p>
         * <p>            "DbName": "database1",</p>
         * <p>            "RequestTimeUTCString": "2022-01-11T07:08:00Z",</p>
         * <p>            "SQLId": "99E9D3BF****B486239E6C7BC79B****",</p>
         * <p>            "Diagnosis": "Total number of executions = 80199, Average CPU time = 6.8 ms, Overall CPU utilization = 87%",</p>
         * <p>            "RequestTime": 1641884880000,</p>
         * <p>            "Executions": 89043,</p>
         * <p>            "UserName": "tester"</p>
         * <p>        }</p>
         * <p>    ]</p>
         * <p>}</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

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
