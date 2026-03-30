// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ImportVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportVocabularyResponseBody body;

    public static ImportVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportVocabularyResponse self = new ImportVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public ImportVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportVocabularyResponse setBody(ImportVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportVocabularyResponseBody getBody() {
        return this.body;
    }

}
