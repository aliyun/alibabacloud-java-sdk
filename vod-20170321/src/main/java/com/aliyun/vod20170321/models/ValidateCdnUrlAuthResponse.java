// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ValidateCdnUrlAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateCdnUrlAuthResponseBody body;

    public static ValidateCdnUrlAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateCdnUrlAuthResponse self = new ValidateCdnUrlAuthResponse();
        return TeaModel.build(map, self);
    }

    public ValidateCdnUrlAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateCdnUrlAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateCdnUrlAuthResponse setBody(ValidateCdnUrlAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateCdnUrlAuthResponseBody getBody() {
        return this.body;
    }

}
