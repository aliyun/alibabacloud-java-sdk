// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The account-level capability information of the current request. It only indicates the operations that the account compatibility adapter can perform and does not represent resource-level authorization. This field is optional and is not returned if no account-level executable operations are provided.</p>
     */
    @NameInMap("Capabilities")
    public UpdateContextDatabaseWorkspaceResponseBodyCapabilities capabilities;

    /**
     * <p>The ID of the cluster to which the workspace belongs. For shared clusters, <code>default</code> is returned. For dedicated clusters, the corresponding cluster ID is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The permission mode used by the server to parse the identity of the current request. Valid values:</p>
     * <ul>
     * <li><code>personal_compatibility</code>: compatibility mode.</li>
     * <li><code>advanced</code>: advanced permission mode.</li>
     * </ul>
     * <p>This field describes the identity context of the current request. For the actual permission mode of the workspace, refer to PermissionMode.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("ConsolePermissionMode")
    public String consolePermissionMode;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The permission mode of the workspace. Valid values:</p>
     * <ul>
     * <li><code>personal_compatibility</code>: compatibility mode.</li>
     * <li><code>advanced</code>: advanced permission mode.</li>
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
     * <p>The workspace status.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The workspace type.</p>
     * 
     * <strong>example:</strong>
     * <p>personal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The viewer identity information of the current request, including the identity resolution mode, caller account type, and member information. Member-related fields are optional.</p>
     */
    @NameInMap("Viewer")
    public UpdateContextDatabaseWorkspaceResponseBodyViewer viewer;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The updated name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static UpdateContextDatabaseWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseWorkspaceResponseBody self = new UpdateContextDatabaseWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseWorkspaceResponseBody setCapabilities(UpdateContextDatabaseWorkspaceResponseBodyCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public UpdateContextDatabaseWorkspaceResponseBodyCapabilities getCapabilities() {
        return this.capabilities;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setConsolePermissionMode(String consolePermissionMode) {
        this.consolePermissionMode = consolePermissionMode;
        return this;
    }
    public String getConsolePermissionMode() {
        return this.consolePermissionMode;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setPermissionMode(String permissionMode) {
        this.permissionMode = permissionMode;
        return this;
    }
    public String getPermissionMode() {
        return this.permissionMode;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setViewer(UpdateContextDatabaseWorkspaceResponseBodyViewer viewer) {
        this.viewer = viewer;
        return this;
    }
    public UpdateContextDatabaseWorkspaceResponseBodyViewer getViewer() {
        return this.viewer;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateContextDatabaseWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class UpdateContextDatabaseWorkspaceResponseBodyCapabilities extends TeaModel {
        /**
         * <p>The list of operation names that the account compatibility adapter can perform. The list content does not represent read/write, member group, or access control authorization for specific resources.</p>
         */
        @NameInMap("ExecutableActions")
        public java.util.List<String> executableActions;

        public static UpdateContextDatabaseWorkspaceResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseWorkspaceResponseBodyCapabilities self = new UpdateContextDatabaseWorkspaceResponseBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseWorkspaceResponseBodyCapabilities setExecutableActions(java.util.List<String> executableActions) {
            this.executableActions = executableActions;
            return this;
        }
        public java.util.List<String> getExecutableActions() {
            return this.executableActions;
        }

    }

    public static class UpdateContextDatabaseWorkspaceResponseBodyViewer extends TeaModel {
        /**
         * <p>The ID of the bound workspace member in the identity information of the current request. Optional. This field is empty if no bound member information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("BoundMemberId")
        public String boundMemberId;

        /**
         * <p>The role of the bound member in the workspace, such as <code>Owner</code>. Optional. This field is empty if no bound member role information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("BoundMemberRole")
        public String boundMemberRole;

        /**
         * <p>The status of the bound member, such as <code>active</code>. Optional. This field is empty if no bound member status information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("BoundMemberStatus")
        public String boundMemberStatus;

        /**
         * <p>The account type of the caller for the current request, such as <code>customer</code>. This field describes the caller account and does not indicate the role of a workspace member.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("CallerType")
        public String callerType;

        /**
         * <p>The identity resolution mode of the current request. Valid values:</p>
         * <ul>
         * <li><code>account_compatibility</code>: account compatibility identity mode.</li>
         * <li><code>bound_member</code>: bound member identity mode.</li>
         * </ul>
         * <p>The identity resolution mode and the workspace permission mode are different concepts. You cannot infer whether advanced permissions are enabled for the workspace based on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>account_compatibility</p>
         */
        @NameInMap("IdentityMode")
        public String identityMode;

        /**
         * <p>The ID of the selected workspace member in the account compatibility identity mode. Optional. This field is empty if no member is selected for the current request. This field and the bound member ID represent the member selection result and the binding relationship, respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("SelectedMemberId")
        public String selectedMemberId;

        public static UpdateContextDatabaseWorkspaceResponseBodyViewer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseWorkspaceResponseBodyViewer self = new UpdateContextDatabaseWorkspaceResponseBodyViewer();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberId(String boundMemberId) {
            this.boundMemberId = boundMemberId;
            return this;
        }
        public String getBoundMemberId() {
            return this.boundMemberId;
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberRole(String boundMemberRole) {
            this.boundMemberRole = boundMemberRole;
            return this;
        }
        public String getBoundMemberRole() {
            return this.boundMemberRole;
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberStatus(String boundMemberStatus) {
            this.boundMemberStatus = boundMemberStatus;
            return this;
        }
        public String getBoundMemberStatus() {
            return this.boundMemberStatus;
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setCallerType(String callerType) {
            this.callerType = callerType;
            return this;
        }
        public String getCallerType() {
            return this.callerType;
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setIdentityMode(String identityMode) {
            this.identityMode = identityMode;
            return this;
        }
        public String getIdentityMode() {
            return this.identityMode;
        }

        public UpdateContextDatabaseWorkspaceResponseBodyViewer setSelectedMemberId(String selectedMemberId) {
            this.selectedMemberId = selectedMemberId;
            return this;
        }
        public String getSelectedMemberId() {
            return this.selectedMemberId;
        }

    }

}
