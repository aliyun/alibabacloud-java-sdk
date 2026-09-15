// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateBuildConfig extends TeaModel {
    @NameInMap("copy")
    public CreateTemplateCopyAction copy;

    @NameInMap("envdInject")
    public CreateTemplateEnvdInjectAction envdInject;

    public static CreateTemplateBuildConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateBuildConfig self = new CreateTemplateBuildConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateBuildConfig setCopy(CreateTemplateCopyAction copy) {
        this.copy = copy;
        return this;
    }
    public CreateTemplateCopyAction getCopy() {
        return this.copy;
    }

    public CreateTemplateBuildConfig setEnvdInject(CreateTemplateEnvdInjectAction envdInject) {
        this.envdInject = envdInject;
        return this;
    }
    public CreateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

}
