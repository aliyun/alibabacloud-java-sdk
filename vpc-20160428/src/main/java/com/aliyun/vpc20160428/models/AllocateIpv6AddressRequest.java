// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6AddressRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Ipv6Address")
    public String ipv6Address;

    @NameInMap("Ipv6AddressDescription")
    public String ipv6AddressDescription;

    @NameInMap("Ipv6AddressName")
    public String ipv6AddressName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<AllocateIpv6AddressRequestTag> tag;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static AllocateIpv6AddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6AddressRequest self = new AllocateIpv6AddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6AddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateIpv6AddressRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AllocateIpv6AddressRequest setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public AllocateIpv6AddressRequest setIpv6AddressDescription(String ipv6AddressDescription) {
        this.ipv6AddressDescription = ipv6AddressDescription;
        return this;
    }
    public String getIpv6AddressDescription() {
        return this.ipv6AddressDescription;
    }

    public AllocateIpv6AddressRequest setIpv6AddressName(String ipv6AddressName) {
        this.ipv6AddressName = ipv6AddressName;
        return this;
    }
    public String getIpv6AddressName() {
        return this.ipv6AddressName;
    }

    public AllocateIpv6AddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateIpv6AddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateIpv6AddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateIpv6AddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateIpv6AddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateIpv6AddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateIpv6AddressRequest setTag(java.util.List<AllocateIpv6AddressRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AllocateIpv6AddressRequestTag> getTag() {
        return this.tag;
    }

    public AllocateIpv6AddressRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class AllocateIpv6AddressRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AllocateIpv6AddressRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateIpv6AddressRequestTag self = new AllocateIpv6AddressRequestTag();
            return TeaModel.build(map, self);
        }

        public AllocateIpv6AddressRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AllocateIpv6AddressRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
