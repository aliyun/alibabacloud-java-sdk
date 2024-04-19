// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAsrVocabResponseBody body;

    public static DeleteAsrVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsrVocabResponse self = new DeleteAsrVocabResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAsrVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAsrVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAsrVocabResponse setBody(DeleteAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAsrVocabResponseBody getBody() {
        return this.body;
    }

}
