// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInternationalIdcardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeInternationalIdcardResponseBody body;

    public static RecognizeInternationalIdcardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInternationalIdcardResponse self = new RecognizeInternationalIdcardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeInternationalIdcardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeInternationalIdcardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeInternationalIdcardResponse setBody(RecognizeInternationalIdcardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeInternationalIdcardResponseBody getBody() {
        return this.body;
    }

}
