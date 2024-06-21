// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The state of the endpoint connection. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong>: The connection is being modified.</li>
     * <li><strong>Connecting</strong>: The connection is being established.</li>
     * <li><strong>Connected</strong>: The connection is established.</li>
     * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
     * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
     * <li><strong>Deleting</strong>: The connection is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disconnected</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The time when the endpoint was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T19:11:12Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The service state of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The endpoint runs as expected.</li>
     * <li><strong>FinancialLocked</strong>: The endpoint is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("EndpointBusinessStatus")
    public String endpointBusinessStatus;

    /**
     * <p>The description of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The domain name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****.epsrv-hp3xdsq46ael67lo****.cn-huhehaote.privatelink.aliyuncs.com</p>
     */
    @NameInMap("EndpointDomain")
    public String endpointDomain;

    /**
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The state of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The endpoint is being created.</li>
     * <li><strong>Active</strong>: The endpoint is available.</li>
     * <li><strong>Pending</strong>: The endpoint is being modified.</li>
     * <li><strong>Deleting</strong>: The endpoint is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the endpoint service with which the endpoint is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the VPC to which the endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-hp356stwkxg3fn2xe****</p>
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
