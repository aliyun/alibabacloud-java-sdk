// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioGatewayRoutesShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GatewayRoute")
    public String gatewayRouteShrink;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Status")
    public Integer status;

    public static UpdateIstioGatewayRoutesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioGatewayRoutesShrinkRequest self = new UpdateIstioGatewayRoutesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIstioGatewayRoutesShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIstioGatewayRoutesShrinkRequest setGatewayRouteShrink(String gatewayRouteShrink) {
        this.gatewayRouteShrink = gatewayRouteShrink;
        return this;
    }
    public String getGatewayRouteShrink() {
        return this.gatewayRouteShrink;
    }

    public UpdateIstioGatewayRoutesShrinkRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public UpdateIstioGatewayRoutesShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateIstioGatewayRoutesShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateIstioGatewayRoutesShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
