// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePermissionMember extends TeaModel {
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    @NameInMap("disinherit_sub_group")
    public Boolean disinheritSubGroup;

    @NameInMap("expire_time")
    public Long expireTime;

    @NameInMap("identity")
    public Identity identity;

    @NameInMap("role_id")
    public String roleId;

    public static FilePermissionMember build(java.util.Map<String, ?> map) throws Exception {
        FilePermissionMember self = new FilePermissionMember();
        return TeaModel.build(map, self);
    }

    public FilePermissionMember setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public FilePermissionMember setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public FilePermissionMember setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public FilePermissionMember setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public FilePermissionMember setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
