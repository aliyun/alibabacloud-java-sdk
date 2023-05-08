// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyUniBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The status of the anti-ransomware policy. Valid values:</p>
     * <br>
     * <p>*   **enabled**</p>
     * <p>*   **disabled**</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("FullPlan")
    public String fullPlanShrink;

    @NameInMap("IncPlan")
    public String incPlanShrink;

    /**
     * <p>The name of the database account.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The password of the database account.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyStatus")
    public String policyStatus;

    /**
     * <p>The policy for full backup. The value of this parameter is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **start**: the start time of a backup task</p>
     * <p>*   **interval**: the interval of backup tasks</p>
     * <p>*   **type**: the unit of the interval</p>
     * <p>*   **days**: the days of a week on which a backup task is performed</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The policy for incremental backup. The value of this parameter is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **start**: the start time of a backup task</p>
     * <p>*   **interval**: the interval of backup tasks</p>
     * <p>*   **type**: the unit of the interval</p>
     * <p>*   **days**: the days of a week on which a backup task is performed</p>
     */
    @NameInMap("SpeedLimiter")
    public Long speedLimiter;

    public static ModifyUniBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUniBackupPolicyShrinkRequest self = new ModifyUniBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUniBackupPolicyShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyUniBackupPolicyShrinkRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ModifyUniBackupPolicyShrinkRequest setFullPlanShrink(String fullPlanShrink) {
        this.fullPlanShrink = fullPlanShrink;
        return this;
    }
    public String getFullPlanShrink() {
        return this.fullPlanShrink;
    }

    public ModifyUniBackupPolicyShrinkRequest setIncPlanShrink(String incPlanShrink) {
        this.incPlanShrink = incPlanShrink;
        return this;
    }
    public String getIncPlanShrink() {
        return this.incPlanShrink;
    }

    public ModifyUniBackupPolicyShrinkRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public ModifyUniBackupPolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyUniBackupPolicyShrinkRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public ModifyUniBackupPolicyShrinkRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ModifyUniBackupPolicyShrinkRequest setSpeedLimiter(Long speedLimiter) {
        this.speedLimiter = speedLimiter;
        return this;
    }
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

}
