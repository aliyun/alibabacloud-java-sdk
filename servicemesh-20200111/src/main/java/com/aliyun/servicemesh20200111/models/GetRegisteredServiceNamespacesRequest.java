// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceNamespacesRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static GetRegisteredServiceNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceNamespacesRequest self = new GetRegisteredServiceNamespacesRequest();
        return TeaModel.build(map, self);
    }

}
