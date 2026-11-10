// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseWorkspaceRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the workspace belongs. This parameter is optional.</p>
     * <ul>
     * <li>If you do not specify this parameter, the cluster selection logic that prioritizes account-exclusive storage is used.</li>
     * <li><code>default</code>: The shared cluster is used.</li>
     * <li>Cluster IDs starting with <code>acc-</code>: The associated dedicated cluster is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to generate an initial API key. This parameter is optional. Default value: <code>true</code>.</p>
     * <ul>
     * <li><code>true</code>: Generates the first API key and returns the key name and plaintext key.</li>
     * <li><code>false</code>: Does not generate an initial API key. The ApiKeyName and ApiKey fields in the response are empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateInitialKey")
    public Boolean generateInitialKey;

    /**
     * <p>The name of the first member when the workspace is created. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>my-member</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>The permission mode selected when the workspace is created. Valid values:</p>
     * <ul>
     * <li><code>compatibility</code>: The compatibility mode. This mode is used if you do not specify this parameter.</li>
     * <li><code>advanced</code>: The advanced permission mode. Only the Alibaba Cloud account can select this mode. It takes effect immediately after the workspace is created and cannot be disabled.</li>
     * </ul>
     * <p>This parameter is a string, not a Boolean switch. Valid values are case-insensitive and ignore leading and trailing whitespace. If you explicitly pass an empty string, pure whitespace, or other values, <code>InvalidParameter</code> (HTTP 400) is returned. If a RAM user selects <code>advanced</code>, <code>NoPermission</code> (HTTP 403) is returned.</p>
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

    public CreateContextDatabaseWorkspaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateContextDatabaseWorkspaceRequest setGenerateInitialKey(Boolean generateInitialKey) {
        this.generateInitialKey = generateInitialKey;
        return this;
    }
    public Boolean getGenerateInitialKey() {
        return this.generateInitialKey;
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
