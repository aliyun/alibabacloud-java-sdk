// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created task template.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-123456</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateDataProcessJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobTemplateResponseBody self = new CreateDataProcessJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataProcessJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
