// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateRequest extends TeaModel {
    /**
     * <p>Specifies an AI template as the default template.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SetDefaultAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultAITemplateRequest self = new SetDefaultAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultAITemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
