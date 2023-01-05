// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitRecordingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitRecordingResponseBody body;

    public static SubmitRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitRecordingResponse self = new SubmitRecordingResponse();
        return TeaModel.build(map, self);
    }

    public SubmitRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitRecordingResponse setBody(SubmitRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitRecordingResponseBody getBody() {
        return this.body;
    }

}
