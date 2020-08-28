// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("Users")
    @Validation(required = true)
    public ListUsersForGroupResponseUsers users;

    public static ListUsersForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponse self = new ListUsersForGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class ListUsersForGroupResponseUsersUser extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("JoinDate")
        @Validation(required = true)
        public String joinDate;

        public static ListUsersForGroupResponseUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseUsersUser self = new ListUsersForGroupResponseUsersUser();
            return TeaModel.build(map, self);
        }

    }

    public static class ListUsersForGroupResponseUsers extends TeaModel {
        @NameInMap("User")
        @Validation(required = true)
        public java.util.List<ListUsersForGroupResponseUsersUser> user;

        public static ListUsersForGroupResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseUsers self = new ListUsersForGroupResponseUsers();
            return TeaModel.build(map, self);
        }

    }

}
