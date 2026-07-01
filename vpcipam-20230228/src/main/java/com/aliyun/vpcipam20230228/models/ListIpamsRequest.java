// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamsRequest extends TeaModel {
    @NameInMap("IpamIds")
    public java.util.List<String> ipamIds;

    @NameInMap("IpamName")
    public String ipamName;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tags")
    public java.util.List<ListIpamsRequestTags> tags;

    public static ListIpamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpamsRequest self = new ListIpamsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpamsRequest setIpamIds(java.util.List<String> ipamIds) {
        this.ipamIds = ipamIds;
        return this;
    }
    public java.util.List<String> getIpamIds() {
        return this.ipamIds;
    }

    public ListIpamsRequest setIpamName(String ipamName) {
        this.ipamName = ipamName;
        return this;
    }
    public String getIpamName() {
        return this.ipamName;
    }

    public ListIpamsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListIpamsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListIpamsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpamsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpamsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListIpamsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListIpamsRequest setTags(java.util.List<ListIpamsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIpamsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListIpamsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListIpamsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamsRequestTags self = new ListIpamsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIpamsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
