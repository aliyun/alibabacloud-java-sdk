// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateResponseBody extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultAITemplateResponseBody self = new SetDefaultAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SetDefaultAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
