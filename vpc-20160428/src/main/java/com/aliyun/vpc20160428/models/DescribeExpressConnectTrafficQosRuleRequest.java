// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RuleIdList")
    public java.util.List<String> ruleIdList;

    @NameInMap("RuleNameList")
    public java.util.List<String> ruleNameList;

    public static DescribeExpressConnectTrafficQosRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosRuleRequest self = new DescribeExpressConnectTrafficQosRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setRuleIdList(java.util.List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }
    public java.util.List<String> getRuleIdList() {
        return this.ruleIdList;
    }

    public DescribeExpressConnectTrafficQosRuleRequest setRuleNameList(java.util.List<String> ruleNameList) {
        this.ruleNameList = ruleNameList;
        return this;
    }
    public java.util.List<String> getRuleNameList() {
        return this.ruleNameList;
    }

}
