// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the gateway endpoint.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The ID of the gateway endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the gateway endpoint.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The status of the gateway endpoint. Valid values:</p>
     * <br>
     * <p>*   **Creating**</p>
     * <p>*   **Created**</p>
     * <p>*   **Modifying**</p>
     * <p>*   **Associating**</p>
     * <p>*   **Dissociating**</p>
     * <p>*   **Deleting**</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The access policy for the cloud service.</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the route table associated with the gateway endpoint.</p>
     */
    @NameInMap("RouteTables")
    public java.util.List<String> routeTables;

    /**
     * <p>The name of the endpoint service.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> tags;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
     */
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

    public GetVpcGatewayEndpointAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public GetVpcGatewayEndpointAttributeResponseBody setTags(java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class GetVpcGatewayEndpointAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The key of tag N added to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetVpcGatewayEndpointAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetVpcGatewayEndpointAttributeResponseBodyTags self = new GetVpcGatewayEndpointAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetVpcGatewayEndpointAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetVpcGatewayEndpointAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
