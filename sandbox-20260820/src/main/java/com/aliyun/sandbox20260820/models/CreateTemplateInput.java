// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    /**
     * <p>The build configuration of the template. The build process is specified in blocks by action. If this parameter is not specified, the service automatically infers the configuration based on the source image: public runtime images are used directly without building, and other images automatically execute copy and envdInject.</p>
     */
    @NameInMap("buildConfig")
    public CreateTemplateBuildConfig buildConfig;

    /**
     * <p>The template name, which must be unique within the same team.</p>
     * 
     * <strong>example:</strong>
     * <p>python-data-analysis</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The runtime configuration of the template. This configuration determines the specifications and environment of sandbox instances created from this template.</p>
     */
    @NameInMap("runtimeConfig")
    public CreateTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The ID of the team to which the template belongs, in UUID format. If this parameter is not specified, the default team of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static CreateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateInput self = new CreateTemplateInput();
        return TeaModel.build(map, self);
    }

    public CreateTemplateInput setBuildConfig(CreateTemplateBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public CreateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public CreateTemplateInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateInput setRuntimeConfig(CreateTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public CreateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public CreateTemplateInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
