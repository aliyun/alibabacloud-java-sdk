// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigRequest extends TeaModel {
    @NameInMap("DataPlaneMode")
    public String dataPlaneMode;

    /**
     * <p>Specifies whether to enable Istio automatic sidecar injection.</p>
     */
    @NameInMap("EnableIstioInjection")
    public Boolean enableIstioInjection;

    /**
     * <p>Specifies whether to enable automatic sidecar injection by using SidecarSet.</p>
     */
    @NameInMap("EnableSidecarSetInjection")
    public Boolean enableSidecarSetInjection;

    @NameInMap("IstioRev")
    public String istioRev;

    /**
     * <p>The namespace for which you want to modify the sidecar injection setting.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateIstioInjectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigRequest self = new UpdateIstioInjectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIstioInjectionConfigRequest setDataPlaneMode(String dataPlaneMode) {
        this.dataPlaneMode = dataPlaneMode;
        return this;
    }
    public String getDataPlaneMode() {
        return this.dataPlaneMode;
    }

    public UpdateIstioInjectionConfigRequest setEnableIstioInjection(Boolean enableIstioInjection) {
        this.enableIstioInjection = enableIstioInjection;
        return this;
    }
    public Boolean getEnableIstioInjection() {
        return this.enableIstioInjection;
    }

    public UpdateIstioInjectionConfigRequest setEnableSidecarSetInjection(Boolean enableSidecarSetInjection) {
        this.enableSidecarSetInjection = enableSidecarSetInjection;
        return this;
    }
    public Boolean getEnableSidecarSetInjection() {
        return this.enableSidecarSetInjection;
    }

    public UpdateIstioInjectionConfigRequest setIstioRev(String istioRev) {
        this.istioRev = istioRev;
        return this;
    }
    public String getIstioRev() {
        return this.istioRev;
    }

    public UpdateIstioInjectionConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateIstioInjectionConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
