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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
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
     * <p>The number of entries returned.</p>
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
         * <p>The key of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
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
         * <p>The ID of the route table associated with the gateway endpoint.</p>
         */
        @NameInMap("AssociatedRouteTables")
        public java.util.List<String> associatedRouteTables;

        /**
         * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
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
         * <p>The ID of the gateway endpoint.</p>
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
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Associating</strong></li>
         * <li><strong>Dissociating</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("EndpointStatus")
        public String endpointStatus;

        /**
         * <p>The access policy for the cloud service.</p>
         * <p>For more information about the syntax and structure of the access policy, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy syntax and structure</a>.</p>
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
         * <p>The name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.cn-hangzhou.oss</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpointsTags> tags;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
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
