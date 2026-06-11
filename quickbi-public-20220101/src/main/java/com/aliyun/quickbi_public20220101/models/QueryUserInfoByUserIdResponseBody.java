// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the organization user.</p>
     */
    @NameInMap("Result")
    public QueryUserInfoByUserIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request is successful.</p>
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
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>135****5848</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the organization administrator role is assigned to the user. Valid values:</p>
         * <ul>
         * <li><p>true: The role is assigned.</p>
         * </li>
         * <li><p>false: The role is not assigned.</p>
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
         * <p>Indicates whether the permission administrator role is assigned to the user. Valid values:</p>
         * <ul>
         * <li><p>true: The role is assigned.</p>
         * </li>
         * <li><p>false: The role is not assigned.</p>
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
         * <p>The list of <code>CopilotModules</code> available to the user.</p>
         */
        @NameInMap("CopilotModules")
        public java.util.List<String> copilotModules;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>测试用户</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The phone number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The list of organization role IDs that are assigned to the user.</p>
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
         * <li><p><code>1</code>: developer</p>
         * </li>
         * <li><p><code>2</code>: viewer</p>
         * </li>
         * <li><p><code>3</code>: analyst</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public QueryUserInfoByUserIdResponseBodyResult setCopilotModules(java.util.List<String> copilotModules) {
            this.copilotModules = copilotModules;
            return this;
        }
        public java.util.List<String> getCopilotModules() {
            return this.copilotModules;
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
