// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosQueueRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>The ID of the QoS queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
     */
    @NameInMap("QueueId")
    public String queueId;

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

    public static DeleteExpressConnectTrafficQosQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosQueueRequest self = new DeleteExpressConnectTrafficQosQueueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosQueueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteExpressConnectTrafficQosQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
