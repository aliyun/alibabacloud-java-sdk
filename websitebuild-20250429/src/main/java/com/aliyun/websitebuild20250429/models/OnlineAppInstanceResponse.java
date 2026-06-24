// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OnlineAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineAppInstanceResponseBody body;

    public static OnlineAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineAppInstanceResponse self = new OnlineAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public OnlineAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineAppInstanceResponse setBody(OnlineAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineAppInstanceResponseBody getBody() {
        return this.body;
    }

}
