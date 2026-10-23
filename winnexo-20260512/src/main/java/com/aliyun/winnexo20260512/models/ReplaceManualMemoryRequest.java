// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceManualMemoryRequest extends TeaModel {
    /**
     * <p>The complete content of profile.md. An empty string indicates that the memory is cleared. This field is required, but an empty value is allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prefers concise answers</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The workspace ID. This parameter is required when ownerType is set to group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_12345</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The owner type. A value of user indicates the personal memory of the authenticated user. A value of group indicates the memory of a specified workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("ownerType")
    public String ownerType;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceManualMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceManualMemoryRequest self = new ReplaceManualMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceManualMemoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplaceManualMemoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReplaceManualMemoryRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public ReplaceManualMemoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
