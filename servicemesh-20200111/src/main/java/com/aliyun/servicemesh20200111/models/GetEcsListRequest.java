// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetEcsListRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetEcsListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEcsListRequest self = new GetEcsListRequest();
        return TeaModel.build(map, self);
    }

    public GetEcsListRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
