// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamScopeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    @NameInMap("IpamScopeDescription")
    public String ipamScopeDescription;

    @NameInMap("IpamScopeName")
    public String ipamScopeName;

    @NameInMap("IpamScopeType")
    public String ipamScopeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateIpamScopeRequestTag> tag;

    public static CreateIpamScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamScopeRequest self = new CreateIpamScopeRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamScopeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamScopeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamScopeRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public CreateIpamScopeRequest setIpamScopeDescription(String ipamScopeDescription) {
        this.ipamScopeDescription = ipamScopeDescription;
        return this;
    }
    public String getIpamScopeDescription() {
        return this.ipamScopeDescription;
    }

    public CreateIpamScopeRequest setIpamScopeName(String ipamScopeName) {
        this.ipamScopeName = ipamScopeName;
        return this;
    }
    public String getIpamScopeName() {
        return this.ipamScopeName;
    }

    public CreateIpamScopeRequest setIpamScopeType(String ipamScopeType) {
        this.ipamScopeType = ipamScopeType;
        return this;
    }
    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    public CreateIpamScopeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamScopeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamScopeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamScopeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIpamScopeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamScopeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamScopeRequest setTag(java.util.List<CreateIpamScopeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateIpamScopeRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateIpamScopeRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateIpamScopeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateIpamScopeRequestTag self = new CreateIpamScopeRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateIpamScopeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIpamScopeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
