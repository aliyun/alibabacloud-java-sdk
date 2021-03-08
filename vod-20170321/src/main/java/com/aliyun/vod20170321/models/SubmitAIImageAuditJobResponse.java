// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAIImageAuditJobResponseBody body;

    public static SubmitAIImageAuditJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageAuditJobResponse self = new SubmitAIImageAuditJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageAuditJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIImageAuditJobResponse setBody(SubmitAIImageAuditJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIImageAuditJobResponseBody getBody() {
        return this.body;
    }

}
