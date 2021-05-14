// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Config")
    public String config;

    @NameInMap("Target")
    public String target;

    public static ModifyLoginBaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginBaseConfigRequest self = new ModifyLoginBaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoginBaseConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyLoginBaseConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyLoginBaseConfigRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
