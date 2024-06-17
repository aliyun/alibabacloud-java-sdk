// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PushDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushDocumentsResponseBody body;

    public static PushDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDocumentsResponse self = new PushDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public PushDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDocumentsResponse setBody(PushDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDocumentsResponseBody getBody() {
        return this.body;
    }

}
