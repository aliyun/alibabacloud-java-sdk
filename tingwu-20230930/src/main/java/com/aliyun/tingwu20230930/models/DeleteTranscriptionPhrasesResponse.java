// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class DeleteTranscriptionPhrasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTranscriptionPhrasesResponseBody body;

    public static DeleteTranscriptionPhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscriptionPhrasesResponse self = new DeleteTranscriptionPhrasesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTranscriptionPhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTranscriptionPhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTranscriptionPhrasesResponse setBody(DeleteTranscriptionPhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

}
