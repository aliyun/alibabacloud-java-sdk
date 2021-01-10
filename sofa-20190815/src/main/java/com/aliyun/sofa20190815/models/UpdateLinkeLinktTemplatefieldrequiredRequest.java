// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktTemplatefieldrequiredRequest extends TeaModel {
    @NameInMap("CustomFieldId")
    public String customFieldId;

    @NameInMap("Required")
    public String required;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLinkeLinktTemplatefieldrequiredRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktTemplatefieldrequiredRequest self = new UpdateLinkeLinktTemplatefieldrequiredRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktTemplatefieldrequiredRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

    public UpdateLinkeLinktTemplatefieldrequiredRequest setRequired(String required) {
        this.required = required;
        return this;
    }
    public String getRequired() {
        return this.required;
    }

    public UpdateLinkeLinktTemplatefieldrequiredRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
