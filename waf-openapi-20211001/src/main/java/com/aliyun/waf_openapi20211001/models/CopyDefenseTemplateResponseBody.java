// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CopyDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the new protection template.</p>
     * 
     * <strong>example:</strong>
     * <p>12346</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CopyDefenseTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDefenseTemplateResponseBody self = new CopyDefenseTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDefenseTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyDefenseTemplateResponseBody setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
