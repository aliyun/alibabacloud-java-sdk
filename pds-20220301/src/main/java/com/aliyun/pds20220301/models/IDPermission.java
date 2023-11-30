// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class IDPermission extends TeaModel {
    @NameInMap("disinherit_sub_group")
    public Boolean disinheritSubGroup;

    @NameInMap("expire_time")
    public Long expireTime;

    @NameInMap("permission")
    public Permission permission;

    @NameInMap("roles")
    public java.util.List<String> roles;

    public static IDPermission build(java.util.Map<String, ?> map) throws Exception {
        IDPermission self = new IDPermission();
        return TeaModel.build(map, self);
    }

    public IDPermission setDisinheritSubGroup(Boolean disinheritSubGroup) {
        this.disinheritSubGroup = disinheritSubGroup;
        return this;
    }
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    public IDPermission setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public IDPermission setPermission(Permission permission) {
        this.permission = permission;
        return this;
    }
    public Permission getPermission() {
        return this.permission;
    }

    public IDPermission setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

}
