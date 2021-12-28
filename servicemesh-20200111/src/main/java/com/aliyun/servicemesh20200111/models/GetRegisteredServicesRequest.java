// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetRegisteredServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesRequest self = new GetRegisteredServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetRegisteredServicesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
