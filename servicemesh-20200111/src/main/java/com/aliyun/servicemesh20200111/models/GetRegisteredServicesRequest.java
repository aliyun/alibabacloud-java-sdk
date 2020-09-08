// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServicesRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    public static GetRegisteredServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServicesRequest self = new GetRegisteredServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServicesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetRegisteredServicesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
