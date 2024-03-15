// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeSocialSecurityCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeSocialSecurityCardResponseBody body;

    public static RecognizeSocialSecurityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSocialSecurityCardResponse self = new RecognizeSocialSecurityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeSocialSecurityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeSocialSecurityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeSocialSecurityCardResponse setBody(RecognizeSocialSecurityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeSocialSecurityCardResponseBody getBody() {
        return this.body;
    }

}
