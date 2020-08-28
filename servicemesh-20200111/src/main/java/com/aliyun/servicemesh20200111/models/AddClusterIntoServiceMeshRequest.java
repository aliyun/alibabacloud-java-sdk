// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static AddClusterIntoServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshRequest self = new AddClusterIntoServiceMeshRequest();
        return TeaModel.build(map, self);
    }

}
