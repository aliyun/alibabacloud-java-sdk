// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeQrCodeResponseBody body;

    public static RecognizeQrCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeResponse self = new RecognizeQrCodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeQrCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeQrCodeResponse setBody(RecognizeQrCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeQrCodeResponseBody getBody() {
        return this.body;
    }

}
