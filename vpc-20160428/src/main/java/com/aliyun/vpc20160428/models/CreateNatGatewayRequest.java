// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayRequest extends TeaModel {
    /**
     * <p>The access mode for reverse access to the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("AccessMode")
    public CreateNatGatewayRequestAccessMode accessMode;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the NAT gateway.</p>
     * <p>You can leave this parameter empty or enter a description. If you enter a description, the description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testnat</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The mode in which the EIP is associated with the NAT gateway. Valid values:</p>
     * <ul>
     * <li><p><strong>MULTI_BINDED</strong>(default): the multi-EIP-to-ENI mode.</p>
     * </li>
     * <li><p><strong>NAT</strong>: NAT mode, which is compatible with IPv4 addresses.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If an EIP is associated with a NAT gateway in NAT mode, the EIP occupies a private IP address of the vSwitch where the NAT gateway is deployed. Make sure that the vSwitch has sufficient private IP addresses. Otherwise, EIPs cannot be associated with the NAT gateway. In NAT mode, a maximum number of 50 EIPs can be associated with each NAT gateway.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("EipBindMode")
    public String eipBindMode;

    /**
     * <p>Specifies whether to enable ICMP retrieval. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IcmpReplyEnabled")
    public Boolean icmpReplyEnabled;

    /**
     * <p>The billing method of the NAT gateway.</p>
     * <p>Set the value to <strong>PostPaid</strong> (pay-as-you-go), which is the default value.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/48126.html">Internet NAT gateway billing</a> and <a href="https://help.aliyun.com/document_detail/270913.html">VPC NAT gateway billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the NAT gateway. Set the value to <strong>PayByLcu</strong>, which specifies the pay-by-CU metering method.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByLcu</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Create an IP prefix address segment for batch creation of NAT IPs. Please use the reserved and unallocated network segments in the VSwitch where the NAT is located.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/28</p>
     */
    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    /**
     * <p>The name of the NAT gateway.</p>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <p>If this parameter is not set, the system assigns a default name to the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>fortest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP address occupied by the NAT gateway. Please use an unassigned IP from the subnet where the NAT is located. If left empty, an IP address will be randomly assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.x</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The type of NAT gateway. Set the value to <strong>Enhanced</strong>, which specifies enhanced NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The network type of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: Internet</li>
     * <li><strong>intranet</strong>: VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>PrivateLink is not supported by default. If you set the value to true, PrivateLink is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateLinkEnabled")
    public Boolean privateLinkEnabled;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable the firewall feature. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)&gt;Notice: This parameter is deprecated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    @Deprecated
    public Boolean securityProtectionEnabled;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNatGatewayRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the NAT gateway is attached.</p>
     * <p>When you create a NAT gateway, you must specify a vSwitch for the NAT gateway. Then, the system assigns an idle private IP address from the vSwitch to the NAT gateway.</p>
     * <ul>
     * <li>To attach the NAT gateway to an existing vSwitch, make sure that the zone to which the vSwitch belongs supports NAT gateways. In addition, the vSwitch must have idle IP addresses.</li>
     * <li>If no vSwitch exists in the VPC, create a vSwitch in a zone that supports NAT gateways. Then, specify the vSwitch for the NAT gateway.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/182292.html">ListEnhanhcedNatGatewayAvailableZones</a> operation to query zones that support NAT gateways. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query idle IP addresses in a vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e3se98n9fq8hle****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC where you want to create the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1di7uewzmtvfuq8****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayRequest self = new CreateNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayRequest setAccessMode(CreateNatGatewayRequestAccessMode accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public CreateNatGatewayRequestAccessMode getAccessMode() {
        return this.accessMode;
    }

    public CreateNatGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNatGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNatGatewayRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateNatGatewayRequest setEipBindMode(String eipBindMode) {
        this.eipBindMode = eipBindMode;
        return this;
    }
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    public CreateNatGatewayRequest setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
        return this;
    }
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public CreateNatGatewayRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateNatGatewayRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateNatGatewayRequest setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public CreateNatGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNatGatewayRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatGatewayRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public CreateNatGatewayRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateNatGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNatGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNatGatewayRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateNatGatewayRequest setPrivateLinkEnabled(Boolean privateLinkEnabled) {
        this.privateLinkEnabled = privateLinkEnabled;
        return this;
    }
    public Boolean getPrivateLinkEnabled() {
        return this.privateLinkEnabled;
    }

    public CreateNatGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNatGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    @Deprecated
    public CreateNatGatewayRequest setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
        this.securityProtectionEnabled = securityProtectionEnabled;
        return this;
    }
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    public CreateNatGatewayRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateNatGatewayRequest setTag(java.util.List<CreateNatGatewayRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNatGatewayRequestTag> getTag() {
        return this.tag;
    }

    public CreateNatGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNatGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateNatGatewayRequestAccessMode extends TeaModel {
        /**
         * <p>Access mode. Valid values:</p>
         * <ul>
         * <li><p><strong>route</strong>: route mode</p>
         * </li>
         * <li><p><strong>tunnel</strong>: tunnel mode</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is specified, you must set <strong>PrivateLinkEnabled</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>route</p>
         */
        @NameInMap("ModeValue")
        public String modeValue;

        /**
         * <p>Tunnel mode type:</p>
         * <ul>
         * <li><strong>geneve</strong>: Geneve type</li>
         * </ul>
         * <blockquote>
         * <p>This value takes effect if the access mode is the tunnel mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>geneve</p>
         */
        @NameInMap("TunnelType")
        public String tunnelType;

        public static CreateNatGatewayRequestAccessMode build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayRequestAccessMode self = new CreateNatGatewayRequestAccessMode();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayRequestAccessMode setModeValue(String modeValue) {
            this.modeValue = modeValue;
            return this;
        }
        public String getModeValue() {
            return this.modeValue;
        }

        public CreateNatGatewayRequestAccessMode setTunnelType(String tunnelType) {
            this.tunnelType = tunnelType;
            return this;
        }
        public String getTunnelType() {
            return this.tunnelType;
        }

    }

    public static class CreateNatGatewayRequestTag extends TeaModel {
        /**
         * <p>The tag key. The format of Tag.N.Key when you call the operation. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The format of Tag.N.Value when you call the operation. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNatGatewayRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayRequestTag self = new CreateNatGatewayRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNatGatewayRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
