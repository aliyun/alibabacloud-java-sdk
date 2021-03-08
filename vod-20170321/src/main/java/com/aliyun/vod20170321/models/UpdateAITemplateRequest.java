// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAITemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    public static UpdateAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITemplateRequest self = new UpdateAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAITemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateAITemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateAITemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

}
