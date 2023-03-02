// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateRequest extends TeaModel {
    /**
     * <p>The type of the AI template. Valid values:</p>
     * <br>
     * <p>*   **AIMediaAudit**: automated review</p>
     * <p>*   **AIImage**: smart thumbnail</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateRequest self = new ListAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListAITemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
