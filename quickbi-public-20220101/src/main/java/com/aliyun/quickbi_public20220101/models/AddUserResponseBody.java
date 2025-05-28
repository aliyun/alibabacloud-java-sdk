// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns detailed information about the newly added Aliyun user.</p>
     */
    @NameInMap("Result")
    public AddUserResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
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

    public static AddUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserResponseBody self = new AddUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUserResponseBody setResult(AddUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddUserResponseBodyResult getResult() {
        return this.result;
    }

    public AddUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddUserResponseBodyResult extends TeaModel {
        /**
         * <p>Aliyun account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Whether the organization administrator role is assigned. Value range: </p>
         * <ul>
         * <li>true: Yes</li>
         * <li>false: No</li>
         * </ul>
         * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIdList is provided.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdminUser")
        public Boolean adminUser;

        /**
         * <p>Whether the permission administrator role is assigned. Value range: </p>
         * <ul>
         * <li>true: Yes</li>
         * <li>false: No</li>
         * </ul>
         * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIdList is provided.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        /**
         * <p>Aliyun account nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>ddd</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>List of organization role IDs bound to the user.</p>
         */
        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        /**
         * <p>UserID in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>b5d8fd9348cc4327****afb604</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>User type of the organization member. Value range: </p>
         * <ul>
         * <li>1: Developer </li>
         * <li>2: Visitor </li>
         * <li>3: Analyst</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserType")
        public Integer userType;

        public static AddUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddUserResponseBodyResult self = new AddUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddUserResponseBodyResult setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public AddUserResponseBodyResult setAdminUser(Boolean adminUser) {
            this.adminUser = adminUser;
            return this;
        }
        public Boolean getAdminUser() {
            return this.adminUser;
        }

        public AddUserResponseBodyResult setAuthAdminUser(Boolean authAdminUser) {
            this.authAdminUser = authAdminUser;
            return this;
        }
        public Boolean getAuthAdminUser() {
            return this.authAdminUser;
        }

        public AddUserResponseBodyResult setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public AddUserResponseBodyResult setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
        }

        public AddUserResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AddUserResponseBodyResult setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
