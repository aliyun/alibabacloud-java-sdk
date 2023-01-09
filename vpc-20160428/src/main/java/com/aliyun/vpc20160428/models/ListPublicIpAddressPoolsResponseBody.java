// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PublicIpAddressPoolList")
    public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> publicIpAddressPoolList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicIpAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolsResponseBody self = new ListPublicIpAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicIpAddressPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicIpAddressPoolsResponseBody setPublicIpAddressPoolList(java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> publicIpAddressPoolList) {
        this.publicIpAddressPoolList = publicIpAddressPoolList;
        return this;
    }
    public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> getPublicIpAddressPoolList() {
        return this.publicIpAddressPoolList;
    }

    public ListPublicIpAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicIpAddressPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags self = new ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("IpAddressRemaining")
        public Boolean ipAddressRemaining;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags;

        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        @NameInMap("UsedIpNum")
        public Integer usedIpNum;

        public static ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList self = new ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setIpAddressRemaining(Boolean ipAddressRemaining) {
            this.ipAddressRemaining = ipAddressRemaining;
            return this;
        }
        public Boolean getIpAddressRemaining() {
            return this.ipAddressRemaining;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setTags(java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> getTags() {
            return this.tags;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setTotalIpNum(Integer totalIpNum) {
            this.totalIpNum = totalIpNum;
            return this;
        }
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setUsedIpNum(Integer usedIpNum) {
            this.usedIpNum = usedIpNum;
            return this;
        }
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

    }

}
