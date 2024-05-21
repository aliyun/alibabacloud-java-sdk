// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListWorkspaceRolesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesResponseBody self = new ListWorkspaceRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceRolesResponseBody setResult(java.util.List<ListWorkspaceRolesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListWorkspaceRolesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListWorkspaceRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceRolesResponseBodyResultAuthConfigList extends TeaModel {
        @NameInMap("ActionAuthKeys")
        public java.util.List<String> actionAuthKeys;

        @NameInMap("AuthKey")
        public String authKey;

        public static ListWorkspaceRolesResponseBodyResultAuthConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyResultAuthConfigList self = new ListWorkspaceRolesResponseBodyResultAuthConfigList();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyResultAuthConfigList setActionAuthKeys(java.util.List<String> actionAuthKeys) {
            this.actionAuthKeys = actionAuthKeys;
            return this;
        }
        public java.util.List<String> getActionAuthKeys() {
            return this.actionAuthKeys;
        }

        public ListWorkspaceRolesResponseBodyResultAuthConfigList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

    public static class ListWorkspaceRolesResponseBodyResult extends TeaModel {
        @NameInMap("AuthConfigList")
        public java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> authConfigList;

        @NameInMap("IsSystemRole")
        public Boolean isSystemRole;

        @NameInMap("RoleId")
        public Long roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static ListWorkspaceRolesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRolesResponseBodyResult self = new ListWorkspaceRolesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRolesResponseBodyResult setAuthConfigList(java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> authConfigList) {
            this.authConfigList = authConfigList;
            return this;
        }
        public java.util.List<ListWorkspaceRolesResponseBodyResultAuthConfigList> getAuthConfigList() {
            return this.authConfigList;
        }

        public ListWorkspaceRolesResponseBodyResult setIsSystemRole(Boolean isSystemRole) {
            this.isSystemRole = isSystemRole;
            return this;
        }
        public Boolean getIsSystemRole() {
            return this.isSystemRole;
        }

        public ListWorkspaceRolesResponseBodyResult setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public ListWorkspaceRolesResponseBodyResult setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
