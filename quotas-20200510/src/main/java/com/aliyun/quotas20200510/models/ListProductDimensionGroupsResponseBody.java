// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductDimensionGroupsResponseBody extends TeaModel {
    /**
     * <p>The dimension groups.</p>
     */
    @NameInMap("DimensionGroups")
    public java.util.List<ListProductDimensionGroupsResponseBodyDimensionGroups> dimensionGroups;

    /**
     * <p>The maximum number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position where the returned query results end. An empty value indicates that all data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>057D210F-F2FC-5329-A536-26C16628BB09</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>The keys of the dimension group.</p>
         */
        @NameInMap("DimensionKeys")
        public java.util.List<String> dimensionKeys;

        /**
         * <p>The code of the dimension group.</p>
         * 
         * <strong>example:</strong>
         * <p>entconsole_zjzp4d****</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The name of the dimension group.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource sharing</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The code of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>entconsole</p>
         */
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
