// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationPrecheckTaskRequest extends TeaModel {
    /**
     * <p>The ID of the target instance. You can invoke the DescribeDBInstances operation to query the instance ID.</p>
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
     * <p>The type of the self-managed PostgreSQL database. Valid values:</p>
     * <ul>
     * <li><strong>idcOnVpc</strong>: IDC-based self-managed PostgreSQL database (the IDC is connected to the VPC).</li>
     * <li><strong>ecsOnVpc</strong>: ECS-based self-managed PostgreSQL database on Alibaba Cloud.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecsOnVpc</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The internal IP address of the self-managed PostgreSQL database.</p>
     * <ul>
     * <li>For one-click migration of an ECS-based self-managed PostgreSQL database, set this parameter to the private IP address of the ECS instance. For more information about how to obtain the IP address, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
     * <li>For one-click migration of an IDC-based self-managed PostgreSQL database, set this parameter to the internal IP address of the IDC.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.2.XX.XX</p>
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
     * <p>The task name. You can specify a custom name. If you do not specify this parameter, the system automatically generates a name.</p>
     * 
     * <strong>example:</strong>
     * <p>slf7w7wj3g</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateCloudMigrationPrecheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMigrationPrecheckTaskRequest self = new CreateCloudMigrationPrecheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudMigrationPrecheckTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateCloudMigrationPrecheckTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCloudMigrationPrecheckTaskRequest setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public CreateCloudMigrationPrecheckTaskRequest setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public CreateCloudMigrationPrecheckTaskRequest setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    public CreateCloudMigrationPrecheckTaskRequest setSourcePassword(String sourcePassword) {
        this.sourcePassword = sourcePassword;
        return this;
    }
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    public CreateCloudMigrationPrecheckTaskRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public CreateCloudMigrationPrecheckTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
