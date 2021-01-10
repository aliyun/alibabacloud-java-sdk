// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPJobsSqlbatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchqueryODPJobsSqlbatchResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPJobsSqlbatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPJobsSqlbatchResponseBody self = new BatchqueryODPJobsSqlbatchResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPJobsSqlbatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPJobsSqlbatchResponseBody setData(BatchqueryODPJobsSqlbatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchqueryODPJobsSqlbatchResponseBodyData getData() {
        return this.data;
    }

    public BatchqueryODPJobsSqlbatchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPJobsSqlbatchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("Variables")
        public String variables;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("LastEndTime")
        public String lastEndTime;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Content")
        public String content;

        @NameInMap("SqlBatchJobId")
        public Long sqlBatchJobId;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs self = new BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setLastEndTime(String lastEndTime) {
            this.lastEndTime = lastEndTime;
            return this;
        }
        public String getLastEndTime() {
            return this.lastEndTime;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setSqlBatchJobId(Long sqlBatchJobId) {
            this.sqlBatchJobId = sqlBatchJobId;
            return this;
        }
        public Long getSqlBatchJobId() {
            return this.sqlBatchJobId;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchqueryODPJobsSqlbatchResponseBodyDataContent extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("SqlJobs")
        public java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs> sqlJobs;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ZdalproxyInstanceId")
        public String zdalproxyInstanceId;

        @NameInMap("FinishedExecutions")
        public String finishedExecutions;

        @NameInMap("SqlJobMode")
        public String sqlJobMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("LastEndTime")
        public String lastEndTime;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("TotalExecutions")
        public String totalExecutions;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryODPJobsSqlbatchResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPJobsSqlbatchResponseBodyDataContent self = new BatchqueryODPJobsSqlbatchResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setSqlJobs(java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs> sqlJobs) {
            this.sqlJobs = sqlJobs;
            return this;
        }
        public java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContentSqlJobs> getSqlJobs() {
            return this.sqlJobs;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setZdalproxyInstanceId(String zdalproxyInstanceId) {
            this.zdalproxyInstanceId = zdalproxyInstanceId;
            return this;
        }
        public String getZdalproxyInstanceId() {
            return this.zdalproxyInstanceId;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setFinishedExecutions(String finishedExecutions) {
            this.finishedExecutions = finishedExecutions;
            return this;
        }
        public String getFinishedExecutions() {
            return this.finishedExecutions;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setSqlJobMode(String sqlJobMode) {
            this.sqlJobMode = sqlJobMode;
            return this;
        }
        public String getSqlJobMode() {
            return this.sqlJobMode;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setLastEndTime(String lastEndTime) {
            this.lastEndTime = lastEndTime;
            return this;
        }
        public String getLastEndTime() {
            return this.lastEndTime;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setTotalExecutions(String totalExecutions) {
            this.totalExecutions = totalExecutions;
            return this;
        }
        public String getTotalExecutions() {
            return this.totalExecutions;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchqueryODPJobsSqlbatchResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContent> content;

        public static BatchqueryODPJobsSqlbatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPJobsSqlbatchResponseBodyData self = new BatchqueryODPJobsSqlbatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPJobsSqlbatchResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public BatchqueryODPJobsSqlbatchResponseBodyData setContent(java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<BatchqueryODPJobsSqlbatchResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
