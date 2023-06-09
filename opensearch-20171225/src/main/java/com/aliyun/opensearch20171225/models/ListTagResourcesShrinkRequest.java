// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The token that is used to retrieve the next page.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The resource IDs. You can specify a maximum number of 50 resource IDs.</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tags. You can specify a maximum number of 20 tags.</p>
     */
    @NameInMap("tag")
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

    public ListTagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
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
