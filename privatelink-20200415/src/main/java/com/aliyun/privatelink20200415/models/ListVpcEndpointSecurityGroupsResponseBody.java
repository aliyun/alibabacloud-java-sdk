// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next requests are performed.</p>
     * <p>*   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security groups that are associated with the endpoint.</p>
     */
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
        /**
         * <p>The ID of the security group that is associated with the endpoint.</p>
         */
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
