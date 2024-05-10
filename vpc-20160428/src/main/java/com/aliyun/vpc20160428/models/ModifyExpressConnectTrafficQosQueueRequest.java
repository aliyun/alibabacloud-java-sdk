// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosQueueRequest extends TeaModel {
    @NameInMap("BandwidthPercent")
    public String bandwidthPercent;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QueueDescription")
    public String queueDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>This parameter is required.</p>
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
