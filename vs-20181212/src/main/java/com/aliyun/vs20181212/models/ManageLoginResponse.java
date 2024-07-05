// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ManageLoginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageLoginResponseBody body;

    public static ManageLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageLoginResponse self = new ManageLoginResponse();
        return TeaModel.build(map, self);
    }

    public ManageLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageLoginResponse setBody(ManageLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageLoginResponseBody getBody() {
        return this.body;
    }

}
