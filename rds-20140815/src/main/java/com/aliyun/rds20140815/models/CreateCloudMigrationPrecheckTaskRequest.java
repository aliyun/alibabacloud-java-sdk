// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateCloudMigrationPrecheckTaskRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceAccount")
    public String sourceAccount;

    @NameInMap("SourceCategory")
    public String sourceCategory;

    @NameInMap("SourceIpAddress")
    public String sourceIpAddress;

    @NameInMap("SourcePassword")
    public String sourcePassword;

    @NameInMap("SourcePort")
    public Long sourcePort;

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
