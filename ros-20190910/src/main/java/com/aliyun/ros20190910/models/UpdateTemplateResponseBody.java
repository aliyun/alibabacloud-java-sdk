// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C5D90E1-66B6-496C-9371-3807F8DA80A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template version affected by this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTemplateResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
