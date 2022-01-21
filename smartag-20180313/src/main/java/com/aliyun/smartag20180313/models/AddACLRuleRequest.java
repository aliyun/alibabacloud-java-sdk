// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleRequest extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestCidr")
    public String destCidr;

    @NameInMap("DestPortRange")
    public String destPortRange;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("DpiGroupIds")
    public java.util.List<String> dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public java.util.List<String> dpiSignatureIds;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

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
