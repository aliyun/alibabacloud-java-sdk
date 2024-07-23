// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEngineConfigResponseBody body;

    public static UpdateEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineConfigResponse self = new UpdateEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEngineConfigResponse setBody(UpdateEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEngineConfigResponseBody getBody() {
        return this.body;
    }

}
