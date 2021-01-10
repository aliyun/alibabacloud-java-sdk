// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktTemplatescopyRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateIds")
    public String templateIds;

    public static ExecLinkeLinktTemplatescopyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktTemplatescopyRequest self = new ExecLinkeLinktTemplatescopyRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktTemplatescopyRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ExecLinkeLinktTemplatescopyRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

}
