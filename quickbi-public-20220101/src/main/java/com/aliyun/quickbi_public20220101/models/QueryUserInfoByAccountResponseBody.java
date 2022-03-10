// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserInfoByAccountResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserInfoByAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByAccountResponseBody self = new QueryUserInfoByAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserInfoByAccountResponseBody setResult(QueryUserInfoByAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserInfoByAccountResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserInfoByAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserInfoByAccountResponseBodyResult extends TeaModel {
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

        public static QueryUserInfoByAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserInfoByAccountResponseBodyResult self = new QueryUserInfoByAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserInfoByAccountResponseBodyResult setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryUserInfoByAccountResponseBodyResult setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryUserInfoByAccountResponseBodyResult setAdminUser(Boolean adminUser) {
            this.adminUser = adminUser;
            return this;
        }
        public Boolean getAdminUser() {
            return this.adminUser;
        }

        public QueryUserInfoByAccountResponseBodyResult setAuthAdminUser(Boolean authAdminUser) {
            this.authAdminUser = authAdminUser;
            return this;
        }
        public Boolean getAuthAdminUser() {
            return this.authAdminUser;
        }

        public QueryUserInfoByAccountResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryUserInfoByAccountResponseBodyResult setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryUserInfoByAccountResponseBodyResult setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryUserInfoByAccountResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryUserInfoByAccountResponseBodyResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
