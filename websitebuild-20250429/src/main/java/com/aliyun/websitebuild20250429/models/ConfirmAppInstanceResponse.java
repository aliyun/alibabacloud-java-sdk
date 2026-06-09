// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ConfirmAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmAppInstanceResponseBody body;

    public static ConfirmAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAppInstanceResponse self = new ConfirmAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAppInstanceResponse setBody(ConfirmAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAppInstanceResponseBody getBody() {
        return this.body;
    }

}
