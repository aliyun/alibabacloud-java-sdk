// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <br>
     * <p>*   **Pending**: The connection is being modified.</p>
     * <p>*   **Connecting**: The connection is being established.</p>
     * <p>*   **Connected**: The connection is established.</p>
     * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
     * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
     * <p>*   **Deleting**: The connection is being deleted.</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The time when the endpoint was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The service state of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The endpoint runs as expected.</p>
     * <p>*   **FinacialLocked**: The endpoint is locked due to overdue payments.</p>
     */
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    /**
     * <p>The description of the endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The domain name of the endpoint.</p>
     */
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    /**
     * <p>The endpoint ID.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The state of the endpoint. Valid values:</p>
     * <br>
     * <p>*   **Creating**: The endpoint is being created.</p>
     * <p>*   **Active**: The endpoint is available.</p>
     * <p>*   **Pending**: The endpoint is being modified.</p>
     * <p>*   **Deleting**: The endpoint is being deleted.</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the VPC to which the endpoint belongs.</p>
     */
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
