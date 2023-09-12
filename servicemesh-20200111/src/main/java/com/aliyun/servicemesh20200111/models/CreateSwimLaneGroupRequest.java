// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneGroupRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The name of the ingress gateway.</p>
     */
    @NameInMap("IngressGatewayName")
    public String ingressGatewayName;

    /**
     * <p>The type of the gateway for ingress traffic. Only ASM ingress gateways are supported.</p>
     */
    @NameInMap("IngressType")
    public String ingressType;

    @NameInMap("IsPermissive")
    public Boolean isPermissive;

    @NameInMap("RouteHeader")
    public String routeHeader;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>A list of services associated with the lane group. The value is a JSON array. The format of a service is `$Cluster name/$Cluster ID/$Namespace/$Service name`.</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    @NameInMap("TraceHeader")
    public String traceHeader;

    public static CreateSwimLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSwimLaneGroupRequest self = new CreateSwimLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSwimLaneGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateSwimLaneGroupRequest setIngressGatewayName(String ingressGatewayName) {
        this.ingressGatewayName = ingressGatewayName;
        return this;
    }
    public String getIngressGatewayName() {
        return this.ingressGatewayName;
    }

    public CreateSwimLaneGroupRequest setIngressType(String ingressType) {
        this.ingressType = ingressType;
        return this;
    }
    public String getIngressType() {
        return this.ingressType;
    }

    public CreateSwimLaneGroupRequest setIsPermissive(Boolean isPermissive) {
        this.isPermissive = isPermissive;
        return this;
    }
    public Boolean getIsPermissive() {
        return this.isPermissive;
    }

    public CreateSwimLaneGroupRequest setRouteHeader(String routeHeader) {
        this.routeHeader = routeHeader;
        return this;
    }
    public String getRouteHeader() {
        return this.routeHeader;
    }

    public CreateSwimLaneGroupRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public CreateSwimLaneGroupRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

    public CreateSwimLaneGroupRequest setTraceHeader(String traceHeader) {
        this.traceHeader = traceHeader;
        return this;
    }
    public String getTraceHeader() {
        return this.traceHeader;
    }

}
