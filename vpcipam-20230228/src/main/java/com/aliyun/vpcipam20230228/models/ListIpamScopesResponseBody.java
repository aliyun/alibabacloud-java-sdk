// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamScopesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The IPAM scopes.</p>
     */
    @NameInMap("IpamScopes")
    public java.util.List<ListIpamScopesResponseBodyIpamScopes> ipamScopes;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8859C501-97E7-53D4-B94B-2A9E16003B22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamScopesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamScopesResponseBody self = new ListIpamScopesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamScopesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamScopesResponseBody setIpamScopes(java.util.List<ListIpamScopesResponseBodyIpamScopes> ipamScopes) {
        this.ipamScopes = ipamScopes;
        return this;
    }
    public java.util.List<ListIpamScopesResponseBodyIpamScopes> getIpamScopes() {
        return this.ipamScopes;
    }

    public ListIpamScopesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamScopesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamScopesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamScopesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamScopesResponseBodyIpamScopesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpamScopesResponseBodyIpamScopesTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamScopesResponseBodyIpamScopesTags self = new ListIpamScopesResponseBodyIpamScopesTags();
            return TeaModel.build(map, self);
        }

        public ListIpamScopesResponseBodyIpamScopesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamScopesResponseBodyIpamScopesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamScopesResponseBodyIpamScopes extends TeaModel {
        /**
         * <p>The time when the IPAM scope was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T03:12:37Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <p>The description of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamScopeDescription")
        public String ipamScopeDescription;

        /**
         * <p>The ID of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        /**
         * <p>The name of the IPAM scope.</p>
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
         * <p>Indicates whether the scope is the default scope. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The Alibaba Cloud account that owns the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The number of pools in the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PoolCount")
        public Integer poolCount;

        /**
         * <p>The region ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the IPAM scope. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIpamScopesResponseBodyIpamScopesTags> tags;

        public static ListIpamScopesResponseBodyIpamScopes build(java.util.Map<String, ?> map) throws Exception {
            ListIpamScopesResponseBodyIpamScopes self = new ListIpamScopesResponseBodyIpamScopes();
            return TeaModel.build(map, self);
        }

        public ListIpamScopesResponseBodyIpamScopes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeDescription(String ipamScopeDescription) {
            this.ipamScopeDescription = ipamScopeDescription;
            return this;
        }
        public String getIpamScopeDescription() {
            return this.ipamScopeDescription;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeId(String ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeName(String ipamScopeName) {
            this.ipamScopeName = ipamScopeName;
            return this;
        }
        public String getIpamScopeName() {
            return this.ipamScopeName;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeType(String ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public String getIpamScopeType() {
            return this.ipamScopeType;
        }

        public ListIpamScopesResponseBodyIpamScopes setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListIpamScopesResponseBodyIpamScopes setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamScopesResponseBodyIpamScopes setPoolCount(Integer poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Integer getPoolCount() {
            return this.poolCount;
        }

        public ListIpamScopesResponseBodyIpamScopes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamScopesResponseBodyIpamScopes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamScopesResponseBodyIpamScopes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpamScopesResponseBodyIpamScopes setTags(java.util.List<ListIpamScopesResponseBodyIpamScopesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamScopesResponseBodyIpamScopesTags> getTags() {
            return this.tags;
        }

    }

}
