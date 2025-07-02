// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamScopesRequest extends TeaModel {
    /**
     * <p>The ID of the IPAM.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <p>The IDs of IPAM scopes.</p>
     */
    @NameInMap("IpamScopeIds")
    public java.util.List<String> ipamScopeIds;

    /**
     * <p>The name of the IPAM scope.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamScopeName")
    public String ipamScopeName;

    /**
     * <p>The type of the IPAM scope. Valid values:</p>
     * <ul>
     * <li><strong>public</strong></li>
     * <li><strong>private</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("IpamScopeType")
    public String ipamScopeType;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
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
     * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID of the IPAM scope.</p>
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
     * <p>The tag list.</p>
     */
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
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The tag key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It cannot start with a <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
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
