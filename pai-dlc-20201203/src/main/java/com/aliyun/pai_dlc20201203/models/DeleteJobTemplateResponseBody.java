// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78F6FCE2-278F-4C4A-A6B7-DD8ECEA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tplwk80096dw****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplateResponseBody self = new DeleteJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
