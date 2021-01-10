// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktTemplatecustomfieldRequest extends TeaModel {
    @NameInMap("CustomFieldId")
    public String customFieldId;

    @NameInMap("TemplateId")
    public String templateId;

    public static RemoveLinkeLinktTemplatecustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktTemplatecustomfieldRequest self = new RemoveLinkeLinktTemplatecustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktTemplatecustomfieldRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

    public RemoveLinkeLinktTemplatecustomfieldRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
