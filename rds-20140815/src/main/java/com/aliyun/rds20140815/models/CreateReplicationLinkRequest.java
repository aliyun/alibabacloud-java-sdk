// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReplicationLinkRequest extends TeaModel {
    /**
     * <p>The ID of the DR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to perform a dry run before the system creates the DR instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run but does not create the instance. The system checks the request parameters, request syntax, limits, and available resources.</li>
     * <li><strong>false</strong> (default): performs a dry run and the actual request. If the request passes the dry run, the instance is directly created.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The account of the database that is used for data synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>testdbuser</p>
     */
    @NameInMap("ReplicatorAccount")
    public String replicatorAccount;

    /**
     * <p>The password of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("ReplicatorPassword")
    public String replicatorPassword;

    /**
     * <p>The endpoint of the source ApsaraDB RDS for PostgreSQL instance or the IP address of the source ApsaraDB RDS for SQL Server instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-****.pg.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceAddress")
    public String sourceAddress;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>other</strong>: other instances. <strong>SQL Server instances are not supported.</strong></li>
     * <li><strong>aliyunRDS</strong>: an ApsaraDB RDS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyunRDS</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The name of the source instance. If you set <strong>SourceCategory</strong> to <strong>aliyunRDS</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("SourceInstanceName")
    public String sourceInstanceName;

    /**
     * <p>The region ID of the source instance. If you set <strong>SourceCategory</strong> to <strong>aliyunRDS</strong>, this parameter is required.</p>
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
     * <p>The IP address of the DR instance of the ApsaraDB RDS for SQL Server instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XXX.XX.XXX</p>
     */
    @NameInMap("TargetAddress")
    public String targetAddress;

    /**
     * <p>The task ID of the successful dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>439946016</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name of the dry run. You can specify a custom task name. If you do not specify this parameter, ApsaraDB RDS automatically generates a task name.</p>
     * 
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
