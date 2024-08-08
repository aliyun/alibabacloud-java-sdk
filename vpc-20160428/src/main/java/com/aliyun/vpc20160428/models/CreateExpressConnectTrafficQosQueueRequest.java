// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosQueueRequest extends TeaModel {
    /**
     * <p>The percentage of bandwidth allocated to the QoS queue.</p>
     * <ul>
     * <li>If QueueType is set to <strong>Medium</strong>, this parameter is required. Valid values: 1 to 100.</li>
     * <li>If QueueType is set to <strong>Default</strong>, a value of - is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BandwidthPercent")
    public String bandwidthPercent;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
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
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The description of the QoS queue.</p>
     * <p>It must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueDescription")
    public String queueDescription;

    /**
     * <p>The name of the QoS queue.</p>
     * <p>It must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The priority of the QoS queue. Valid values:</p>
     * <ul>
     * <li><strong>High</strong></li>
     * <li><strong>Medium</strong></li>
     * <li><strong>Default</strong>: default queue.</li>
     * </ul>
     * <blockquote>
     * <p>You cannot create a QoS queue of the default priority.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("QueueType")
    public String queueType;

    /**
     * <p>The region ID of the QoS policy.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static CreateExpressConnectTrafficQosQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosQueueRequest self = new CreateExpressConnectTrafficQosQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosQueueRequest setBandwidthPercent(String bandwidthPercent) {
        this.bandwidthPercent = bandwidthPercent;
        return this;
    }
    public String getBandwidthPercent() {
        return this.bandwidthPercent;
    }

    public CreateExpressConnectTrafficQosQueueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectTrafficQosQueueRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateExpressConnectTrafficQosQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateExpressConnectTrafficQosQueueRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosQueueRequest setQueueDescription(String queueDescription) {
        this.queueDescription = queueDescription;
        return this;
    }
    public String getQueueDescription() {
        return this.queueDescription;
    }

    public CreateExpressConnectTrafficQosQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateExpressConnectTrafficQosQueueRequest setQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }
    public String getQueueType() {
        return this.queueType;
    }

    public CreateExpressConnectTrafficQosQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExpressConnectTrafficQosQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
