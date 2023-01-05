// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RecordFailureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecordFailureResponseBody body;

    public static RecordFailureResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordFailureResponse self = new RecordFailureResponse();
        return TeaModel.build(map, self);
    }

    public RecordFailureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordFailureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordFailureResponse setBody(RecordFailureResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordFailureResponseBody getBody() {
        return this.body;
    }

}
