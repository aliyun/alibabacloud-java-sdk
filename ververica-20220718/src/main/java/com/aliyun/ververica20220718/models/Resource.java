// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    @NameInMap("elasticResource")
    public ResourceSpec elasticResource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fixedResource")
    public ResourceSpec fixedResource;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setElasticResource(ResourceSpec elasticResource) {
        this.elasticResource = elasticResource;
        return this;
    }
    public ResourceSpec getElasticResource() {
        return this.elasticResource;
    }

    public Resource setFixedResource(ResourceSpec fixedResource) {
        this.fixedResource = fixedResource;
        return this;
    }
    public ResourceSpec getFixedResource() {
        return this.fixedResource;
    }

}
