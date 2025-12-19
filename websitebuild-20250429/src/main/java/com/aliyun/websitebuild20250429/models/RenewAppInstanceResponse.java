// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RenewAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAppInstanceResponseBody body;

    public static RenewAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAppInstanceResponse self = new RenewAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAppInstanceResponse setBody(RenewAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAppInstanceResponseBody getBody() {
        return this.body;
    }

}
