// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationPrecheckResultRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>. Default value: 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private or public IP address that is used to connect to the self-managed PostgreSQL instance.</p>
     * <ul>
     * <li>If the self-managed PostgreSQL instance resides on an Elastic Compute Service (ECS) instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
     * <li>If the self-managed PostgreSQL instance resides in an on-premises data center, enter the private IP address of the on-premises data center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.2.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The port number that is used to connect to the self-managed PostgreSQL instance. You can run the netstat -a | grep PGSQL command to obtain the port number.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The task ID. You can obtain the task ID from the response that is returned after you call the CreateCloudMigrationPrecheckTask operation to create the task.</p>
     * 
     * <strong>example:</strong>
     * <p>439946016</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name. You can obtain the task name from the response that is returned after you call the CreateCloudMigrationPrecheckTask operation to create the task.</p>
     * 
     * <strong>example:</strong>
     * <p>slf7w7wj3g</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeCloudMigrationPrecheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationPrecheckResultRequest self = new DescribeCloudMigrationPrecheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationPrecheckResultRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCloudMigrationPrecheckResultRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudMigrationPrecheckResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudMigrationPrecheckResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCloudMigrationPrecheckResultRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public DescribeCloudMigrationPrecheckResultRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public DescribeCloudMigrationPrecheckResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeCloudMigrationPrecheckResultRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
