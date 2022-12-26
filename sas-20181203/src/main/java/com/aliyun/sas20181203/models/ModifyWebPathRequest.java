// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebPathRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Target")
    public String target;

    @NameInMap("Type")
    public String type;

    public static ModifyWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPathRequest self = new ModifyWebPathRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebPathRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyWebPathRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
