// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmAppMeshInfoRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static GetVmAppMeshInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmAppMeshInfoRequest self = new GetVmAppMeshInfoRequest();
        return TeaModel.build(map, self);
    }

}
