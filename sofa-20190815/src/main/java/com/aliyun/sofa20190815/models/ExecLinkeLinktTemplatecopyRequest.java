// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktTemplatecopyRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateId")
    public String templateId;

    public static ExecLinkeLinktTemplatecopyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktTemplatecopyRequest self = new ExecLinkeLinktTemplatecopyRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktTemplatecopyRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ExecLinkeLinktTemplatecopyRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
