// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateODPJobsSqlbatchResponseBody body;

    public static CreateODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateODPJobsSqlbatchResponse self = new CreateODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateODPJobsSqlbatchResponse setBody(CreateODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
