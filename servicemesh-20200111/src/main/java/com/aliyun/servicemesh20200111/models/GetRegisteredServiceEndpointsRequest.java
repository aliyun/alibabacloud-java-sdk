// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Name")
    public String name;

    public static GetRegisteredServiceEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsRequest self = new GetRegisteredServiceEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetRegisteredServiceEndpointsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetRegisteredServiceEndpointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
