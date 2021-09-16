// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDetectionTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteDetectionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionTemplateRequest self = new DeleteDetectionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
