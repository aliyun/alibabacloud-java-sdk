// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayBlockVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ModifyGatewayBlockVolumeResponse setBody(ModifyGatewayBlockVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayBlockVolumeResponseBody getBody() {
        return this.body;
    }

}
