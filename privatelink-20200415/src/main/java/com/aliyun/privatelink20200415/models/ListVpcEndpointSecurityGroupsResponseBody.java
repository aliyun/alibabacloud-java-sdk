// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public java.util.List<ListVpcEndpointSecurityGroupsResponseBodySecurityGroups> securityGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListVpcEndpointSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        /**
         * <p>The ID of the security group that is associated with the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-hp33bw6ynvm2yb0e****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The associate status of the security group, valid values:</p>
         * <ul>
         * <li>Attaching: The security group is being attached.</li>
         * <li>Attached: The security group is attached.</li>
         * <li>Detaching: The security group is being detached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("SecurityGroupStatus")
        public String securityGroupStatus;

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

        public ListVpcEndpointSecurityGroupsResponseBodySecurityGroups setSecurityGroupStatus(String securityGroupStatus) {
            this.securityGroupStatus = securityGroupStatus;
            return this;
        }
        public String getSecurityGroupStatus() {
            return this.securityGroupStatus;
        }

    }

}
