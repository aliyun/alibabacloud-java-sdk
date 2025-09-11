// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceUserRolesByUserIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC4E***************F67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListWorkspaceUserRolesByUserIdResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceUserRolesByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUserRolesByUserIdResponseBody self = new ListWorkspaceUserRolesByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUserRolesByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceUserRolesByUserIdResponseBody setResult(java.util.List<ListWorkspaceUserRolesByUserIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListWorkspaceUserRolesByUserIdResponseBodyResult> getResult() {
        return this.result;
    }

    public ListWorkspaceUserRolesByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>34637***35</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <strong>example:</strong>
         * <p>arms-admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel self = new ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListWorkspaceUserRolesByUserIdResponseBodyResult extends TeaModel {
        @NameInMap("RoleModel")
        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel roleModel;

        /**
         * <strong>example:</strong>
         * <p>9337d121-a78f-4c1b-a8bc-f81de117****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspaceUserRolesByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceUserRolesByUserIdResponseBodyResult self = new ListWorkspaceUserRolesByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResult setRoleModel(ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel roleModel) {
            this.roleModel = roleModel;
            return this;
        }
        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel getRoleModel() {
            return this.roleModel;
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspaceUserRolesByUserIdResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
