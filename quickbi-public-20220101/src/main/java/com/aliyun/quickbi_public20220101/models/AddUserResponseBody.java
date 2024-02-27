// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddUserResponseBodyResult result;

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
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AdminUser")
        public Boolean adminUser;

        @NameInMap("AuthAdminUser")
        public Boolean authAdminUser;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RoleIdList")
        public java.util.List<Long> roleIdList;

        @NameInMap("UserId")
        public String userId;

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
