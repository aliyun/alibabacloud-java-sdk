// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNamespaceScopeSidecarConfigRequest extends TeaModel {
    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeNamespaceScopeSidecarConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceScopeSidecarConfigRequest self = new DescribeNamespaceScopeSidecarConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceScopeSidecarConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeNamespaceScopeSidecarConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
