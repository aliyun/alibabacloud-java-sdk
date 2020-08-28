// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static RemoveClusterFromServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterFromServiceMeshRequest self = new RemoveClusterFromServiceMeshRequest();
        return TeaModel.build(map, self);
    }

}
