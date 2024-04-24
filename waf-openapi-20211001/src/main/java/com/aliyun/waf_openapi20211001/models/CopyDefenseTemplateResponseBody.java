// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CopyDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the new protection template.</p>
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
