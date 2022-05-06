// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    @NameInMap("SourcePort")
    public Long sourcePort;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskName")
    public String taskName;

    public static DescribeCloudMigrationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationResultRequest self = new DescribeCloudMigrationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationResultRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCloudMigrationResultRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudMigrationResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudMigrationResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCloudMigrationResultRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public DescribeCloudMigrationResultRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public DescribeCloudMigrationResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeCloudMigrationResultRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
