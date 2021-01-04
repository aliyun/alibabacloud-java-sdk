// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKeys")
    public String tagKeysShrink;

    @NameInMap("All")
    public Boolean all;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
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

    public UntagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

}
