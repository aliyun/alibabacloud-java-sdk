// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyStatusRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The version of the anti-ransomware policy. Set the value to **2.0.0**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    /**
     * <p>Specifies whether to enable or disable the anti-ransomware policy. Valid values:</p>
     * <br>
     * <p>*   **enabled**: enables the anti-ransomware policy. After you enable the anti-ransomware policy, the anti-ransomware feature protects data on your servers. Data on your servers is backed up based on the policy.</p>
     * <p>*   **disabled**: disables the anti-ransomware policy. After you disable the anti-ransomware policy, the data backup task that is running based on the policy stops.</p>
     * <br>
     * <p>>  When the system runs data backup tasks, your network bandwidth is consumed. We recommend that you enable the anti-ransomware policy during peak-off hours to back up data.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyBackupPolicyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyStatusRequest self = new ModifyBackupPolicyStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyBackupPolicyStatusRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public ModifyBackupPolicyStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
