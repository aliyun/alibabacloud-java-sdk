// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateInput extends TeaModel {
    /**
     * <p>The build configuration.</p>
     */
    @NameInMap("buildConfig")
    public PublicUpdateTemplateBuildConfig buildConfig;

    /**
     * <p>The subscription plan for the team. Valid values: eco, std, and pro.</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("plan")
    public String plan;

    /**
     * <p>The runtime configuration.</p>
     */
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

    public PublicUpdateTemplateInput setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public PublicUpdateTemplateInput setRuntimeConfig(PublicUpdateTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicUpdateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

}
