// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>false (default): performs a dry run and performs the actual request.</li>
     * <li>true: performs only a dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The document of the tag policy.</p>
     * <p>For more information about the syntax of a tag policy, see <a href="https://help.aliyun.com/document_detail/417436.html">Syntax of a tag policy</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tags&quot;:{&quot;CostCenter&quot;:{&quot;tag_value&quot;:{&quot;@@assign&quot;:[&quot;Beijing&quot;,&quot;Shanghai&quot;]},&quot;tag_key&quot;:{&quot;@@assign&quot;:&quot;CostCenter&quot;}}}}</p>
     */
    @NameInMap("PolicyContent")
    public String policyContent;

    /**
     * <p>The description of the tag policy.</p>
     * <p>The description must be 0 to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a tag policy example.</p>
     */
    @NameInMap("PolicyDesc")
    public String policyDesc;

    /**
     * <p>The name of the tag policy.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID. Set the value to cn-shanghai.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The mode of the Tag Policy feature. Valid values:</p>
     * <ul>
     * <li>USER: single-account mode. Set the value to USER if you use an Alibaba Cloud account or a member of a resource directory to call this API operation to create a tag policy for the Alibaba Cloud account or member.</li>
     * <li>RD: multi-account mode. Set the value to RD if you use the management account of a resource directory to call this API operation to create a tag policy for the resource directory.</li>
     * </ul>
     * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RD</p>
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
