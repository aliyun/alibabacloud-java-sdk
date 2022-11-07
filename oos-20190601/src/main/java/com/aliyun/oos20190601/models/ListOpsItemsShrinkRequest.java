// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListOpsItemsShrinkRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListOpsItemsShrinkRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceTags")
    public String resourceTagsShrink;

    @NameInMap("Tags")
    public String tagsShrink;

    public static ListOpsItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpsItemsShrinkRequest self = new ListOpsItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOpsItemsShrinkRequest setFilter(java.util.List<ListOpsItemsShrinkRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListOpsItemsShrinkRequestFilter> getFilter() {
        return this.filter;
    }

    public ListOpsItemsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpsItemsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOpsItemsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOpsItemsShrinkRequest setResourceTagsShrink(String resourceTagsShrink) {
        this.resourceTagsShrink = resourceTagsShrink;
        return this;
    }
    public String getResourceTagsShrink() {
        return this.resourceTagsShrink;
    }

    public ListOpsItemsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public static class ListOpsItemsShrinkRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListOpsItemsShrinkRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListOpsItemsShrinkRequestFilter self = new ListOpsItemsShrinkRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListOpsItemsShrinkRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOpsItemsShrinkRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListOpsItemsShrinkRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
