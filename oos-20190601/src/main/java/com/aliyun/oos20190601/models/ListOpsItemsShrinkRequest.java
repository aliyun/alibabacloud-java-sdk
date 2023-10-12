// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListOpsItemsShrinkRequest extends TeaModel {
    /**
     * <p>The filter rules for the component.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListOpsItemsShrinkRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about resource tags.</p>
     */
    @NameInMap("ResourceTags")
    public String resourceTagsShrink;

    /**
     * <p>The tags.</p>
     */
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
        /**
         * <p>The parameter name of the filter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The comparison operator that is used to filter property values.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parameter values of the filter.</p>
         */
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
