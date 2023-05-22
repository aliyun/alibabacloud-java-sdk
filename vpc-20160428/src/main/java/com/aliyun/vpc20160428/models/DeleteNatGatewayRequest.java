// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to forcefully delete the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **true**: yes If you set the value to **true**:</p>
     * <br>
     * <p>    *   If the NAT gateway has SNAT entries, the system automatically deletes them.</p>
     * <p>    *   If the NAT gateway has DNAT entries, the system automatically deletes them.</p>
     * <p>    *   If the NAT gateway is associated with an elastic IP address (EIP), the system automatically disassociates the EIP from the NAT gateway.</p>
     * <p>    *   If the NAT gateway is associated with a NAT bandwidth plan, the system automatically disassociates the NAT bandwidth plan from the NAT gateway.</p>
     * <br>
     * <p>*   **false**(default): no If you set the value to **false**:</p>
     * <br>
     * <p>    *   If the NAT gateway is associated with a NAT bandwidth plan, disassociate the NAT gateway from the NAT bandwidth plan first.</p>
     * <p>    *   If the NAT gateway has SNAT entries, delete them first.</p>
     * <p>    *   If the NAT gateway has DNAT entries, delete them first.</p>
     * <p>    *   If the NAT gateway is associated with an EIP, disassociate the EIP from the NAT gateway first.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayRequest self = new DeleteNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNatGatewayRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteNatGatewayRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DeleteNatGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteNatGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteNatGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNatGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteNatGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
