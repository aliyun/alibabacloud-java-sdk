// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of entries.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next queries are sent.</p>
     * <p>*   If **NextToken** is not empty, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the prefix list.</p>
     */
    @NameInMap("PrefixListEntry")
    public java.util.List<GetVpcPrefixListEntriesResponseBodyPrefixListEntry> prefixListEntry;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The CIDR blocks specified in the prefix list.</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the prefix list.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the prefix list.</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The region ID of the prefix list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

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

        public GetVpcPrefixListEntriesResponseBodyPrefixListEntry setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
