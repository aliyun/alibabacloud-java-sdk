// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CancelSqlPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSqlPreviewResponseBody body;

    public static CancelSqlPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSqlPreviewResponse self = new CancelSqlPreviewResponse();
        return TeaModel.build(map, self);
    }

    public CancelSqlPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSqlPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSqlPreviewResponse setBody(CancelSqlPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSqlPreviewResponseBody getBody() {
        return this.body;
    }

}
