// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateStep extends TeaModel {
    @NameInMap("args")
    public java.util.List<String> args;

    @NameInMap("type")
    public String type;

    public static CreateTemplateStep build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateStep self = new CreateTemplateStep();
        return TeaModel.build(map, self);
    }

    public CreateTemplateStep setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public CreateTemplateStep setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
