// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    @NameInMap("PeerIpAddress")
    public String peerIpAddress;

    @NameInMap("EnableBfd")
    public Boolean enableBfd;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("BfdMultiHop")
    public Integer bfdMultiHop;

    public static CreateBgpPeerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerRequest self = new CreateBgpPeerRequest();
        return TeaModel.build(map, self);
    }

    public CreateBgpPeerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateBgpPeerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateBgpPeerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateBgpPeerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBgpPeerRequest setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public CreateBgpPeerRequest setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
        return this;
    }
    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    public CreateBgpPeerRequest setEnableBfd(Boolean enableBfd) {
        this.enableBfd = enableBfd;
        return this;
    }
    public Boolean getEnableBfd() {
        return this.enableBfd;
    }

    public CreateBgpPeerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBgpPeerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateBgpPeerRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateBgpPeerRequest setBfdMultiHop(Integer bfdMultiHop) {
        this.bfdMultiHop = bfdMultiHop;
        return this;
    }
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

}
