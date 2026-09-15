// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateInput extends TeaModel {
    @NameInMap("buildConfig")
    public PublicUpdateTemplateBuildConfig buildConfig;

    @NameInMap("runtimeConfig")
    public PublicUpdateTemplateRuntimeConfig runtimeConfig;

    public static PublicUpdateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateInput self = new PublicUpdateTemplateInput();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateInput setBuildConfig(PublicUpdateTemplateBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public PublicUpdateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public PublicUpdateTemplateInput setRuntimeConfig(PublicUpdateTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicUpdateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

}
