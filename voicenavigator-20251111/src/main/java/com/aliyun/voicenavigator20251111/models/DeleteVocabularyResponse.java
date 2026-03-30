// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVocabularyResponseBody body;

    public static DeleteVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVocabularyResponse self = new DeleteVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVocabularyResponse setBody(DeleteVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVocabularyResponseBody getBody() {
        return this.body;
    }

}
