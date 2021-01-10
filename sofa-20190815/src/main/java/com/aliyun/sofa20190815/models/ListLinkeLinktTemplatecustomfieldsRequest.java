// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktTemplatecustomfieldsRequest extends TeaModel {
    @NameInMap("ExcludeInvisible")
    public String excludeInvisible;

    @NameInMap("TemplateId")
    public String templateId;

    public static ListLinkeLinktTemplatecustomfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktTemplatecustomfieldsRequest self = new ListLinkeLinktTemplatecustomfieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktTemplatecustomfieldsRequest setExcludeInvisible(String excludeInvisible) {
        this.excludeInvisible = excludeInvisible;
        return this;
    }
    public String getExcludeInvisible() {
        return this.excludeInvisible;
    }

    public ListLinkeLinktTemplatecustomfieldsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
