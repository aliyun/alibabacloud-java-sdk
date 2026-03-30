// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecordingResponseBody body;

    public static GetRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingResponse self = new GetRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecordingResponse setBody(GetRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecordingResponseBody getBody() {
        return this.body;
    }

}
