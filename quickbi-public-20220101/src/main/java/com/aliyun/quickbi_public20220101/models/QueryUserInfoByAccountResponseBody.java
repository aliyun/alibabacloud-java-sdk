// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user information of the organization member.</p>
     */
    @NameInMap("Result")
    public QueryUserInfoByAccountResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
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
         * <p>The Alibaba Cloud ID. For users not added through RAM self-service, this ID becomes available only after the user\&quot;s first login.</p>
         * 
         * <strong>example:</strong>
         * <p>135****5848</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account name. For a RAM user, the domain suffix (the part after the @ symbol) is omitted. For example, for the user <code>test@test.com</code>, the value <code>test</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the user is assigned the organization administrator role. Valid values:</p>
         * <ul>
         * <li><p>true: Yes</p>
         * </li>
         * <li><p>false: No</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the <code>RoleIdList</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Indicates whether the user is assigned the permission administrator role. Valid values:</p>
         * <ul>
         * <li><p>true: Yes</p>
         * </li>
         * <li><p>false: No</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the <code>RoleIdList</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>The intelligent modules for which the user has a quota.</p>
         */
        @NameInMap("CopilotModules")
        public java.util.List<String> copilotModules;

        /**
         * <p>The user\&quot;s email address.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The user\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>测试用户</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The user\&quot;s phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The IDs of the organization roles assigned to the user.</p>
         */
        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>The user ID in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user type of the organization member. Valid values:</p>
         * <ul>
         * <li><p>1: developer</p>
         * </li>
         * <li><p>2: viewer</p>
         * </li>
         * <li><p>3: analyst</p>
         * </li>
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

        public QueryUserInfoByAccountResponseBodyResult setCopilotModules(java.util.List<String> copilotModules) {
            this.copilotModules = copilotModules;
            return this;
        }
        public java.util.List<String> getCopilotModules() {
            return this.copilotModules;
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
