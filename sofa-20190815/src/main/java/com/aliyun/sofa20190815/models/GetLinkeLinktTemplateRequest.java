// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLinkeLinktTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktTemplateRequest self = new GetLinkeLinktTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
