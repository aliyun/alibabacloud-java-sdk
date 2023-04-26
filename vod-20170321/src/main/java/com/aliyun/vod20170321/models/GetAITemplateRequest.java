// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateRequest extends TeaModel {
    /**
     * <p>The source of the AI template. Valid values:</p>
     * <br>
     * <p>*   **System**</p>
     * <p>*   **Custom**</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateRequest self = new GetAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAITemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
