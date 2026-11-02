// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateVpcIpv6CidrRequest extends TeaModel {
    /**
     * <p>The type of the IPv6 address pool. Valid values:</p>
     * <ul>
     * <li><strong>aliyun</strong> (default): The IPv6 CIDR block is allocated by the system.</li>
     * <li><strong>custom</strong>: The IPv6 CIDR block is customized by the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("AddressPoolType")
    public String addressPoolType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IPv6 CIDR block to be reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/56</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The ISP type of the IPv6 CIDR block for the VPC. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP).</li>
     * <li><strong>BGP_International</strong>: BGP (Multi-ISP) International.</li>
     * <li><strong>ChinaMobile</strong>: China Mobile (single ISP).</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom (single ISP).</li>
     * <li><strong>ChinaTelecom</strong>: China Telecom (single ISP).</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile (single ISP) L2.</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom (single ISP) L2.</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom (single ISP) L2.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If your account is added to the corresponding whitelist, you can set this parameter to <strong>ChinaTelecom</strong> (China Telecom), <strong>ChinaUnicom</strong> (China Unicom), <strong>ChinaMobile</strong> (China Mobile), <strong>ChinaTelecom_L2</strong> (China Telecom L2), <strong>ChinaUnicom_L2</strong> (China Unicom L2), <strong>ChinaMobile_L2</strong> (China Mobile L2), or <strong>BGP_International</strong> (BGP Multi-ISP International).</li>
     * <li>You can reserve only one IPv6 CIDR block of each ISP type. You can reserve the next IPv6 CIDR block only after the current one is allocated to a VPC.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VPC is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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

    public static AllocateVpcIpv6CidrRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateVpcIpv6CidrRequest self = new AllocateVpcIpv6CidrRequest();
        return TeaModel.build(map, self);
    }

    public AllocateVpcIpv6CidrRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public AllocateVpcIpv6CidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateVpcIpv6CidrRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public AllocateVpcIpv6CidrRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public AllocateVpcIpv6CidrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateVpcIpv6CidrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateVpcIpv6CidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateVpcIpv6CidrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateVpcIpv6CidrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
