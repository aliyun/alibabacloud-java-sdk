// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayClientUsersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Users")
    public DescribeSmartAccessGatewayClientUsersResponseBodyUsers users;

    public static DescribeSmartAccessGatewayClientUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayClientUsersResponseBody self = new DescribeSmartAccessGatewayClientUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayClientUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSmartAccessGatewayClientUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmartAccessGatewayClientUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewayClientUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSmartAccessGatewayClientUsersResponseBody setUsers(DescribeSmartAccessGatewayClientUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public DescribeSmartAccessGatewayClientUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("State")
        public Integer state;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserMail")
        public String userMail;

        public static DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser self = new DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser setUserMail(String userMail) {
            this.userMail = userMail;
            return this;
        }
        public String getUserMail() {
            return this.userMail;
        }

    }

    public static class DescribeSmartAccessGatewayClientUsersResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser> user;

        public static DescribeSmartAccessGatewayClientUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayClientUsersResponseBodyUsers self = new DescribeSmartAccessGatewayClientUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayClientUsersResponseBodyUsers setUser(java.util.List<DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayClientUsersResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
