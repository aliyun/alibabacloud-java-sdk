// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RemoveTagsFromGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTagsFromGatewayResponseBody body;

    public static RemoveTagsFromGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromGatewayResponse self = new RemoveTagsFromGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTagsFromGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTagsFromGatewayResponse setBody(RemoveTagsFromGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagsFromGatewayResponseBody getBody() {
        return this.body;
    }

}
