// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resources.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public Boolean all;

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
     * <p>The keys of the tags. You can specify up to 20 tag keys.</p>
     */
    @NameInMap("TagKeys")
    public String tagKeysShrink;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesShrinkRequest setResourceNamesShrink(String resourceNamesShrink) {
        this.resourceNamesShrink = resourceNamesShrink;
        return this;
    }
    public String getResourceNamesShrink() {
        return this.resourceNamesShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

}
