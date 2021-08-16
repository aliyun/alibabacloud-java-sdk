// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniBackupPolicyShrinkRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("Retention")
    public Integer retention;

    @NameInMap("SpeedLimiter")
    public Long speedLimiter;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPassword")
    public String accountPassword;

    @NameInMap("DatabaseAddByUser")
    public String databaseAddByUser;

    @NameInMap("UniRegionId")
    public String uniRegionId;

    @NameInMap("FullPlan")
    public String fullPlanShrink;

    @NameInMap("IncPlan")
    public String incPlanShrink;

    public static CreateUniBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniBackupPolicyShrinkRequest self = new CreateUniBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniBackupPolicyShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateUniBackupPolicyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUniBackupPolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateUniBackupPolicyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUniBackupPolicyShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateUniBackupPolicyShrinkRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateUniBackupPolicyShrinkRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public CreateUniBackupPolicyShrinkRequest setSpeedLimiter(Long speedLimiter) {
        this.speedLimiter = speedLimiter;
        return this;
    }
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

    public CreateUniBackupPolicyShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateUniBackupPolicyShrinkRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateUniBackupPolicyShrinkRequest setDatabaseAddByUser(String databaseAddByUser) {
        this.databaseAddByUser = databaseAddByUser;
        return this;
    }
    public String getDatabaseAddByUser() {
        return this.databaseAddByUser;
    }

    public CreateUniBackupPolicyShrinkRequest setUniRegionId(String uniRegionId) {
        this.uniRegionId = uniRegionId;
        return this;
    }
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public CreateUniBackupPolicyShrinkRequest setFullPlanShrink(String fullPlanShrink) {
        this.fullPlanShrink = fullPlanShrink;
        return this;
    }
    public String getFullPlanShrink() {
        return this.fullPlanShrink;
    }

    public CreateUniBackupPolicyShrinkRequest setIncPlanShrink(String incPlanShrink) {
        this.incPlanShrink = incPlanShrink;
        return this;
    }
    public String getIncPlanShrink() {
        return this.incPlanShrink;
    }

}
