// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamScopesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    @NameInMap("IpamScopeIds")
    public java.util.List<String> ipamScopeIds;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamScopeName")
    public String ipamScopeName;

    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("IpamScopeType")
    public String ipamScopeType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

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
    public java.util.List<ListIpamScopesRequestTags> tags;

    public static ListIpamScopesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpamScopesRequest self = new ListIpamScopesRequest();
        return TeaModel.build(map, self);
    }

    public ListIpamScopesRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public ListIpamScopesRequest setIpamScopeIds(java.util.List<String> ipamScopeIds) {
        this.ipamScopeIds = ipamScopeIds;
        return this;
    }
    public java.util.List<String> getIpamScopeIds() {
        return this.ipamScopeIds;
    }

    public ListIpamScopesRequest setIpamScopeName(String ipamScopeName) {
        this.ipamScopeName = ipamScopeName;
        return this;
    }
    public String getIpamScopeName() {
        return this.ipamScopeName;
    }

    public ListIpamScopesRequest setIpamScopeType(String ipamScopeType) {
        this.ipamScopeType = ipamScopeType;
        return this;
    }
    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    public ListIpamScopesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamScopesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamScopesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListIpamScopesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListIpamScopesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpamScopesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpamScopesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListIpamScopesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListIpamScopesRequest setTags(java.util.List<ListIpamScopesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIpamScopesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListIpamScopesRequestTags extends TeaModel {
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

        public static ListIpamScopesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamScopesRequestTags self = new ListIpamScopesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIpamScopesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamScopesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
