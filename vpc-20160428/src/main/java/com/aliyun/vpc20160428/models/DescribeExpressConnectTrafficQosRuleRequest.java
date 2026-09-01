// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
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
     * <p>The QoS policy ID returned by the CreateExpressConnectTrafficQos operation.</p>
     * <blockquote>
     * <p>This parameter is required. If you do not specify this parameter, the service returns IllegalParam.QosId (400).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The QoS queue ID returned by the CreateExpressConnectTrafficQosQueue operation.</p>
     * <blockquote>
     * <p>This parameter is required. If you do not specify this parameter, the service returns IllegalParam.QueueId (400).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rc****</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>The region ID of the QoS policy.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The list of QoS rule IDs.</p>
     */
    @NameInMap("RuleIdList")
    public java.util.List<String> ruleIdList;

    /**
     * <p>The list of QoS rule names.</p>
     */
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
