// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The marker. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.````</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B450CA1-36E8-4AA2-8461-86B42BF4CC4E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM users.</p>
     */
    @NameInMap("Users")
    public ListUsersForGroupResponseBodyUsers users;

    public static ListUsersForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponseBody self = new ListUsersForGroupResponseBody();
        return TeaModel.build(map, self);
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

    public ListUsersForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponseBody setUsers(ListUsersForGroupResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersForGroupResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseBodyUsersUser extends TeaModel {
        /**
         * <p>The display name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the RAM user joined the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("JoinDate")
        public String joinDate;

        /**
         * <p>The name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangqiang</p>
         */
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
