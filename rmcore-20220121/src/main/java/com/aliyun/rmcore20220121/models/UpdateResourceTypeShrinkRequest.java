// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UpdateResourceTypeShrinkRequest extends TeaModel {
    @NameInMap("Path")
    public java.util.List<String> path;

    @NameInMap("ResourceTypeConfiguration")
    public String resourceTypeConfigurationShrink;

    public static UpdateResourceTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceTypeShrinkRequest self = new UpdateResourceTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceTypeShrinkRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public UpdateResourceTypeShrinkRequest setResourceTypeConfigurationShrink(String resourceTypeConfigurationShrink) {
        this.resourceTypeConfigurationShrink = resourceTypeConfigurationShrink;
        return this;
    }
    public String getResourceTypeConfigurationShrink() {
        return this.resourceTypeConfigurationShrink;
    }

}
