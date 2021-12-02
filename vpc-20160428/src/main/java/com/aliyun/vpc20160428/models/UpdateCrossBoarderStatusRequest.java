// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateCrossBoarderStatusRequest extends TeaModel {
    // 开通还是关闭服务
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // region
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // 开通服务的帐号
    @NameInMap("ResourceUid")
    public Long resourceUid;

    public static UpdateCrossBoarderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBoarderStatusRequest self = new UpdateCrossBoarderStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBoarderStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateCrossBoarderStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateCrossBoarderStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCrossBoarderStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateCrossBoarderStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateCrossBoarderStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateCrossBoarderStatusRequest setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

}
