// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateEipAddressRequest extends TeaModel {
    /**
     * <p>The type of instance with which you want to associate the EIP. Valid values:</p>
     * <br>
     * <p>*   **Nat**: a NAT gateway</p>
     * <p>*   **SlbInstance**: a CLB instance</p>
     * <p>*   **EcsInstance** (default): an ECS instance in a VPC</p>
     * <p>*   **NetworkInterface**: a secondary ENI</p>
     * <p>*   **HaVip**: an HAVIP</p>
     * <p>*   **IpAddress**: an IP address</p>
     * <br>
     * <p>>  If you do not set this parameter, the type of the instance with which you want to associate the EIP is **EcsInstance**. If the type of the instance with which you want to associate the EIP is not **EcsInstance**, this parameter is required.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the instance with which you want to associate the EIP.</p>
     * <br>
     * <p>>  This parameter is required only when the EIP is associated with a shared-bandwidth Global Accelerator (GA) instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The association mode. Valid values:</p>
     * <br>
     * <p>*   **NAT** (default): NAT mode</p>
     * <p>*   **MULTI_BINDED**: multi-EIP-to-ENI mode</p>
     * <p>*   **BINDED**: cut-through mode</p>
     * <br>
     * <p>>  This parameter is required only when **InstanceType** is set to **NetworkInterface**.</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>An IP address in the CIDR block of the vSwitch.</p>
     * <br>
     * <p>If you do not set this parameter, the system allocates a private IP address based on the VPC ID and vSwitch ID.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the VPC that has IPv4 gateways enabled and that is deployed in the same region as the EIP.</p>
     * <br>
     * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.</p>
     * <br>
     * <p>>  This parameter is required if **InstanceType** is set to **IpAddress**. In this case, the EIP is associated with an IP address.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the instance with which you want to associate the EIP.</p>
     * <br>
     * <p>You can enter the ID of a NAT gateway, CLB instance, ECS instance, secondary ENI, HAVIP, or IP address.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the request.</p>
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
