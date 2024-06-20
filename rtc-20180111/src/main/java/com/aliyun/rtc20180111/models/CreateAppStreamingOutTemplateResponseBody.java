// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppStreamingOutTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>30D41049-D02D-1C21-86AE-B3E5FD805C27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>bc5v****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateAppStreamingOutTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppStreamingOutTemplateResponseBody self = new CreateAppStreamingOutTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppStreamingOutTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppStreamingOutTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
