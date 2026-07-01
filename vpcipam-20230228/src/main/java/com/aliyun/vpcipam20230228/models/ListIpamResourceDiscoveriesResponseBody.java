// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveriesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IpamResourceDiscoveries")
    public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveries> ipamResourceDiscoveries;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IpamResourceDiscoveryDescription")
        public String ipamResourceDiscoveryDescription;

        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

        @NameInMap("IpamResourceDiscoveryName")
        public String ipamResourceDiscoveryName;

        @NameInMap("IpamResourceDiscoveryStatus")
        public String ipamResourceDiscoveryStatus;

        @NameInMap("OperatingRegionList")
        public java.util.List<String> operatingRegionList;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Tags")
        public java.util.List<ListIpamResourceDiscoveriesResponseBodyIpamResourceDiscoveriesTags> tags;

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
