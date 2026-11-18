// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    /**
     * <p>The build configuration of the template. This configuration specifies the build process in action-based chunks. If this parameter is not specified, the service automatically derives the configuration based on the source image. Public runtime images are used directly without building. For other images, the copy and envdInject actions are automatically executed.</p>
     */
    @NameInMap("buildConfig")
    public CreateTemplateBuildConfig buildConfig;

    /**
     * <p>The name of the template. The name must be unique within the same team.</p>
     * 
     * <strong>example:</strong>
     * <p>python-data-analysis</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("resourceTags")
    public java.util.List<CreateTemplateInputResourceTags> resourceTags;

    /**
     * <p>The runtime configuration of the template. This configuration determines the specifications and environment of the sandbox instances created from the template.</p>
     */
    @NameInMap("runtimeConfig")
    public CreateTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The ID of the team to which the template belongs. The ID must be in UUID format. If this parameter is not specified, the default team of the current account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The templatetype. Set this parameter to layer to build a layer template.</p>
     * 
     * <strong>example:</strong>
     * <p>layer</p>
     */
    @NameInMap("templateType")
    public String templateType;

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

    public CreateTemplateInput setResourceTags(java.util.List<CreateTemplateInputResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<CreateTemplateInputResourceTags> getResourceTags() {
        return this.resourceTags;
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

    public CreateTemplateInput setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class CreateTemplateInputResourceTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateTemplateInputResourceTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateInputResourceTags self = new CreateTemplateInputResourceTags();
            return TeaModel.build(map, self);
        }

        public CreateTemplateInputResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateInputResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
