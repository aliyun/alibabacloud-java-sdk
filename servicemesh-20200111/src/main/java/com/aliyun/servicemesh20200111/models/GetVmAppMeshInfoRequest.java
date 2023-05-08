// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetVmAppMeshInfoRequest extends TeaModel {
    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetVmAppMeshInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmAppMeshInfoRequest self = new GetVmAppMeshInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVmAppMeshInfoRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
