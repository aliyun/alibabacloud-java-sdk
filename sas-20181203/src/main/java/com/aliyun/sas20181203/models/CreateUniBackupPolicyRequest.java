// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniBackupPolicyRequest extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether the database is manually added. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("DatabaseAddByUser")
    public String databaseAddByUser;

    /**
     * <p>The type of the database. Valid values:</p>
     * <br>
     * <p>*   **MYSQL**</p>
     * <p>*   **ORACLE**</p>
     * <p>*   **MSSQL**</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The policy for full backup. The value of this parameter is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **start**: the start time of a backup task</p>
     * <p>*   **interval**: the interval of backup tasks</p>
     * <p>*   **type**: the unit of the interval</p>
     * <p>*   **days**: the days of a week on which a backup task is performed</p>
     */
    @NameInMap("FullPlan")
    public java.util.Map<String, ?> fullPlan;

    /**
     * <p>The policy for incremental backup. The value of this parameter is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **start**: the start time of a backup task</p>
     * <p>*   **interval**: the interval of backup tasks</p>
     * <p>*   **type**: the unit of the interval</p>
     * <p>*   **days**: the days of a week on which a backup task is performed</p>
     */
    @NameInMap("IncPlan")
    public java.util.Map<String, ?> incPlan;

    /**
     * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the IDs of ECS instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the anti-ransomware policy.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The retention period of backup data.</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The maximum network bandwidth that is allowed during data backup. Unit: bytes.</p>
     */
    @NameInMap("SpeedLimiter")
    public Long speedLimiter;

    /**
     * <p>The region in which the server resides.</p>
     */
    @NameInMap("UniRegionId")
    public String uniRegionId;

    /**
     * <p>The UUID of the server whose data is backed up based on the anti-ransomware policy.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.</p>
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
