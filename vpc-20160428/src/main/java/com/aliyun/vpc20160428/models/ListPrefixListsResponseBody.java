// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPrefixListsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value indicates the token that is used for the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the prefix lists.</p>
     */
    @NameInMap("PrefixLists")
    public java.util.List<ListPrefixListsResponseBodyPrefixLists> prefixLists;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DF72F7BB-5DFA-529C-887E-B0BB70D89C4F</p>
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

    public static ListPrefixListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrefixListsResponseBody self = new ListPrefixListsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrefixListsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListPrefixListsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrefixListsResponseBody setPrefixLists(java.util.List<ListPrefixListsResponseBodyPrefixLists> prefixLists) {
        this.prefixLists = prefixLists;
        return this;
    }
    public java.util.List<ListPrefixListsResponseBodyPrefixLists> getPrefixLists() {
        return this.prefixLists;
    }

    public ListPrefixListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrefixListsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPrefixListsResponseBodyPrefixListsTags extends TeaModel {
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

        public static ListPrefixListsResponseBodyPrefixListsTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrefixListsResponseBodyPrefixListsTags self = new ListPrefixListsResponseBodyPrefixListsTags();
            return TeaModel.build(map, self);
        }

        public ListPrefixListsResponseBodyPrefixListsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrefixListsResponseBodyPrefixListsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrefixListsResponseBodyPrefixLists extends TeaModel {
        /**
         * <p>The CIDR block specified in the prefix list.</p>
         */
        @NameInMap("CidrBlocks")
        public java.util.List<String> cidrBlocks;

        /**
         * <p>The time when the prefix list was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T14:22:32Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The IP version of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>IPV4</strong></li>
         * <li><strong>IPV6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The maximum number of CIDR blocks that you can specify in the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxEntries")
        public Integer maxEntries;

        /**
         * <p>The Alibaba Cloud account to which the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The description of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>Created with oss service by system.</p>
         */
        @NameInMap("PrefixListDescription")
        public String prefixListDescription;

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-m5estsqsdqwg88hjf****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The name of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PrefixListName")
        public String prefixListName;

        /**
         * <p>The status of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>Modifying</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is the same as the <strong>Status</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("PrefixListStatus")
        public String prefixListStatus;

        /**
         * <p>The type of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PrefixListType")
        public String prefixListType;

        /**
         * <p>The region ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the prefix list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the prefix list is shared. Valid values:</p>
         * <ul>
         * <li><strong>Shared</strong>: The prefix list is shared.</li>
         * <li>If an empty value is returned, the prefix list is not shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The status of the prefix list. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>Modifying</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPrefixListsResponseBodyPrefixListsTags> tags;

        public static ListPrefixListsResponseBodyPrefixLists build(java.util.Map<String, ?> map) throws Exception {
            ListPrefixListsResponseBodyPrefixLists self = new ListPrefixListsResponseBodyPrefixLists();
            return TeaModel.build(map, self);
        }

        public ListPrefixListsResponseBodyPrefixLists setCidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public java.util.List<String> getCidrBlocks() {
            return this.cidrBlocks;
        }

        public ListPrefixListsResponseBodyPrefixLists setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListPrefixListsResponseBodyPrefixLists setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListPrefixListsResponseBodyPrefixLists setMaxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        public ListPrefixListsResponseBodyPrefixLists setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListPrefixListsResponseBodyPrefixLists setPrefixListDescription(String prefixListDescription) {
            this.prefixListDescription = prefixListDescription;
            return this;
        }
        public String getPrefixListDescription() {
            return this.prefixListDescription;
        }

        public ListPrefixListsResponseBodyPrefixLists setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public ListPrefixListsResponseBodyPrefixLists setPrefixListName(String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }
        public String getPrefixListName() {
            return this.prefixListName;
        }

        public ListPrefixListsResponseBodyPrefixLists setPrefixListStatus(String prefixListStatus) {
            this.prefixListStatus = prefixListStatus;
            return this;
        }
        public String getPrefixListStatus() {
            return this.prefixListStatus;
        }

        public ListPrefixListsResponseBodyPrefixLists setPrefixListType(String prefixListType) {
            this.prefixListType = prefixListType;
            return this;
        }
        public String getPrefixListType() {
            return this.prefixListType;
        }

        public ListPrefixListsResponseBodyPrefixLists setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrefixListsResponseBodyPrefixLists setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPrefixListsResponseBodyPrefixLists setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPrefixListsResponseBodyPrefixLists setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrefixListsResponseBodyPrefixLists setTags(java.util.List<ListPrefixListsResponseBodyPrefixListsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrefixListsResponseBodyPrefixListsTags> getTags() {
            return this.tags;
        }

    }

}
