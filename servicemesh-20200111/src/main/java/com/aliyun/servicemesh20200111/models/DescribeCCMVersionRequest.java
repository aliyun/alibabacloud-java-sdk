// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCCMVersionRequest extends TeaModel {
    /**
     * <p>The versions of the CCM component in all clusters on the data plane.</p>
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
