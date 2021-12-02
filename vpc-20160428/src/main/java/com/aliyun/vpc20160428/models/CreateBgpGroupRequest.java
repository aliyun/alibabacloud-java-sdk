// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IsFakeAsn")
    public Boolean isFakeAsn;

    @NameInMap("LocalAsn")
    public Long localAsn;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeerAsn")
    public Long peerAsn;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouterId")
    public String routerId;

    public static CreateBgpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupRequest self = new CreateBgpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateBgpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBgpGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBgpGroupRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateBgpGroupRequest setIsFakeAsn(Boolean isFakeAsn) {
        this.isFakeAsn = isFakeAsn;
        return this;
    }
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    public CreateBgpGroupRequest setLocalAsn(Long localAsn) {
        this.localAsn = localAsn;
        return this;
    }
    public Long getLocalAsn() {
        return this.localAsn;
    }

    public CreateBgpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBgpGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateBgpGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateBgpGroupRequest setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }
    public Long getPeerAsn() {
        return this.peerAsn;
    }

    public CreateBgpGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBgpGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateBgpGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateBgpGroupRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

}
