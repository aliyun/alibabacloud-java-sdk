// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRussianResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeRussianResponseBody body;

    public static RecognizeRussianResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussianResponse self = new RecognizeRussianResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeRussianResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeRussianResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeRussianResponse setBody(RecognizeRussianResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeRussianResponseBody getBody() {
        return this.body;
    }

}
