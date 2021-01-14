// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static CreateServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMeshResponse self = new CreateServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceMeshResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceMeshResponse setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
