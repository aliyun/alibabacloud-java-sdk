// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesShrinkRequest extends TeaModel {
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

    public static CreateIstioGatewayRoutesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayRoutesShrinkRequest self = new CreateIstioGatewayRoutesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayRoutesShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIstioGatewayRoutesShrinkRequest setGatewayRouteShrink(String gatewayRouteShrink) {
        this.gatewayRouteShrink = gatewayRouteShrink;
        return this;
    }
    public String getGatewayRouteShrink() {
        return this.gatewayRouteShrink;
    }

    public CreateIstioGatewayRoutesShrinkRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public CreateIstioGatewayRoutesShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateIstioGatewayRoutesShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public CreateIstioGatewayRoutesShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
