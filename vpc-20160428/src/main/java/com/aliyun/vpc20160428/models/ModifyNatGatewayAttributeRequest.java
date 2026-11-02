// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeRequest extends TeaModel {
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
     * <p>The EIP attach pattern of the NAT gateway. Valid values: You can leave this parameter empty. If you specify a value, only <strong>NAT</strong> is allowed, which indicates the standard EIP attach pattern.</p>
     * <blockquote>
     * <ul>
     * <li>You can only change the pattern from <strong>MULTI_BINDED</strong> to <strong>NAT</strong>. You cannot change the pattern from <strong>NAT</strong> to <strong>MULTI_BINDED</strong>. For more information about the <strong>MULTI_BINDED</strong> pattern, see <a href="https://help.aliyun.com/document_detail/120219.html">CreateNatGateway</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>During the EIP attach pattern switchover procedure, network connectivity may experience a transient connection at the second level (the duration of the transient connection increases with the number of EIPs. Currently, configuration changes are supported for NAT gateways with up to five EIPs attached), so execute the switchover operation during off-peak hours.</li>
     * <li>After the EIP attach pattern is changed to <strong>NAT</strong>, the Internet NAT gateway becomes compatible with the IPv4 gateway. However, when you attach a public EIP, a private IP address in the vSwitch where the NAT gateway resides is occupied. Ensure that the vSwitch has sufficient private IP addresses. If no available private IP address exists in the vSwitch, you cannot attach a new EIP.</li>
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
     * <li><p><strong>true</strong>: enables the session log feature.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the session log feature.</p>
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
     * <p>The session log configuration.</p>
     */
    @NameInMap("LogDelivery")
    public ModifyNatGatewayAttributeRequestLogDelivery logDelivery;

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

    public static ModifyNatGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeRequest self = new ModifyNatGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNatGatewayAttributeRequest setEipBindMode(String eipBindMode) {
        this.eipBindMode = eipBindMode;
        return this;
    }
    public String getEipBindMode() {
        return this.eipBindMode;
    }

    public ModifyNatGatewayAttributeRequest setEnableSessionLog(Boolean enableSessionLog) {
        this.enableSessionLog = enableSessionLog;
        return this;
    }
    public Boolean getEnableSessionLog() {
        return this.enableSessionLog;
    }

    public ModifyNatGatewayAttributeRequest setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
        this.icmpReplyEnabled = icmpReplyEnabled;
        return this;
    }
    public Boolean getIcmpReplyEnabled() {
        return this.icmpReplyEnabled;
    }

    public ModifyNatGatewayAttributeRequest setLogDelivery(ModifyNatGatewayAttributeRequestLogDelivery logDelivery) {
        this.logDelivery = logDelivery;
        return this;
    }
    public ModifyNatGatewayAttributeRequestLogDelivery getLogDelivery() {
        return this.logDelivery;
    }

    public ModifyNatGatewayAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyNatGatewayAttributeRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatGatewayAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNatGatewayAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNatGatewayAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatGatewayAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNatGatewayAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyNatGatewayAttributeRequestLogDelivery extends TeaModel {
        /**
         * <p>The session log delivery type. Valid values: <strong>sls</strong>, which indicates Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("LogDeliveryType")
        public String logDeliveryType;

        /**
         * <p>The session log delivery destination. Valid values: acs:log:${regionName}:${projectOwnerAliUid}:project/${projectName}/logstore/${logstoreName}.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou:0000:project/nat_session_log_project/logstore/session_log_test</p>
         */
        @NameInMap("LogDestination")
        public String logDestination;

        public static ModifyNatGatewayAttributeRequestLogDelivery build(java.util.Map<String, ?> map) throws Exception {
            ModifyNatGatewayAttributeRequestLogDelivery self = new ModifyNatGatewayAttributeRequestLogDelivery();
            return TeaModel.build(map, self);
        }

        public ModifyNatGatewayAttributeRequestLogDelivery setLogDeliveryType(String logDeliveryType) {
            this.logDeliveryType = logDeliveryType;
            return this;
        }
        public String getLogDeliveryType() {
            return this.logDeliveryType;
        }

        public ModifyNatGatewayAttributeRequestLogDelivery setLogDestination(String logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public String getLogDestination() {
            return this.logDestination;
        }

    }

}
