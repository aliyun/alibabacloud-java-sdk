// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAITemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAITemplateResponseBody self = new DeleteAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
