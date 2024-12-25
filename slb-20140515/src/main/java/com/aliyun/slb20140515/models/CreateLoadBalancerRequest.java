// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The private IP address of the CLB instance. The private IP address must belong to the destination CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The IP version of the CLB instance. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The network type of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: After an Internet-facing CLB instance is created, the system allocates a public IP address to the instance. The CLB instance can forward requests over the Internet.</li>
     * <li><strong>intranet</strong>: After an internal-facing CLB instance is created, the system allocates a private IP address to the CLB instance. The CLB instance can forward requests only within the VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>Specifies whether to automatically pay the subscription fee of the Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. The CLB instance is created after you call the API operation.</li>
     * <li><strong>false</strong> (default): After you call the operation, the order is created but the payment is not completed. You can view pending orders in the console. The CLB instance will not be created until you complete the payment.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only for subscription CLB instances created on the Alibaba Cloud China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    @Deprecated
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>1</strong> to <strong>5120</strong>. For a pay-by-bandwidth Internet-facing CLB instance, you can specify a maximum bandwidth for each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection for the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DeleteProtection")
    public String deleteProtection;

    /**
     * <p>The subscription duration of the Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li>If <strong>PricingCycle</strong> is set to <strong>month</strong>, the valid values are <strong>1 to 9</strong>.</li>
     * <li>If <strong>PricingCycle</strong> is set to <strong>year</strong>, the valid values are <strong>1 to 5</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only by subscription instances created on the Alibaba Cloud China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    @Deprecated
    public Integer duration;

    /**
     * <p>The metering method of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>PayBySpec</strong> (default)</li>
     * <li><strong>PayByCLCU</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only by instances created on the Alibaba Cloud China site and only when <strong>PayType</strong> is set to <strong>PayOnDemand</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayBySpec</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li><p><strong>paybytraffic</strong> (default): pay-by-data-transfer</p>
     * <blockquote>
     * <p> If you set InternetChargeType to <strong>paybytraffic</strong>, you do not need to configure the <strong>Bandwidth</strong> parameter. The value of <strong>Bandwidth</strong> does not take effect even if you specify one.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>paybybandwidth</strong>: pay-by-bandwidth</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you set <strong>PayType</strong> to <strong>PayOnDemand</strong> and <strong>InstanceChargeType</strong> to <strong>PayByCLCU</strong>, the only valid value for InternetChargeType is <strong>paybytraffic</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>paybytraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The CLB instance name.</p>
     * <p>The name must be 1 to 80 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * <p>If you do not specify this parameter, the system automatically assigns a name to the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1o94dp5i6ea****</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The specification of the CLB instance. Valid values:</p>
     * <ul>
     * <li><p><strong>slb.s1.small</strong></p>
     * </li>
     * <li><p><strong>slb.s2.small</strong></p>
     * </li>
     * <li><p><strong>slb.s2.medium</strong></p>
     * </li>
     * <li><p><strong>slb.s3.small</strong></p>
     * </li>
     * <li><p><strong>slb.s3.medium</strong></p>
     * </li>
     * <li><p><strong>slb.s3.large</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>  If you do not specify this parameter, a shared-resource CLB instance is created. Shared-resource CLB instances are no longer available for purchase. Therefore, you must specify this parameter.</p>
     * </blockquote>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PayByCLCU</strong>, this parameter is invalid and you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    /**
     * <p>The ID of the primary zone to which the CLB instance belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401683.html">DescribeZone</a> operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The reason for enabling the configuration read-only mode. The reason must be 1 to 80 characters in length. It must start with a letter and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p> This parameter takes effect only when <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Managed instance</p>
     */
    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    /**
     * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
     * <ul>
     * <li><strong>NonProtection</strong>: disables the configuration read-only mode. After you disable the configuration read-only mode, the value of <strong>ModificationProtectionReason</strong> is cleared.</li>
     * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode.</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ConsoleProtection</p>
     */
    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <p><strong>PayOnDemand</strong>: pay-as-you-go.</p>
     * <blockquote>
     * <p> The Alibaba Cloud International site supports only pay-as-you-go CLB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayOnDemand</p>
     */
    @NameInMap("PayType")
    @Deprecated
    public String payType;

    /**
     * <p>The billing cycle of the subscription Internet-facing CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>month</strong></li>
     * <li><strong>year</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only by subscription instances created on the Alibaba Cloud China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PricingCycle")
    @Deprecated
    public String pricingCycle;

    /**
     * <p>The region ID of the CLB instance.</p>
     * <p>You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtopt****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401683.html">DescribeZone</a> operation to query the primary and secondary zones in the region where you want to create the CLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("SlaveZoneId")
    public String slaveZoneId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLoadBalancerRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the CLB instance belongs.</p>
     * <p>If you want to deploy the CLB instance in a VPC, this parameter is required. If this parameter is specified, <strong>AddessType</strong> is set to <strong>intranet</strong> by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgy****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the CLB instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sofi8mh1****</p>
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

    public CreateLoadBalancerRequest setTag(java.util.List<CreateLoadBalancerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestTag> getTag() {
        return this.tag;
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

    public static class CreateLoadBalancerRequestTag extends TeaModel {
        /**
         * <p>The tag key of the bastion host. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
         * <p>The tag key can be at most 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It must not start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLoadBalancerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestTag self = new CreateLoadBalancerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLoadBalancerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
