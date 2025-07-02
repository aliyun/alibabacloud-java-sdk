// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveriesRequest extends TeaModel {
    /**
     * <p>The IDs of resource discovery instances. Valid values of N: 1 to 100. A maximum of 100 resource discoveries can be queried at a time.</p>
     */
    @NameInMap("IpamResourceDiscoveryIds")
    public java.util.List<String> ipamResourceDiscoveryIds;

    /**
     * <p>The name of the resource discovery.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamResourceDiscoveryName")
    public String ipamResourceDiscoveryName;

    /**
     * <p>Whether it is a shared resource discovery.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The maximum number of entries on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, it indicates the token that is used for the next query.</li>
     * </ul>
     * 
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
     * <p>The ID of the region where you want to query resource discovery. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group that resource discovery belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2sermdd6****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListIpamResourceDiscoveriesRequestTags> tags;

    /**
     * <p>The type of resource discovery.</p>
     * <blockquote>
     * <p>Supported types:</p>
     * <ul>
     * <li>system: default resource discovery created by the system.</li>
     * <li>custom: custom resource discovery created by users.</li>
     * </ul>
     * </blockquote>
     * 
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
         * <p>The key of the tag. You can specify at most 20 tag keys. It cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The tag key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify at most 20 tag values. The tag value cannot be an empty string.</p>
         * <p>A tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
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
