// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateEnvdInjectAction extends TeaModel {
    /**
     * <p>Specifies whether to enable the envd injection action. This parameter is required when this action block is specified.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    public static CreateTemplateEnvdInjectAction build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateEnvdInjectAction self = new CreateTemplateEnvdInjectAction();
        return TeaModel.build(map, self);
    }

    public CreateTemplateEnvdInjectAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
