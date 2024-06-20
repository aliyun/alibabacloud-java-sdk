// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTemplateResponseBody self = new UpdateRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRecordTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
