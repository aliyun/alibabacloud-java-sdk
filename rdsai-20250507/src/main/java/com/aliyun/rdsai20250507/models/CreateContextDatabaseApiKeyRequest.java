// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseApiKeyRequest extends TeaModel {
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
     * <p>The API key name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-key</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateContextDatabaseApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseApiKeyRequest self = new CreateContextDatabaseApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseApiKeyRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public CreateContextDatabaseApiKeyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContextDatabaseApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
