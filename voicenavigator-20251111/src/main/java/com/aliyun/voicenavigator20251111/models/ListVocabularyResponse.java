// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVocabularyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVocabularyResponseBody body;

    public static ListVocabularyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVocabularyResponse self = new ListVocabularyResponse();
        return TeaModel.build(map, self);
    }

    public ListVocabularyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVocabularyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVocabularyResponse setBody(ListVocabularyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVocabularyResponseBody getBody() {
        return this.body;
    }

}
