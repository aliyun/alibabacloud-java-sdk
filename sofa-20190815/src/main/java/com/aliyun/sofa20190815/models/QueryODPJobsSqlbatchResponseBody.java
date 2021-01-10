// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPJobsSqlbatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPJobsSqlbatchResponseBodyData data;

    public static QueryODPJobsSqlbatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPJobsSqlbatchResponseBody self = new QueryODPJobsSqlbatchResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPJobsSqlbatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPJobsSqlbatchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPJobsSqlbatchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPJobsSqlbatchResponseBody setData(QueryODPJobsSqlbatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPJobsSqlbatchResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPJobsSqlbatchResponseBodyDataSqlJobs extends TeaModel {
        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastEndTime")
        public String lastEndTime;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("SqlBatchJobId")
        public Long sqlBatchJobId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Variables")
        public String variables;

        public static QueryODPJobsSqlbatchResponseBodyDataSqlJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryODPJobsSqlbatchResponseBodyDataSqlJobs self = new QueryODPJobsSqlbatchResponseBodyDataSqlJobs();
            return TeaModel.build(map, self);
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setLastEndTime(String lastEndTime) {
            this.lastEndTime = lastEndTime;
            return this;
        }
        public String getLastEndTime() {
            return this.lastEndTime;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setSqlBatchJobId(Long sqlBatchJobId) {
            this.sqlBatchJobId = sqlBatchJobId;
            return this;
        }
        public Long getSqlBatchJobId() {
            return this.sqlBatchJobId;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryODPJobsSqlbatchResponseBodyDataSqlJobs setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

    public static class QueryODPJobsSqlbatchResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("FinishedExecutions")
        public String finishedExecutions;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LastEndTime")
        public String lastEndTime;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SqlJobMode")
        public String sqlJobMode;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalExecutions")
        public String totalExecutions;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ZdalproxyInstanceId")
        public String zdalproxyInstanceId;

        @NameInMap("SqlJobs")
        public java.util.List<QueryODPJobsSqlbatchResponseBodyDataSqlJobs> sqlJobs;

        public static QueryODPJobsSqlbatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPJobsSqlbatchResponseBodyData self = new QueryODPJobsSqlbatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPJobsSqlbatchResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryODPJobsSqlbatchResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryODPJobsSqlbatchResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryODPJobsSqlbatchResponseBodyData setFinishedExecutions(String finishedExecutions) {
            this.finishedExecutions = finishedExecutions;
            return this;
        }
        public String getFinishedExecutions() {
            return this.finishedExecutions;
        }

        public QueryODPJobsSqlbatchResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPJobsSqlbatchResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPJobsSqlbatchResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPJobsSqlbatchResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPJobsSqlbatchResponseBodyData setLastEndTime(String lastEndTime) {
            this.lastEndTime = lastEndTime;
            return this;
        }
        public String getLastEndTime() {
            return this.lastEndTime;
        }

        public QueryODPJobsSqlbatchResponseBodyData setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public QueryODPJobsSqlbatchResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryODPJobsSqlbatchResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public QueryODPJobsSqlbatchResponseBodyData setSqlJobMode(String sqlJobMode) {
            this.sqlJobMode = sqlJobMode;
            return this;
        }
        public String getSqlJobMode() {
            return this.sqlJobMode;
        }

        public QueryODPJobsSqlbatchResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryODPJobsSqlbatchResponseBodyData setTotalExecutions(String totalExecutions) {
            this.totalExecutions = totalExecutions;
            return this;
        }
        public String getTotalExecutions() {
            return this.totalExecutions;
        }

        public QueryODPJobsSqlbatchResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryODPJobsSqlbatchResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryODPJobsSqlbatchResponseBodyData setZdalproxyInstanceId(String zdalproxyInstanceId) {
            this.zdalproxyInstanceId = zdalproxyInstanceId;
            return this;
        }
        public String getZdalproxyInstanceId() {
            return this.zdalproxyInstanceId;
        }

        public QueryODPJobsSqlbatchResponseBodyData setSqlJobs(java.util.List<QueryODPJobsSqlbatchResponseBodyDataSqlJobs> sqlJobs) {
            this.sqlJobs = sqlJobs;
            return this;
        }
        public java.util.List<QueryODPJobsSqlbatchResponseBodyDataSqlJobs> getSqlJobs() {
            return this.sqlJobs;
        }

    }

}
