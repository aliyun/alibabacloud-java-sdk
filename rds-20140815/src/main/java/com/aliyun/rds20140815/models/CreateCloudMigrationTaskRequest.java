// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationTaskRequest extends TeaModel {
    /**
     * <p>The instance ID of the destination instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The username. The database account created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create a migration account</a> step.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>migratetest</p>
     */
    @NameInMap("SourceAccount")
    public String sourceAccount;

    /**
     * <p>The category of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>aliyunRDS</strong>: Alibaba Cloud RDS instance.</li>
     * <li><strong>other</strong>: Other.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The internal or public IP address of the self-managed PostgreSQL database.</p>
     * <ul>
     * <li>For the one-click cloud migration scenario of a self-managed PostgreSQL database on an ECS instance, set this parameter to the private IP address of the ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/98677.html">View IP addresses</a>.</li>
     * <li>For the one-click cloud migration scenario of a self-managed PostgreSQL database in an IDC, set this parameter to the internal IP address of the IDC.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The password. The password of the database account created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create a migration account</a> step.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SourcePassword")
    public String sourcePassword;

    /**
     * <p>The port of the self-managed PostgreSQL database. You can run the <code>netstat -a | grep PGSQL</code> command to view the port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The name of the task. You can specify a custom name. If you do not specify a name, the system automatically generates one.</p>
     * 
     * <strong>example:</strong>
     * <p>362c6c7a-4d20-4eac-898c-1495ceab374c</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateCloudMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationTaskRequest self = new CreateCloudMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateCloudMigrationTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCloudMigrationTaskRequest setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public CreateCloudMigrationTaskRequest setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public CreateCloudMigrationTaskRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public CreateCloudMigrationTaskRequest setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
        return this;
    }
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    public CreateCloudMigrationTaskRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public CreateCloudMigrationTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
