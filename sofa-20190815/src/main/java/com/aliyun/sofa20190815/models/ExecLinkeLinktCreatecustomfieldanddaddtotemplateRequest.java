// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("TemplateId")
    public String templateId;

    public static ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest self = new ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public ExecLinkeLinktCreatecustomfieldanddaddtotemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
