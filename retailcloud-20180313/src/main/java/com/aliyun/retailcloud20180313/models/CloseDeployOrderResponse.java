// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CloseDeployOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloseDeployOrderResponseBody body;

    public static CloseDeployOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDeployOrderResponse self = new CloseDeployOrderResponse();
        return TeaModel.build(map, self);
    }

    public CloseDeployOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDeployOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseDeployOrderResponse setBody(CloseDeployOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDeployOrderResponseBody getBody() {
        return this.body;
    }

}
