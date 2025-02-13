// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The IPAMs.</p>
     */
    @NameInMap("Ipams")
    public java.util.List<ListIpamsResponseBodyIpams> ipams;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>23CA0A0B-B0F5-5495-B355-7D9A9203A46B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamsResponseBody self = new ListIpamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamsResponseBody setIpams(java.util.List<ListIpamsResponseBodyIpams> ipams) {
        this.ipams = ipams;
        return this;
    }
    public java.util.List<ListIpamsResponseBodyIpams> getIpams() {
        return this.ipams;
    }

    public ListIpamsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamsResponseBodyIpamsTags extends TeaModel {
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
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpamsResponseBodyIpamsTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamsResponseBodyIpamsTags self = new ListIpamsResponseBodyIpamsTags();
            return TeaModel.build(map, self);
        }

        public ListIpamsResponseBodyIpamsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamsResponseBodyIpamsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamsResponseBodyIpams extends TeaModel {
        /**
         * <p>The time when the IPAM was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-01T02:05:23Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>ipam-res-disco-assoc-jt5fac8twugdbbgip****</p>
         */
        @NameInMap("DefaultResourceDiscoveryAssociationId")
        public String defaultResourceDiscoveryAssociationId;

        /**
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        @NameInMap("DefaultResourceDiscoveryId")
        public String defaultResourceDiscoveryId;

        /**
         * <p>The description of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamDescription")
        public String ipamDescription;

        /**
         * <p>The ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <p>The name of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpamName")
        public String ipamName;

        /**
         * <p>The status of the IPAM. Valid values:</p>
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
        @NameInMap("IpamStatus")
        public String ipamStatus;

        /**
         * <p>The effective regions of the IPAM.</p>
         */
        @NameInMap("OperatingRegionList")
        public java.util.List<String> operatingRegionList;

        /**
         * <p>The Alibaba Cloud account that owns the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The default private scope created by the system after the IPAM is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-okoerbco6unqfr****</p>
         */
        @NameInMap("PrivateDefaultScopeId")
        public String privateDefaultScopeId;

        /**
         * <p>The default public scope created by the system after the IPAM is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-ovb76p1g1m19dr****</p>
         */
        @NameInMap("PublicDefaultScopeId")
        public String publicDefaultScopeId;

        /**
         * <p>The region ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDiscoveryAssociationCount")
        public Integer resourceDiscoveryAssociationCount;

        /**
         * <p>The resource group ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2dbprgpt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of IPAM scopes. Value: <strong>2 to 5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScopeCount")
        public Integer scopeCount;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIpamsResponseBodyIpamsTags> tags;

        public static ListIpamsResponseBodyIpams build(java.util.Map<String, ?> map) throws Exception {
            ListIpamsResponseBodyIpams self = new ListIpamsResponseBodyIpams();
            return TeaModel.build(map, self);
        }

        public ListIpamsResponseBodyIpams setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamsResponseBodyIpams setDefaultResourceDiscoveryAssociationId(String defaultResourceDiscoveryAssociationId) {
            this.defaultResourceDiscoveryAssociationId = defaultResourceDiscoveryAssociationId;
            return this;
        }
        public String getDefaultResourceDiscoveryAssociationId() {
            return this.defaultResourceDiscoveryAssociationId;
        }

        public ListIpamsResponseBodyIpams setDefaultResourceDiscoveryId(String defaultResourceDiscoveryId) {
            this.defaultResourceDiscoveryId = defaultResourceDiscoveryId;
            return this;
        }
        public String getDefaultResourceDiscoveryId() {
            return this.defaultResourceDiscoveryId;
        }

        public ListIpamsResponseBodyIpams setIpamDescription(String ipamDescription) {
            this.ipamDescription = ipamDescription;
            return this;
        }
        public String getIpamDescription() {
            return this.ipamDescription;
        }

        public ListIpamsResponseBodyIpams setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamsResponseBodyIpams setIpamName(String ipamName) {
            this.ipamName = ipamName;
            return this;
        }
        public String getIpamName() {
            return this.ipamName;
        }

        public ListIpamsResponseBodyIpams setIpamStatus(String ipamStatus) {
            this.ipamStatus = ipamStatus;
            return this;
        }
        public String getIpamStatus() {
            return this.ipamStatus;
        }

        public ListIpamsResponseBodyIpams setOperatingRegionList(java.util.List<String> operatingRegionList) {
            this.operatingRegionList = operatingRegionList;
            return this;
        }
        public java.util.List<String> getOperatingRegionList() {
            return this.operatingRegionList;
        }

        public ListIpamsResponseBodyIpams setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamsResponseBodyIpams setPrivateDefaultScopeId(String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }
        public String getPrivateDefaultScopeId() {
            return this.privateDefaultScopeId;
        }

        public ListIpamsResponseBodyIpams setPublicDefaultScopeId(String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }
        public String getPublicDefaultScopeId() {
            return this.publicDefaultScopeId;
        }

        public ListIpamsResponseBodyIpams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamsResponseBodyIpams setResourceDiscoveryAssociationCount(Integer resourceDiscoveryAssociationCount) {
            this.resourceDiscoveryAssociationCount = resourceDiscoveryAssociationCount;
            return this;
        }
        public Integer getResourceDiscoveryAssociationCount() {
            return this.resourceDiscoveryAssociationCount;
        }

        public ListIpamsResponseBodyIpams setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamsResponseBodyIpams setScopeCount(Integer scopeCount) {
            this.scopeCount = scopeCount;
            return this;
        }
        public Integer getScopeCount() {
            return this.scopeCount;
        }

        public ListIpamsResponseBodyIpams setTags(java.util.List<ListIpamsResponseBodyIpamsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamsResponseBodyIpamsTags> getTags() {
            return this.tags;
        }

    }

}
