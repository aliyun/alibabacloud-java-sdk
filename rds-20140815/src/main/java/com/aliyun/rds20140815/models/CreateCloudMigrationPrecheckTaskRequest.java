// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationPrecheckTaskRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
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
     * <p>The username of the account that is used to connect to the self-managed PostgreSQL instance. Enter the username of the account that you created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create an account for cloud migration on a self-managed PostgreSQL instance</a> topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>migratetest</p>
     */
    @NameInMap("SourceAccount")
    public String sourceAccount;

    /**
     * <p>The environment in which the self-managed PostgreSQL instance runs.</p>
     * <ul>
     * <li><strong>idcOnVpc</strong>: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.</li>
     * <li><strong>ecsOnVpc</strong>: The self-managed PostgreSQL instance resides on an ECS instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecsOnVpc</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The private IP address that is used to connect to the self-managed PostgreSQL instance.</p>
     * <ul>
     * <li>If the self-managed PostgreSQL instance resides on an ECS instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see <a href="https://help.aliyun.com/document_detail/273914.html">View IP addresses</a>.</li>
     * <li>If the self-managed PostgreSQL instance resides in an on-premises data center, enter the private IP address of the on-premises data center.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.2.XX.XX</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The password of the account that is used to connect to the self-managed PostgreSQL instance. Enter the password of the account that you created in the <a href="https://help.aliyun.com/document_detail/369500.html">Create an account for cloud migration on a self-managed PostgreSQL instance</a> topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SourcePassword")
    public String sourcePassword;

    /**
     * <p>The port that is used to connect to the self-managed PostgreSQL instance. You can run the <code>netstat -a | grep PGSQL</code> command to view the port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The name of the task. If you do not specify this parameter, ApsaraDB RDS automatically generates a name for the cloud migration task.</p>
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
