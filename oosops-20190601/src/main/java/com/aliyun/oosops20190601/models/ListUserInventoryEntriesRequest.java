// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInventoryEntriesRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("Filter")
    public java.util.List<ListUserInventoryEntriesRequestFilter> filter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TypeName")
    public String typeName;

    public static ListUserInventoryEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserInventoryEntriesRequest self = new ListUserInventoryEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserInventoryEntriesRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ListUserInventoryEntriesRequest setFilter(java.util.List<ListUserInventoryEntriesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListUserInventoryEntriesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListUserInventoryEntriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserInventoryEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserInventoryEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserInventoryEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserInventoryEntriesRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public static class ListUserInventoryEntriesRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListUserInventoryEntriesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListUserInventoryEntriesRequestFilter self = new ListUserInventoryEntriesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListUserInventoryEntriesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserInventoryEntriesRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListUserInventoryEntriesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
