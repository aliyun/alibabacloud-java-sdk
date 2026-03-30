// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ExportVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportVocabularyResponseBody body;

    public static ExportVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportVocabularyResponse self = new ExportVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public ExportVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportVocabularyResponse setBody(ExportVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportVocabularyResponseBody getBody() {
        return this.body;
    }

}
