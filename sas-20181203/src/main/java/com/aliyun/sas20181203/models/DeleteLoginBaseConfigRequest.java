// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Config")
    public String config;

    @NameInMap("Target")
    public String target;

    public static DeleteLoginBaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginBaseConfigRequest self = new DeleteLoginBaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoginBaseConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteLoginBaseConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DeleteLoginBaseConfigRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
