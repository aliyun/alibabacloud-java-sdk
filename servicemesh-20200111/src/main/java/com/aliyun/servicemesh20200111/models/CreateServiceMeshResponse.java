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

}
