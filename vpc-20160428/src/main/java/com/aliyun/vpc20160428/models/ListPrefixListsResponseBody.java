// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPrefixListsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrefixLists")
    public java.util.List<ListPrefixListsResponseBodyPrefixLists> prefixLists;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class ListPrefixListsResponseBodyPrefixLists extends TeaModel {
        @NameInMap("CidrBlocks")
        public java.util.List<String> cidrBlocks;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("MaxEntries")
        public Integer maxEntries;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("PrefixListDescription")
        public String prefixListDescription;

        @NameInMap("PrefixListId")
        public String prefixListId;

        @NameInMap("PrefixListName")
        public String prefixListName;

        @NameInMap("PrefixListStatus")
        public String prefixListStatus;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Status")
        public String status;

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

    }

}
