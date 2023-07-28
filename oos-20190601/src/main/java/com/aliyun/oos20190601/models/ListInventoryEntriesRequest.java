// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInventoryEntriesRequest extends TeaModel {
    /**
     * <p>The filter rules for the component.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListInventoryEntriesRequestFilter> filter;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the component. Valid values:</p>
     * <br>
     * <p>*   ACS:InstanceInformation</p>
     * <p>*   ACS:Application</p>
     * <p>*   ACS:File</p>
     * <p>*   ACS:Network</p>
     * <p>*   ACS:WindowsRole</p>
     * <p>*   ACS:Service</p>
     * <p>*   ACS:WindowsRegistry</p>
     * <p>*   ACS:WindowsUpdate</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    public static ListInventoryEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryEntriesRequest self = new ListInventoryEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListInventoryEntriesRequest setFilter(java.util.List<ListInventoryEntriesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListInventoryEntriesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListInventoryEntriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInventoryEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInventoryEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInventoryEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInventoryEntriesRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public static class ListInventoryEntriesRequestFilter extends TeaModel {
        /**
         * <p>The name of the component property. Valid values of N: 1 to 5.</p>
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
         * <p>The values of properties. Valid values of the first N: 1 to 5. Valid values of the second N: 1 to 20.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListInventoryEntriesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListInventoryEntriesRequestFilter self = new ListInventoryEntriesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListInventoryEntriesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInventoryEntriesRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListInventoryEntriesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
