// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateRequest extends TeaModel {
    /**
     * <p>The ID of the AI template. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template if no AI template exists. The value of TemplateId in the response is the ID of the AI template.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation if the template already exists. The value of TemplateId in the response is the ID of the AI template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1706a0063dd733f6a823ef32e0a5****</p>
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
