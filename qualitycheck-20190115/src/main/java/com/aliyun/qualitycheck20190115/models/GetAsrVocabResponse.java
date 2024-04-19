// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAsrVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsrVocabResponse setBody(GetAsrVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsrVocabResponseBody getBody() {
        return this.body;
    }

}
