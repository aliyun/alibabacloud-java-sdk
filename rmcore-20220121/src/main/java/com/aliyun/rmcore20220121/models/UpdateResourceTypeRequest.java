// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UpdateResourceTypeRequest extends TeaModel {
    @NameInMap("Path")
    public java.util.List<String> path;

    @NameInMap("ResourceTypeConfiguration")
    public java.util.Map<String, ?> resourceTypeConfiguration;

    public static UpdateResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceTypeRequest self = new UpdateResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceTypeRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public UpdateResourceTypeRequest setResourceTypeConfiguration(java.util.Map<String, ?> resourceTypeConfiguration) {
        this.resourceTypeConfiguration = resourceTypeConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getResourceTypeConfiguration() {
        return this.resourceTypeConfiguration;
    }

}
