// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The plaintext API key. This key is returned only once upon creation. The caller must persist the key.</p>
     * 
     * <strong>example:</strong>
     * <p>ctxdb-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The name of the first API key. The value is fixed to default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ApiKeyName")
    public String apiKeyName;

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
     * <p>The permission mode that actually takes effect after the workspace is created. The value is returned as a lowercase string:</p>
     * <ul>
     * <li><code>personal_compatibility</code>: Compatibility mode, which corresponds to the request value <code>compatibility</code>.</li>
     * <li><code>advanced</code>: Advanced permission mode.</li>
     * </ul>
     * <p>This field is optional. If it is not returned in the response, check the actual mode in the workspace details. Do not recreate the workspace only because this field is missing.</p>
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
     * <p>The role of the first member. The value is fixed to owner.</p>
     * 
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The status of the workspace. Valid values: Active (running normally) and Locked (stopped due to an overdue payment or locked due to expiration).</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the workspace. Valid values: personal and enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>personal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the newly created workspace.</p>
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

}
