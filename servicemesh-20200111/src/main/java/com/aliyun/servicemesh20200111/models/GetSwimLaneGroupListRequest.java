// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneGroupListRequest extends TeaModel {
    /**
     * <p>A list of services associated with the lane group.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetSwimLaneGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneGroupListRequest self = new GetSwimLaneGroupListRequest();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneGroupListRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
