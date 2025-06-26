// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateAudioAsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAudioAsrTaskResponseBody body;

    public static CreateAudioAsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAudioAsrTaskResponse self = new CreateAudioAsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAudioAsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAudioAsrTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAudioAsrTaskResponse setBody(CreateAudioAsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAudioAsrTaskResponseBody getBody() {
        return this.body;
    }

}
