// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    @NameInMap("buildConfig")
    public CreateTemplateBuildConfig buildConfig;

    /**
     * <strong>example:</strong>
     * <p>python-data-analysis</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("runtimeConfig")
    public CreateTemplateRuntimeConfig runtimeConfig;

    /**
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
