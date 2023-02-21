// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
     * <br>
     * <p>*   If the self-managed PostgreSQL instance resides on an ECS instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see [View IP addresses](~~273914~~).</p>
     * <p>*   If the self-managed PostgreSQL instance resides in an on-premises data center, enter the private IP address of the on-premises data center.</p>
     * <p>*   If the self-managed PostgreSQL instance resides on a device that is connected over the Internet, enter the public IP address of the device.</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The port number that is used to connect to the self-managed PostgreSQL instance. You can run the netstat -a | grep PGSQL command to obtain the port number.</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The ID of the task. You can obtain the ID of a task from the response that is returned when you call the [CreateCloudMigrationTask](~~411690~~) operation to create the task.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the task. You can obtain the name of a task from the response that is returned when you call the [CreateCloudMigrationTask](~~411690~~) operation to create the task.</p>
     */
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
