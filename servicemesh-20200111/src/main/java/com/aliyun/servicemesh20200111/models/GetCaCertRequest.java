// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetCaCertRequest extends TeaModel {
    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c7894c929677643a5bfe1a732d778a****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static GetCaCertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertRequest self = new GetCaCertRequest();
        return TeaModel.build(map, self);
    }

    public GetCaCertRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
