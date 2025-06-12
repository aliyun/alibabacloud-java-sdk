// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>GY/oWREsOP1bPHGcHGrXfYX7UG1k9KqWFYThNDPx1UX26PbWOIu2CMqqiMr68H/K</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The names of the resources. You can specify up to 50 resource names.</p>
     */
    @NameInMap("ResourceNames")
    public String resourceNamesShrink;

    /**
     * <p>The resource type.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>role</li>
     * <li>policy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>role</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListTagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesShrinkRequest self = new ListTagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagResourcesShrinkRequest setResourceNamesShrink(String resourceNamesShrink) {
        this.resourceNamesShrink = resourceNamesShrink;
        return this;
    }
    public String getResourceNamesShrink() {
        return this.resourceNamesShrink;
    }

    public ListTagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
