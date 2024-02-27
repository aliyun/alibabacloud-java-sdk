// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosQueueRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QueueIdList")
    public java.util.List<String> queueIdList;

    @NameInMap("QueueNameList")
    public java.util.List<String> queueNameList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DescribeExpressConnectTrafficQosQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosQueueRequest self = new DescribeExpressConnectTrafficQosQueueRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosQueueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setQueueIdList(java.util.List<String> queueIdList) {
        this.queueIdList = queueIdList;
        return this;
    }
    public java.util.List<String> getQueueIdList() {
        return this.queueIdList;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setQueueNameList(java.util.List<String> queueNameList) {
        this.queueNameList = queueNameList;
        return this;
    }
    public java.util.List<String> getQueueNameList() {
        return this.queueNameList;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExpressConnectTrafficQosQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
