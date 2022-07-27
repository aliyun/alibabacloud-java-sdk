// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationShrinkRequest self = new UpdateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
