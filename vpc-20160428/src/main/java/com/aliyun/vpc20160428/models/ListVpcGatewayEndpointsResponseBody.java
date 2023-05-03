// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcGatewayEndpointsResponseBody extends TeaModel {
    /**
     * <p>The name of the endpoint service.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpoints> endpoints;

    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the gateway endpoint.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the gateway endpoint.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the gateway endpoint.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListVpcGatewayEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcGatewayEndpointsResponseBody self = new ListVpcGatewayEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcGatewayEndpointsResponseBody setEndpoints(java.util.List<ListVpcGatewayEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListVpcGatewayEndpointsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListVpcGatewayEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcGatewayEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcGatewayEndpointsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcGatewayEndpointsResponseBodyEndpointsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListVpcGatewayEndpointsResponseBodyEndpointsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcGatewayEndpointsResponseBodyEndpointsTags self = new ListVpcGatewayEndpointsResponseBodyEndpointsTags();
            return TeaModel.build(map, self);
        }

        public ListVpcGatewayEndpointsResponseBodyEndpointsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpointsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcGatewayEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("AssociatedRouteTables")
        public java.util.List<String> associatedRouteTables;

        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The access policy for the cloud service.</p>
         * <br>
         * <p>For more information about the syntax and structure of the access policy, see [Policy syntax and structure](~~93739~~).</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointStatus")
        public String endpointStatus;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Tags")
        public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpointsTags> tags;

        /**
         * <p>The ID of the route table associated with the gateway endpoint.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListVpcGatewayEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListVpcGatewayEndpointsResponseBodyEndpoints self = new ListVpcGatewayEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setAssociatedRouteTables(java.util.List<String> associatedRouteTables) {
            this.associatedRouteTables = associatedRouteTables;
            return this;
        }
        public java.util.List<String> getAssociatedRouteTables() {
            return this.associatedRouteTables;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setEndpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setTags(java.util.List<ListVpcGatewayEndpointsResponseBodyEndpointsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpointsTags> getTags() {
            return this.tags;
        }

        public ListVpcGatewayEndpointsResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
