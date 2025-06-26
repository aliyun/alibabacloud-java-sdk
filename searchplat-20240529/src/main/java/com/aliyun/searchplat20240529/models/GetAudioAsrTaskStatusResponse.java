// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetAudioAsrTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAudioAsrTaskStatusResponseBody body;

    public static GetAudioAsrTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsrTaskStatusResponse self = new GetAudioAsrTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioAsrTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAudioAsrTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAudioAsrTaskStatusResponse setBody(GetAudioAsrTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAudioAsrTaskStatusResponseBody getBody() {
        return this.body;
    }

}
