// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserOnlineClientsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public DescribeUserOnlineClientsResponseBodyUsers users;

    public static DescribeUserOnlineClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserOnlineClientsResponseBody self = new DescribeUserOnlineClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserOnlineClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserOnlineClientsResponseBody setUsers(DescribeUserOnlineClientsResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public DescribeUserOnlineClientsResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class DescribeUserOnlineClientsResponseBodyUsersUser extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("OnlineTime")
        public String onlineTime;

        public static DescribeUserOnlineClientsResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserOnlineClientsResponseBodyUsersUser self = new DescribeUserOnlineClientsResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public DescribeUserOnlineClientsResponseBodyUsersUser setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeUserOnlineClientsResponseBodyUsersUser setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

    }

    public static class DescribeUserOnlineClientsResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<DescribeUserOnlineClientsResponseBodyUsersUser> user;

        public static DescribeUserOnlineClientsResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserOnlineClientsResponseBodyUsers self = new DescribeUserOnlineClientsResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUserOnlineClientsResponseBodyUsers setUser(java.util.List<DescribeUserOnlineClientsResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<DescribeUserOnlineClientsResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
