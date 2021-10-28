// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayBlockVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayBlockVolumesResponseBody body;

    public static DeleteGatewayBlockVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayBlockVolumesResponse self = new DeleteGatewayBlockVolumesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayBlockVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayBlockVolumesResponse setBody(DeleteGatewayBlockVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayBlockVolumesResponseBody getBody() {
        return this.body;
    }

}
