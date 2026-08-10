// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateInitialKey")
    public Boolean generateInitialKey;

    /**
     * <strong>example:</strong>
     * <p>my-key</p>
     */
    @NameInMap("InitialKeyName")
    public String initialKeyName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>member</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateContextDatabaseMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseMemberRequest self = new CreateContextDatabaseMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseMemberRequest setGenerateInitialKey(Boolean generateInitialKey) {
        this.generateInitialKey = generateInitialKey;
        return this;
    }
    public Boolean getGenerateInitialKey() {
        return this.generateInitialKey;
    }

    public CreateContextDatabaseMemberRequest setInitialKeyName(String initialKeyName) {
        this.initialKeyName = initialKeyName;
        return this;
    }
    public String getInitialKeyName() {
        return this.initialKeyName;
    }

    public CreateContextDatabaseMemberRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateContextDatabaseMemberRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateContextDatabaseMemberRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
