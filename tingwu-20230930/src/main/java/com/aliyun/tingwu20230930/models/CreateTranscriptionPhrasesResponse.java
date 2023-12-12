// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTranscriptionPhrasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTranscriptionPhrasesResponseBody body;

    public static CreateTranscriptionPhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTranscriptionPhrasesResponse self = new CreateTranscriptionPhrasesResponse();
        return TeaModel.build(map, self);
    }

    public CreateTranscriptionPhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTranscriptionPhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTranscriptionPhrasesResponse setBody(CreateTranscriptionPhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

}
