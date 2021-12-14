// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleStatusRequest extends TeaModel {
    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModuleStatus")
    public Integer moduleStatus;

    public static ModifyProtectionModuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleStatusRequest self = new ModifyProtectionModuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleStatusRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionModuleStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionModuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProtectionModuleStatusRequest setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
        return this;
    }
    public Integer getModuleStatus() {
        return this.moduleStatus;
    }

}
