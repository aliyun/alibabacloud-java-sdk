// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The time when the workspace was created, in ISO-8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workspace status. The value is fixed as Deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>Deleted</p>
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

    public DeleteContextDatabaseWorkspaceResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
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

}
