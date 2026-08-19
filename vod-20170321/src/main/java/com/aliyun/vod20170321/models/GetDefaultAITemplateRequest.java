// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDefaultAITemplateRequest extends TeaModel {
    /**
     * <p>The AI templatetype. Set the value to <strong>AIMediaAudit</strong> (automated review).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AIMediaAudit</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static GetDefaultAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAITemplateRequest self = new GetDefaultAITemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultAITemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
