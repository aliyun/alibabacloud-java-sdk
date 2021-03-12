// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceRegistrySourceRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetServiceRegistrySourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrySourceRequest self = new GetServiceRegistrySourceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrySourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
