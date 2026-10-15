// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByUserIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The organization user information returned.</p>
     */
    @NameInMap("Result")
    public QueryUserInfoByUserIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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
         * <p>Indicates whether the user is an organization administrator. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter is deprecated. Use the RoleIdList parameter instead.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Indicates whether the user has the permission management administrator role attached. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter has expired and is no longer recommended. Use the RoleIList parameter instead.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>The intelligent quota owned by the user.</p>
         */
        @NameInMap("CopilotModules")
        public java.util.List<String> copilotModules;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****@163.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the user is disabled. Valid values:</p>
         * <ul>
         * <li>true: Disabled.</li>
         * <li>false: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>Test user</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1386587****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The list of organization role IDs bound to the user.</p>
         */
        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>The UserID in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user type of the organization member. Valid values:</p>
         * <ul>
         * <li>1: Developer.</li>
         * <li>2: Viewer.</li>
         * <li>3: Analyst.</li>
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

        public QueryUserInfoByUserIdResponseBodyResult setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
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
