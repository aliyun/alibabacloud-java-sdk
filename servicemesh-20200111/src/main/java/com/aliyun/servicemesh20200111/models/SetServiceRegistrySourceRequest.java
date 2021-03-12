// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class SetServiceRegistrySourceRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    public static SetServiceRegistrySourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetServiceRegistrySourceRequest self = new SetServiceRegistrySourceRequest();
        return TeaModel.build(map, self);
    }

    public SetServiceRegistrySourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public SetServiceRegistrySourceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

}
