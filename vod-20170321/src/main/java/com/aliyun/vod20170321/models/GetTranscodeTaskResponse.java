// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranscodeTaskResponseBody body;

    public static GetTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskResponse self = new GetTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranscodeTaskResponse setBody(GetTranscodeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeTaskResponseBody getBody() {
        return this.body;
    }

}
