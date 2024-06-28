// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> We recommend that you enable automatic payment. If you disable automatic payment, you must manually pay the bill for creating the VPN gateway.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
     * <ul>
     * <li>If you want to create a public VPN gateway, valid values are <strong>10</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.</li>
     * <li>If you want to create a private VPN gateway, valid values are <strong>200</strong> and <strong>1000</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> The maximum bandwidth supported by VPN gateways in some regions is 200 Mbit/s. For more information, see <a href="https://help.aliyun.com/document_detail/65290.html">VPN gateway limits</a>.</p>
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
     * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The value of <strong>RequestId</strong> for each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The second vSwitch with which you want to associate the VPN gateway.</p>
     * <ul>
     * <li>If you call this operation in a region that supports the IPsec-VPN connections in dual-tunnel mode, this parameter is required.</li>
     * <li>You need to specify two vSwitches in different zones in the virtual private cloud (VPC) that is associated with the VPN gateway to implement disaster recovery across zones.</li>
     * <li>For a region that supports only one zone, disaster recovery across zones is not supported. We recommend that you specify two vSwitches in the zone to implement high availability. You can specify the same vSwitch.</li>
     * </ul>
     * <p>For more information about the regions and zones that support the IPsec-VPN connections in dual-tunnel mode, see <a href="https://help.aliyun.com/document_detail/2358946.html">IPsec-VPN connections support the dual-tunnel mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0wiz7obm0tbimu4r****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>Specifies whether to enable the IPsec-VPN feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIpsec")
    public Boolean enableIpsec;

    /**
     * <p>Specifies whether to enable the SSL-VPN feature for the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSsl")
    public Boolean enableSsl;

    /**
     * <p>The billing method of the VPN gateway. Set the value to <strong>POSTPAY</strong>, which specifies the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value for the Alibaba Cloud China site: PREPAY. Example value for the Alibaba Cloud International site: POSTPAY.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the VPN gateway. The default value is the ID of the VPN gateway.</p>
     * <p>The name must be 2 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>. It must start with a letter and can contain letters, digits, underscores (_), hyphens (-), and periods (.). Other special characters are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MYVPN</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>public</strong> (default)</li>
     * <li><strong>private</strong></li>
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
     * <p>The subscription duration. Unit: month. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the VPN gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li><p>If you do not specify a resource group ID, the VPN gateway belongs to the default resource group.</p>
     * </li>
     * <li><p>After the VPN gateway is created, the following resources also belong to the resource group and you cannot change the resource group: SSL servers, SSL client certificates, IPsec servers, and IPsec-VPN connections.</p>
     * <p>If you move the VPN gateway to a new resource group, the preceding resources are also moved to the new resource group.</p>
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
     * <p>The maximum number of clients that can be connected at the same time. Valid values: <strong>5</strong> (default), <strong>10</strong>, <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>500</strong>, and <strong>1000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SslConnections")
    public Integer sslConnections;

    /**
     * <p>The vSwitch with which you want to associate the VPN gateway.</p>
     * <ul>
     * <li>If you call this operation in a region that supports the IPsec-VPN connections in dual-tunnel mode, this parameter is required. You must specify a vSwitch and specify <strong>DisasterRecoveryVSwitchId</strong>.</li>
     * <li>If you call this operation in a region that supports the IPsec-VPN connections in single-tunnel mode and do not specify a vSwitch, the system automatically specifies a vSwitch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j5miw2bae9s2vt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) where you want to create the VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ub1yt9cvakoelj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The type of the VPN gateway. Valid values:</p>
     * <p>Set the value to <strong>Normal</strong> (default), which specifies a standard NAT gateway.</p>
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
