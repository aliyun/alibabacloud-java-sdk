// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    /**
     * <p>The promotion code. This parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): The automatic payment is disabled. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</li>
     * <li><strong>true</strong>: The automatic payment is enabled. Payments are automatically complete after an order is generated.</li>
     * </ul>
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, this parameter is required. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, this parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <ul>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>: <strong>1</strong> to <strong>500</strong>.****</li>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong> and <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>: <strong>1</strong> to <strong>200</strong>.****</li>
     * <li>Valid values when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>: <strong>1</strong> to <strong>1000</strong>.****</li>
     * </ul>
     * <p>Default value: <strong>5</strong>. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The <strong>client token</strong> can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the <strong>client token</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the EIP.</p>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <blockquote>
     * <p> You cannot specify this parameter if you create a subscription EIP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (Multi-ISP) All regions support BGP (Multi-ISP) EIPs.</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</li>
     * </ul>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the &quot;Line types&quot; section of <a href="https://help.aliyun.com/document_detail/32321.html">What is EIP?</a></p>
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
     * <li><p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to <strong>BGP_FinanceCloud</strong>.</p>
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
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong>. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
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
     * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth</li>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * </ul>
     * <p>When <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong>.</p>
     * <p>When <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, set <strong>InternetChargeType</strong> to <strong>PayByBandwidth</strong> or <strong>PayByTraffic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the EIP that you want to request.</p>
     * <p>Specify <strong>IpAddress</strong> or <strong>InstanceId</strong>. If you leave both parameters empty, the system randomly allocates an EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The EIP name.</p>
     * <p>The name must be 1 to 128 characters in length and start with a letter, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p> You cannot specify this parameter if you create a subscription EIP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EIP1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type. Default value: <strong>public</strong>.</p>
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
     * <p>The subscription duration of the EIP.</p>
     * <p>Valid values when <strong>PricingCycle</strong> is set to <strong>Month</strong>: <strong>1</strong> to <strong>9</strong>.****</p>
     * <p>Valid values when <strong>PricingCycle</strong> is set to <strong>Year</strong>: <strong>1</strong> to <strong>5</strong>.****</p>
     * <p>This parameter must be specified when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>. This parameter is optional when <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>.</p>
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
     * <p>If <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>, this parameter is required. If <strong>InstanceChargeType</strong> is set to <strong>PostPaid</strong>, this parameter is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the IP address pool.</p>
     * <p>The EIP is allocated from the IP address pool.</p>
     * <p>By default, the IP address pool feature is unavailable. To use the IP address pool, apply for the privilege in the Quota Center console. For more information, see the &quot;Request a quota increase in the Quota Center console&quot; section in <a href="https://help.aliyun.com/document_detail/108213.html">Manage EIP quotas</a>.</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazffggds****</p>
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
     * <p>You can specify up to 10 editions of Anti-DDoS.</p>
     * 
     * <strong>example:</strong>
     * <p>AntiDDoS_Enhanced</p>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

    /**
     * <p>The zone of the EIP.</p>
     * <p>When the service type of the IP address pool specified by <strong>PublicIpAddressPoolId</strong> is CloudBox, the default value is the zone of the IP address pool.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/429433.html">ListPublicIpAddressPools</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public AllocateEipAddressRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public AllocateEipAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateEipAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AllocateEipAddressRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AllocateEipAddressRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AllocateEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocateEipAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipAddressRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocateEipAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AllocateEipAddressRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateEipAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateEipAddressRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AllocateEipAddressRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public AllocateEipAddressRequest setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public AllocateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateEipAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateEipAddressRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public AllocateEipAddressRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
