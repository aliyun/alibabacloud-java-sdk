// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMaliciousNoteResponseBody body;

    public static DeleteMaliciousNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaliciousNoteResponse self = new DeleteMaliciousNoteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaliciousNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaliciousNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaliciousNoteResponse setBody(DeleteMaliciousNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaliciousNoteResponseBody getBody() {
        return this.body;
    }

}
