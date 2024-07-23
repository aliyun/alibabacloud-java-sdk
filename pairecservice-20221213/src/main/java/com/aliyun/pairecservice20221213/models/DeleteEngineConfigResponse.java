// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEngineConfigResponseBody body;

    public static DeleteEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEngineConfigResponse self = new DeleteEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEngineConfigResponse setBody(DeleteEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEngineConfigResponseBody getBody() {
        return this.body;
    }

}
