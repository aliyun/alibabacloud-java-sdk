// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcGatewayEndpointResponseBody extends TeaModel {
    /**
     * <p>The time when the gateway endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-27T01:58:37Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The ID of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vpce-bp1w1dmdqjpwul0v3****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62CFC815-E08A-5CF4-92D1-54273EC9E406</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyun.cn-hangzhou.oss</p>
     */
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
