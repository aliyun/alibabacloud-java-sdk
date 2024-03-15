// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHKIdcardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeHKIdcardResponseBody body;

    public static RecognizeHKIdcardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHKIdcardResponse self = new RecognizeHKIdcardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHKIdcardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHKIdcardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHKIdcardResponse setBody(RecognizeHKIdcardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHKIdcardResponseBody getBody() {
        return this.body;
    }

}
