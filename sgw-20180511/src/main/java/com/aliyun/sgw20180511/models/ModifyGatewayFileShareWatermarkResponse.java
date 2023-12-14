// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayFileShareWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGatewayFileShareWatermarkResponseBody body;

    public static ModifyGatewayFileShareWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayFileShareWatermarkResponse self = new ModifyGatewayFileShareWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayFileShareWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayFileShareWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGatewayFileShareWatermarkResponse setBody(ModifyGatewayFileShareWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayFileShareWatermarkResponseBody getBody() {
        return this.body;
    }

}
