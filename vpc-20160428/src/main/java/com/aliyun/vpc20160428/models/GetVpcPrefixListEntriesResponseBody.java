// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListEntriesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PrefixListEntry")
    public java.util.List<GetVpcPrefixListEntriesResponseBodyPrefixListEntry> prefixListEntry;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetVpcPrefixListEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPrefixListEntriesResponseBody self = new GetVpcPrefixListEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcPrefixListEntriesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetVpcPrefixListEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetVpcPrefixListEntriesResponseBody setPrefixListEntry(java.util.List<GetVpcPrefixListEntriesResponseBodyPrefixListEntry> prefixListEntry) {
        this.prefixListEntry = prefixListEntry;
        return this;
    }
    public java.util.List<GetVpcPrefixListEntriesResponseBodyPrefixListEntry> getPrefixListEntry() {
        return this.prefixListEntry;
    }

    public GetVpcPrefixListEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcPrefixListEntriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetVpcPrefixListEntriesResponseBodyPrefixListEntry extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Description")
        public String description;

        @NameInMap("PrefixListId")
        public String prefixListId;

        public static GetVpcPrefixListEntriesResponseBodyPrefixListEntry build(java.util.Map<String, ?> map) throws Exception {
            GetVpcPrefixListEntriesResponseBodyPrefixListEntry self = new GetVpcPrefixListEntriesResponseBodyPrefixListEntry();
            return TeaModel.build(map, self);
        }

        public GetVpcPrefixListEntriesResponseBodyPrefixListEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetVpcPrefixListEntriesResponseBodyPrefixListEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVpcPrefixListEntriesResponseBodyPrefixListEntry setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

    }

}
