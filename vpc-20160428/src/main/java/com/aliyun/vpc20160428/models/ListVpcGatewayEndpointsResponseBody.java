// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcGatewayEndpointsResponseBody extends TeaModel {
    /**
     * <p>The list of gateway endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>Indicates whether a next query token is available. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no more results are available.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AB1129F-32C1-5E4D-9E22-E4A859CA46EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
        /**
         * <p>The IDs of the route tables associated with the gateway endpoint.</p>
         */
        @NameInMap("AssociatedRouteTables")
        public java.util.List<String> associatedRouteTables;

        /**
         * <p>The time when the gateway endpoint was created. The time is displayed in UTC in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08T08:43:04Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        /**
         * <p>The endpoint instance ID of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpce-bp1i1212ss2whuwyw****</p>
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
         * <p>The status of the gateway endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Created</strong>: created and in a normal state.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Associating</strong>: being associated.</li>
         * <li><strong>Dissociating</strong>: being disassociated.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("EndpointStatus")
        public String endpointStatus;

        /**
         * <p>The access policy for the cloud service.</p>
         * <p>For more information about the syntax and structure of access policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy structure and syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;Version\&quot;: \&quot;1\&quot;,\n  \&quot;Statement\&quot;: [\n    {\n      \&quot;Effect\&quot;: \&quot;Allow\&quot;,\n      \&quot;Action\&quot;: \&quot;<em>\&quot;,\n      \&quot;Principal\&quot;: \&quot;</em>\&quot;,\n      \&quot;Resource\&quot;: \&quot;*\&quot;\n    }\n  ]\n}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxvfvazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The service name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.cn-hangzhou.oss</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpointsTags> tags;

        /**
         * <p>The ID of the VPC to which the gateway endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1gsk7h12ew7oegk****</p>
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
