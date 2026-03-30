// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVocabularyResponseBody body;

    public static CreateVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabularyResponse self = new CreateVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public CreateVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVocabularyResponse setBody(CreateVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVocabularyResponseBody getBody() {
        return this.body;
    }

}
