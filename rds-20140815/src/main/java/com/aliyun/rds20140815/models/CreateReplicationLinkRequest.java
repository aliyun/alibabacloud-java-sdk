// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReplicationLinkRequest extends TeaModel {
    /**
     * <p>The instance ID of the disaster recovery instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2zeytekus0r******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform a dry run for creating the synchronization link of the disaster recovery instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Executes a dry run without creating the instance. The system checks items such as request parameters, request format, business limits, and inventory.</li>
     * <li><strong>false</strong> (default): Sends a normal request and creates the instance after the check is passed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The database account used for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>testdbuser</p>
     */
    @NameInMap("ReplicatorAccount")
    public String replicatorAccount;

    /**
     * <p>The password of the synchronization account.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ReplicatorPassword")
    public String replicatorPassword;

    /**
     * <p>The endpoint of the PostgreSQL source instance or the IP address of the SQL Server source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PostgreSQL：pgm-****.pg.rds.aliyuncs.com
     * SQL Server：10.XX.XXX.XXX</p>
     */
    @NameInMap("SourceAddress")
    public String sourceAddress;

    /**
     * <p>The category of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>other</strong>: Other. (<strong>Not supported for SQL Server.</strong>)</li>
     * <li><strong>aliyunRDS</strong>: ApsaraDB RDS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The name of the source instance. This parameter is required when <strong>SourceCategory</strong> is set to <strong>aliyunRDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2zeaaz62s18******</p>
     */
    @NameInMap("SourceInstanceName")
    public String sourceInstanceName;

    /**
     * <p>The region ID of the source instance. This parameter is required when <strong>SourceCategory</strong> is set to <strong>aliyunRDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceInstanceRegionId")
    public String sourceInstanceRegionId;

    /**
     * <p>The port of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("SourcePort")
    public Long sourcePort;

    /**
     * <p>The IP address of the SQL Server disaster recovery instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XXX.XX.XXX</p>
     */
    @NameInMap("TargetAddress")
    public String targetAddress;

    /**
     * <p>The ID of a successful dry run task.</p>
     * 
     * <strong>example:</strong>
     * <p>43994****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the dry run task. You can specify a custom name. If you do not specify this parameter, the system automatically generates a name.</p>
     * 
     * <strong>example:</strong>
     * <p>zbtest</p>
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

    public CreateReplicationLinkRequest setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
        return this;
    }
    public String getTargetAddress() {
        return this.targetAddress;
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
