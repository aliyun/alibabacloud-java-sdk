// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserARNs")
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUserARNs> userARNs;

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
