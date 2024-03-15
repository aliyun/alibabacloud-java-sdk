// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMultiLanguageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeMultiLanguageResponseBody body;

    public static RecognizeMultiLanguageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMultiLanguageResponse self = new RecognizeMultiLanguageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMultiLanguageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMultiLanguageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMultiLanguageResponse setBody(RecognizeMultiLanguageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMultiLanguageResponseBody getBody() {
        return this.body;
    }

}
