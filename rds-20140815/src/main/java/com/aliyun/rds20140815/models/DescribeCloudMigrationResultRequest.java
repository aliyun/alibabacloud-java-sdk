// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultRequest extends TeaModel {
    /**
     * <p>The target instance ID. You can invoke the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The internal IP address of the self-managed PostgreSQL database.</p>
     * <ul>
     * <li>For a one-click cloud migration of a self-managed PostgreSQL database on an ECS instance, set this parameter to the private IP address of the ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
     * <li>For a one-click cloud migration of a self-managed PostgreSQL database in an IDC, set this parameter to the internal IP address of the IDC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The port of the self-managed PostgreSQL database. You can run the netstat -a | grep PGSQL command to query the port.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The task ID. You can obtain the task ID from the response of the CreateCloudMigrationTask operation when you create an RDS PostgreSQL cloud migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>440437220</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name. You can obtain the task name from the response of the CreateCloudMigrationTask operation when you create an RDS PostgreSQL cloud migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>362c6c7a-4d20-4eac-898c-1495ceab374c</p>
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
