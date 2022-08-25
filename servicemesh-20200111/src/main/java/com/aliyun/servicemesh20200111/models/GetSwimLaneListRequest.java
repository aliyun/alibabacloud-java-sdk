// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetSwimLaneListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListRequest self = new GetSwimLaneListRequest();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
