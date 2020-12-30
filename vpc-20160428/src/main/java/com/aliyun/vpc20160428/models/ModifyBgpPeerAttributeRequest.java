// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BgpPeerId")
    public String bgpPeerId;

    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    @NameInMap("PeerIpAddress")
    public String peerIpAddress;

    @NameInMap("EnableBfd")
    public Boolean enableBfd;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("BfdMultiHop")
    public Integer bfdMultiHop;

    public static ModifyBgpPeerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeRequest self = new ModifyBgpPeerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBgpPeerAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBgpPeerAttributeRequest setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
        return this;
    }
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    public ModifyBgpPeerAttributeRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public ModifyBgpPeerAttributeRequest setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
        return this;
    }
    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    public ModifyBgpPeerAttributeRequest setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }
    public Boolean getEnableBfd() {
        return this.enableBfd;
    }

    public ModifyBgpPeerAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBgpPeerAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBgpPeerAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyBgpPeerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBgpPeerAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBgpPeerAttributeRequest setBfdMultiHop(Integer bfdMultiHop) {
        this.bfdMultiHop = bfdMultiHop;
        return this;
    }
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

}
