// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DetachPolicyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the tag policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-a3381efe2fe34a75****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

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
     * <p>The ID of the object.</p>
     * <blockquote>
     * <p>If you use the Tag Policy feature in single-account mode, this parameter is optional. If you use the Tag Policy feature in multi-account mode, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>151266687691****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <ul>
     * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
     * <li>ROOT: the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * <li>FOLDER: a folder other than the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * <li>ACCOUNT: a member in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * </ul>
     * <blockquote>
     * <p>If you use the Tag Policy feature in single-account mode, this parameter is optional. If you use the Tag Policy feature in multi-account mode, this parameter is required. The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ACCOUNT</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DetachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyRequest self = new DetachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DetachPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DetachPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachPolicyRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public DetachPolicyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
