// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyUniBackupPolicyRequest extends TeaModel {
    /**
     * <p>The username of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>sa</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>Sa@****</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The full backup policy. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>start</strong>: the backup start time.</li>
     * <li><strong>interval</strong>: the interval.</li>
     * <li><strong>type</strong>: the unit of the interval.</li>
     * <li><strong>days</strong>: the days of the week on which the backup is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;days&quot;:[4],&quot;interval&quot;:1,&quot;planType&quot;:&quot;weekly&quot;,&quot;startTime&quot;:&quot;22:00:00&quot;}</p>
     */
    @NameInMap("FullPlan")
    public java.util.Map<String, ?> fullPlan;

    /**
     * <p>The incremental backup policy. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>start</strong>: the backup start time.</li>
     * <li><strong>interval</strong>: the interval.</li>
     * <li><strong>type</strong>: the unit of the interval.</li>
     * <li><strong>days</strong>: the days of the week on which the backup is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;interval&quot;:1,&quot;planType&quot;:&quot;daily&quot;,&quot;startTime&quot;:&quot;23:30:00&quot;}</p>
     */
    @NameInMap("IncPlan")
    public java.util.Map<String, ?> incPlan;

    /**
     * <p>The ID of the anti-ransomware backup policy for databases.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The name of the anti-ransomware backup policy for databases.</p>
     * 
     * <strong>example:</strong>
     * <p>databak</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: The policy is enabled.</li>
     * <li><strong>disabled</strong>: The policy is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PolicyStatus")
    public String policyStatus;

    /**
     * <p>The number of days for which backup snapshots are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    /**
     * <p>The network bandwidth throttling for backup network bandwidth. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
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
