// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class QueryFaceVideoTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryFaceVideoTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceVideoTemplateRequest self = new QueryFaceVideoTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceVideoTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
