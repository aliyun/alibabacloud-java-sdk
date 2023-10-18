// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultAITemplateRequest extends TeaModel {
    /**
     * <p>The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:</p>
     * <br>
     * <p>*   Call the [AddAITemplate](~~102930~~) operation to add an AI template if no AI template exists. The value of TemplateId in the response is the ID of the AI template.</p>
     * <p>*   Call the [ListAITemplate](~~102936~~) operation if the template already exists. The value of TemplateId in the response is the ID of the AI template.</p>
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
