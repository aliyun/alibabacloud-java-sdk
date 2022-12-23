// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAITemplateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the template.
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITemplateResponseBody self = new UpdateAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
