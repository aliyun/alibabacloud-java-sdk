// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseMemberRequest extends TeaModel {
    /**
     * <p>The member ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mb-cz51tnnp8****</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The new role. Valid values: owner, admin, and member. If not specified, the current role is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The new status. Valid values: active, disabled, and deleted. If not specified, the current status is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateContextDatabaseMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseMemberRequest self = new UpdateContextDatabaseMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateContextDatabaseMemberRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateContextDatabaseMemberRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateContextDatabaseMemberRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
