// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVSwitchCidrReservationRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VSwitchCidrReservationId")
    public String vSwitchCidrReservationId;

    public static DeleteVSwitchCidrReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchCidrReservationRequest self = new DeleteVSwitchCidrReservationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchCidrReservationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteVSwitchCidrReservationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVSwitchCidrReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVSwitchCidrReservationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteVSwitchCidrReservationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteVSwitchCidrReservationRequest setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
        this.vSwitchCidrReservationId = vSwitchCidrReservationId;
        return this;
    }
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

}
