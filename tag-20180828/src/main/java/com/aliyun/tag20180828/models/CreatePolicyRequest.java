// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run for the request. Valid values:</p>
     * <br>
     * <p>*   false: The system performs the related operation based on the parameter settings in the request. This is the default value.</p>
     * <p>*   true: The system does not perform the related operation based on the parameter settings in the request but only verifies the parameter settings.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The document of the tag policy.</p>
     * <br>
     * <p>For more information about the syntax of a tag policy, see [Syntax of a tag policy](~~417436~~).</p>
     */
    @NameInMap("PolicyContent")
    public String policyContent;

    /**
     * <p>The description of the tag policy.</p>
     * <br>
     * <p>The description must be 0 to 512 characters in length.</p>
     */
    @NameInMap("PolicyDesc")
    public String policyDesc;

    /**
     * <p>The name of the tag policy.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID. Set the value to cn-shanghai.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The mode of the Tag Policy feature. Valid values:</p>
     * <br>
     * <p>*   USER: single-account mode. Set the value to USER if you use an Alibaba Cloud account or a member of a resource directory to call this API operation to create a tag policy for the Alibaba Cloud account or member.</p>
     * <p>*   RD: multi-account mode. Set the value to RD if you use the management account of a resource directory to call this API operation to create a tag policy for the resource directory.</p>
     * <br>
     * <p>For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).</p>
     */
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
