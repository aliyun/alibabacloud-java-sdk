// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceMeshSlbRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    public static GetServiceMeshSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMeshSlbRequest self = new GetServiceMeshSlbRequest();
        return TeaModel.build(map, self);
    }

}
