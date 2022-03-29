// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioRouteAdditionalStatusRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RouteName")
    public String routeName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

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
