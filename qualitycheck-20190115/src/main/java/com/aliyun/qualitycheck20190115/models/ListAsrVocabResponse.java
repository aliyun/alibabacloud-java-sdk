// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAsrVocabResponseBody body;

    public static ListAsrVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsrVocabResponse self = new ListAsrVocabResponse();
        return TeaModel.build(map, self);
    }

    public ListAsrVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsrVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAsrVocabResponse setBody(ListAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsrVocabResponseBody getBody() {
        return this.body;
    }

}
