// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    @NameInMap("QuotaDimensions")
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListProductQuotaDimensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotaDimensionsResponseBody self = new ListProductQuotaDimensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductQuotaDimensionsResponseBody setQuotaDimensions(java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public ListProductQuotaDimensionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListProductQuotaDimensionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductQuotaDimensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductQuotaDimensionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListProductQuotaDimensionsResponseBodyQuotaDimensions extends TeaModel {
        @NameInMap("Requisite")
        public Boolean requisite;

        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        @NameInMap("Name")
        public String name;

        public static ListProductQuotaDimensionsResponseBodyQuotaDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotaDimensionsResponseBodyQuotaDimensions self = new ListProductQuotaDimensionsResponseBodyQuotaDimensions();
            return TeaModel.build(map, self);
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setRequisite(Boolean requisite) {
            this.requisite = requisite;
            return this;
        }
        public Boolean getRequisite() {
            return this.requisite;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDependentDimensions(java.util.List<String> dependentDimensions) {
            this.dependentDimensions = dependentDimensions;
            return this;
        }
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDimensionValues(java.util.List<String> dimensionValues) {
            this.dimensionValues = dimensionValues;
            return this;
        }
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
