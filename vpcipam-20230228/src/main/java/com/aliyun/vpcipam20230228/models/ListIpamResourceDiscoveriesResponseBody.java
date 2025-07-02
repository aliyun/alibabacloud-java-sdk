// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveriesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of resource discovery instances.</p>
     */
    @NameInMap("IpamResourceDiscoveries")
    public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries> ipamResourceDiscoveries;

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

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86137597-443F-5B66-B9B6-8514E0C50B8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamResourceDiscoveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceDiscoveriesResponseBody self = new ListIpamResourceDiscoveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceDiscoveriesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpamResourceDiscoveriesResponseBody setIpamResourceDiscoveries(java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries> ipamResourceDiscoveries) {
        this.ipamResourceDiscoveries = ipamResourceDiscoveries;
        return this;
    }
    public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries> getIpamResourceDiscoveries() {
        return this.ipamResourceDiscoveries;
    }

    public ListIpamResourceDiscoveriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamResourceDiscoveriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamResourceDiscoveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamResourceDiscoveriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags extends TeaModel {
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

        public static ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags self = new ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries extends TeaModel {
        /**
         * <p>The time when the resource was discovered.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-01T02:05:23Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamResourceDiscoveryDescription")
        public String ipamResourceDiscoveryDescription;

        /**
         * <p>The ID of resource discovery instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

        /**
         * <p>The name of the resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpamResourceDiscoveryName")
        public String ipamResourceDiscoveryName;

        /**
         * <p>The status of the resource discovery instance. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("IpamResourceDiscoveryStatus")
        public String ipamResourceDiscoveryStatus;

        /**
         * <p>The list of resource discovery regions.</p>
         */
        @NameInMap("OperatingRegionList")
        public java.util.List<String> operatingRegionList;

        /**
         * <p>The Alibaba Cloud account that owns the resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the queried resource discovery instance.</p>
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

        /**
         * <p>The sharing status of the resource.</p>
         * <ul>
         * <li>If the value is empty, the resource is as an average instance.</li>
         * <li>If the value is Shared, the resource discovery comes from a shared source.</li>
         * <li>If the value is Sharing, the resource discovery is being shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags> tags;

        /**
         * <p>The type of resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries build(java.util.Map<String, ?> map) throws Exception {
            ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries self = new ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries();
            return TeaModel.build(map, self);
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setIpamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
            this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
            return this;
        }
        public String getIpamResourceDiscoveryDescription() {
            return this.ipamResourceDiscoveryDescription;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setIpamResourceDiscoveryName(String ipamResourceDiscoveryName) {
            this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
            return this;
        }
        public String getIpamResourceDiscoveryName() {
            return this.ipamResourceDiscoveryName;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setIpamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
            this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
            return this;
        }
        public String getIpamResourceDiscoveryStatus() {
            return this.ipamResourceDiscoveryStatus;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setOperatingRegionList(java.util.List<String> operatingRegionList) {
            this.operatingRegionList = operatingRegionList;
            return this;
        }
        public java.util.List<String> getOperatingRegionList() {
            return this.operatingRegionList;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setTags(java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags> getTags() {
            return this.tags;
        }

        public ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
