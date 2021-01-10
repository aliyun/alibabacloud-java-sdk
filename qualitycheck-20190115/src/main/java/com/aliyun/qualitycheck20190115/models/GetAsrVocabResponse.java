// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsrVocabResponseBody body;

    public static GetAsrVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsrVocabResponse self = new GetAsrVocabResponse();
        return TeaModel.build(map, self);
    }

    public GetAsrVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsrVocabResponse setBody(GetAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsrVocabResponseBody getBody() {
        return this.body;
    }

}
