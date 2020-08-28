// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmMetaRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static GetVmMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmMetaRequest self = new GetVmMetaRequest();
        return TeaModel.build(map, self);
    }

}
