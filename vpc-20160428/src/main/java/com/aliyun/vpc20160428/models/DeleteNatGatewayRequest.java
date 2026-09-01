// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully delete the NAT gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: forcefully deletes the NAT gateway. If you set this parameter to <strong>true</strong>:</p>
     * <ul>
     * <li><p>If the NAT gateway has SNAT rules, the system force deletes the SNAT rules.</p>
     * </li>
     * <li><p>If the NAT gateway has DNAT rules, the system force deletes the DNAT rules.</p>
     * </li>
     * <li><p>If the NAT gateway has associated elastic IP addresses (EIPs), the system automatically disassociates the EIPs.</p>
     * </li>
     * <li><p>If the NAT gateway has NAT service plans that are not deleted, the system force deletes the NAT service plans.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>false</strong> (default): does not forcefully delete the NAT gateway. If you set this parameter to <strong>false</strong>:</p>
     * <ul>
     * <li><p>If the NAT gateway has NAT service plans that are not deleted, delete the NAT service plans first.</p>
     * </li>
     * <li><p>If the NAT gateway has SNAT rules, delete the SNAT rules first.</p>
     * </li>
     * <li><p>If the NAT gateway has DNAT rules, delete the DNAT rules first.</p>
     * </li>
     * <li><p>If the NAT gateway has associated EIPs, disassociate the EIPs first.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The instance ID of the NAT gateway that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
