// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PolicyContent")
    public String policyContent;

    @NameInMap("PolicyDesc")
    public String policyDesc;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("UserType")
    public String userType;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreatePolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePolicyRequest setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }
    public String getPolicyContent() {
        return this.policyContent;
    }

    public CreatePolicyRequest setPolicyDesc(String policyDesc) {
        this.policyDesc = policyDesc;
        return this;
    }
    public String getPolicyDesc() {
        return this.policyDesc;
    }

    public CreatePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePolicyRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
