// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateEnvdInjectAction extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    public static PublicUpdateTemplateEnvdInjectAction build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateEnvdInjectAction self = new PublicUpdateTemplateEnvdInjectAction();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateEnvdInjectAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
