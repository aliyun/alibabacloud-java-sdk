// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyShrinkRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policy")
    public String policyShrink;

    @NameInMap("PolicyVersion")
    public String policyVersion;

    @NameInMap("PolicyRegionId")
    public String policyRegionId;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateBackupPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyShrinkRequest self = new CreateBackupPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateBackupPolicyShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateBackupPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBackupPolicyShrinkRequest setPolicyShrink(String policyShrink) {
        this.policyShrink = policyShrink;
        return this;
    }
    public String getPolicyShrink() {
        return this.policyShrink;
    }

    public CreateBackupPolicyShrinkRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public CreateBackupPolicyShrinkRequest setPolicyRegionId(String policyRegionId) {
        this.policyRegionId = policyRegionId;
        return this;
    }
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    public CreateBackupPolicyShrinkRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
