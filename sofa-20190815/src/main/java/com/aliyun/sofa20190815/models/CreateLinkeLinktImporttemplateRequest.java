// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktImporttemplateRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateLinkeLinktImporttemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktImporttemplateRequest self = new CreateLinkeLinktImporttemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktImporttemplateRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktImporttemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
