// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateRequest extends TeaModel {
    /**
     * <p>The detailed configurations of the AI template. The value is a JSON string.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The name of the AI template. The name can be up to 128 bytes in length.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the AI template. Valid values:</p>
     * <br>
     * <p>*   **AIMediaAudit**: automated review</p>
     * <p>*   **AIImage**: smart thumbnail</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static AddAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateRequest self = new AddAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddAITemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public AddAITemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddAITemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
