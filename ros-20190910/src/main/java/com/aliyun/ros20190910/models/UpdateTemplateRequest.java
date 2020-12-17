// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
