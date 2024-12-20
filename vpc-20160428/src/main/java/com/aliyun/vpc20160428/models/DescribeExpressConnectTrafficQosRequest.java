// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("Tags")
    public java.util.List<DescribeExpressConnectTrafficQosRequestTags> tags;

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

    public DescribeExpressConnectTrafficQosRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeExpressConnectTrafficQosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeExpressConnectTrafficQosRequest setTags(java.util.List<DescribeExpressConnectTrafficQosRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeExpressConnectTrafficQosRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeExpressConnectTrafficQosRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectTrafficQosRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosRequestTags self = new DescribeExpressConnectTrafficQosRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectTrafficQosRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
