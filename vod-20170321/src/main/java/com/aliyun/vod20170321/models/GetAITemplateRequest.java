// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateRequest extends TeaModel {
    /**
     * <p>The AI template ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, the AI template ID is the value of the TemplateId parameter in the response.</li>
     * <li>After the AI template is added, you can call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI template ID, which is the value of the TemplateId parameter in the response.</li>
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
