// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GrantAgentUsersRequest extends TeaModel {
    /**
     * <p>授权截止时间戳（毫秒），不传表示永不过期</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expireDate")
    public Long expireDate;

    /**
     * <p>数字员工名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>权限列表：USE（使用权限）和/或 MANAGE（管理权限），不传时默认仅 USE；不得为空列表</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("permissions")
    public java.util.List<String> permissions;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>676577544219585</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>被授权的用户组 ID 列表（16位 hex 字符串）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>被授权的用户 ID 列表</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userIds")
    public java.util.List<String> userIds;

    public static GrantAgentUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAgentUsersRequest self = new GrantAgentUsersRequest();
        return TeaModel.build(map, self);
    }

    public GrantAgentUsersRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public GrantAgentUsersRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public GrantAgentUsersRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public GrantAgentUsersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GrantAgentUsersRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public GrantAgentUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
