// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioRouteAdditionalStatusRequest extends TeaModel {
    /**
     * <p>The description of the routing rule.</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The name of the routing rule.</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The status of the routing rule. Valid values: 0: The routing rule is valid. 1: The routing rule is invalid. 2: An error occurs during the creation or update of the routing rule.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateIstioRouteAdditionalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioRouteAdditionalStatusRequest self = new UpdateIstioRouteAdditionalStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIstioRouteAdditionalStatusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIstioRouteAdditionalStatusRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public UpdateIstioRouteAdditionalStatusRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateIstioRouteAdditionalStatusRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public UpdateIstioRouteAdditionalStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateIstioRouteAdditionalStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
