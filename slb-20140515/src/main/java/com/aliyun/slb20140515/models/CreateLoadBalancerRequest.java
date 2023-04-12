// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The private IP address of the CLB instance. The private IP address must belong to the destination CIDR block of the vSwitch.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The IP version that is used by the CLB instance. Valid values: **ipv4** and **ipv6**.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The network type of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **internet:** After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.</p>
     * <p>*   **intranet:** After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over internal networks.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>Specifies whether to automatically pay for the subscription Internet-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   true: automatically pays for the subscription Internet-facing CLB instance. After you call the operation, the system automatically completes the payment and creates the CLB instance.</p>
     * <p>*   **false:** After you call the operation, the system creates an order but does not complete the payment. This is the default value. You can view pending orders in the CLB console. The CLB instance is not created until you complete the payment.</p>
     * <br>
     * <p>>  This parameter takes effect only for accounts registered on the China site (aliyun.com) and when the PayType parameter is set to PrePay.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **1** to **5120**. For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth for each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** is different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection for the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **on:** enables deletion protection.</p>
     * <p>*   **off:** disables deletion protection.</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <p>The subscription duration of the Internet-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   Valid values if the **PricingCycle** parameter is set to **month**: **1 to 9**.</p>
     * <p>*   Valid values if the **PricingCycle** parameter is set to **year**: **1 to 5**.</p>
     * <br>
     * <p>>  This parameter takes effect only for accounts registered on the China site (aliyun.com) and for subscription CLB instances.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The metering method of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **PayBySpec:** pay-by-specification. This is the default vaue.</p>
     * <p>*   **PayByCLCU:** pay-by-LCU.</p>
     * <br>
     * <p>>  This parameter takes effect only for accounts registered on the China site (aliyun.com) and when the **PayType** parameter is set to **PayOnDemand**.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   **paybytraffic:** pay-by-data-transfer. This is the default value.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note:**If you set this parameter to **paybytraffic**, you do not need to specify the **Bandwidth** parameter. Even if you specify the **Bandwidth** parameter, the value does not take effect.</p>
     * <br>
     * <p>*   **paybybandwidth**: pay-by-bandwidth.</p>
     * <br>
     * <p>> If you set the **PayType** parameter to **PayOnDemand** and the **InstanceChargeType** parameter to **PayByCLCU**, you can set the InternetChargeType parameter only to **paybytraffic**.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the CLB instance.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     * <br>
     * <p>If you do not specify this parameter, the system automatically specifies a name for the CLB instance.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The specification of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   **slb.s1.small**</p>
     * <p>*   **slb.s2.small**</p>
     * <p>*   **slb.s2.medium**</p>
     * <p>*   **slb.s3.small**</p>
     * <p>*   **slb.s3.medium**</p>
     * <p>*   **slb.s3.large**</p>
     * <br>
     * <p>> If you do not specify this parameter, a shared-resource CLB instance is created. Shared-resource CLB instances are no longer available for purchase. Therefore, you must specify this parameter.</p>
     * <br>
     * <p>If you set the **InstanceChargeType** parameter to **PayByCLCU**, the LoadBalancerSpec parameter is invalid and you do not need to specify this parameter.</p>
     */
    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    /**
     * <p>The ID of the primary zone to which the CLB instance belongs.</p>
     * <br>
     * <p>You can call the [DescribeZone](~~27585~~) operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The reason why you want to enable the configuration read-only mode. The reason must be 1 to 80 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     * <br>
     * <p>> This parameter takes effect only when you set the **ModificationProtectionStatus** parameter to **ConsoleProtection**.</p>
     */
    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    /**
     * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
     * <br>
     * <p>*   **NonProtection:** The configuration read-only mode is disabled. In this case, you cannot specify the ModificationProtectionReason parameter. If you specify the **ModificationProtectionReason** parameter, the value is cleared.</p>
     * <p>*   **ConsoleProtection:** The configuration read-only mode is enabled.</p>
     * <br>
     * <p>>  If you set this parameter to **ConsoleProtection**, you cannot modify the configurations of the CLB instance in the CLB console. However, you can call API operations to modify the configurations of the CLB instance.</p>
     */
    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>************</p>
     * <br>
     * <p>Set the value to **PayOnDemand**.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription Internet-facing CLB instance. Valid values:</p>
     * <br>
     * <p>*   **month:** billed on a monthly basis.</p>
     * <p>*   **year:** billed on an annual basis.</p>
     * <br>
     * <p>>  This parameter takes effect only for accounts registered on the China site (aliyun.com) and for subscription CLB instances.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the secondary zone to which the SLB instance belongs.</p>
     * <br>
     * <p>You can call the [DescribeZone](~~27585~~) operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
     */
    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    /**
     * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
     * <br>
     * <p>If you want to deploy the CLB instance in aVPC, you must specify this parameter. If you specify this parameter, the **AddessType** parameter is automatically set to **intranet**.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the CLB instance belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateLoadBalancerRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateLoadBalancerRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadBalancerRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateLoadBalancerRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLoadBalancerRequest setDeleteProtection(String deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    public CreateLoadBalancerRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateLoadBalancerRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLoadBalancerRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public CreateLoadBalancerRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CreateLoadBalancerRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public CreateLoadBalancerRequest setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public CreateLoadBalancerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLoadBalancerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLoadBalancerRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateLoadBalancerRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLoadBalancerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLoadBalancerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLoadBalancerRequest setSlaveZoneId(String slaveZoneId) {
        this.slaveZoneId = slaveZoneId;
        return this;
    }
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    public CreateLoadBalancerRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLoadBalancerRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
