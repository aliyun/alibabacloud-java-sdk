// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductDimensionGroupsResponseBody extends TeaModel {
    // The dimension groups.
    @NameInMap("DimensionGroups")
    public java.util.List<ListProductDimensionGroupsResponseBodyDimensionGroups> dimensionGroups;

    // The number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that marks the position at which the query ends. An empty value indicates that all data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of records that are returned for the query.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductDimensionGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductDimensionGroupsResponseBody self = new ListProductDimensionGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductDimensionGroupsResponseBody setDimensionGroups(java.util.List<ListProductDimensionGroupsResponseBodyDimensionGroups> dimensionGroups) {
        this.dimensionGroups = dimensionGroups;
        return this;
    }
    public java.util.List<ListProductDimensionGroupsResponseBodyDimensionGroups> getDimensionGroups() {
        return this.dimensionGroups;
    }

    public ListProductDimensionGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductDimensionGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductDimensionGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductDimensionGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductDimensionGroupsResponseBodyDimensionGroups extends TeaModel {
        // The keys of the dimension group.
        @NameInMap("DimensionKeys")
        public java.util.List<String> dimensionKeys;

        // The code of the dimension group.
        @NameInMap("GroupCode")
        public String groupCode;

        // The name of the dimension group.
        @NameInMap("GroupName")
        public String groupName;

        // The service code.
        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductDimensionGroupsResponseBodyDimensionGroups build(java.util.Map<String, ?> map) throws Exception {
            ListProductDimensionGroupsResponseBodyDimensionGroups self = new ListProductDimensionGroupsResponseBodyDimensionGroups();
            return TeaModel.build(map, self);
        }

        public ListProductDimensionGroupsResponseBodyDimensionGroups setDimensionKeys(java.util.List<String> dimensionKeys) {
            this.dimensionKeys = dimensionKeys;
            return this;
        }
        public java.util.List<String> getDimensionKeys() {
            return this.dimensionKeys;
        }

        public ListProductDimensionGroupsResponseBodyDimensionGroups setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public ListProductDimensionGroupsResponseBodyDimensionGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListProductDimensionGroupsResponseBodyDimensionGroups setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
