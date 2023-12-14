// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayBlockVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGatewayBlockVolumeResponseBody body;

    public static ModifyGatewayBlockVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayBlockVolumeResponse self = new ModifyGatewayBlockVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayBlockVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayBlockVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGatewayBlockVolumeResponse setBody(ModifyGatewayBlockVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayBlockVolumeResponseBody getBody() {
        return this.body;
    }

}
