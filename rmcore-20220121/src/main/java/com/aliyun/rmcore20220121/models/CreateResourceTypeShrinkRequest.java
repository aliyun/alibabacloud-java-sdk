// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CreateResourceTypeShrinkRequest extends TeaModel {
    @NameInMap("ResourceTypeConfiguration")
    public String resourceTypeConfigurationShrink;

    public static CreateResourceTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceTypeShrinkRequest self = new CreateResourceTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceTypeShrinkRequest setResourceTypeConfigurationShrink(String resourceTypeConfigurationShrink) {
        this.resourceTypeConfigurationShrink = resourceTypeConfigurationShrink;
        return this;
    }
    public String getResourceTypeConfigurationShrink() {
        return this.resourceTypeConfigurationShrink;
    }

}
