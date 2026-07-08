// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetEffectivePolicyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. Only <code>cn-shanghai</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    /**
     * <p>The ID of the target object.</p>
     * <blockquote>
     * <p>This parameter is optional in Single-Account Mode and required in Multi-Account Mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>154950938137****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the target object. Valid values:</p>
     * <ul>
     * <li><p>USER: queries the effective policy for the current logon account. This value applies only to Single-Account Mode.</p>
     * </li>
     * <li><p>ROOT: queries the effective policy for the Root Folder in a Resource Directory. This value applies only to Multi-Account Mode.</p>
     * </li>
     * <li><p>FOLDER: queries the effective policy for a Folder in a Resource Directory. This value applies only to Multi-Account Mode.</p>
     * </li>
     * <li><p>ACCOUNT: queries the effective policy for a Member in a Resource Directory. This value applies only to Multi-Account Mode.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is optional in Single-Account Mode and required in Multi-Account Mode. The value is case-insensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ACCOUNT</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static GetEffectivePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEffectivePolicyRequest self = new GetEffectivePolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetEffectivePolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetEffectivePolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetEffectivePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEffectivePolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetEffectivePolicyRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public GetEffectivePolicyRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public GetEffectivePolicyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
