// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operation that you want to perform. Set the value to TagResources.</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    /**
     * <p>The IDs of resources. The number of resource IDs ranges from 1 to 50.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tags")
    public String tagsShrink;

    public static TagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesShrinkRequest self = new TagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public TagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
