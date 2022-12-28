// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointResponseBody extends TeaModel {
    // The maximum bandwidth of the endpoint connection. Unit: Mbit/s.
    @NameInMap("Bandwidth")
    public Long bandwidth;

    // The state of the endpoint connection. Valid values:
    // 
    // *   **Pending**: The connection is being modified.
    // *   **Connecting**: The connection is being established.
    // *   **Connected**: The connection is established.
    // *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
    // *   **Disconnected**: The endpoint is disconnected from the endpoint service.
    // *   **Deleting**: The connection is being deleted.
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    // The time when the endpoint was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The business state of the endpoint. Valid values:
    // 
    // *   **Normal**: The endpoint runs as expected.
    // *   **FinacialLocked**: The endpoint is locked due to overdue payments.
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    // The description of the endpoint.
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    // The domain name of the endpoint.
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The name of the endpoint.
    @NameInMap("EndpointName")
    public String endpointName;

    // The state of the endpoint. Valid values:
    // 
    // *   **Creating**: The endpoint is being created.
    // *   **Active**: The endpoint is available.
    // *   **Pending**: The endpoint is being modified.
    // *   **Deleting**: The endpoint is being deleted.
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the endpoint service with which the endpoint is associated.
    @NameInMap("ServiceId")
    public String serviceId;

    // The name of the endpoint service with which the endpoint is associated.
    @NameInMap("ServiceName")
    public String serviceName;

    // The VPC to which the endpoint belongs.
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointResponseBody self = new CreateVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateVpcEndpointResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public CreateVpcEndpointResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateVpcEndpointResponseBody setEndpointBusinessStatus(String endpointBusinessStatus) {
        this.endpointBusinessStatus = endpointBusinessStatus;
        return this;
    }
    public String getEndpointBusinessStatus() {
        return this.endpointBusinessStatus;
    }

    public CreateVpcEndpointResponseBody setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public CreateVpcEndpointResponseBody setEndpointDomain(String endpointDomain) {
        this.endpointDomain = endpointDomain;
        return this;
    }
    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    public CreateVpcEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public CreateVpcEndpointResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcEndpointResponseBody setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public CreateVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcEndpointResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateVpcEndpointResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcEndpointResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
