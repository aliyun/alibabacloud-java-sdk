// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesShrinkRequest extends TeaModel {
    /**
     * <p>The description of the routing rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the routing rule to be created for the ASM gateway.</p>
     */
    @NameInMap("GatewayRoute")
    public String gatewayRouteShrink;

    /**
     * <p>The name of the ASM gateway.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The status of the routing rule. Valid values:</p>
     * <br>
     * <p>*   `0`: The routing rule is valid.</p>
     * <p>*   `1`: The routing rule is invalid.</p>
     * <p>*   `2`: An error occurs during the creation or update of the routing rule.</p>
     */
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
