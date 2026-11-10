// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The account-level capability information for the current request. This information only indicates the operations that the account compatibility adapter can perform and does not represent resource-level authorization. This field is optional and is not returned when no account-level executable operations are provided.</p>
     */
    @NameInMap("Capabilities")
    public DeleteContextDatabaseWorkspaceResponseBodyCapabilities capabilities;

    /**
     * <p>The ID of the cluster to which the workspace belongs. For shared clusters, default is returned. For dedicated clusters, the corresponding cluster ID is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The permission mode used by the server to parse the identity of the current request. Valid values:</p>
     * <ul>
     * <li>personal_compatibility: Compatibility mode.</li>
     * <li>advanced: Advanced permission mode.</li>
     * </ul>
     * <p>This field describes the identity context of the current request. For the actual permission mode of the workspace, refer to PermissionMode.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("ConsolePermissionMode")
    public String consolePermissionMode;

    /**
     * <p>The creation time in ISO-8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The permission mode of the workspace. Valid values:</p>
     * <ul>
     * <li>personal_compatibility: Compatibility mode.</li>
     * <li>advanced: Advanced permission mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("PermissionMode")
    public String permissionMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the workspace. This value is fixed to Deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>Deleted</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>personal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The viewer identity information for the current request, including the identity resolution mode, caller account type, and member information. Member-related fields are optional.</p>
     */
    @NameInMap("Viewer")
    public DeleteContextDatabaseWorkspaceResponseBodyViewer viewer;

    /**
     * <p>The ID of the deleted workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the deleted workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DeleteContextDatabaseWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseWorkspaceResponseBody self = new DeleteContextDatabaseWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseWorkspaceResponseBody setCapabilities(DeleteContextDatabaseWorkspaceResponseBodyCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public DeleteContextDatabaseWorkspaceResponseBodyCapabilities getCapabilities() {
        return this.capabilities;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setConsolePermissionMode(String consolePermissionMode) {
        this.consolePermissionMode = consolePermissionMode;
        return this;
    }
    public String getConsolePermissionMode() {
        return this.consolePermissionMode;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setPermissionMode(String permissionMode) {
        this.permissionMode = permissionMode;
        return this;
    }
    public String getPermissionMode() {
        return this.permissionMode;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setViewer(DeleteContextDatabaseWorkspaceResponseBodyViewer viewer) {
        this.viewer = viewer;
        return this;
    }
    public DeleteContextDatabaseWorkspaceResponseBodyViewer getViewer() {
        return this.viewer;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteContextDatabaseWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class DeleteContextDatabaseWorkspaceResponseBodyCapabilities extends TeaModel {
        /**
         * <p>The list of operation names that the account compatibility adapter can perform. The list content does not represent read/write, member group, or access control authorization for specific resources.</p>
         */
        @NameInMap("ExecutableActions")
        public java.util.List<String> executableActions;

        public static DeleteContextDatabaseWorkspaceResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            DeleteContextDatabaseWorkspaceResponseBodyCapabilities self = new DeleteContextDatabaseWorkspaceResponseBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public DeleteContextDatabaseWorkspaceResponseBodyCapabilities setExecutableActions(java.util.List<String> executableActions) {
            this.executableActions = executableActions;
            return this;
        }
        public java.util.List<String> getExecutableActions() {
            return this.executableActions;
        }

    }

    public static class DeleteContextDatabaseWorkspaceResponseBodyViewer extends TeaModel {
        /**
         * <p>The ID of the bound workspace member in the identity information for the current request. This field is optional and has no value when bound member information is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("BoundMemberId")
        public String boundMemberId;

        /**
         * <p>The role of the bound member in the workspace, such as Owner. This field is optional and has no value when bound member role information is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("BoundMemberRole")
        public String boundMemberRole;

        /**
         * <p>The status of the bound member, such as active. This field is optional and has no value when bound member status information is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("BoundMemberStatus")
        public String boundMemberStatus;

        /**
         * <p>The account type of the caller for the current request, such as customer. This field describes the caller account and does not represent the role of a workspace member.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("CallerType")
        public String callerType;

        /**
         * <p>The identity resolution mode for the current request. Valid values:</p>
         * <ul>
         * <li>account_compatibility: Account compatibility identity mode.</li>
         * <li>bound_member: Bound member identity mode.</li>
         * </ul>
         * <p>The identity resolution mode and the workspace permission mode are different concepts. You cannot infer whether advanced permissions are enabled for the workspace based on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>account_compatibility</p>
         */
        @NameInMap("IdentityMode")
        public String identityMode;

        /**
         * <p>The ID of the selected workspace member in the account compatibility identity mode. This field is optional and has no value when no member is selected for the current request. This field and the bound member ID represent the member selection result and the binding relationship, respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("SelectedMemberId")
        public String selectedMemberId;

        public static DeleteContextDatabaseWorkspaceResponseBodyViewer build(java.util.Map<String, ?> map) throws Exception {
            DeleteContextDatabaseWorkspaceResponseBodyViewer self = new DeleteContextDatabaseWorkspaceResponseBodyViewer();
            return TeaModel.build(map, self);
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setBoundMemberId(String boundMemberId) {
            this.boundMemberId = boundMemberId;
            return this;
        }
        public String getBoundMemberId() {
            return this.boundMemberId;
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setBoundMemberRole(String boundMemberRole) {
            this.boundMemberRole = boundMemberRole;
            return this;
        }
        public String getBoundMemberRole() {
            return this.boundMemberRole;
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setBoundMemberStatus(String boundMemberStatus) {
            this.boundMemberStatus = boundMemberStatus;
            return this;
        }
        public String getBoundMemberStatus() {
            return this.boundMemberStatus;
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setCallerType(String callerType) {
            this.callerType = callerType;
            return this;
        }
        public String getCallerType() {
            return this.callerType;
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setIdentityMode(String identityMode) {
            this.identityMode = identityMode;
            return this;
        }
        public String getIdentityMode() {
            return this.identityMode;
        }

        public DeleteContextDatabaseWorkspaceResponseBodyViewer setSelectedMemberId(String selectedMemberId) {
            this.selectedMemberId = selectedMemberId;
            return this;
        }
        public String getSelectedMemberId() {
            return this.selectedMemberId;
        }

    }

}
