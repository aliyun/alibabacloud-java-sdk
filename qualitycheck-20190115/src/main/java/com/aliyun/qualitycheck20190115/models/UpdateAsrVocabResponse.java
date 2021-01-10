// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAsrVocabResponseBody body;

    public static UpdateAsrVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAsrVocabResponse self = new UpdateAsrVocabResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAsrVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAsrVocabResponse setBody(UpdateAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAsrVocabResponseBody getBody() {
        return this.body;
    }

}
