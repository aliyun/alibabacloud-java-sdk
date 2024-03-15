// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeIdcardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeIdcardResponseBody body;

    public static RecognizeIdcardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdcardResponse self = new RecognizeIdcardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIdcardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeIdcardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeIdcardResponse setBody(RecognizeIdcardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeIdcardResponseBody getBody() {
        return this.body;
    }

}
