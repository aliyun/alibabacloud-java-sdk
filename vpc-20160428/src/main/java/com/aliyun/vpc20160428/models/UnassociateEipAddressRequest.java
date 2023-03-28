// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the EIP that you want to disassociate.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** might be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **false** (default): does not disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.</p>
     * <p>*   **true**: disassociates the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the instance from which you want to disassociate the EIP.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance from which you want to disassociate the EIP. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance** (default): an Elastic Compute Service (ECS) instance in a virtual private cloud (VPC)</p>
     * <p>*   **SlbInstance**: a Server Load Balancer (SLB) instance in a VPC</p>
     * <p>*   **NetworkInterface**: a secondary elastic network interface (ENI) in a VPC</p>
     * <p>*   **Nat**: a NAT gateway</p>
     * <p>*   **HaVip**: a high-availability virtual IP address (HAVIP)</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private IP address of the ECS instance or the secondary ENI from which you want to disassociate the EIP.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UnassociateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressRequest self = new UnassociateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateEipAddressRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public UnassociateEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnassociateEipAddressRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public UnassociateEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnassociateEipAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UnassociateEipAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnassociateEipAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnassociateEipAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public UnassociateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociateEipAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnassociateEipAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
