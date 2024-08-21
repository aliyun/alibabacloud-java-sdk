// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReplicationLinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>testdbuser</p>
     */
    @NameInMap("ReplicatorAccount")
    public String replicatorAccount;

    /**
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ReplicatorPassword")
    public String replicatorPassword;

    /**
     * <strong>example:</strong>
     * <p>pgm-****.pg.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceAddress")
    public String sourceAddress;

    /**
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("SourceInstanceName")
    public String sourceInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceInstanceRegionId")
    public String sourceInstanceRegionId;

    /**
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <strong>example:</strong>
     * <p>439946016</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateReplicationLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationLinkRequest self = new CreateReplicationLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateReplicationLinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateReplicationLinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateReplicationLinkRequest setReplicatorAccount(String replicatorAccount) {
        this.replicatorAccount = replicatorAccount;
        return this;
    }
    public String getReplicatorAccount() {
        return this.replicatorAccount;
    }

    public CreateReplicationLinkRequest setReplicatorPassword(String replicatorPassword) {
        this.replicatorPassword = replicatorPassword;
        return this;
    }
    public String getReplicatorPassword() {
        return this.replicatorPassword;
    }

    public CreateReplicationLinkRequest setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }
    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public CreateReplicationLinkRequest setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public CreateReplicationLinkRequest setSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
        return this;
    }
    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public CreateReplicationLinkRequest setSourceInstanceRegionId(String sourceInstanceRegionId) {
        this.sourceInstanceRegionId = sourceInstanceRegionId;
        return this;
    }
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

    public CreateReplicationLinkRequest setSourcePort(Long sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public Long getSourcePort() {
        return this.sourcePort;
    }

    public CreateReplicationLinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CreateReplicationLinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
