// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVocabularyResponseBody body;

    public static GetVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVocabularyResponse self = new GetVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public GetVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVocabularyResponse setBody(GetVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVocabularyResponseBody getBody() {
        return this.body;
    }

}
