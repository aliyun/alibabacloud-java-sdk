// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP to be associated with the cloud resource instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7ujsxdc****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID of the instance to be associated with the EIP.</p>
     * <p>You can enter the instance ID of a NAT gateway, a Classic Load Balancer (CLB) instance, an Elastic Compute Service (ECS) instance, a secondary elastic network interface controller (NIC) instance, a high-availability virtual IP address instance, or an IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zebb08phyczzawe****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance to be associated with the EIP.</p>
     * <blockquote>
     * <p>This parameter is required only after the EIP is added to a shared-bandwidth Global Accelerator (GA) instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The type of the instance to be associated with the EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>Nat</strong>: NAT gateway.</p>
     * </li>
     * <li><p><strong>SlbInstance</strong>: Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>EcsInstance</strong> (default): Elastic Compute Service (ECS).</p>
     * </li>
     * <li><p><strong>NetworkInterface</strong>: secondary elastic network interface controller (NIC).</p>
     * </li>
     * <li><p><strong>HaVip</strong>: high-availability virtual IP address. </p>
     * </li>
     * <li><p><strong>IpAddress</strong>: IP address.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default instance type is <strong>EcsInstance</strong>. If the instance type is not <strong>EcsInstance</strong>, this parameter is required.</p>
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
     * <li><p><strong>NAT</strong> (default): NAT mode (standard mode).</p>
     * </li>
     * <li><p><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode.</p>
     * </li>
     * <li><p><strong>BINDED</strong>: EIP-to-ENI mode.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only when <strong>InstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
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
     * <p>An IP address in the vSwitch CIDR block.</p>
     * <p>If you do not specify this parameter, the system automatically assigns a private IP address based on the VPC ID and vSwitch ID.</p>
     * <blockquote>
     * <p>If <strong>InstanceType</strong> is set to <strong>NetworkInterface</strong>, this parameter is required. Enter the private IP address to be associated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID of the EIP to be associated with the cloud resource instance.</p>
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
     * <p>The ID of the VPC that has the IPv4 gateway feature enabled and is in the same region as the EIP.</p>
     * <p>When the EIP is associated with an IP address, the system can use the route configuration of the VPC to enable public network access for the associated IP address.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>InstanceType</strong> is set to <strong>IpAddress</strong>.</p>
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
