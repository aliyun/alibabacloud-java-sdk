// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeSocialSecurityCardVersionIIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeSocialSecurityCardVersionIIResponseBody body;

    public static RecognizeSocialSecurityCardVersionIIResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSocialSecurityCardVersionIIResponse self = new RecognizeSocialSecurityCardVersionIIResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeSocialSecurityCardVersionIIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeSocialSecurityCardVersionIIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeSocialSecurityCardVersionIIResponse setBody(RecognizeSocialSecurityCardVersionIIResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeSocialSecurityCardVersionIIResponseBody getBody() {
        return this.body;
    }

}
