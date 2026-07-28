// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Automatic payment is disabled. After an order is generated, go to the Order Center to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: Automatic payment is enabled. The order is automatically paid.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. This parameter is optional if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the EIP to allocate. Unit: Mbit/s.</p>
     * <ul>
     * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>500</strong>.</p>
     * </li>
     * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>200</strong>.</p>
     * </li>
     * <li><p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>1000</strong>.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>5</strong> Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
     * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. All regions support BGP (multi-ISP) EIPs.</li>
     * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line. Only the following regions support BGP (multi-ISP) Pro EIPs: Hong Kong (China), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</li>
     * </ul>
     * <p>For more information about BGP (multi-ISP) and BGP (multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <ul>
     * <li>If you are a single-ISP bandwidth whitelist user, you can also select the following types:<ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom</li>
     * <li><strong>ChinaMobile</strong>: China Mobile</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
     * </ul>
     * </li>
     * <li>If you are a China (Hangzhou) Finance Cloud user, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The billing method of the EIP to allocate. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription.</p>
     * </li>
     * <li><p><strong>PostPaid</strong> (default): pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, <strong>InternetChargeType</strong> can be set to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance ID of the EIP to allocate.</p>
     * <p>You need to specify only one of <strong>IpAddress</strong> and <strong>InstanceId</strong>. If neither is specified, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the EIP to allocate. Valid values:</p>
     * <ul>
     * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
     * </li>
     * <li><p><strong>PayByTraffic</strong>: pay-by-data-transfer.</p>
     * </li>
     * </ul>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, <strong>InternetChargeType</strong> must be set to <strong>PayByBandwidth</strong>.</p>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, <strong>InternetChargeType</strong> can be set to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the EIP to allocate.</p>
     * <p>You need to specify only one of <strong>IpAddress</strong> and <strong>InstanceId</strong>. If neither is specified, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The network type. The value can only be <strong>public</strong> (default), which indicates the public network.</p>
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
     * <p>The subscription duration.</p>
     * <ul>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, valid values of <strong>Period</strong> are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, valid values of <strong>Period</strong> are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * <p>Do not set this parameter if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong> (default): billed on a monthly basis.</p>
     * </li>
     * <li><p><strong>Year</strong>: billed on a yearly basis.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. This parameter is optional if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the IP address pool.</p>
     * <p>The EIP is allocated from the specified IP address pool.</p>
     * <p>The IP address pool feature is not available by default. To use this feature, apply for the IP address pool privilege quota in Quota Center. For more information, see <a href="https://help.aliyun.com/document_detail/108213.html">Increase a quota in Quota Center</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-2vc0kxcedhquybdsz****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The region ID of the EIP to allocate.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the EIP belongs.</p>
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
     * <li><p>If this parameter is left empty, the default value is Anti-DDoS Basic.</p>
     * </li>
     * <li><p>If this parameter is set to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS (Enhanced) is enabled.</p>
     * </li>
     * </ul>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

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
        @NameInMap("Key")
        public String key;

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
