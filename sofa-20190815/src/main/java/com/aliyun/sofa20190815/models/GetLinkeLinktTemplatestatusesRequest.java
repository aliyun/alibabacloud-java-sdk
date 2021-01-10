// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktTemplatestatusesRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLinkeLinktTemplatestatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktTemplatestatusesRequest self = new GetLinkeLinktTemplatestatusesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktTemplatestatusesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
