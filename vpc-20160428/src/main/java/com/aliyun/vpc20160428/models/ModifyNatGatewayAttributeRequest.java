// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeRequest extends TeaModel {
    /**
     * <p>The description of the NAT gateway.</p>
     * <p>The description must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Modifies the mode in which the EIP is associated with the NAT gateway. The value can be empty or <strong>NAT</strong>, which specifies the NAT mode.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can only change <strong>MULTI_BINDED</strong> to <strong>NAT</strong>. You cannot change <strong>NAT</strong> to <strong>MULTI_BINDED</strong>. For more information about the <strong>MULTI_BINDED</strong> mode, see <a href="https://help.aliyun.com/document_detail/120219.html">CreateNatGateway</a>.</p>
     * </li>
     * <li><p>When you change the association mode, your network may be interrupted for seconds. The duration increases with the number of EIPs. You can change the association mode for at most 5 EIPs at the same time. We recommend changing the association mode during off-peak hours.</p>
     * </li>
     * <li><p>After the association mode is changed to <strong>NAT</strong>, the Internet NAT gateway is compatible with an IPv4 gateway. If an EIP is associated with a NAT gateway in NAT mode, the EIP occupies a private IP address of the vSwitch to which the NAT gateway belongs. Ensure the vSwitch has sufficient private IP addresses for EIPs to be associated with the NAT gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAT</p>
     */
    @NameInMap("EipBindMode")
    public String eipBindMode;

    /**
     * <p>Whether to enable session logging, with values:</p>
     * <ul>
     * <li><strong>true</strong>: Session logging is enabled. </li>
     * <li><strong>false</strong>: Session logging is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSessionLog")
    public Boolean enableSessionLog;

    /**
     * <p>Specifies whether to enable the Internet Control Message Protocol (ICMP) non-retrieval feature. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IcmpReplyEnabled")
    public Boolean icmpReplyEnabled;

    /**
     * <p>Session log configuration information.</p>
     */
    @NameInMap("LogDelivery")
    public ModifyNatGatewayAttributeRequestLogDelivery logDelivery;

    /**
     * <p>The name of the NAT gateway.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nat123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the NAT gateway.</p>
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
     * <p>The region ID of the NAT gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>Session log write type. Value: <strong>sls</strong>, Alibaba Cloud Log Service SLS.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("LogDeliveryType")
        public String logDeliveryType;

        /**
         * <p>Session log write address. Value: acs:log:${regionName}:${projectOwnerAliUid}:project/${projectName}/logstore/${logstoreName}</p>
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
