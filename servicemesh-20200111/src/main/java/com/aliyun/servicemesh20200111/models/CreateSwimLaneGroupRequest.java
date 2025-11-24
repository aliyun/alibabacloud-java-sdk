// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneGroupRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The name of the ingress gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ingressgateway</p>
     */
    @NameInMap("IngressGatewayName")
    public String ingressGatewayName;

    /**
     * <strong>example:</strong>
     * <p>istio-system</p>
     */
    @NameInMap("IngressGatewayNamespace")
    public String ingressGatewayNamespace;

    /**
     * <p>The type of the gateway for ingress traffic. Only ASM ingress gateways are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASM</p>
     */
    @NameInMap("IngressType")
    public String ingressType;

    /**
     * <p>Specifies whether the permissive mode is enabled for the lane group to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPermissive")
    public Boolean isPermissive;

    /**
     * <p>The request routing header of the lane group if you plan to create a lane group in permissive mode. This parameter must be specified when IsPermissive is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>x-asm-prefer-tag</p>
     */
    @NameInMap("RouteHeader")
    public String routeHeader;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>A list of services associated with the lane group. The value is a JSON array. The format of a service is <code>$Cluster name/$Cluster ID/$Namespace/$Service name</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka\&quot;,\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb\&quot;,\&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc\&quot;]</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    /**
     * <p>The end-to-end (E2E) pass-through request header of the lane group if you plan to create a lane group in permissive mode. This parameter must be specified when IsPermissive is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>my-request-id</p>
     */
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

    public CreateSwimLaneGroupRequest setIngressGatewayNamespace(String ingressGatewayNamespace) {
        this.ingressGatewayNamespace = ingressGatewayNamespace;
        return this;
    }
    public String getIngressGatewayNamespace() {
        return this.ingressGatewayNamespace;
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
