// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneEngineConfigResponseBody body;

    public static CloneEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneEngineConfigResponse self = new CloneEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloneEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneEngineConfigResponse setBody(CloneEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneEngineConfigResponseBody getBody() {
        return this.body;
    }

}
