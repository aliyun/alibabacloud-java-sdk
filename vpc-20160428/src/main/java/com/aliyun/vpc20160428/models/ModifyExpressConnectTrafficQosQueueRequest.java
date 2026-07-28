// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosQueueRequest extends TeaModel {
    /**
     * <p>The bandwidth percentage of the QoS queue.</p>
     * <ul>
     * <li>If the QoS queue type is <strong>Medium</strong>, this parameter is required. Valid values: 1 to 100.</li>
     * <li>If the QoS queue type is <strong>Default</strong>, this parameter is set to &quot;-&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BandwidthPercent")
    public String bandwidthPercent;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
     * <p>The ID of the QoS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The description of the QoS queue.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueDescription")
    public String queueDescription;

    /**
     * <p>The ID of the QoS queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rc****</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>The name of the QoS queue.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The region ID of the QoS policy.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static ModifyExpressConnectTrafficQosQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosQueueRequest self = new ModifyExpressConnectTrafficQosQueueRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosQueueRequest setBandwidthPercent(String bandwidthPercent) {
        this.bandwidthPercent = bandwidthPercent;
        return this;
    }
    public String getBandwidthPercent() {
        return this.bandwidthPercent;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setQueueDescription(String queueDescription) {
        this.queueDescription = queueDescription;
        return this;
    }
    public String getQueueDescription() {
        return this.queueDescription;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExpressConnectTrafficQosQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
