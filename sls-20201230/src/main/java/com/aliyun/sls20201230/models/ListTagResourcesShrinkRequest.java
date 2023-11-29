// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the resources for which you want to query tags. You must specify at least one of resourceId and tags.</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The type of the resource. Set the value to project.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tags that you want to use to filter resources based on exact match. Each tag is a key-value pair. You must specify at least one of resourceId and tags.</p>
     * <br>
     * <p>You can enter up to 20 tags.</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    public static ListTagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesShrinkRequest self = new ListTagResourcesShrinkRequest();
        return TeaModel.build(map, self);
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

    public ListTagResourcesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
