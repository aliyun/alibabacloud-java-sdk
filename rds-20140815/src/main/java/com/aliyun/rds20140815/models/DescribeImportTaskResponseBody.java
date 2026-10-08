// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskResponseBody extends TeaModel {
    /**
     * <p>The account name.</p>
     * 
     * <strong>example:</strong>
     * <p>myadmin</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The Milvus version number.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("DbVersion")
    public String dbVersion;

    /**
     * <p>The detailed information about the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Error Message</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A103039D-B1B2-4C57-B989-7D7C0DA95426</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The category of the source instance.</p>
     * <ul>
     * <li><strong>ECS</strong>: Alibaba Cloud ECS.</li>
     * <li><strong>other</strong>: Other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>59.172.25.122</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The source MySQL port.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourcePort")
    public String sourcePort;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Importing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the destination disaster recovery instance for the switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4neh0q12v1******</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>416980000</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type. This parameter is used to query tasks of specific types. Separate multiple task types with commas (,). A maximum of 30 task types are supported. If this parameter is left empty, tasks of all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>import</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportTaskResponseBody self = new DescribeImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportTaskResponseBody setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeImportTaskResponseBody setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public String getDbVersion() {
        return this.dbVersion;
    }

    public DescribeImportTaskResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public DescribeImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImportTaskResponseBody setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public DescribeImportTaskResponseBody setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeImportTaskResponseBody setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public String getSourcePort() {
        return this.sourcePort;
    }

    public DescribeImportTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImportTaskResponseBody setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    public DescribeImportTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeImportTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeImportTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
