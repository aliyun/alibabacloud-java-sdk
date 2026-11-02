// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayShrinkRequest extends TeaModel {
    /**
     * <p>The access mode for reverse access to the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>MULTI_BINDED</p>
     */
    @NameInMap("AccessMode")
    public String accessModeShrink;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * <blockquote>
     * <p>Notice:  This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The disaster recovery type of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>CrossAZ</strong>: cross-zone disaster recovery.</li>
     * <li><strong>SingleAZ</strong>: single-zone disaster recovery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CrossAZ</p>
     */
    @NameInMap("AvailabilityMode")
    public String availabilityMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the NAT gateway.</p>
     * <p>The description can be left empty or be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testnat</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The EIP binding mode of the NAT gateway. Valid values:</p>
     * <ul>
     * <li><strong>MULTI_BINDED</strong> (default): multi-EIP NIC-visible mode.</li>
     * <li><strong>NAT</strong>: NAT mode, which is compatible with IPv4 gateways.<blockquote>
     * <p>When the EIP binding mode of the NAT gateway is set to NAT mode, the EIP occupies a private IP address of the vSwitch to which the NAT gateway belongs. Make sure that the vSwitch has sufficient private IP addresses. If the vSwitch to which the NAT gateway belongs does not have available idle private IP addresses, you cannot bind new EIPs. When the EIP binding mode of the NAT gateway is set to NAT mode, the NAT gateway supports a maximum of 50 EIPs.</p>
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
     * <li><strong>true</strong> (default): enables ICMP echo reply.</li>
     * <li><strong>false</strong>: disables ICMP echo reply.</li>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/48126.html">Internet NAT gateway billing</a> and <a href="https://help.aliyun.com/document_detail/270913.html">VPC NAT gateway billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the NAT gateway. Set the value to <strong>PayByLcu</strong>, which specifies pay-by-LCU.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByLcu</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP prefix CIDR block that is used to create NAT IP addresses in batches. Use an unallocated reserved CIDR block in the vSwitch to which the NAT gateway belongs.</p>
     * <blockquote>
     * <p>This parameter takes effect only for VPC NAT gateways.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/28</p>
     */
    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    /**
     * <p>The name of the NAT gateway.</p>
     * <p>The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character, and can contain digits, underscores (_), and hyphens (-).</p>
     * <p>If you do not specify this parameter, the system generates a default name for the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>fortest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private IP address that is allocated to the NAT gateway. Use an unallocated IP address in the vSwitch CIDR block of the NAT gateway. If this parameter is left empty, an IP address is randomly allocated.</p>
     * <blockquote>
     * <p>This parameter takes effect only for VPC NAT gateways.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.2</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The type of the NAT gateway. Set the value to <strong>Enhanced</strong>, which specifies an enhanced NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Enhanced</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The type of the NAT gateway that you want to create. Valid values:</p>
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
     * <p>Subscription Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Specifies whether to enable PrivateLink. Valid values:</p>
     * <ul>
     * <li><p>true: enables PrivateLink.</p>
     * </li>
     * <li><p>false (default): disables PrivateLink.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
     * <li><strong>false</strong> (default): disables the firewall feature.<blockquote>
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
     * <p>Subscription Internet NAT gateways are no longer available for purchase. This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid parameter</p>
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
    public java.util.List<CreateNatGatewayShrinkRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the NAT gateway belongs.</p>
     * <p>When you create a NAT gateway, you must specify the vSwitch to which the NAT gateway belongs. The system allocates an idle private IP address from the vSwitch to the NAT gateway.</p>
     * <ul>
     * <li><p>If you want to create a NAT gateway in an existing vSwitch, make sure that the zone to which the vSwitch belongs supports NAT gateways and the vSwitch has available IP addresses.</p>
     * </li>
     * <li><p>If you have not created a vSwitch, create a vSwitch in a zone that supports NAT gateways, and then specify the vSwitch to which the NAT gateway belongs.</p>
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
     * <p>The ID of the VPC where you want to create the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1di7uewzmtvfuq8****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateNatGatewayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayShrinkRequest self = new CreateNatGatewayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayShrinkRequest setAccessModeShrink(String accessModeShrink) {
        this.accessModeShrink = accessModeShrink;
        return this;
    }
    public String getAccessModeShrink() {
        return this.accessModeShrink;
    }

    public CreateNatGatewayShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNatGatewayShrinkRequest setAvailabilityMode(String availabilityMode) {
        this.availabilityMode = availabilityMode;
        return this;
    }
    public String getAvailabilityMode() {
        return this.availabilityMode;
    }

    public CreateNatGatewayShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNatGatewayShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNatGatewayShrinkRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateNatGatewayShrinkRequest setEipBindMode(String eipBindMode) {
        this.eipBindMode = eipBindMode;
        return this;
    }
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    public CreateNatGatewayShrinkRequest setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
        return this;
    }
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public CreateNatGatewayShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateNatGatewayShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateNatGatewayShrinkRequest setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public CreateNatGatewayShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNatGatewayShrinkRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatGatewayShrinkRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public CreateNatGatewayShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateNatGatewayShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNatGatewayShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNatGatewayShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateNatGatewayShrinkRequest setPrivateLinkEnabled(Boolean privateLinkEnabled) {
        this.privateLinkEnabled = privateLinkEnabled;
        return this;
    }
    public Boolean getPrivateLinkEnabled() {
        return this.privateLinkEnabled;
    }

    public CreateNatGatewayShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNatGatewayShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNatGatewayShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    @Deprecated
    public CreateNatGatewayShrinkRequest setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
        this.securityProtectionEnabled = securityProtectionEnabled;
        return this;
    }
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    public CreateNatGatewayShrinkRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateNatGatewayShrinkRequest setTag(java.util.List<CreateNatGatewayShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNatGatewayShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateNatGatewayShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNatGatewayShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateNatGatewayShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can use the Tag.N.Key format when you call API operations. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can use the Tag.N.Value format when you call API operations. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNatGatewayShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayShrinkRequestTag self = new CreateNatGatewayShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNatGatewayShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
