// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchCreateMaliciousNoteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateMaliciousNoteResponseBody body;

    public static BatchCreateMaliciousNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMaliciousNoteResponse self = new BatchCreateMaliciousNoteResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateMaliciousNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateMaliciousNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateMaliciousNoteResponse setBody(BatchCreateMaliciousNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateMaliciousNoteResponseBody getBody() {
        return this.body;
    }

}
