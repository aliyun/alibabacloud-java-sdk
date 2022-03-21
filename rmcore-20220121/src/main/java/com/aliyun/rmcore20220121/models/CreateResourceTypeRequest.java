// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CreateResourceTypeRequest extends TeaModel {
    @NameInMap("ResourceTypeConfiguration")
    public java.util.Map<String, ?> resourceTypeConfiguration;

    public static CreateResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceTypeRequest self = new CreateResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceTypeRequest setResourceTypeConfiguration(java.util.Map<String, ?> resourceTypeConfiguration) {
        this.resourceTypeConfiguration = resourceTypeConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getResourceTypeConfiguration() {
        return this.resourceTypeConfiguration;
    }

}
