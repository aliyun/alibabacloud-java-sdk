// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeJanpaneseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeJanpaneseResponseBody body;

    public static RecognizeJanpaneseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeJanpaneseResponse self = new RecognizeJanpaneseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeJanpaneseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeJanpaneseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeJanpaneseResponse setBody(RecognizeJanpaneseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeJanpaneseResponseBody getBody() {
        return this.body;
    }

}
