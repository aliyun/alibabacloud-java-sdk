// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceUsersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> users;

    public static ListVpcEndpointServiceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceUsersResponseBody self = new ListVpcEndpointServiceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceUsersResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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

    public ListVpcEndpointServiceUsersResponseBody setUsers(java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListVpcEndpointServiceUsersResponseBodyUsers> getUsers() {
        return this.users;
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
