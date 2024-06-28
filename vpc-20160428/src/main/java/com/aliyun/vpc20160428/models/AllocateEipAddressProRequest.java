// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressProRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Automatic payment is disabled. After an order is generated, you must go to the Order Center to complete the payment.</li>
     * <li><strong>true</strong>: Automatic payment is enabled. After an order is generated, the payment is automatically completed.</li>
     * </ul>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. This parameter is optional if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the specified EIP. Unit: Mbit/s.</p>
     * <ul>
     * <li>When <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>500</strong>.</li>
     * <li>When <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>200</strong>.</li>
     * <li>When <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, valid values for <strong>Bandwidth</strong> are <strong>1</strong> to <strong>1000</strong>.</li>
     * </ul>
     * <p>Default value: <strong>5</strong> Mbit /s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line The BGP (Multi-ISP) Pro line is supported in the China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
     * </ul>
     * <p>For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see the &quot;Line types&quot; section of <a href="https://help.aliyun.com/document_detail/32321.html">What is EIP?</a></p>
     * <ul>
     * <li><p>If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaTelecom_L2</strong></li>
     * <li><strong>ChinaUnicom_L2</strong></li>
     * <li><strong>ChinaMobile_L2</strong></li>
     * </ul>
     * </li>
     * <li><p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to <strong>BGP_FinanceCloud</strong>.</p>
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
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
     * </ul>
     * <p>Set the value of <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * <p>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>: <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The EIP ID.</p>
     * <p>Specify <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you leave both parameters empty, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the EIP. Valid values:</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
     * </ul>
     * <p>When <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, you must set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong>.</p>
     * <p>When <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the EIP.</p>
     * <p>Specify <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you leave both parameters empty, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The network type. By default, this value is set to <strong>public</strong>, which specifies the public network type.</p>
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
     * <li>Valid values when <strong>PricingCycle</strong> is set to <strong>Month</strong>: <strong>1 to 9</strong>.****</li>
     * <li>Valid values when <strong>PricingCycle</strong> is set to <strong>Year</strong>: <strong>1 to 3</strong>.****</li>
     * </ul>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * <p>Leave this parameter empty if <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription EIP. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong> (default)</li>
     * <li><strong>Year</strong></li>
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
     * <p>The EIP is allocated from the IP address pool.</p>
     * <p>By default, you cannot use the IP address pool. To use this feature, apply for the privilege in the Quota Center console. For more information, see the &quot;Request a quota increase in the Quota Center console&quot; section of <a href="https://help.aliyun.com/document_detail/108213.html">Manage EIP quotas</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-2vc0kxcedhquybdsz****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The editions of Anti-DDoS.</p>
     * <ul>
     * <li>If you do not specify this parameter, Anti-DDoS Origin Basic is used.</li>
     * <li>If you set the parameter to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS Pro/Premium is used.</li>
     * </ul>
     * <p>You can configure Anti-DDoS editions for up to 10 EIPs.</p>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

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

}
