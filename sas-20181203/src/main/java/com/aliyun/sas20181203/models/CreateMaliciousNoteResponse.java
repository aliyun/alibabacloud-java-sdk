// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMaliciousNoteResponseBody body;

    public static CreateMaliciousNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaliciousNoteResponse self = new CreateMaliciousNoteResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaliciousNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaliciousNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaliciousNoteResponse setBody(CreateMaliciousNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaliciousNoteResponseBody getBody() {
        return this.body;
    }

}
