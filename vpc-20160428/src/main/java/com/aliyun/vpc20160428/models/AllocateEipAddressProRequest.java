// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Disables automatic payment. You must go to the Order Center to pay for the order.</p>
     * </li>
     * <li><p><strong>true</strong>: Enables automatic payment. The payment is completed automatically.</p>
     * </li>
     * </ul>
     * <p>This parameter is required only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The peak bandwidth of the EIP. Unit: Mbps.</p>
     * <ul>
     * <li><p>If <strong>InstanceChargeType</strong> is <strong>PostPaid</strong> (pay-as-you-go) and <strong>InternetChargeType</strong> is <strong>PayByBandwidth</strong>, <strong>Bandwidth</strong> can be from <strong>1</strong> to <strong>500</strong>.</p>
     * </li>
     * <li><p>If <strong>InstanceChargeType</strong> is <strong>PostPaid</strong> (pay-as-you-go) and <strong>InternetChargeType</strong> is <strong>PayByTraffic</strong>, <strong>Bandwidth</strong> can be from <strong>1</strong> to <strong>200</strong>.</p>
     * </li>
     * <li><p>If <strong>InstanceChargeType</strong> is <strong>PrePaid</strong> (subscription), <strong>Bandwidth</strong> can be from <strong>1</strong> to <strong>1000</strong>.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>A token used to ensure the idempotence of the request.</p>
     * <p>You must ensure that this token is unique across requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> differs for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><p><strong>BGP</strong> (default): BGP (Multi-ISP) line. All regions support EIPs that use BGP (Multi-ISP) lines.</p>
     * </li>
     * <li><p><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line. This line type is available only in the China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</p>
     * </li>
     * </ul>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <ul>
     * <li><p>If your account is on the allowlist for single-ISP bandwidth, you can also select one of the following values:</p>
     * <ul>
     * <li><p><strong>ChinaTelecom</strong></p>
     * </li>
     * <li><p><strong>ChinaUnicom</strong></p>
     * </li>
     * <li><p><strong>ChinaMobile</strong></p>
     * </li>
     * <li><p><strong>ChinaTelecom_L2</strong></p>
     * </li>
     * <li><p><strong>ChinaUnicom_L2</strong></p>
     * </li>
     * <li><p><strong>ChinaMobile_L2</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For China (Hangzhou) Finance Cloud users, this parameter is required and must be set to <strong>BGP_FinanceCloud</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The billing method of the EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription</p>
     * </li>
     * <li><p><strong>PostPaid</strong> (default): pay-as-you-go</p>
     * </li>
     * </ul>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, you can set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of the EIP to be allocated.</p>
     * <p>You can specify either <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you do not specify either parameter, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth</p>
     * </li>
     * <li><p><strong>PayByTraffic</strong>: pay-by-traffic</p>
     * </li>
     * </ul>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, you can set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the EIP to be allocated.</p>
     * <p>You can specify either <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you do not specify either parameter, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The network type. The only valid value is <strong>public</strong> (default), which indicates the public network.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period.</p>
     * <ul>
     * <li><p>If <strong>PricingCycle</strong> is <strong>Month</strong>, <strong>Period</strong> can be from <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If <strong>PricingCycle</strong> is <strong>Year</strong>, <strong>Period</strong> can be from <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * <p>If <code>InstanceChargeType</code> is set to <code>PostPaid</code>, this parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong> (default): Billed monthly.</p>
     * </li>
     * <li><p><strong>Year</strong>: Billed annually.</p>
     * </li>
     * </ul>
     * <p>This parameter is required only when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong> (subscription).</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the IP address pool from which to allocate the EIP.</p>
     * <p>This feature is disabled by default. To use this feature, apply for the required permissions in Quota Center. For more information, see <a href="https://help.aliyun.com/document_detail/108213.html">Increase quotas by using Quota Center</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-2vc0kxcedhquybdsz****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The ID of the region where the EIP is to be allocated.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group for the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resourcegroup****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security protection level.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, DDoS Protection (Basic) is enabled by default.</p>
     * </li>
     * <li><p>Set the value to <strong>AntiDDoS_Enhanced</strong> to enable DDoS Protection (Enhanced).</p>
     * </li>
     * </ul>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

    /**
     * <p>The tags to add to the EIP.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AllocateEipAddressProRequestTag> tag;

    public static AllocateEipAddressProRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressProRequest self = new AllocateEipAddressProRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressProRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public AllocateEipAddressProRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipAddressProRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateEipAddressProRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AllocateEipAddressProRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AllocateEipAddressProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocateEipAddressProRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipAddressProRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocateEipAddressProRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipAddressProRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateEipAddressProRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateEipAddressProRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AllocateEipAddressProRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public AllocateEipAddressProRequest setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public AllocateEipAddressProRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipAddressProRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipAddressProRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateEipAddressProRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateEipAddressProRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public AllocateEipAddressProRequest setTag(java.util.List<AllocateEipAddressProRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AllocateEipAddressProRequestTag> getTag() {
        return this.tag;
    }

    public static class AllocateEipAddressProRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AllocateEipAddressProRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateEipAddressProRequestTag self = new AllocateEipAddressProRequestTag();
            return TeaModel.build(map, self);
        }

        public AllocateEipAddressProRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AllocateEipAddressProRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
