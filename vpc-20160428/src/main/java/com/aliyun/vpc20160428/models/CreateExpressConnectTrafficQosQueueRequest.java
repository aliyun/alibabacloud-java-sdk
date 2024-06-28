// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosQueueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BandwidthPercent")
    public String bandwidthPercent;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueDescription")
    public String queueDescription;

    /**
     * <strong>example:</strong>
     * <p>qos-queue-test</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("QueueType")
    public String queueType;

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
