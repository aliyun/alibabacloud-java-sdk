// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshWorkloadVersionStatusRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeMeshWorkloadVersionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshWorkloadVersionStatusRequest self = new DescribeMeshWorkloadVersionStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeshWorkloadVersionStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMeshWorkloadVersionStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
