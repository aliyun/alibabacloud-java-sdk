// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktTemplateselectablecustomfieldsRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static ListLinkeLinktTemplateselectablecustomfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktTemplateselectablecustomfieldsRequest self = new ListLinkeLinktTemplateselectablecustomfieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktTemplateselectablecustomfieldsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
