// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateVpcCidrBlockRequest extends TeaModel {
    /**
     * <p>The secondary IPv6 CIDR block to be deleted.</p>
     * <blockquote>
     * <p> You must set one of the <strong>Ipv6CidrBlock</strong> and <strong>SecondaryCidrBlock</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:6a::/56</p>
     */
    @NameInMap("IPv6CidrBlock")
    public String IPv6CidrBlock;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the VPC to which the secondary CIDR block to be deleted belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The secondary IPv4 CIDR block to be deleted.</p>
     * <blockquote>
     * <p> You must set one of the <strong>SecondaryCidrBlock</strong> and <strong>Ipv6CidrBlock</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    /**
     * <p>The ID of the VPC from which you want to delete a secondary CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-o6wrloqsdqc9io3mg****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UnassociateVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateVpcCidrBlockRequest self = new UnassociateVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateVpcCidrBlockRequest setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
        return this;
    }
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    public UnassociateVpcCidrBlockRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnassociateVpcCidrBlockRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnassociateVpcCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociateVpcCidrBlockRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnassociateVpcCidrBlockRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnassociateVpcCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public UnassociateVpcCidrBlockRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
