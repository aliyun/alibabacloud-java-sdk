// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovetemplatefromprojectRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("TemplateId")
    public String templateId;

    public static CheckLinkeLinktRemovetemplatefromprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovetemplatefromprojectRequest self = new CheckLinkeLinktRemovetemplatefromprojectRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovetemplatefromprojectRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CheckLinkeLinktRemovetemplatefromprojectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
