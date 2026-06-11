// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceUserRolesByUserIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E***************F67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of all workspace role information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListWorkspaceUserRolesByUserIdResponseBodyResult> result;

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
         * <p>The code that corresponds to the preset workspace role. This parameter is not returned for custom roles.</p>
         * 
         * <strong>example:</strong>
         * <p>34637***35</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <p>The workspace role ID. This includes, but is not limited to, the following preset workspace roles:</p>
         * <ul>
         * <li><p>25: Workspace Admin (preset role)</p>
         * </li>
         * <li><p>26: Workspace Developer (preset role)</p>
         * </li>
         * <li><p>27: Workspace Analyst (preset role)</p>
         * </li>
         * <li><p>30: Workspace Viewer (preset role)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The name of the workspace role.</p>
         * 
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
        /**
         * <p>The workspace role information.</p>
         */
        @NameInMap("RoleModel")
        public ListWorkspaceUserRolesByUserIdResponseBodyResultRoleModel roleModel;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9337d121-a78f-4c1b-a8bc-f81de117****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
