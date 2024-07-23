// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEngineConfigResponseBody body;

    public static GetEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEngineConfigResponse self = new GetEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEngineConfigResponse setBody(GetEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEngineConfigResponseBody getBody() {
        return this.body;
    }

}
