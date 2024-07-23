// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEngineConfigResponseBody body;

    public static CreateEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineConfigResponse self = new CreateEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEngineConfigResponse setBody(CreateEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEngineConfigResponseBody getBody() {
        return this.body;
    }

}
