// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F48ABDF7-D777-5F26-892A-57349765D7A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the protection rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>2212</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateDefenseTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseTemplateResponseBody self = new CreateDefenseTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefenseTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefenseTemplateResponseBody setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
