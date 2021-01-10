// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPDbnodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateODPDbnodesResponseBody body;

    public static CreateODPDbnodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateODPDbnodesResponse self = new CreateODPDbnodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateODPDbnodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateODPDbnodesResponse setBody(CreateODPDbnodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateODPDbnodesResponseBody getBody() {
        return this.body;
    }

}
