// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2628785.html">DescribeDBInstances</a> operation to query the IDs of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp15i4hn07r******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The description of the security group rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zht_test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the transport layer protocol. Valid values:</p>
     * <ul>
     * <li>TCP</li>
     * <li>UDP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The range of destination ports over which TCP and UDP traffic is allowed in the security group rule.</p>
     * <p>Valid values: 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1/200</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/2834044.html">DescribeDBInstanceSecurityGroupRule</a> to obtain the ID of the security group rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgr-2ze17u******</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    /**
     * <p>The range of source IP addresses. CIDR blocks and IPv4 addresses are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.100</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    public static ModifyDBInstanceSecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSecurityGroupRuleRequest self = new ModifyDBInstanceSecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public ModifyDBInstanceSecurityGroupRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

}
