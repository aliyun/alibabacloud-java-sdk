// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupSourceContentRequest extends TeaModel {
    /**
     * <p>The returned content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Updated body content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Specifies whether to force synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceSync")
    public Boolean forceSync;

    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The original project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateGroupSourceContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupSourceContentRequest self = new UpdateGroupSourceContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupSourceContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateGroupSourceContentRequest setForceSync(Boolean forceSync) {
        this.forceSync = forceSync;
        return this;
    }
    public Boolean getForceSync() {
        return this.forceSync;
    }

    public UpdateGroupSourceContentRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupSourceContentRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateGroupSourceContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
