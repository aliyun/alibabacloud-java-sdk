// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNodeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UisId")
    public String uisId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("UisNodeBandwidth")
    public Integer uisNodeBandwidth;

    @NameInMap("IpAddrsNum")
    public Integer ipAddrsNum;

    @NameInMap("UisNodeAreaId")
    public String uisNodeAreaId;

    public static CreateUisNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNodeRequest self = new CreateUisNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateUisNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateUisNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUisNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateUisNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUisNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUisNodeRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public CreateUisNodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUisNodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUisNodeRequest setUisNodeBandwidth(Integer uisNodeBandwidth) {
        this.uisNodeBandwidth = uisNodeBandwidth;
        return this;
    }
    public Integer getUisNodeBandwidth() {
        return this.uisNodeBandwidth;
    }

    public CreateUisNodeRequest setIpAddrsNum(Integer ipAddrsNum) {
        this.ipAddrsNum = ipAddrsNum;
        return this;
    }
    public Integer getIpAddrsNum() {
        return this.ipAddrsNum;
    }

    public CreateUisNodeRequest setUisNodeAreaId(String uisNodeAreaId) {
        this.uisNodeAreaId = uisNodeAreaId;
        return this;
    }
    public String getUisNodeAreaId() {
        return this.uisNodeAreaId;
    }

}
