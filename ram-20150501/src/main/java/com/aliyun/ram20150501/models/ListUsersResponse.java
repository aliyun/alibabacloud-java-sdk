// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersResponse extends TeaModel {
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
    public ListUsersResponseUsers users;

    public static ListUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponse self = new ListUsersResponse();
        return TeaModel.build(map, self);
    }

    public static class ListUsersResponseUsersUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("MobilePhone")
        @Validation(required = true)
        public String mobilePhone;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        public static ListUsersResponseUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseUsersUser self = new ListUsersResponseUsersUser();
            return TeaModel.build(map, self);
        }

    }

    public static class ListUsersResponseUsers extends TeaModel {
        @NameInMap("User")
        @Validation(required = true)
        public java.util.List<ListUsersResponseUsersUser> user;

        public static ListUsersResponseUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseUsers self = new ListUsersResponseUsers();
            return TeaModel.build(map, self);
        }

    }

}
