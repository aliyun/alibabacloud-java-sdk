// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCCMVersionRequest extends TeaModel {
    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeCCMVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCCMVersionRequest self = new DescribeCCMVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCCMVersionRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
