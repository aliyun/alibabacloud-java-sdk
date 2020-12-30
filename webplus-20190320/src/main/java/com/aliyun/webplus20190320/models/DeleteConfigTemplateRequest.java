// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateRequest self = new DeleteConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
