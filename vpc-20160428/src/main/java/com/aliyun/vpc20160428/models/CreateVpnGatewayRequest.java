// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically pay the bill for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: automatically pays the bill for the VPN gateway.</p>
     * </li>
     * <li><p><strong>false</strong> (default): does not automatically pay the bill for the VPN gateway.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To successfully create a VPN gateway instance, enable automatic payment. If you disable automatic payment, you must manually pay the bill to create the VPN gateway instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The bandwidth specification of the VPN gateway. Unit: Mbit/s.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- If you want to create a public VPN gateway, valid values are <strong>5</strong>, <strong>10</strong>, <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.
     * &lt;props=&quot;china&quot;&gt;- If you want to create a private VPN gateway, valid values are <strong>200</strong> and <strong>1000</strong>.
     * &lt;props=&quot;intl&quot;&gt;- If you want to create a public VPN gateway, valid values are <strong>10</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.
     * &lt;props=&quot;intl&quot;&gt;- If you want to create a private VPN gateway, valid values are <strong>200</strong> and <strong>1000</strong>.</p>
     * <blockquote>
     * <p>The maximum bandwidth specification supported by VPN gateways in some regions is 500 Mbit/s. For more information, see <a href="https://help.aliyun.com/document_detail/65290.html">VPN gateway limits</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The second vSwitch associated with the VPN VPC-connected instance.</p>
     * <ul>
     * <li>If the current region supports dual-tunnel IPsec-VPN connections, this parameter is required.</li>
     * <li>You must specify two vSwitches in different zones within the VPC associated with the VPN VPC-connected instance to implement zone-level disaster recovery for IPsec-VPN connections.</li>
     * <li>For regions that support only one zone, zone-level disaster recovery is not supported. Specify two different vSwitches in the same zone to achieve high availability for IPsec-VPN connections. You can also specify the same vSwitch.</li>
     * </ul>
     * <p>For information about the regions and zones that support dual-tunnel IPsec-VPN connections, see <a href="https://help.aliyun.com/document_detail/2358946.html">Upgrade an IPsec-VPN connection to dual-tunnel mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0wiz7obm0tbimu4r****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>Specifies whether to enable the IPsec-VPN feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): enables the IPsec-VPN feature.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the IPsec-VPN feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpsec")
    public Boolean enableIpsec;

    /**
     * <p>Specifies whether to enable the SSL-VPN feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the SSL-VPN feature.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables the SSL-VPN feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSsl")
    public Boolean enableSsl;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The billing method of the VPN gateway. Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.
     * &lt;props=&quot;intl&quot;&gt;The billing method of the VPN gateway. Set the value to <strong>POSTPAY</strong>, which specifies the pay-as-you-go billing method.
     * &lt;props=&quot;partner&quot;&gt;The billing method of the VPN gateway. Set the value to <strong>POSTPAY</strong>, which specifies the pay-as-you-go billing method.</p>
     * <p>&lt;props=&quot;china&quot;&gt;This parameter is required when you create a VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>中国站示例值：PREPAY，国际站示例值：POSTPAY</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the VPN gateway. The default value is the ID of the VPN gateway.</p>
     * <p>The name must be 2 to 100 characters in length. It cannot start with <code>http://</code> or <code>https://</code>. It must start with an uppercase or lowercase letter and can contain uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.). Other special characters are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MYVPN</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>public</strong> (default): public VPN gateway.</li>
     * <li><strong>private</strong>: private VPN gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> is set to <strong>PREPAY</strong>..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the VPN gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the VPN gateway belongs.</p>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group IDs.</p>
     * </li>
     * <li><p>If you do not specify a resource group ID, the VPN gateway belongs to the default resource group after it is created.</p>
     * </li>
     * <li><p>After the VPN gateway is created, if you create SSL servers, SSL client certificates, IPsec servers, or IPsec-VPN connections (when the IPsec-VPN connection is associated with the VPN gateway) under the VPN gateway, these resources belong to the same resource group as the VPN gateway. The resource group of these resources cannot be modified.</p>
     * <p>If you change the resource group of the VPN gateway, the resource group of the preceding resources is also changed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of clients that can be simultaneously connected. Valid values: <strong>5</strong> (default), <strong>10</strong>, <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SslConnections")
    public Integer sslConnections;

    /**
     * <p>The vSwitch associated with the VPN gateway instance. </p>
     * <ul>
     * <li>In regions that support dual-tunnel IPsec-VPN connections, this parameter is required. You must specify a vSwitch and also specify the <strong>DisasterRecoveryVSwitchId</strong> parameter.</li>
     * <li>In regions that support only single-tunnel IPsec-VPN connections, if you do not specify a vSwitch, the system automatically selects a vSwitch from the VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j5miw2bae9s2vt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC-connected instance to which the VPN gateway belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ub1yt9cvakoelj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The type of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): standard.
     * &lt;props=&quot;china&quot;&gt;- <strong>NationalStandard</strong>: Chinese SM-based..</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("VpnType")
    public String vpnType;

    public static CreateVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayRequest self = new CreateVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpnGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateVpnGatewayRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateVpnGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpnGatewayRequest setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    public CreateVpnGatewayRequest setEnableIpsec(Boolean enableIpsec) {
        this.enableIpsec = enableIpsec;
        return this;
    }
    public Boolean getEnableIpsec() {
        return this.enableIpsec;
    }

    public CreateVpnGatewayRequest setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }
    public Boolean getEnableSsl() {
        return this.enableSsl;
    }

    public CreateVpnGatewayRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateVpnGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnGatewayRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateVpnGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpnGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpnGatewayRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpnGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpnGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpnGatewayRequest setSslConnections(Integer sslConnections) {
        this.sslConnections = sslConnections;
        return this;
    }
    public Integer getSslConnections() {
        return this.sslConnections;
    }

    public CreateVpnGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVpnGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpnGatewayRequest setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

}
