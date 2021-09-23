// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("MobileCountryCode")
        public String mobileCountryCode;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Source")
        public String source;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("UserState")
        public java.util.List<String> userState;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUsersResponseBodyUsers setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public ListUsersResponseBodyUsers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsers setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUsersResponseBodyUsers setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public ListUsersResponseBodyUsers setUserState(java.util.List<String> userState) {
            this.userState = userState;
            return this;
        }
        public java.util.List<String> getUserState() {
            return this.userState;
        }

    }

}
