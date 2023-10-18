// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP that you want to associate with an instance.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance with which you want to associate the EIP.</p>
     * <br>
     * <p>You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance with which you want to associate the EIP resides.</p>
     * <br>
     * <p>>  This parameter is required only when the EIP is added to a shared Global Accelerator (GA) instance.</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The type of the instance with which you want to associate the EIP. Valid values:</p>
     * <br>
     * <p>*   **Nat**: NAT gateway</p>
     * <p>*   **SlbInstance**: CLB instance</p>
     * <p>*   **EcsInstance** (default): ECS instance</p>
     * <p>*   **NetworkInterface**: secondary ENI</p>
     * <p>*   **HaVip**: HAVIP</p>
     * <p>*   **IpAddress**: IP address</p>
     * <br>
     * <p>>  The default value is **EcsInstance**. If the instance with which you want to associate the EIP is not an ECS instance, this parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The association mode. Valid values:</p>
     * <br>
     * <p>*   **NAT** (default): NAT mode</p>
     * <p>*   **MULTI_BINDED**: multi-EIP-to-ENI mode</p>
     * <p>*   **BINDED**: cut-network interface controller mode</p>
     * <br>
     * <p>>  This parameter is required only when **InstanceType** is set to **NetworkInterface**.</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IP address in the CIDR block of the vSwitch.</p>
     * <br>
     * <p>If you leave this parameter empty, the system allocates a private IP address based on the VPC ID and vSwitch ID.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPC in which an IPv4 gateway is created. The VPC and the EIP must be in the same region.</p>
     * <br>
     * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.</p>
     * <br>
     * <p>>  This parameter is required if **InstanceType** is set to **IpAddress**, which indicates that the EIP is to be associated with an IP address.</p>
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
