// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateEnhancedVpnGatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The second vSwitch associated with the enhanced VPN VPC-connected instance.</p>
     * <ul>
     * <li>This parameter is required.</li>
     * <li>You must specify two vSwitches in different zones under the VPC associated with the enhanced VPN VPC-connected instance to implement zone-level disaster recovery for IPsec-VPN connections.</li>
     * <li>For regions that support only one zone, zone-level disaster recovery is not supported. Specify two different vSwitches in the same zone to achieve high availability for IPsec-VPN connections. You can also specify the same vSwitch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0wiz7obm0tbimu4r****</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>The type of the enhanced VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>Enhanced.SiteToSite</strong>: enhanced site-to-cloud VPN that covers only IPsec functionality.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced.SiteToSite</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The name of the enhanced VPN gateway. The default value is the ID of the enhanced VPN gateway.</p>
     * <p>The name must be 2 to 100 characters in length. It cannot start with http:// or https://. It must start with an uppercase or lowercase letter and can contain uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.). Other special characters are not supported.</p>
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
     * <p>The region ID of the enhanced VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the enhanced VPN gateway belongs.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group IDs.</li>
     * <li>If you do not specify a resource group ID, the enhanced VPN gateway belongs to the default resource group after it is created.</li>
     * <li>After the enhanced VPN gateway is created, if you create IPsec-VPN connections under the enhanced VPN gateway (IPsec-VPN connections bound to the enhanced VPN gateway), these resources belong to the same resource group as the enhanced VPN gateway and cannot be modified independently. If you change the resource group of the enhanced VPN gateway, the resource group of the preceding resources is also changed.</li>
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
     * <p>The vSwitch associated with the enhanced VPN gateway instance.</p>
     * <ul>
     * <li>You must specify a vSwitch and also specify the <strong>DisasterRecoveryVSwitchId</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j5miw2bae9s2vt****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the enhanced VPN gateway belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ub1yt9cvakoelj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The type of the enhanced VPN gateway. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): standard.</li>
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
