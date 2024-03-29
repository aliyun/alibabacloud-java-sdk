// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListPakRenderExpressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListPakRenderExpressionResponseBody body;

    public static PopListPakRenderExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListPakRenderExpressionResponse self = new PopListPakRenderExpressionResponse();
        return TeaModel.build(map, self);
    }

    public PopListPakRenderExpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListPakRenderExpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListPakRenderExpressionResponse setBody(PopListPakRenderExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListPakRenderExpressionResponseBody getBody() {
        return this.body;
    }

}
