// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEnglishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeEnglishResponseBody body;

    public static RecognizeEnglishResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEnglishResponse self = new RecognizeEnglishResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEnglishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEnglishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEnglishResponse setBody(RecognizeEnglishResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEnglishResponseBody getBody() {
        return this.body;
    }

}
