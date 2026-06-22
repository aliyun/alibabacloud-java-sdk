// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyStatusRequest extends TeaModel {
    /**
     * <p>The ID of the anti-ransomware policy that you want to enable or shutdown.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30490</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The version of the policy that you want to enable or disable. Set the value to <strong>2.0.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("PolicyVersion")
    @Deprecated
    public String policyVersion;

    /**
     * <p>Specifies whether to enable or disable the anti-ransomware policy. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: Enables the anti-ransomware policy. After the policy is enabled, anti-ransomware can protect your server data by backing up data on specified servers based on your anti-ransomware policy.</li>
     * <li><strong>disabled</strong>: Disables the anti-ransomware policy. After the policy is disabled, running backup tasks are stopped.</li>
     * </ul>
     * <blockquote>
     * <p>Backup tasks consume network bandwidth. Enable the policy during off-peak hours to execute data backup tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
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

    @Deprecated
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
