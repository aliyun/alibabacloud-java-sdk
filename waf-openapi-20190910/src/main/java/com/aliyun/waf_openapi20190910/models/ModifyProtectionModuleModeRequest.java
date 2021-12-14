// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleModeRequest extends TeaModel {
    @NameInMap("DefenseType")
    public String defenseType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public Integer mode;

    public static ModifyProtectionModuleModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleModeRequest self = new ModifyProtectionModuleModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleModeRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public ModifyProtectionModuleModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionModuleModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProtectionModuleModeRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

}
