// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterRuleAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("DestinationPortRange")
    public String destinationPortRange;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleAction")
    public String ruleAction;

    @NameInMap("SourceCidrBlock")
    public String sourceCidrBlock;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    @NameInMap("TrafficMirrorFilterRuleId")
    public String trafficMirrorFilterRuleId;

    public static UpdateTrafficMirrorFilterRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterRuleAttributeRequest self = new UpdateTrafficMirrorFilterRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }
    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }
    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
        return this;
    }
    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

}
