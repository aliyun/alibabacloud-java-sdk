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

}
