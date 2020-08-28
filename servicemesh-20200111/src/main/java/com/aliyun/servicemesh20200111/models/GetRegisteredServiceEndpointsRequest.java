// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static GetRegisteredServiceEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsRequest self = new GetRegisteredServiceEndpointsRequest();
        return TeaModel.build(map, self);
    }

}
