// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SubmitSqlPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSqlPreviewResponseBody body;

    public static SubmitSqlPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlPreviewResponse self = new SubmitSqlPreviewResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSqlPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSqlPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSqlPreviewResponse setBody(SubmitSqlPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSqlPreviewResponseBody getBody() {
        return this.body;
    }

}
