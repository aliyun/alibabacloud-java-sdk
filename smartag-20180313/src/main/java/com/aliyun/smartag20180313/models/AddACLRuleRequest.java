// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleRequest extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0n*****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The description of the ACL rule.</p>
     * <p>The description must be 1 to <strong>512</strong> characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * <p>For example: 192.168.10.0/24.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * <p>Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Use the format 1/200 or 80/80. A value of -1/-1 means all ports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1/200</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    /**
     * <p>The direction of traffic to which the ACL rule applies. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound. Traffic from an external network to the local branch where the SAG instance is deployed.</li>
     * <li><strong>out</strong>: outbound. Traffic from the local branch where the SAG instance is deployed to an external network.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>A list of application group IDs. The ACL rule matches traffic of the specified application groups.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196754.html">ListDpiGroups</a>. You can specify up to <strong>10</strong> application group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DpiGroupIds")
    public java.util.List<String> dpiGroupIds;

    /**
     * <p>A list of application IDs. The ACL rule matches traffic of the specified applications.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196630.html">ListDpiSignatures</a>. You can specify up to <strong>10</strong> application IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DpiSignatureIds")
    public java.util.List<String> dpiSignatureIds;

    /**
     * <p>The protocol to which the ACL rule applies.</p>
     * <p>For a list of supported protocols, see the console. The protocol is not case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the ACL rule.</p>
     * <p>The name must be 2 to 100 characters in length, start with a letter, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The authorization policy of the ACL rule. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows access.</li>
     * <li><strong>drop</strong>: denies access.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The priority of the ACL rule.</p>
     * <p>A smaller value indicates a higher priority. If multiple rules have the same priority, the rule that is first delivered to the Smart Access Gateway device takes precedence.</p>
     * <p>Valid values: 1 to <strong>100</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the region where the access control list (ACL) is located.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source CIDR block.</p>
     * <p>For example: 192.168.1.0/24.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.20.0/24</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * <p>Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>Use the format 1/200 or 80/80. A value of -1/-1 means all ports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1/200</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The type of the ACL rule. Valid values:</p>
     * <ul>
     * <li><strong>LAN</strong>: (Default) private network. The ACL rule controls traffic on private networks.</li>
     * <li><strong>WAN</strong>: public network. The ACL rule controls traffic on public networks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LAN</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddACLRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddACLRuleRequest self = new AddACLRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddACLRuleRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddACLRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddACLRuleRequest setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public AddACLRuleRequest setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public AddACLRuleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AddACLRuleRequest setDpiGroupIds(java.util.List<String> dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public AddACLRuleRequest setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public AddACLRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AddACLRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddACLRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddACLRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddACLRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AddACLRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddACLRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddACLRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddACLRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddACLRuleRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public AddACLRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AddACLRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
