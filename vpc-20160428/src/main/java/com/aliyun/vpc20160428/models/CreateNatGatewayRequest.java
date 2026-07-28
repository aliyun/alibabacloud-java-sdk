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
     * <p>Subscription-based Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>无效参数</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AvailabilityMode")
    public String availabilityMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the NAT gateway.</p>
     * <p>The description can be empty or 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testnat</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Subscription-based Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>无效参数</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The EIP binding pattern of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>MULTI_BINDED</strong> (default): multi-EIP network interface controller (NIC)-visible pattern.</li>
     * <li><strong>NAT</strong>: EIP normal pattern, compatible with IPv4 gateways.<blockquote>
     * <p>When the EIP binding pattern of the NAT gateway is set to EIP normal pattern, each EIP occupies a private IP address in the vSwitch to which the NAT gateway belongs. Make sure that the vSwitch has sufficient private IP addresses. If no idle private IP addresses are available in the vSwitch, new EIPs cannot be attached. In EIP normal pattern, a maximum of 50 EIPs can be attached to the NAT gateway.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("EipBindMode")
    public String eipBindMode;

    /**
     * <p>Specifies whether to enable ICMP echo reply. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IcmpReplyEnabled")
    public Boolean icmpReplyEnabled;

    /**
     * <p>The billing method of the NAT gateway. Valid values:</p>
     * <p><strong>PostPaid</strong> (default): pay-as-you-go.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/48126.html">Billing of Internet NAT gateways</a> and <a href="https://help.aliyun.com/document_detail/270913.html">Billing of VPC NAT gateways</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the NAT gateway. Valid values: <strong>PayByLcu</strong>: pay-by-data-transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByLcu</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP prefix CIDR block used to create NAT IP addresses in batches. Specify an unassigned reserved CIDR block from the vSwitch to which the NAT gateway belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/28</p>
     */
    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    /**
     * <p>The name of the NAT gateway.</p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * <p>If you do not specify this parameter, the system assigns a default name to the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>fortest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP address occupied by the NAT gateway. Specify an unallocated IP address from the vSwitch CIDR block to which the NAT gateway belongs. If this parameter is left empty, a random IP address is allocated.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.2</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The type of the NAT gateway. Valid values: <strong>Enhanced</strong>: enhanced NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of NAT gateway to create. Valid values:</p>
     * <ul>
     * <li><p><strong>internet</strong>: Internet NAT gateway.</p>
     * </li>
     * <li><p><strong>intranet</strong>: VPC NAT gateway.</p>
     * </li>
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
     * <p>Subscription-based Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>无效参数</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Specifies whether to enable PrivateLink. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false (default): Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateLinkEnabled")
    public Boolean privateLinkEnabled;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <li><strong>false</strong> (default): Disabled.<blockquote>
     * <p>Notice:  This parameter is deprecated.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    @Deprecated
    public Boolean securityProtectionEnabled;

    /**
     * <p>Subscription-based Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>无效参数</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNatGatewayRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the NAT gateway belongs.</p>
     * <p>When you create a NAT gateway, you must specify the vSwitch to which the NAT gateway belongs. The system allocates an available private IP address from the vSwitch to the NAT gateway.</p>
     * <ul>
     * <li><p>To create a NAT gateway in an existing vSwitch, make sure that the zone to which the vSwitch belongs supports NAT gateways and the vSwitch has active IP addresses.</p>
     * </li>
     * <li><p>If you have not created a vSwitch, create a vSwitch in a zone that supports NAT gateways first, and then specify the vSwitch for the NAT gateway.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/182292.html">ListEnhanhcedNatGatewayAvailableZones</a> operation to query the zones that support NAT gateways, and call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query the available IP address count in a vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e3se98n9fq8hle****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC in which you want to create the NAT gateway.</p>
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

    public CreateNatGatewayRequest setAvailabilityMode(String availabilityMode) {
        this.availabilityMode = availabilityMode;
        return this;
    }
    public String getAvailabilityMode() {
        return this.availabilityMode;
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
         * <p>The access mode. Valid values:</p>
         * <ul>
         * <li><p><strong>route</strong>: route mode.</p>
         * </li>
         * <li><p><strong>tunnel</strong>: tunnel mode.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When this field is specified, the <strong>PrivateLinkEnabled</strong> field must be set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>route</p>
         */
        @NameInMap("ModeValue")
        public String modeValue;

        /**
         * <p>The tunnel mode type. Valid values:</p>
         * <ul>
         * <li><strong>geneve</strong>: Geneve type.</li>
         * </ul>
         * <blockquote>
         * <p>This value takes effect only when the access mode is tunnel mode.</p>
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
         * <p>The tag key. Specify this parameter in the Tag.N.Key format. N is the index of the tag, with valid values from 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Specify this parameter in the Tag.N.Value format. N is the index of the tag, with valid values from 1 to 20. The tag value cannot be an empty string. The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
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
