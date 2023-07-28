// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>Specifies whether to delete all tags. This parameter takes effect only when the TagKeys parameter is not specified. Valid values: true and false. Default value: false. The TagKeys parameter is required when this parameter is set to false.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>You can call this operation to delete tags that are attached to one or more resources.</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    @NameInMap("ResourceType")
    public String resourceType;

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

    public UntagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
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
