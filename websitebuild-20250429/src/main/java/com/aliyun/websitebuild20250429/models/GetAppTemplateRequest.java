// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>JKSVNY04LH7DRI6F</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateRequest self = new GetAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
