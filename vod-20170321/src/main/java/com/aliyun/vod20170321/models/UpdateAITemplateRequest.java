// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAITemplateRequest extends TeaModel {
    // The detailed configurations of the AI template. The value is a JSON string.
    @NameInMap("TemplateConfig")
    public String templateConfig;

    // The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:
    // 
    // *   Call the [AddAITemplate](~~102930~~) operation to add an AI template if no AI template exists. The value of TemplateId from the response is the ID of the AI template.
    // *   Call the [ListAITemplate](~~102936~~) operation if the template already exists. The value of TemplateId from the response is the ID of the AI template.
    @NameInMap("TemplateId")
    public String templateId;

    // The name of the AI template. The name can be up to 128 bytes in length.
    @NameInMap("TemplateName")
    public String templateName;

    public static UpdateAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITemplateRequest self = new UpdateAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAITemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
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

}
