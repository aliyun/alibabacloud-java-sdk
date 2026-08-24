// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseApiKeyRequest extends TeaModel {
    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>for nightly cron</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>API Key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("KeyId")
    public Long keyId;

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
     * <p>The new display name.</p>
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

    public static UpdateContextDatabaseApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseApiKeyRequest self = new UpdateContextDatabaseApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateContextDatabaseApiKeyRequest setKeyId(Long keyId) {
        this.keyId = keyId;
        return this;
    }
    public Long getKeyId() {
        return this.keyId;
    }

    public UpdateContextDatabaseApiKeyRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateContextDatabaseApiKeyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContextDatabaseApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
