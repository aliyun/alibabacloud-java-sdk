// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListOpsItemsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListOpsItemsRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceTags")
    public java.util.Map<String, ?> resourceTags;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static ListOpsItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpsItemsRequest self = new ListOpsItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListOpsItemsRequest setFilter(java.util.List<ListOpsItemsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListOpsItemsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListOpsItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpsItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOpsItemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOpsItemsRequest setResourceTags(java.util.Map<String, ?> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.Map<String, ?> getResourceTags() {
        return this.resourceTags;
    }

    public ListOpsItemsRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class ListOpsItemsRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListOpsItemsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListOpsItemsRequestFilter self = new ListOpsItemsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListOpsItemsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOpsItemsRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListOpsItemsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
