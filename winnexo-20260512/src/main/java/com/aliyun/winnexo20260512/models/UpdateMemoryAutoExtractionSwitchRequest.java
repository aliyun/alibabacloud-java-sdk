// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateMemoryAutoExtractionSwitchRequest extends TeaModel {
    /**
     * <p>Specifies whether to synchronously clear the automatically collected memory. This parameter can be used when enabling or disabling the feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("clearExisting")
    public Boolean clearExisting;

    /**
     * <p>Specifies whether to enable automatic memory collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the collaboration workspace. This parameter is required when ownerType is set to group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_12345</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The owner type. Valid values:</p>
     * <ul>
     * <li>user: the personal memory of the authenticated user</li>
     * <li>group: the memory of the specified collaboration workspace</li>
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

    public static UpdateMemoryAutoExtractionSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryAutoExtractionSwitchRequest self = new UpdateMemoryAutoExtractionSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryAutoExtractionSwitchRequest setClearExisting(Boolean clearExisting) {
        this.clearExisting = clearExisting;
        return this;
    }
    public Boolean getClearExisting() {
        return this.clearExisting;
    }

    public UpdateMemoryAutoExtractionSwitchRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateMemoryAutoExtractionSwitchRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateMemoryAutoExtractionSwitchRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public UpdateMemoryAutoExtractionSwitchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
