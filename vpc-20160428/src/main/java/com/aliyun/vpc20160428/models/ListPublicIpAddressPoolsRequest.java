// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PublicIpAddressPoolIds")
    public java.util.List<String> publicIpAddressPoolIds;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<ListPublicIpAddressPoolsRequestTags> tags;

    public static ListPublicIpAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolsRequest self = new ListPublicIpAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListPublicIpAddressPoolsRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public ListPublicIpAddressPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicIpAddressPoolsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPublicIpAddressPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicIpAddressPoolsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListPublicIpAddressPoolsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPublicIpAddressPoolsRequest setPublicIpAddressPoolIds(java.util.List<String> publicIpAddressPoolIds) {
        this.publicIpAddressPoolIds = publicIpAddressPoolIds;
        return this;
    }
    public java.util.List<String> getPublicIpAddressPoolIds() {
        return this.publicIpAddressPoolIds;
    }

    public ListPublicIpAddressPoolsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPublicIpAddressPoolsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPublicIpAddressPoolsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListPublicIpAddressPoolsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListPublicIpAddressPoolsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPublicIpAddressPoolsRequest setTags(java.util.List<ListPublicIpAddressPoolsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPublicIpAddressPoolsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListPublicIpAddressPoolsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListPublicIpAddressPoolsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsRequestTags self = new ListPublicIpAddressPoolsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPublicIpAddressPoolsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
