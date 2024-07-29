// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppRecordTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>lD7muaxx</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateAppRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRecordTemplateResponseBody self = new CreateAppRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppRecordTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
