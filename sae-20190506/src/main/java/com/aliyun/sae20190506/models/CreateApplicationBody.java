// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationBody extends TeaModel {
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    @NameInMap("PhpConfig")
    public String phpConfig;

    public static CreateApplicationBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationBody self = new CreateApplicationBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationBody setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public CreateApplicationBody setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

}
