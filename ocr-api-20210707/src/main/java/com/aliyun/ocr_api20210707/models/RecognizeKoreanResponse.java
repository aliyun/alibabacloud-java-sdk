// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeKoreanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeKoreanResponseBody body;

    public static RecognizeKoreanResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeKoreanResponse self = new RecognizeKoreanResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeKoreanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeKoreanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeKoreanResponse setBody(RecognizeKoreanResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeKoreanResponseBody getBody() {
        return this.body;
    }

}
