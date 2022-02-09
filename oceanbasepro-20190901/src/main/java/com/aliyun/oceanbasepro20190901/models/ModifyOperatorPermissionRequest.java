// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOperatorPermissionRequest extends TeaModel {
    // 时间字符串
    @NameInMap("ExpiredTime")
    public String expiredTime;

    // Oceanbase集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 权限列表
    @NameInMap("Roles")
    public String roles;

    public static ModifyOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperatorPermissionRequest self = new ModifyOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOperatorPermissionRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyOperatorPermissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyOperatorPermissionRequest setRoles(String roles) {
        this.roles = roles;
        return this;
    }
    public String getRoles() {
        return this.roles;
    }

}
