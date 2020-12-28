// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVmAppFromMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ServiceName")
    public String serviceName;

    public static RemoveVmAppFromMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVmAppFromMeshRequest self = new RemoveVmAppFromMeshRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVmAppFromMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public RemoveVmAppFromMeshRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RemoveVmAppFromMeshRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
