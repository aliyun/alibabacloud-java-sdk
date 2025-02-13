// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveriesRequest extends TeaModel {
    @NameInMap("IpamResourceDiscoveryIds")
    public java.util.List<String> ipamResourceDiscoveryIds;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamResourceDiscoveryName")
    public String ipamResourceDiscoveryName;

    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek2sermdd6****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tags")
    public java.util.List<ListIpamResourceDiscoveriesRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListIpamResourceDiscoveriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceDiscoveriesRequest self = new ListIpamResourceDiscoveriesRequest();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceDiscoveriesRequest setIpamResourceDiscoveryIds(java.util.List<String> ipamResourceDiscoveryIds) {
        this.ipamResourceDiscoveryIds = ipamResourceDiscoveryIds;
        return this;
    }
    public java.util.List<String> getIpamResourceDiscoveryIds() {
        return this.ipamResourceDiscoveryIds;
    }

    public ListIpamResourceDiscoveriesRequest setIpamResourceDiscoveryName(String ipamResourceDiscoveryName) {
        this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
        return this;
    }
    public String getIpamResourceDiscoveryName() {
        return this.ipamResourceDiscoveryName;
    }

    public ListIpamResourceDiscoveriesRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public ListIpamResourceDiscoveriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamResourceDiscoveriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamResourceDiscoveriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListIpamResourceDiscoveriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListIpamResourceDiscoveriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpamResourceDiscoveriesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpamResourceDiscoveriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListIpamResourceDiscoveriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListIpamResourceDiscoveriesRequest setTags(java.util.List<ListIpamResourceDiscoveriesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIpamResourceDiscoveriesRequestTags> getTags() {
        return this.tags;
    }

    public ListIpamResourceDiscoveriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListIpamResourceDiscoveriesRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpamResourceDiscoveriesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceDiscoveriesRequestTags self = new ListIpamResourceDiscoveriesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceDiscoveriesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamResourceDiscoveriesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
