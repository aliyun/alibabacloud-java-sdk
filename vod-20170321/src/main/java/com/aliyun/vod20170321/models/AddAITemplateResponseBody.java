// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddAITemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the AI template.</p>
     * 
     * <strong>example:</strong>
     * <p>1706a0063dd733f6a823ef32e0a5****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static AddAITemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAITemplateResponseBody self = new AddAITemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAITemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAITemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
