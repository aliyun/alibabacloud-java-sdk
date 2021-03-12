// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("EnableIstioInjection")
    public Boolean enableIstioInjection;

    public static UpdateIstioInjectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigRequest self = new UpdateIstioInjectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIstioInjectionConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateIstioInjectionConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateIstioInjectionConfigRequest setEnableIstioInjection(Boolean enableIstioInjection) {
        this.enableIstioInjection = enableIstioInjection;
        return this;
    }
    public Boolean getEnableIstioInjection() {
        return this.enableIstioInjection;
    }

}
