// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseWorkspaceRequest extends TeaModel {
    /**
     * <p>The name of the first member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-member</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>The permission mode selected when creating the workspace. Valid values:</p>
     * <ul>
     * <li><code>compatibility</code>: Compatibility mode. This mode is used if this parameter is not specified.</li>
     * <li><code>advanced</code>: Advanced permission mode. Only the Alibaba Cloud account can select this mode. It takes effect immediately after the workspace is created and cannot be disabled after creation.</li>
     * </ul>
     * <p>This parameter is a string, not a Boolean switch. Valid values are case-insensitive and ignore leading and trailing whitespace. If an empty string, a string with only whitespace, or an invalid value is explicitly specified, <code>InvalidParameter</code> (HTTP 400) is returned. If a RAM user selects <code>advanced</code>, <code>NoPermission</code> (HTTP 403) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("PermissionMode")
    public String permissionMode;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateContextDatabaseWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseWorkspaceRequest self = new CreateContextDatabaseWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseWorkspaceRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateContextDatabaseWorkspaceRequest setPermissionMode(String permissionMode) {
        this.permissionMode = permissionMode;
        return this;
    }
    public String getPermissionMode() {
        return this.permissionMode;
    }

    public CreateContextDatabaseWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
