// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateResponseBody extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateResponseBody self = new AddAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AddAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
