// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static GetDetectionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionTemplateRequest self = new GetDetectionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
