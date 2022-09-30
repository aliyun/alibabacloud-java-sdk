// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserDescriptionRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserName")
    public String userName;

    public static ModifyTenantUserDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserDescriptionRequest self = new ModifyTenantUserDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTenantUserDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantUserDescriptionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantUserDescriptionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
