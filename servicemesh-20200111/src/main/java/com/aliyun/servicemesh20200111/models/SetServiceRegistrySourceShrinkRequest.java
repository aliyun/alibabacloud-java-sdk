// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SetServiceRegistrySourceShrinkRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Config")
    public String configShrink;

    public static SetServiceRegistrySourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServiceRegistrySourceShrinkRequest self = new SetServiceRegistrySourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetServiceRegistrySourceShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public SetServiceRegistrySourceShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

}
