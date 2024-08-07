// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseGroupResponse extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>desc-111</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>bj123</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <strong>example:</strong>
     * <p>b38b5681bd964950ad8bc0f8ea504793</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>name-111</p>
     */
    @NameInMap("group_name")
    public String groupName;

    @NameInMap("is_sync")
    public Boolean isSync;

    @NameInMap("permission")
    public java.util.Map<String, IDPermission> permission;

    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    public static BaseGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseGroupResponse self = new BaseGroupResponse();
        return TeaModel.build(map, self);
    }

    public BaseGroupResponse setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public BaseGroupResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseGroupResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BaseGroupResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseGroupResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BaseGroupResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public BaseGroupResponse setIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }
    public Boolean getIsSync() {
        return this.isSync;
    }

    public BaseGroupResponse setPermission(java.util.Map<String, IDPermission> permission) {
        this.permission = permission;
        return this;
    }
    public java.util.Map<String, IDPermission> getPermission() {
        return this.permission;
    }

    public BaseGroupResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
