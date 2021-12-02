// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("EndpointDescription")
    public String endpointDescription;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointStatus")
    public String endpointStatus;

    @NameInMap("PolicyDocument")
    public String policyDocument;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteTables")
    public java.util.List<String> routeTables;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("VpcId")
    public String vpcId;

    public static GetVpcGatewayEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcGatewayEndpointAttributeResponseBody self = new GetVpcGatewayEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcGatewayEndpointAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setRouteTables(java.util.List<String> routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public java.util.List<String> getRouteTables() {
        return this.routeTables;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
