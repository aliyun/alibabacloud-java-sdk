// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVmAppFromMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("ServiceName")
    @Validation(required = true)
    public String serviceName;

    public static RemoveVmAppFromMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVmAppFromMeshRequest self = new RemoveVmAppFromMeshRequest();
        return TeaModel.build(map, self);
    }

}
