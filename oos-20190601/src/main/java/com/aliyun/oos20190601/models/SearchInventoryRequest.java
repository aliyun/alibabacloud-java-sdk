// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SearchInventoryRequest extends TeaModel {
    /**
     * <p>The information about aggregators. You can use one or more aggregators to query the aggregate information of an instance. Valid values:</p>
     * <br>
     * <p>*   ACS:Application.Name</p>
     * <p>*   ACS:Application.Version</p>
     */
    @NameInMap("Aggregator")
    public java.util.List<String> aggregator;

    /**
     * <p>The filter rules for the component.</p>
     */
    @NameInMap("Filter")
    public java.util.List<SearchInventoryRequestFilter> filter;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SearchInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryRequest self = new SearchInventoryRequest();
        return TeaModel.build(map, self);
    }

    public SearchInventoryRequest setAggregator(java.util.List<String> aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public java.util.List<String> getAggregator() {
        return this.aggregator;
    }

    public SearchInventoryRequest setFilter(java.util.List<SearchInventoryRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<SearchInventoryRequestFilter> getFilter() {
        return this.filter;
    }

    public SearchInventoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchInventoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchInventoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SearchInventoryRequestFilter extends TeaModel {
        /**
         * <p>The name of the component property. Valid values of N: 1 to 5. Different components have different property names. You can call the [GetInventorySchema](https://api.aliyun.com/#/?product=oos\&version=2019-06-01\&api=GetInventorySchema) operation to query the property names of different components. For example, the ACS:InstanceInformation component has the InstanceId property. Therefore, you can set this parameter to ACS:InstanceInformation.InstanceId.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The comparison operator that is used to filter property values. Valid values of N: 1 to 5. Valid values:</p>
         * <br>
         * <p>*   Equal</p>
         * <p>*   NotEqual</p>
         * <p>*   BeginWith</p>
         * <p>*   LessThan</p>
         * <p>*   GreaterThan</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The property values to query.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static SearchInventoryRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchInventoryRequestFilter self = new SearchInventoryRequestFilter();
            return TeaModel.build(map, self);
        }

        public SearchInventoryRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchInventoryRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SearchInventoryRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
