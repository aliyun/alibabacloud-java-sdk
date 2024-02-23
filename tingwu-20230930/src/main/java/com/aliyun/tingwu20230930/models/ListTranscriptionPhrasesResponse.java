// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class ListTranscriptionPhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTranscriptionPhrasesResponseBody body;

    public static ListTranscriptionPhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscriptionPhrasesResponse self = new ListTranscriptionPhrasesResponse();
        return TeaModel.build(map, self);
    }

    public ListTranscriptionPhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTranscriptionPhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTranscriptionPhrasesResponse setBody(ListTranscriptionPhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

}
