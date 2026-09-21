// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniBackupPolicyRequest extends TeaModel {
    /**
     * <p>The username of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>Pass****</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether the database is manually added by the user. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The database is manually added.</li>
     * <li><strong>false</strong>: The database is not manually added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DatabaseAddByUser")
    public String databaseAddByUser;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>MYSQL</strong></li>
     * <li><strong>ORACLE</strong></li>
     * <li><strong>MSSQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The full backup policy. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>start</strong>: the start time of the backup.</li>
     * <li><strong>interval</strong>: the interval between backups.</li>
     * <li><strong>type</strong>: the unit of the interval.</li>
     * <li><strong>days</strong>: the days of the week on which backups are performed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;days&quot;:[4],&quot;interval&quot;:1,&quot;planType&quot;:&quot;weekly&quot;,&quot;startTime&quot;:&quot;22:00:00&quot;}</p>
     */
    @NameInMap("FullPlan")
    public java.util.Map<String, ?> fullPlan;

    /**
     * <p>The incremental backup policy. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>start</strong>: the start time of the backup.</li>
     * <li><strong>interval</strong>: the interval between backups.</li>
     * <li><strong>type</strong>: the unit of the interval.</li>
     * <li><strong>days</strong>: the days of the week on which backups are performed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;interval&quot;:1,&quot;planType&quot;:&quot;daily&quot;,&quot;startTime&quot;:&quot;23:30:00&quot;}</p>
     */
    @NameInMap("IncPlan")
    public java.util.Map<String, ?> incPlan;

    /**
     * <p>The ID of the ECS instance.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1fu4aqltf1huhc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the anti-ransomware backup policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql-policy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The number of days for which backup data is retained.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The network bandwidth throttling for backup network bandwidth. Unit: bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5242880</p>
     */
    @NameInMap("SpeedLimiter")
    public Long speedLimiter;

    /**
     * <p>The region in which the server protected by the backup policy resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("UniRegionId")
    public String uniRegionId;

    /**
     * <p>The UUID of the server that is backed up by the database anti-ransomware feature.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>045cad48-eb08-4047-a70c-713aec7b****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static CreateUniBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniBackupPolicyRequest self = new CreateUniBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniBackupPolicyRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateUniBackupPolicyRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateUniBackupPolicyRequest setDatabaseAddByUser(String databaseAddByUser) {
        this.databaseAddByUser = databaseAddByUser;
        return this;
    }
    public String getDatabaseAddByUser() {
        return this.databaseAddByUser;
    }

    public CreateUniBackupPolicyRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateUniBackupPolicyRequest setFullPlan(java.util.Map<String, ?> fullPlan) {
        this.fullPlan = fullPlan;
        return this;
    }
    public java.util.Map<String, ?> getFullPlan() {
        return this.fullPlan;
    }

    public CreateUniBackupPolicyRequest setIncPlan(java.util.Map<String, ?> incPlan) {
        this.incPlan = incPlan;
        return this;
    }
    public java.util.Map<String, ?> getIncPlan() {
        return this.incPlan;
    }

    public CreateUniBackupPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUniBackupPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateUniBackupPolicyRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public CreateUniBackupPolicyRequest setSpeedLimiter(Long speedLimiter) {
        this.speedLimiter = speedLimiter;
        return this;
    }
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

    public CreateUniBackupPolicyRequest setUniRegionId(String uniRegionId) {
        this.uniRegionId = uniRegionId;
        return this;
    }
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public CreateUniBackupPolicyRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
