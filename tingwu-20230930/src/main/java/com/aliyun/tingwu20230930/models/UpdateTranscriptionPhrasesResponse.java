// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class UpdateTranscriptionPhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTranscriptionPhrasesResponseBody body;

    public static UpdateTranscriptionPhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscriptionPhrasesResponse self = new UpdateTranscriptionPhrasesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTranscriptionPhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTranscriptionPhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTranscriptionPhrasesResponse setBody(UpdateTranscriptionPhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

}
