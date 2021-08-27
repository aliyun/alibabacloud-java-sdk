// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
