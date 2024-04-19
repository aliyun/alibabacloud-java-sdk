// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAsrVocabResponseBody body;

    public static CreateAsrVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsrVocabResponse self = new CreateAsrVocabResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsrVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAsrVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAsrVocabResponse setBody(CreateAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAsrVocabResponseBody getBody() {
        return this.body;
    }

}
