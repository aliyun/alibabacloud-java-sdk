// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The whitelists in the format of Aliyun Resource Name (ARN).</p>
     */
    @NameInMap("UserARNs")
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUserARNs> userARNs;

    /**
     * <p>The Alibaba Cloud accounts in the whitelist of the endpoint service.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> users;

    public static ListVpcEndpointServiceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceUsersResponseBody self = new ListVpcEndpointServiceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceUsersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServiceUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServiceUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServiceUsersResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListVpcEndpointServiceUsersResponseBody setUserARNs(java.util.List<ListVpcEndpointServiceUsersResponseBodyUserARNs> userARNs) {
        this.userARNs = userARNs;
        return this;
    }
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUserARNs> getUserARNs() {
        return this.userARNs;
    }

    public ListVpcEndpointServiceUsersResponseBody setUsers(java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListVpcEndpointServiceUsersResponseBodyUserARNs extends TeaModel {
        /**
         * <p>The whitelist in the format of ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:<em>::</em></p>
         */
        @NameInMap("UserARN")
        public String userARN;

        public static ListVpcEndpointServiceUsersResponseBodyUserARNs build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServiceUsersResponseBodyUserARNs self = new ListVpcEndpointServiceUsersResponseBodyUserARNs();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServiceUsersResponseBodyUserARNs setUserARN(String userARN) {
            this.userARN = userARN;
            return this;
        }
        public String getUserARN() {
            return this.userARN;
        }

    }

    public static class ListVpcEndpointServiceUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account in the whitelist of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListVpcEndpointServiceUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServiceUsersResponseBodyUsers self = new ListVpcEndpointServiceUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServiceUsersResponseBodyUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
