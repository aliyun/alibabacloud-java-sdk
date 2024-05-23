// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the destination instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The username of the account that is used to connect to the self-managed PostgreSQL instance. Enter the username of the account that you created in the [Create an account for cloud migration on a self-managed PostgreSQL instance](https://help.aliyun.com/document_detail/369500.html) topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceAccount")
    public String sourceAccount;

    /**
     * <p>The environment in which the self-managed PostgreSQL instance runs.</p>
     * <br>
     * <p>*   **idcOnVpc**: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.</p>
     * <p>*   **ecsOnVpc**: The self-managed PostgreSQL instance resides on an ECS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The private or public IP address that is used to connect to the self-managed PostgreSQL instance.</p>
     * <br>
     * <p>*   If the self-managed PostgreSQL instance resides on an Elastic Compute Service (ECS) instance, enter the private IP address of the ECS instance. For more information about how to obtain the private IP address of an ECS instance, see [View IP addresses](https://help.aliyun.com/document_detail/273914.html).</p>
     * <p>*   If the self-managed PostgreSQL instance resides in a data center, enter the private IP address of the data center.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    /**
     * <p>The password of the account that is used to connect to the self-managed PostgreSQL instance. Enter the password of the account that you created in the [Create an account for cloud migration on a self-managed PostgreSQL instance](https://help.aliyun.com/document_detail/369500.html) topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourcePassword")
    public String sourcePassword;

    /**
     * <p>The port number that is used to connect to the self-managed PostgreSQL instance. You can run the `netstat -a | grep PGSQL` command to obtain the port number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The name of the task. If you do not specify this parameter, ApsaraDB RDS automatically generates a name for the cloud migration task.</p>
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
