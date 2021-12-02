// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcGatewayEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    public java.util.List<ListVpcGatewayEndpointsResponseBodyEndpoints> endpoints;

    // 本次请求最大数量
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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

    public static class ListVpcGatewayEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("AssociatedRouteTables")
        public java.util.List<String> associatedRouteTables;

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

        @NameInMap("ServiceName")
        public String serviceName;

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

        public ListVpcGatewayEndpointsResponseBodyEndpoints setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
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
