// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ClearAutoMemoryRequest extends TeaModel {
    /**
     * <p>The workspace ID. This parameter is required when ownerType is set to group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_12345</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The owner type. Valid values:</p>
     * <ul>
     * <li>user: the personal memory of the authenticated user.</li>
     * <li>group: the memory of a specified workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("ownerType")
    public String ownerType;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The memory type. Valid values: user, feedback, reference, project, and all. A value of all does not clear manual memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("type")
    public String type;

    public static ClearAutoMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearAutoMemoryRequest self = new ClearAutoMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ClearAutoMemoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ClearAutoMemoryRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public ClearAutoMemoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ClearAutoMemoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
