// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAITemplateRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The name of the AI template. The name can be up to 128 bytes in length.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The detailed configurations of the AI template. The value is a JSON string. For more information, see [AITemplateConfig](https://help.aliyun.com/document_detail/89863.html#title-vd3-499-o36).</p>
     */
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
