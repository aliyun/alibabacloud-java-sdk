// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitAIMediaAuditJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIMediaAuditJobResponse setBody(SubmitAIMediaAuditJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIMediaAuditJobResponseBody getBody() {
        return this.body;
    }

}
