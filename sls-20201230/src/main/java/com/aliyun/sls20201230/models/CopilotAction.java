// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CopilotAction extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("parameters")
    public java.util.List<CopilotActionParameters> parameters;

    @NameInMap("queryMaxLength")
    public Long queryMaxLength;

    @NameInMap("queryTemplate")
    public String queryTemplate;

    @NameInMap("queryTemplateParameters")
    public java.util.List<CopilotActionQueryTemplateParameters> queryTemplateParameters;

    @NameInMap("scene")
    public String scene;

    public static CopilotAction build(java.util.Map<String, ?> map) throws Exception {
        CopilotAction self = new CopilotAction();
        return TeaModel.build(map, self);
    }

    public CopilotAction setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CopilotAction setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CopilotAction setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopilotAction setParameters(java.util.List<CopilotActionParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CopilotActionParameters> getParameters() {
        return this.parameters;
    }

    public CopilotAction setQueryMaxLength(Long queryMaxLength) {
        this.queryMaxLength = queryMaxLength;
        return this;
    }
    public Long getQueryMaxLength() {
        return this.queryMaxLength;
    }

    public CopilotAction setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public CopilotAction setQueryTemplateParameters(java.util.List<CopilotActionQueryTemplateParameters> queryTemplateParameters) {
        this.queryTemplateParameters = queryTemplateParameters;
        return this;
    }
    public java.util.List<CopilotActionQueryTemplateParameters> getQueryTemplateParameters() {
        return this.queryTemplateParameters;
    }

    public CopilotAction setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public static class CopilotActionParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("prompt")
        public String prompt;

        @NameInMap("required")
        public String required;

        @NameInMap("type")
        public String type;

        public static CopilotActionParameters build(java.util.Map<String, ?> map) throws Exception {
            CopilotActionParameters self = new CopilotActionParameters();
            return TeaModel.build(map, self);
        }

        public CopilotActionParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopilotActionParameters setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CopilotActionParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public CopilotActionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CopilotActionQueryTemplateParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("prompt")
        public String prompt;

        @NameInMap("required")
        public String required;

        @NameInMap("type")
        public String type;

        public static CopilotActionQueryTemplateParameters build(java.util.Map<String, ?> map) throws Exception {
            CopilotActionQueryTemplateParameters self = new CopilotActionQueryTemplateParameters();
            return TeaModel.build(map, self);
        }

        public CopilotActionQueryTemplateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopilotActionQueryTemplateParameters setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CopilotActionQueryTemplateParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public CopilotActionQueryTemplateParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
