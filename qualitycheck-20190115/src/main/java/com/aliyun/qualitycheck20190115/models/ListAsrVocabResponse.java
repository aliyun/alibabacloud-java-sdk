// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAsrVocabResponse setBody(ListAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsrVocabResponseBody getBody() {
        return this.body;
    }

}
