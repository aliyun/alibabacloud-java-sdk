// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteAsrVocabResponse setBody(DeleteAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAsrVocabResponseBody getBody() {
        return this.body;
    }

}
