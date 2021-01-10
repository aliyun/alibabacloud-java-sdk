// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktProjecttemplateRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateId")
    public String templateId;

    public static RemoveLinkeLinktProjecttemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktProjecttemplateRequest self = new RemoveLinkeLinktProjecttemplateRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktProjecttemplateRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public RemoveLinkeLinktProjecttemplateRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public RemoveLinkeLinktProjecttemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
