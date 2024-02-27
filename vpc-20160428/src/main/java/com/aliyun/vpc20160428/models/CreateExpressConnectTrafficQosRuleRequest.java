// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DstCidr")
    public String dstCidr;

    @NameInMap("DstIPv6Cidr")
    public String dstIPv6Cidr;

    @NameInMap("DstPortRange")
    public String dstPortRange;

    @NameInMap("MatchDscp")
    public Integer matchDscp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemarkingDscp")
    public Integer remarkingDscp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RuleDescription")
    public String ruleDescription;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SrcCidr")
    public String srcCidr;

    @NameInMap("SrcIPv6Cidr")
    public String srcIPv6Cidr;

    @NameInMap("SrcPortRange")
    public String srcPortRange;

    public static CreateExpressConnectTrafficQosRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosRuleRequest self = new CreateExpressConnectTrafficQosRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstCidr(String dstCidr) {
        this.dstCidr = dstCidr;
        return this;
    }
    public String getDstCidr() {
        return this.dstCidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstIPv6Cidr(String dstIPv6Cidr) {
        this.dstIPv6Cidr = dstIPv6Cidr;
        return this;
    }
    public String getDstIPv6Cidr() {
        return this.dstIPv6Cidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstPortRange(String dstPortRange) {
        this.dstPortRange = dstPortRange;
        return this;
    }
    public String getDstPortRange() {
        return this.dstPortRange;
    }

    public CreateExpressConnectTrafficQosRuleRequest setMatchDscp(Integer matchDscp) {
        this.matchDscp = matchDscp;
        return this;
    }
    public Integer getMatchDscp() {
        return this.matchDscp;
    }

    public CreateExpressConnectTrafficQosRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateExpressConnectTrafficQosRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateExpressConnectTrafficQosRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateExpressConnectTrafficQosRuleRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRemarkingDscp(Integer remarkingDscp) {
        this.remarkingDscp = remarkingDscp;
        return this;
    }
    public Integer getRemarkingDscp() {
        return this.remarkingDscp;
    }

    public CreateExpressConnectTrafficQosRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcCidr(String srcCidr) {
        this.srcCidr = srcCidr;
        return this;
    }
    public String getSrcCidr() {
        return this.srcCidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcIPv6Cidr(String srcIPv6Cidr) {
        this.srcIPv6Cidr = srcIPv6Cidr;
        return this;
    }
    public String getSrcIPv6Cidr() {
        return this.srcIPv6Cidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcPortRange(String srcPortRange) {
        this.srcPortRange = srcPortRange;
        return this;
    }
    public String getSrcPortRange() {
        return this.srcPortRange;
    }

}
