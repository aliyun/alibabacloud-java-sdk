// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeShrinkRequest extends TeaModel {
    /**
     * <p>The description of the NAT gateway that you want to modify.</p>
     * <p>The description must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The EIP attach mode of the NAT gateway. Valid values: Leave this parameter empty or set it to <strong>NAT</strong>, which indicates the standard EIP mode.</p>
     * <blockquote>
     * <ul>
     * <li>You can only change the mode from <strong>MULTI_BINDED</strong> to <strong>NAT</strong>. You cannot change the mode from <strong>NAT</strong> to <strong>MULTI_BINDED</strong>. For more information about the <strong>MULTI_BINDED</strong> mode, see <a href="https://help.aliyun.com/document_detail/120219.html">CreateNatGateway</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>During the EIP attach mode switch procedure, network connectivity may experience a transient connection that lasts for a few seconds (the duration of the transient connection increases with the number of EIPs. Currently, configuration changes are supported only for NAT gateways with up to five EIPs attached). We recommend that you execute the switch operation during off-peak hours.</li>
     * <li>After the EIP attach mode is changed to <strong>NAT</strong>, the Internet NAT gateway becomes compatible with the IPv4 gateway. However, attaching a public EIP consumes a private IP address from the vSwitch where the NAT gateway resides. Ensure that the vSwitch has sufficient private IP addresses. If no idle private IP address is available in the vSwitch, you cannot attach new EIPs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAT</p>
     */
    @NameInMap("EipBindMode")
    public String eipBindMode;

    /**
     * <p>Specifies whether to enable the session log feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The session log feature is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: The session log feature is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSessionLog")
    public Boolean enableSessionLog;

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
     * <p>The IPv6 configuration.</p>
     */
    @NameInMap("Ipv6Config")
    public String ipv6ConfigShrink;

    /**
     * <p>The session log configuration.</p>
     */
    @NameInMap("LogDelivery")
    public String logDeliveryShrink;

    /**
     * <p>The name of the NAT gateway that you want to modify.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nat123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-2ze0dcn4mq31qx2jc****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the NAT gateway that you want to modify. </p>
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

    public static ModifyNatGatewayAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeShrinkRequest self = new ModifyNatGatewayAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayAttributeShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNatGatewayAttributeShrinkRequest setEipBindMode(String eipBindMode) {
        this.eipBindMode = eipBindMode;
        return this;
    }
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    public ModifyNatGatewayAttributeShrinkRequest setEnableSessionLog(Boolean enableSessionLog) {
        this.enableSessionLog = enableSessionLog;
        return this;
    }
    public Boolean getEnableSessionLog() {
        return this.enableSessionLog;
    }

    public ModifyNatGatewayAttributeShrinkRequest setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
        return this;
    }
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public ModifyNatGatewayAttributeShrinkRequest setIpv6ConfigShrink(String ipv6ConfigShrink) {
        this.ipv6ConfigShrink = ipv6ConfigShrink;
        return this;
    }
    public String getIpv6ConfigShrink() {
        return this.ipv6ConfigShrink;
    }

    public ModifyNatGatewayAttributeShrinkRequest setLogDeliveryShrink(String logDeliveryShrink) {
        this.logDeliveryShrink = logDeliveryShrink;
        return this;
    }
    public String getLogDeliveryShrink() {
        return this.logDeliveryShrink;
    }

    public ModifyNatGatewayAttributeShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyNatGatewayAttributeShrinkRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatGatewayAttributeShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNatGatewayAttributeShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNatGatewayAttributeShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatGatewayAttributeShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNatGatewayAttributeShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
