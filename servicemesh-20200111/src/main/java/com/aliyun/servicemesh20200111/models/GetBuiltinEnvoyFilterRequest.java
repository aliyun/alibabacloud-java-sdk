// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IstioVersion")
    public String istioVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetBuiltinEnvoyFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterRequest self = new GetBuiltinEnvoyFilterRequest();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetBuiltinEnvoyFilterRequest setIstioVersion(String istioVersion) {
        this.istioVersion = istioVersion;
        return this;
    }
    public String getIstioVersion() {
        return this.istioVersion;
    }

    public GetBuiltinEnvoyFilterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBuiltinEnvoyFilterRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
