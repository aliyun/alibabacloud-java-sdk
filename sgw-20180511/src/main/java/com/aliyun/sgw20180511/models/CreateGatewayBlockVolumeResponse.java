// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayBlockVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewayBlockVolumeResponseBody body;

    public static CreateGatewayBlockVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayBlockVolumeResponse self = new CreateGatewayBlockVolumeResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayBlockVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayBlockVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayBlockVolumeResponse setBody(CreateGatewayBlockVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayBlockVolumeResponseBody getBody() {
        return this.body;
    }

}
