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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cpoxxxwxxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the component. Valid values:</p>
     * <ul>
     * <li>ACS:InstanceInformation</li>
     * <li>ACS:Application</li>
     * <li>ACS:File</li>
     * <li>ACS:Network</li>
     * <li>ACS:WindowsRole</li>
     * <li>ACS:Service</li>
     * <li>ACS:WindowsRegistry</li>
     * <li>ACS:WindowsUpdate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS:InstanceInformation</p>
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
         * 
         * <strong>example:</strong>
         * <p>PlatformName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The comparison operator that is used to filter property values. Valid values of N: 1 to 5. Valid values:</p>
         * <ul>
         * <li>Equal</li>
         * <li>NotEqual</li>
         * <li>BeginWith</li>
         * <li>LessThan</li>
         * <li>GreaterThan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The values of properties. Valid values of the first N: 1 to 5. Valid values of the second N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
