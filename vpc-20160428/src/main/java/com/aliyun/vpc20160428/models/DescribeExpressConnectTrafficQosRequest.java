// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QosIdList")
    public java.util.List<String> qosIdList;

    @NameInMap("QosNameList")
    public java.util.List<String> qosNameList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DescribeExpressConnectTrafficQosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosRequest self = new DescribeExpressConnectTrafficQosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectTrafficQosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectTrafficQosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectTrafficQosRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeExpressConnectTrafficQosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeExpressConnectTrafficQosRequest setQosIdList(java.util.List<String> qosIdList) {
        this.qosIdList = qosIdList;
        return this;
    }
    public java.util.List<String> getQosIdList() {
        return this.qosIdList;
    }

    public DescribeExpressConnectTrafficQosRequest setQosNameList(java.util.List<String> qosNameList) {
        this.qosNameList = qosNameList;
        return this;
    }
    public java.util.List<String> getQosNameList() {
        return this.qosNameList;
    }

    public DescribeExpressConnectTrafficQosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExpressConnectTrafficQosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
