// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that indicates the position of the returned data. If this parameter is not returned, it indicates that all data has been queried.</p>
     * 
     * <strong>example:</strong>
     * <p>84</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("QuotaDimensions")
    public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensions> quotaDimensions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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

    public static class ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension on which the target quota dimension depends.</p>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension on which the target quota dimension depends.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions self = new ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions();
            return TeaModel.build(map, self);
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail extends TeaModel {
        /**
         * <p>The quota dimensions on which the target quota dimension depends.</p>
         */
        @NameInMap("DependentDimensions")
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions> dependentDimensions;

        /**
         * <p>The name of the quota dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the quota dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail self = new ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail();
            return TeaModel.build(map, self);
        }

        public ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail setDependentDimensions(java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions> dependentDimensions) {
            this.dependentDimensions = dependentDimensions;
            return this;
        }
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetailDependentDimensions> getDependentDimensions() {
            return this.dependentDimensions;
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
        /**
         * <p>The quota dimensions on which the target quota dimension depends.</p>
         */
        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        /**
         * <p>The key of the quota dimension. Valid values:</p>
         * <ul>
         * <li><p>regionId: the region ID.</p>
         * </li>
         * <li><p>zoneId: the zone ID.</p>
         * </li>
         * <li><p>chargeType: the billing method.</p>
         * </li>
         * <li><p>networkType: the network type.</p>
         * </li>
         * <li><p>resourceType: the resource type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zoneId</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The details of the quota dimension value.</p>
         */
        @NameInMap("DimensionValueDetail")
        public java.util.List<ListProductQuotaDimensionsResponseBodyQuotaDimensionsDimensionValueDetail> dimensionValueDetail;

        /**
         * <p>The list of quota dimension values.</p>
         */
        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        /**
         * <p>The name of the quota dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>Zone</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the quota dimension is required when you query quota dimensions. Valid values:</p>
         * <ul>
         * <li><p>true: The quota dimension is required.</p>
         * </li>
         * <li><p>false: The quota dimension is optional.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
