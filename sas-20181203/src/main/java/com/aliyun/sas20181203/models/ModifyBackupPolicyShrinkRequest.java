// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the server to which the anti-ransomware policy is applied.</p>
     * <br>
     * <p>You can call the [DescribeSupportRegion](~~DescribeSupportRegion~~) operation to query the regions in which the anti-ransomware feature is supported.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Modifies an anti-ransomware policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>ModifyBackupPolicy</p>
     */
    @NameInMap("Policy")
    public String policyShrink;

    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    /**
     * <p>WB01014029</p>
     */
    @NameInMap("PolicyVersion")
    public String policyVersion;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ModifyBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyShrinkRequest self = new ModifyBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyBackupPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public ModifyBackupPolicyShrinkRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public ModifyBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
