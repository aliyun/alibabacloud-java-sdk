// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpdateGatewayBlockVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayBlockVolumeResponseBody body;

    public static UpdateGatewayBlockVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayBlockVolumeResponse self = new UpdateGatewayBlockVolumeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayBlockVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayBlockVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayBlockVolumeResponse setBody(UpdateGatewayBlockVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayBlockVolumeResponseBody getBody() {
        return this.body;
    }

}
