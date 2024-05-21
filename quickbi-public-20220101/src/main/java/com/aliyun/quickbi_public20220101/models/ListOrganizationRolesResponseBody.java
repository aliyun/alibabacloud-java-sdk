// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListOrganizationRolesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListOrganizationRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRolesResponseBody self = new ListOrganizationRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationRolesResponseBody setResult(java.util.List<ListOrganizationRolesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOrganizationRolesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOrganizationRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrganizationRolesResponseBodyResultAuthConfigList extends TeaModel {
        @NameInMap("AuthKey")
        public String authKey;

        public static ListOrganizationRolesResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRolesResponseBodyResultAuthConfigList self = new ListOrganizationRolesResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRolesResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class ListOrganizationRolesResponseBodyResult extends TeaModel {
        @NameInMap("AuthConfigList")
        public java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> authConfigList;

        @NameInMap("IsSystemRole")
        public Boolean isSystemRole;

        @NameInMap("RoleId")
        public Long roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static ListOrganizationRolesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRolesResponseBodyResult self = new ListOrganizationRolesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRolesResponseBodyResult setAuthConfigList(java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<ListOrganizationRolesResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public ListOrganizationRolesResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public ListOrganizationRolesResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public ListOrganizationRolesResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
