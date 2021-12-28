// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveBuiltinEnvoyFilterRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IstioVersion")
    public String istioVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static RemoveBuiltinEnvoyFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBuiltinEnvoyFilterRequest self = new RemoveBuiltinEnvoyFilterRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBuiltinEnvoyFilterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RemoveBuiltinEnvoyFilterRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public RemoveBuiltinEnvoyFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RemoveBuiltinEnvoyFilterRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
