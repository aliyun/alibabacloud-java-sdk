// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The plaintext of the first API key. It is returned only once during creation. Save the key properly. If GenerateInitialKey is set to <code>false</code>, this field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>ctxdb-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The name of the first API key. The name is <code>default</code> when the key is generated. If GenerateInitialKey is set to <code>false</code>, this field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ApiKeyName")
    public String apiKeyName;

    /**
     * <p>The account-level capability information for the current call. It only indicates the operations that the account compatibility adapter can perform and does not represent resource-level authorization. This field is optional and is not returned if no account-level executable operations are provided.</p>
     */
    @NameInMap("Capabilities")
    public CreateContextDatabaseWorkspaceResponseBodyCapabilities capabilities;

    /**
     * <p>The ID of the cluster to which the workspace belongs. <code>default</code> is returned for a shared cluster, and the corresponding cluster ID is returned for a dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The permission mode used by the server to parse the identity of the current call. Valid values:</p>
     * <ul>
     * <li><code>personal_compatibility</code>: The compatibility mode.</li>
     * <li><code>advanced</code>: The advanced permission mode.</li>
     * </ul>
     * <p>This field describes the identity context of the current call. The actual permission mode of the workspace is subject to PermissionMode. Creating a workspace uses the account-level identity context, so this field may be empty.</p>
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
     * <p>The ID of the first member.</p>
     * 
     * <strong>example:</strong>
     * <p>mb-cz51tnnp8****</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The name of the first member.</p>
     * 
     * <strong>example:</strong>
     * <p>my-member</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>The permission mode that actually takes effect after the workspace is created. A lowercase string is returned.</p>
     * <ul>
     * <li><code>personal_compatibility</code>: The compatibility mode, which corresponds to the request value <code>compatibility</code>.</li>
     * <li><code>advanced</code>: The advanced permission mode.</li>
     * </ul>
     * <p>This field is optional. If it is not returned in the response, call GetContextDatabaseWorkspace to query the workspace details and confirm the actual mode. Do not recreate the workspace simply because this field is missing.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("PermissionMode")
    public String permissionMode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role of the first member, which is fixed to owner.</p>
     * 
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The status of the workspace (Active: running normally; Locked: stopped due to overdue payments or locked due to expiration).</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the workspace (personal: individual, enterprise: enterprise).</p>
     * 
     * <strong>example:</strong>
     * <p>personal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The viewer identity information for the current call, including the identity parsing mode, caller account type, and member information. Member-related fields are optional.</p>
     */
    @NameInMap("Viewer")
    public CreateContextDatabaseWorkspaceResponseBodyViewer viewer;

    /**
     * <p>The ID of the new workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateContextDatabaseWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseWorkspaceResponseBody self = new CreateContextDatabaseWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseWorkspaceResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateContextDatabaseWorkspaceResponseBody setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public CreateContextDatabaseWorkspaceResponseBody setCapabilities(CreateContextDatabaseWorkspaceResponseBodyCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public CreateContextDatabaseWorkspaceResponseBodyCapabilities getCapabilities() {
        return this.capabilities;
    }

    public CreateContextDatabaseWorkspaceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateContextDatabaseWorkspaceResponseBody setConsolePermissionMode(String consolePermissionMode) {
        this.consolePermissionMode = consolePermissionMode;
        return this;
    }
    public String getConsolePermissionMode() {
        return this.consolePermissionMode;
    }

    public CreateContextDatabaseWorkspaceResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateContextDatabaseWorkspaceResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public CreateContextDatabaseWorkspaceResponseBody setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateContextDatabaseWorkspaceResponseBody setPermissionMode(String permissionMode) {
        this.permissionMode = permissionMode;
        return this;
    }
    public String getPermissionMode() {
        return this.permissionMode;
    }

    public CreateContextDatabaseWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContextDatabaseWorkspaceResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateContextDatabaseWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateContextDatabaseWorkspaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateContextDatabaseWorkspaceResponseBody setViewer(CreateContextDatabaseWorkspaceResponseBodyViewer viewer) {
        this.viewer = viewer;
        return this;
    }
    public CreateContextDatabaseWorkspaceResponseBodyViewer getViewer() {
        return this.viewer;
    }

    public CreateContextDatabaseWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateContextDatabaseWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class CreateContextDatabaseWorkspaceResponseBodyCapabilities extends TeaModel {
        /**
         * <p>The list of operation names that the account compatibility adapter can perform. The list content does not represent read/write, member group, or access control authorization for specific resources.</p>
         */
        @NameInMap("ExecutableActions")
        public java.util.List<String> executableActions;

        public static CreateContextDatabaseWorkspaceResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDatabaseWorkspaceResponseBodyCapabilities self = new CreateContextDatabaseWorkspaceResponseBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public CreateContextDatabaseWorkspaceResponseBodyCapabilities setExecutableActions(java.util.List<String> executableActions) {
            this.executableActions = executableActions;
            return this;
        }
        public java.util.List<String> getExecutableActions() {
            return this.executableActions;
        }

    }

    public static class CreateContextDatabaseWorkspaceResponseBodyViewer extends TeaModel {
        /**
         * <p>The ID of the workspace member bound in the identity information of the current call. This field is optional and is empty if no bound member information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("BoundMemberId")
        public String boundMemberId;

        /**
         * <p>The role of the bound member in the workspace, such as <code>Owner</code>. This field is optional and is empty if no bound member role information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("BoundMemberRole")
        public String boundMemberRole;

        /**
         * <p>The status of the bound member, such as <code>active</code>. This field is optional and is empty if no bound member status information is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("BoundMemberStatus")
        public String boundMemberStatus;

        /**
         * <p>The account type of the caller for the current call, such as <code>customer</code>. This field describes the caller account and does not represent the role of the workspace member.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("CallerType")
        public String callerType;

        /**
         * <p>The identity parsing mode for the current call. Valid values:</p>
         * <ul>
         * <li><code>account_compatibility</code>: The account compatibility identity mode.</li>
         * <li><code>bound_member</code>: The bound member identity mode.</li>
         * </ul>
         * <p>The identity parsing mode and the permission mode of the workspace are different concepts. You cannot infer whether advanced permissions are enabled for the workspace based on this field.</p>
         * 
         * <strong>example:</strong>
         * <p>account_compatibility</p>
         */
        @NameInMap("IdentityMode")
        public String identityMode;

        /**
         * <p>The ID of the workspace member selected in the account compatibility identity mode. This field is optional and is empty if no member is selected for the current call. This field and the bound member ID represent the member selection result and the binding relationship, respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>member-example</p>
         */
        @NameInMap("SelectedMemberId")
        public String selectedMemberId;

        public static CreateContextDatabaseWorkspaceResponseBodyViewer build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDatabaseWorkspaceResponseBodyViewer self = new CreateContextDatabaseWorkspaceResponseBodyViewer();
            return TeaModel.build(map, self);
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberId(String boundMemberId) {
            this.boundMemberId = boundMemberId;
            return this;
        }
        public String getBoundMemberId() {
            return this.boundMemberId;
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberRole(String boundMemberRole) {
            this.boundMemberRole = boundMemberRole;
            return this;
        }
        public String getBoundMemberRole() {
            return this.boundMemberRole;
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setBoundMemberStatus(String boundMemberStatus) {
            this.boundMemberStatus = boundMemberStatus;
            return this;
        }
        public String getBoundMemberStatus() {
            return this.boundMemberStatus;
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setCallerType(String callerType) {
            this.callerType = callerType;
            return this;
        }
        public String getCallerType() {
            return this.callerType;
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setIdentityMode(String identityMode) {
            this.identityMode = identityMode;
            return this;
        }
        public String getIdentityMode() {
            return this.identityMode;
        }

        public CreateContextDatabaseWorkspaceResponseBodyViewer setSelectedMemberId(String selectedMemberId) {
            this.selectedMemberId = selectedMemberId;
            return this;
        }
        public String getSelectedMemberId() {
            return this.selectedMemberId;
        }

    }

}
