// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned organization user information.</p>
     */
    @NameInMap("Result")
    public QueryUserInfoByUserIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the Alibaba Cloud account that corresponds to the member.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Whether you are an administrator of the organization. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Whether you are a permission administrator. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The nickname of the account.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The phone number of the alert contact.</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>The UserID in the Quick BI.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The role type of the organization member. Valid values:</p>
         * <br>
         * <p>*   1 : developer</p>
         * <p>*   2 : visitors</p>
         * <p>*   3 : Analyst</p>
         */
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

        public QueryUserInfoByUserIdResponseBodyResult setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
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
