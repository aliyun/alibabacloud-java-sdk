// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateMemoryAutoExtractionSwitchRequest extends TeaModel {
    /**
     * <p>是否同时清空当前记忆范围内的全部自动记忆；开启或关闭时均可使用，不影响手动记忆；不传时为 false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("clearExisting")
    public Boolean clearExisting;

    /**
     * <p>目标开关状态；true 为开启自动记忆拾取，false 为关闭</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>写作协作空间 ID；ownerType 为 group 时必填，且当前鉴权用户须为该空间的活跃成员；ownerType 为 user 时不传</p>
     * 
     * <strong>example:</strong>
     * <p>cg_12345</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>记忆归属范围；user 为当前鉴权用户的个人记忆，group 为指定写作协作空间的记忆；不传时默认为 user</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("ownerType")
    public String ownerType;

    /**
     * <p>租户 ID，查询参数；不传时使用调用方的默认租户</p>
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
