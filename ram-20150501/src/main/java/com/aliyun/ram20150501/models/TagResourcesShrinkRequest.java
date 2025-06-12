// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
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

    public static TagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesShrinkRequest self = new TagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesShrinkRequest setResourceNamesShrink(String resourceNamesShrink) {
        this.resourceNamesShrink = resourceNamesShrink;
        return this;
    }
    public String getResourceNamesShrink() {
        return this.resourceNamesShrink;
    }

    public TagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
