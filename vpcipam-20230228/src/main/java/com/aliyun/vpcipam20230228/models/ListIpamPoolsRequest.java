// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolsRequest extends TeaModel {
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IpamPoolIds")
    public java.util.List<String> ipamPoolIds;

    @NameInMap("IpamPoolName")
    public String ipamPoolName;

    @NameInMap("IpamScopeId")
    public String ipamScopeId;

    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    @NameInMap("IsShared")
    public Boolean isShared;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolRegionId")
    public String poolRegionId;

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

    @NameInMap("SourceIpamPoolId")
    public String sourceIpamPoolId;

    @NameInMap("Tags")
    public java.util.List<ListIpamPoolsRequestTags> tags;

    public static ListIpamPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolsRequest self = new ListIpamPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolsRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public ListIpamPoolsRequest setIpamPoolIds(java.util.List<String> ipamPoolIds) {
        this.ipamPoolIds = ipamPoolIds;
        return this;
    }
    public java.util.List<String> getIpamPoolIds() {
        return this.ipamPoolIds;
    }

    public ListIpamPoolsRequest setIpamPoolName(String ipamPoolName) {
        this.ipamPoolName = ipamPoolName;
        return this;
    }
    public String getIpamPoolName() {
        return this.ipamPoolName;
    }

    public ListIpamPoolsRequest setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
        return this;
    }
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    public ListIpamPoolsRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public ListIpamPoolsRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public ListIpamPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamPoolsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListIpamPoolsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListIpamPoolsRequest setPoolRegionId(String poolRegionId) {
        this.poolRegionId = poolRegionId;
        return this;
    }
    public String getPoolRegionId() {
        return this.poolRegionId;
    }

    public ListIpamPoolsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpamPoolsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpamPoolsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListIpamPoolsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListIpamPoolsRequest setSourceIpamPoolId(String sourceIpamPoolId) {
        this.sourceIpamPoolId = sourceIpamPoolId;
        return this;
    }
    public String getSourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }

    public ListIpamPoolsRequest setTags(java.util.List<ListIpamPoolsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIpamPoolsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListIpamPoolsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListIpamPoolsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamPoolsRequestTags self = new ListIpamPoolsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIpamPoolsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamPoolsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
