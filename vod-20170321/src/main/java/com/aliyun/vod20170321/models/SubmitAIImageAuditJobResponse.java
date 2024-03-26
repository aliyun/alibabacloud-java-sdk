// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitAIImageAuditJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIImageAuditJobResponse setBody(SubmitAIImageAuditJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIImageAuditJobResponseBody getBody() {
        return this.body;
    }

}
