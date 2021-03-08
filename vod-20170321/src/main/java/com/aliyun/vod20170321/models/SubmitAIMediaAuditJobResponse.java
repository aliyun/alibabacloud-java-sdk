// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAIMediaAuditJobResponseBody body;

    public static SubmitAIMediaAuditJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobResponse self = new SubmitAIMediaAuditJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIMediaAuditJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIMediaAuditJobResponse setBody(SubmitAIMediaAuditJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIMediaAuditJobResponseBody getBody() {
        return this.body;
    }

}
