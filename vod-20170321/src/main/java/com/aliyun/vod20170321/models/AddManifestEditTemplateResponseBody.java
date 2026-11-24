// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddManifestEditTemplateResponseBody extends TeaModel {
    /**
     * <p><strong>The request ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>req-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p><strong>The ID of the new template.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>met-abc123</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static AddManifestEditTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddManifestEditTemplateResponseBody self = new AddManifestEditTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddManifestEditTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddManifestEditTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
