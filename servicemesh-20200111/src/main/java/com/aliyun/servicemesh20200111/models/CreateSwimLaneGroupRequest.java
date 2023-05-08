// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneGroupRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IngressGatewayName")
    public String ingressGatewayName;

    @NameInMap("IngressType")
    public String ingressType;

    /**
     * <p>The type of the ingress. Only ingress gateways are supported. Set the value to ASM.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The name of the ingress gateway.</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

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

}
