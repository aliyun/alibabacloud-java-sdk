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

    // Id of the request
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
        // 前缀列表包含的网段
        @NameInMap("CidrBlocks")
        public java.util.List<String> cidrBlocks;

        // 创建时间
        @NameInMap("CreationTime")
        public String creationTime;

        // IpVersion
        @NameInMap("IpVersion")
        public String ipVersion;

        // 描述
        @NameInMap("PrefixListDescription")
        public String prefixListDescription;

        // 前缀列表的实例ID
        @NameInMap("PrefixListId")
        public String prefixListId;

        // 名称
        @NameInMap("PrefixListName")
        public String prefixListName;

        // 状态
        @NameInMap("PrefixListStatus")
        public String prefixListStatus;

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

    }

}
