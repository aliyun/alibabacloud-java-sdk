// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8E70E3F8-E2EE-47BC-4677-379D6F28****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1706a0063dd733f6a823ef32e0a5****</p>
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
