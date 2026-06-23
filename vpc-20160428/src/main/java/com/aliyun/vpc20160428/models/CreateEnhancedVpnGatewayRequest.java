// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateEnhancedVpnGatewayRequest extends TeaModel {
    /**
     * <p>A client token used to ensure request idempotence.</p>
     * <p>You can generate this token from your client. Make sure that the token is unique for each request. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. Each request may have a different <strong>RequestId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the second vSwitch to associate with the enhanced VPN gateway for high availability.</p>
     * <ul>
     * <li></li>
     * <li><p>For zone-level disaster recovery, the two vSwitches must be in different availability zones within the same VPC.</p>
     * </li>
     * <li><p>In regions with only one availability zone, zone-level disaster recovery is not supported. To ensure high availability, specify two different vSwitches from that zone. You can also specify the same vSwitch for both the <strong>VSwitchId</strong> and <strong>DisasterRecoveryVSwitchId</strong> parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0wiz7obm0tbimu4r****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>The type of the enhanced VPN gateway. Valid value:</p>
     * <ul>
     * <li><strong>Enhanced.SiteToSite</strong>: an enhanced site-to-site VPN gateway that supports only the IPsec feature.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced.SiteToSite</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The name of the enhanced VPN gateway. If you do not specify this parameter, the gateway ID is used as the name.</p>
     * <p>The name must be 2 to 100 characters long, start with a letter, and not start with http\:// or https\://. It can contain only letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>MYVPN</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the VPN gateway. Valid value:</p>
     * <ul>
     * <li><strong>public</strong> (default): a public VPN gateway.</li>
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
     * <p>The ID of the region where you want to create the enhanced VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to get the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which you want to assign the enhanced VPN gateway.</p>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group IDs.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the enhanced VPN gateway is added to the Default Resource Group.</p>
     * </li>
     * <li><p>Associated IPsec connections are automatically added to the same resource group as the enhanced VPN gateway. You cannot directly change the resource group of an IPsec connection. If you change the resource group of the gateway, the resource group of its associated IPsec connections is also updated.</p>
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
     * <p>The ID of the vSwitch to associate with the enhanced VPN gateway.</p>
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j5miw2bae9s2vt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC where you want to create the enhanced VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ub1yt9cvakoelj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The type of the enhanced VPN gateway. Valid value:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): standard type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("VpnType")
    public String vpnType;

    public static CreateEnhancedVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnhancedVpnGatewayRequest self = new CreateEnhancedVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnhancedVpnGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEnhancedVpnGatewayRequest setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    public CreateEnhancedVpnGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateEnhancedVpnGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnhancedVpnGatewayRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateEnhancedVpnGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateEnhancedVpnGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateEnhancedVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnhancedVpnGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEnhancedVpnGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateEnhancedVpnGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateEnhancedVpnGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateEnhancedVpnGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateEnhancedVpnGatewayRequest setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

}
