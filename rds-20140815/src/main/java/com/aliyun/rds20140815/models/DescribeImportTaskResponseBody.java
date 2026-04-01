// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myadmin</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("DbVersion")
    public String dbVersion;

    /**
     * <strong>example:</strong>
     * <p>Error Message</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>A103039D-B1B2-4C57-B989-7D7C0DA95426</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <strong>example:</strong>
     * <p>59.172.25.122</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourcePort")
    public String sourcePort;

    /**
     * <strong>example:</strong>
     * <p>Importing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>rm-t4neh0q12v1******</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <strong>example:</strong>
     * <p>416980000</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
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
