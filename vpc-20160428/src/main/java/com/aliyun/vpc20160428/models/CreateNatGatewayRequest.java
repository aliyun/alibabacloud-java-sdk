// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayRequest extends TeaModel {
    /**
     * <p>The type of NAT gateway. Set the value to **Enhanced** (enhanced NAT gateway).</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The billing method of the NAT gateway.</p>
     * <br>
     * <p>Set the value to **PostPaid** (pay-as-you-go), which is the default value.</p>
     * <br>
     * <p>For more information, see [Internet NAT gateway billing](~~48126~~) and [VPC NAT gateway billing](~~270913~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the vSwitch to which the NAT gateway is attached.</p>
     * <br>
     * <p>When you create a NAT gateway, you must specify a vSwitch for the NAT gateway. Then, the system assigns an idle private IP address from the vSwitch to the NAT gateway.</p>
     * <br>
     * <p>*   To attach the NAT gateway to an existing vSwitch, make sure that the zone to which the vSwitch belongs supports NAT gateways. In addition, the vSwitch must have idle IP addresses.</p>
     * <p>*   If no vSwitch exists in the VPC, create a vSwitch in a zone that supports NAT gateways. Then, specify the vSwitch for the NAT gateway.</p>
     * <br>
     * <p>>  You can query the zones that support NAT gateways by calling the [ListEnhanhcedNatGatewayAvailableZones](~~182292~~) operation. You can query the number of available IP addresses in a vSwitch by calling the [DescribeVSwitches](~~35748~~) operation.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The tag value. The format of Tag.N.Value when you call the operation. Valid values of N: 1 to 20. It cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
     */
    @NameInMap("EipBindMode")
    public String eipBindMode;

    /**
     * <p>The tag key. The format of Tag.N.Key when you call the operation. Valid values of N: 1 to 20. It cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
     */
    @NameInMap("IcmpReplyEnabled")
    public Boolean icmpReplyEnabled;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>Specifies whether to enable the firewall feature. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <p>*   **true**: yes</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically sets **ClientToken** to the value of **RequestId**. **RequestId** might be different for each API request.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **internet**: an Internet NAT gateway</p>
     * <p>*   **intranet**: a VPC NAT gateway</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>Specifies whether to enable the ICMP non-retrieval feature. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <p>*   **true**: yes</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The name of the NAT gateway.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>If this parameter is not set, the system assigns a default name to the NAT gateway.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The mode in which the EIP is associated with the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **MULTI_BINDED** (default): Multi-EIP-to-ENI mode.</p>
     * <br>
     * <p>*   **NAT**: NAT mode. IPv4 gateways are supported.</p>
     * <br>
     * <p>> If you use the NAT mode, the EIP occupies one private IP address on the vSwitch of the NAT gateway. Make sure that the vSwitch has sufficient private IP addresses. Otherwise, the NAT gateway fails to be associated with the EIP. In NAT mode, you can associate a NAT gateway with at most 50 EIPs.</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>Subscription Internet NAT gateways are no longer available for purchase. Ignore this parameter.</p>
     */
    @NameInMap("Spec")
    public String spec;

    @NameInMap("Tag")
    public java.util.List<CreateNatGatewayRequestTag> tag;

    /**
     * <p>The metering method of the NAT gateway. Set the value to **PayByLcu**, which specifies the pay-by-CU metering method.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The description of the NAT gateway.</p>
     * <br>
     * <p>You can leave this parameter empty or enter a description. If you enter a description, the description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayRequest self = new CreateNatGatewayRequest();
        return TeaModel.build(map, self);
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

    public CreateNatGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public static class CreateNatGatewayRequestTag extends TeaModel {
        /**
         * <p>The ID of the NAT gateway.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the request.</p>
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
