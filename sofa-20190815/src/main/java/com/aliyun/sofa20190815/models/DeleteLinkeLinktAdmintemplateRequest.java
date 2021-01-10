// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktAdmintemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLinkeLinktAdmintemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktAdmintemplateRequest self = new DeleteLinkeLinktAdmintemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktAdmintemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
