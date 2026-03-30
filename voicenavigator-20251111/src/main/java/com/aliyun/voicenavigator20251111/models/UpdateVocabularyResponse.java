// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVocabularyResponseBody body;

    public static UpdateVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabularyResponse self = new UpdateVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVocabularyResponse setBody(UpdateVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVocabularyResponseBody getBody() {
        return this.body;
    }

}
