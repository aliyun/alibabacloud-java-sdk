// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the AI template.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SetDefaultAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultAITemplateResponseBody self = new SetDefaultAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDefaultAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
