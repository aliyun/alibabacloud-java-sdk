// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAITemplateRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DeleteAITemplate**.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAITemplateRequest self = new DeleteAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAITemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
