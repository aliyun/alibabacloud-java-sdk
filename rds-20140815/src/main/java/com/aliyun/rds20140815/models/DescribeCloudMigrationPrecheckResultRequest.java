// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationPrecheckResultRequest extends TeaModel {
    /**
     * <p>The instance ID of the target instance. You can invoke the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The page number. Valid values: any positive integer up to the maximum value of the Integer type. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>.
     * Default value: 30.</p>
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
     * <p>The internal IP address or public IP address of the self-managed PostgreSQL database.</p>
     * <ul>
     * <li>In the one-click cloud migration scenario for a self-managed PostgreSQL database on an ECS instance, set this parameter to the private IP address of the ECS instance. For more information about how to obtain the IP address, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
     * <li>In the one-click cloud migration scenario for a self-managed PostgreSQL database in a data center, set this parameter to the internal IP address of the data center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.2.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The port of the self-managed PostgreSQL database. You can run the <code>netstat -a | grep PGSQL</code> command to view the port.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The ID of the task. You can obtain the task ID from the response message when you call the CreateCloudMigrationPrecheckTask operation to create a pre-check task for one-click cloud migration.</p>
     * 
     * <strong>example:</strong>
     * <p>439946016</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the task. You can obtain the task name from the response message when you call the CreateCloudMigrationPrecheckTask operation to create a pre-check task for one-click cloud migration.</p>
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
