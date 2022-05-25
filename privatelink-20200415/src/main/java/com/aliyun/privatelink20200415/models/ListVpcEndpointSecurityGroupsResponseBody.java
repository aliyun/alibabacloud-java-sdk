// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroups")
    public java.util.List<ListVpcEndpointSecurityGroupsResponseBodySecurityGroups> securityGroups;

    public static ListVpcEndpointSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointSecurityGroupsResponseBody self = new ListVpcEndpointSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointSecurityGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointSecurityGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointSecurityGroupsResponseBody setSecurityGroups(java.util.List<ListVpcEndpointSecurityGroupsResponseBodySecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<ListVpcEndpointSecurityGroupsResponseBodySecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    public static class ListVpcEndpointSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static ListVpcEndpointSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointSecurityGroupsResponseBodySecurityGroups self = new ListVpcEndpointSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointSecurityGroupsResponseBodySecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
