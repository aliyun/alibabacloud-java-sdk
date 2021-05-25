// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetBuiltinEnvoyFilterCatalogRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetBuiltinEnvoyFilterCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuiltinEnvoyFilterCatalogRequest self = new GetBuiltinEnvoyFilterCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetBuiltinEnvoyFilterCatalogRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
