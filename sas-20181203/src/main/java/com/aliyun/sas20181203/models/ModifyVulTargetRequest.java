// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Target")
    public String target;

    public static ModifyVulTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetRequest self = new ModifyVulTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyVulTargetRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
