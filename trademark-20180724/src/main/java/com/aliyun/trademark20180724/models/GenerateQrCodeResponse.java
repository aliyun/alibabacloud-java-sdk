// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GenerateQrCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateQrCodeResponseBody body;

    public static GenerateQrCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateQrCodeResponse self = new GenerateQrCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateQrCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateQrCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateQrCodeResponse setBody(GenerateQrCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateQrCodeResponseBody getBody() {
        return this.body;
    }

}
