// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInventoryEntriesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Filter")
    public java.util.List<ListInventoryEntriesRequestFilter> filter;

    public static ListInventoryEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryEntriesRequest self = new ListInventoryEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListInventoryEntriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInventoryEntriesRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
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

    public ListInventoryEntriesRequest setFilter(java.util.List<ListInventoryEntriesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListInventoryEntriesRequestFilter> getFilter() {
        return this.filter;
    }

    public static class ListInventoryEntriesRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Name")
        public String name;

        public static ListInventoryEntriesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListInventoryEntriesRequestFilter self = new ListInventoryEntriesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListInventoryEntriesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListInventoryEntriesRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListInventoryEntriesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
