// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RestartAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartAppInstanceResponseBody body;

    public static RestartAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartAppInstanceResponse self = new RestartAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartAppInstanceResponse setBody(RestartAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartAppInstanceResponseBody getBody() {
        return this.body;
    }

}
