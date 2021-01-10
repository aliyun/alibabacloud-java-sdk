// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktTemplateworkflowRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryLinkeLinktTemplateworkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktTemplateworkflowRequest self = new QueryLinkeLinktTemplateworkflowRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktTemplateworkflowRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
