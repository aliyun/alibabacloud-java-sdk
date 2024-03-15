// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHandwritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeHandwritingResponseBody body;

    public static RecognizeHandwritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandwritingResponse self = new RecognizeHandwritingResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHandwritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHandwritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHandwritingResponse setBody(RecognizeHandwritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHandwritingResponseBody getBody() {
        return this.body;
    }

}
