// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktTemplatecustomfieldRequest extends TeaModel {
    @NameInMap("CustomFieldId")
    public String customFieldId;

    @NameInMap("TemplateId")
    public String templateId;

    public static AddLinkeLinktTemplatecustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktTemplatecustomfieldRequest self = new AddLinkeLinktTemplatecustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktTemplatecustomfieldRequest setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }
    public String getCustomFieldId() {
        return this.customFieldId;
    }

    public AddLinkeLinktTemplatecustomfieldRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
