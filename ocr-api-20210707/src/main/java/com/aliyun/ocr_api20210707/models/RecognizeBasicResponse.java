// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBasicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeBasicResponseBody body;

    public static RecognizeBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBasicResponse self = new RecognizeBasicResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBasicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeBasicResponse setBody(RecognizeBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBasicResponseBody getBody() {
        return this.body;
    }

}
