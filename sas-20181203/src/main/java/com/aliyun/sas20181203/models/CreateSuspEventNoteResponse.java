// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSuspEventNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSuspEventNoteResponseBody body;

    public static CreateSuspEventNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSuspEventNoteResponse self = new CreateSuspEventNoteResponse();
        return TeaModel.build(map, self);
    }

    public CreateSuspEventNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSuspEventNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSuspEventNoteResponse setBody(CreateSuspEventNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSuspEventNoteResponseBody getBody() {
        return this.body;
    }

}
