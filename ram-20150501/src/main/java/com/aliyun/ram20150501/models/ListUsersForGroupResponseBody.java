// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("Users")
    public ListUsersForGroupResponseBodyUsers users;

    public static ListUsersForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponseBody self = new ListUsersForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersForGroupResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersForGroupResponseBody setUsers(ListUsersForGroupResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersForGroupResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseBodyUsersUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("JoinDate")
        public String joinDate;

        @NameInMap("UserName")
        public String userName;

        public static ListUsersForGroupResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsersUser self = new ListUsersForGroupResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersForGroupResponseBodyUsersUser setJoinDate(String joinDate) {
            this.joinDate = joinDate;
            return this;
        }
        public String getJoinDate() {
            return this.joinDate;
        }

        public ListUsersForGroupResponseBodyUsersUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListUsersForGroupResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersForGroupResponseBodyUsersUser> user;

        public static ListUsersForGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsers self = new ListUsersForGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsers setUser(java.util.List<ListUsersForGroupResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersForGroupResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
