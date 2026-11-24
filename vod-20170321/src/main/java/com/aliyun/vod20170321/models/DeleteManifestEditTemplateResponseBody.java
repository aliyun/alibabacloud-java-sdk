// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteManifestEditTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the deleted ManifestEdit template.</p>
     * 
     * <strong>example:</strong>
     * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteManifestEditTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteManifestEditTemplateResponseBody self = new DeleteManifestEditTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteManifestEditTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteManifestEditTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
