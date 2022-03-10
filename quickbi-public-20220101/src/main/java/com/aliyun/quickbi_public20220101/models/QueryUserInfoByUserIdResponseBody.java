// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserInfoByUserIdResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserInfoByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByUserIdResponseBody self = new QueryUserInfoByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserInfoByUserIdResponseBody setResult(QueryUserInfoByUserIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserInfoByUserIdResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserInfoByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserInfoByUserIdResponseBodyResult extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AdminUser")
        public Boolean adminUser;

        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        @NameInMap("Email")
        public String email;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public Integer userType;

        public static QueryUserInfoByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserInfoByUserIdResponseBodyResult self = new QueryUserInfoByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserInfoByUserIdResponseBodyResult setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryUserInfoByUserIdResponseBodyResult setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryUserInfoByUserIdResponseBodyResult setAdminUser(Boolean adminUser) {
            this.adminUser = adminUser;
            return this;
        }
        public Boolean getAdminUser() {
            return this.adminUser;
        }

        public QueryUserInfoByUserIdResponseBodyResult setAuthAdminUser(Boolean authAdminUser) {
            this.authAdminUser = authAdminUser;
            return this;
        }
        public Boolean getAuthAdminUser() {
            return this.authAdminUser;
        }

        public QueryUserInfoByUserIdResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryUserInfoByUserIdResponseBodyResult setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryUserInfoByUserIdResponseBodyResult setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryUserInfoByUserIdResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryUserInfoByUserIdResponseBodyResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
