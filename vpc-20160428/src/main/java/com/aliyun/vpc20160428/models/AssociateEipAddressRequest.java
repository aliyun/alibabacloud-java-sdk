// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP that you want to associate with an instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7ujsxdc****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance with which you want to associate the EIP.</p>
     * <p>You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zebb08phyczzawe****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance with which you want to associate the EIP resides.</p>
     * <blockquote>
     * <p> This parameter is required only when the EIP is added to a shared Global Accelerator (GA) instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The type of the instance with which you want to associate the EIP. Valid values:</p>
     * <ul>
     * <li><strong>Nat</strong>: NAT gateway</li>
     * <li><strong>SlbInstance</strong>: CLB instance</li>
     * <li><strong>EcsInstance</strong> (default): ECS instance</li>
     * <li><strong>NetworkInterface</strong>: secondary ENI</li>
     * <li><strong>HaVip</strong>: HAVIP</li>
     * <li><strong>IpAddress</strong>: IP address</li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>EcsInstance</strong>. If the instance with which you want to associate the EIP is not an ECS instance, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsInstance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The association mode. Valid values:</p>
     * <ul>
     * <li><strong>NAT</strong> (default): NAT mode</li>
     * <li><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode</li>
     * <li><strong>BINDED</strong>: cut-network interface controller mode</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required only when <strong>InstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NAT</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address in the CIDR block of the vSwitch.</p>
     * <p>If you leave this parameter empty, the system allocates a private IP address based on the VPC ID and vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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

    /**
     * <p>The ID of the VPC in which an IPv4 gateway is created. The VPC and the EIP must be in the same region.</p>
     * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.</p>
     * <blockquote>
     * <p> This parameter is required if <strong>InstanceType</strong> is set to <strong>IpAddress</strong>, which indicates that the EIP is to be associated with an IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-257gqcdfvx6n****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static AssociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipAddressRequest self = new AssociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipAddressRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public AssociateEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateEipAddressRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public AssociateEipAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AssociateEipAddressRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AssociateEipAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssociateEipAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateEipAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AssociateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateEipAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateEipAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssociateEipAddressRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
