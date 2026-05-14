// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class LoginPolarClawChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginPolarClawChannelResponseBody body;

    public static LoginPolarClawChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginPolarClawChannelResponse self = new LoginPolarClawChannelResponse();
        return TeaModel.build(map, self);
    }

    public LoginPolarClawChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginPolarClawChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginPolarClawChannelResponse setBody(LoginPolarClawChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginPolarClawChannelResponseBody getBody() {
        return this.body;
    }

}
