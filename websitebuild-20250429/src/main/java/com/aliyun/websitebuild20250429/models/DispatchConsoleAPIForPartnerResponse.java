// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DispatchConsoleAPIForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DispatchConsoleAPIForPartnerResponseBody body;

    public static DispatchConsoleAPIForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DispatchConsoleAPIForPartnerResponse self = new DispatchConsoleAPIForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public DispatchConsoleAPIForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DispatchConsoleAPIForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DispatchConsoleAPIForPartnerResponse setBody(DispatchConsoleAPIForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DispatchConsoleAPIForPartnerResponseBody getBody() {
        return this.body;
    }

}
