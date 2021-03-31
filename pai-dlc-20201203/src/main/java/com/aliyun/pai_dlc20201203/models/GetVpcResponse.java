// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVpcResponseBody body;

    public static GetVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcResponse self = new GetVpcResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcResponse setBody(GetVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcResponseBody getBody() {
        return this.body;
    }

}
