// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLRuleRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AcrId")
    public String acrId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("DestCidr")
    public String destCidr;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("DestPortRange")
    public String destPortRange;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Type")
    public String type;

    @NameInMap("Name")
    public String name;

    @NameInMap("DpiSignatureIds")
    public java.util.List<String> dpiSignatureIds;

    @NameInMap("DpiGroupIds")
    public java.util.List<String> dpiGroupIds;

    public static ModifyACLRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyACLRuleRequest self = new ModifyACLRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyACLRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyACLRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyACLRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyACLRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyACLRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyACLRuleRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ModifyACLRuleRequest setAcrId(String acrId) {
        this.acrId = acrId;
        return this;
    }
    public String getAcrId() {
        return this.acrId;
    }

    public ModifyACLRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyACLRuleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyACLRuleRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public ModifyACLRuleRequest setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public ModifyACLRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyACLRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public ModifyACLRuleRequest setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public ModifyACLRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyACLRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyACLRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyACLRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyACLRuleRequest setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public ModifyACLRuleRequest setDpiGroupIds(java.util.List<String> dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

}
