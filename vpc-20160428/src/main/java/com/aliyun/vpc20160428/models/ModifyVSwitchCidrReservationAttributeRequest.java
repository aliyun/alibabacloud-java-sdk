// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchCidrReservationAttributeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the vSwitch is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new description of the reserved CIDR block. The default value is empty.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("VSwitchCidrReservationDescription")
    public String vSwitchCidrReservationDescription;

    /**
     * <p>The ID of the reserved CIDR block.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchCidrReservationId")
    public String vSwitchCidrReservationId;

    /**
     * <p>The new name of the reserved CIDR block.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("VSwitchCidrReservationName")
    public String vSwitchCidrReservationName;

    public static ModifyVSwitchCidrReservationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchCidrReservationAttributeRequest self = new ModifyVSwitchCidrReservationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchCidrReservationAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
        this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
        return this;
    }
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
        this.vSwitchCidrReservationId = vSwitchCidrReservationId;
        return this;
    }
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

    public ModifyVSwitchCidrReservationAttributeRequest setVSwitchCidrReservationName(String vSwitchCidrReservationName) {
        this.vSwitchCidrReservationName = vSwitchCidrReservationName;
        return this;
    }
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

}
