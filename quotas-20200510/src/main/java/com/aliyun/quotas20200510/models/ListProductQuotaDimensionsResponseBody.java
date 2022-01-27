// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QuotaDimensions")
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductQuotaDimensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductQuotaDimensionsResponseBody self = new ListProductQuotaDimensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductQuotaDimensionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductQuotaDimensionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductQuotaDimensionsResponseBody setQuotaDimensions(java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    public ListProductQuotaDimensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductQuotaDimensionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail self = new ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail();
            return TeaModel.build(map, self);
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProductQuotaDimensionsResponseBodyQuotaDimensions extends TeaModel {
        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValueDetail")
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail> dimensionValueDetail;

        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        @NameInMap("Name")
        public String name;

        @NameInMap("Requisite")
        public Boolean requisite;

        public static ListProductQuotaDimensionsResponseBodyQuotaDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotaDimensionsResponseBodyQuotaDimensions self = new ListProductQuotaDimensionsResponseBodyQuotaDimensions();
            return TeaModel.build(map, self);
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDependentDimensions(java.util.List<String> dependentDimensions) {
            this.dependentDimensions = dependentDimensions;
            return this;
        }
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setDimensionValueDetail(java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail> dimensionValueDetail) {
            this.dimensionValueDetail = dimensionValueDetail;
            return this;
        }
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
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

        public ListProductQuotaDimensionsResponseBodyQuotaDimensions setRequisite(Boolean requisite) {
            this.requisite = requisite;
            return this;
        }
        public Boolean getRequisite() {
            return this.requisite;
        }

    }

}
