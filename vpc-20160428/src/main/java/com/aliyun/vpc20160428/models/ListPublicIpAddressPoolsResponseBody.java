// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** is returned, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of IP address pools.</p>
     */
    @NameInMap("PublicIpAddressPoolList")
    public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> publicIpAddressPoolList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The time when the IP address pool was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the IP address pool.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the IP address pool has idle IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("IpAddressRemaining")
        public Boolean ipAddressRemaining;

        /**
         * <p>The line type.</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines</p>
         * <br>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).</p>
         * <br>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values is returned:</p>
         * <br>
         * <p>*   **ChinaTelecom**: China Telecom</p>
         * <p>*   **ChinaUnicom**: China Unicom</p>
         * <p>*   **ChinaMobile**: China Mobile</p>
         * <p>*   **ChinaTelecom_L2**: China Telecom L2</p>
         * <p>*   **ChinaUnicom_L2**: China Unicom L2</p>
         * <p>*   **ChinaMobile_L2**: China Mobile L2</p>
         * <br>
         * <p>If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the IP address pool.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account to which the IP address pool belongs.</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the IP address pool.</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The region ID of the IP address pool.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the IP address pool belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the IP address pool is shared.</p>
         * <br>
         * <p>*   **Shared**: The IP address pool is shared.</p>
         * <p>*   An empty value indicates that the IP address pool is not shared.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The status of the IP address pool. Valid values:</p>
         * <br>
         * <p>*   **Created**: The IP address pool is available.</p>
         * <p>*   **Deleting**: The IP address pool is being deleted.</p>
         * <p>*   **Modifying**: The IP address pool is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags;

        /**
         * <p>The total number of IP addresses in the public IP address pool.</p>
         */
        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        /**
         * <p>The number of occupied IP addresses in the public IP address pool.</p>
         */
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
