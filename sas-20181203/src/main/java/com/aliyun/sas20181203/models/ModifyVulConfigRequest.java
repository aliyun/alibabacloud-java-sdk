// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Type")
    public String type;

    public static ModifyVulConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulConfigRequest self = new ModifyVulConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVulConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyVulConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
