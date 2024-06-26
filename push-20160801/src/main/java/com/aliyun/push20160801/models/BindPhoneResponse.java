// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPhoneResponseBody body;

    public static BindPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPhoneResponse self = new BindPhoneResponse();
        return TeaModel.build(map, self);
    }

    public BindPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPhoneResponse setBody(BindPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPhoneResponseBody getBody() {
        return this.body;
    }

}
