// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyUniBackupPolicyRequest extends TeaModel {
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
    public java.util.Map<String, ?> fullPlan;

    @NameInMap("IncPlan")
    public java.util.Map<String, ?> incPlan;

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

    public static ModifyUniBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUniBackupPolicyRequest self = new ModifyUniBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUniBackupPolicyRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyUniBackupPolicyRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ModifyUniBackupPolicyRequest setFullPlan(java.util.Map<String, ?> fullPlan) {
        this.fullPlan = fullPlan;
        return this;
    }
    public java.util.Map<String, ?> getFullPlan() {
        return this.fullPlan;
    }

    public ModifyUniBackupPolicyRequest setIncPlan(java.util.Map<String, ?> incPlan) {
        this.incPlan = incPlan;
        return this;
    }
    public java.util.Map<String, ?> getIncPlan() {
        return this.incPlan;
    }

    public ModifyUniBackupPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public ModifyUniBackupPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyUniBackupPolicyRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public ModifyUniBackupPolicyRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public ModifyUniBackupPolicyRequest setSpeedLimiter(Long speedLimiter) {
        this.speedLimiter = speedLimiter;
        return this;
    }
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

}
