// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned organization user information.</p>
     */
    @NameInMap("Result")
    public QueryUserInfoByAccountResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>135****5848</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the Alibaba Cloud account that corresponds to the member. (If you use a RAM user, the domain name information that follows @ is removed. For example, if you use a <a href="mailto:test@test.com">test@test.com</a>, test is returned.)</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Whether you are an administrator of the organization. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Whether you are a permission administrator. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The nickname of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test user</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The phone number of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>The UserID in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The role type of the organization member. Valid values:</p>
         * <ul>
         * <li>1 : developer</li>
         * <li>2 : visitors</li>
         * <li>3 : Analyst</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public QueryUserInfoByAccountResponseBodyResult setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
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
