// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends. An empty value indicates that all data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about quota dimensions.</p>
     */
    @NameInMap("QuotaDimensions")
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that are returned for the query.</p>
     */
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
        /**
         * <p>The name of the quota dimension value.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quota dimension value.</p>
         */
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

        /**
         * <p>The key of the quota dimension. Valid values:</p>
         * <br>
         * <p>*   regionId: the region ID.</p>
         * <p>*   zoneId: the zone ID.</p>
         * <p>*   chargeType: the billing method.</p>
         * <p>*   networkType: the network type.</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The details of the quota dimension value.</p>
         */
        @NameInMap("DimensionValueDetail")
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail> dimensionValueDetail;

        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        /**
         * <p>The name of the quota dimension.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the quota dimension is required when you query quota dimensions. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
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
