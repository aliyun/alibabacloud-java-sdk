// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcGatewayEndpointResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static CreateVpcGatewayEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcGatewayEndpointResponseBody self = new CreateVpcGatewayEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcGatewayEndpointResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public CreateVpcGatewayEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public CreateVpcGatewayEndpointResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcGatewayEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcGatewayEndpointResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcGatewayEndpointResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
