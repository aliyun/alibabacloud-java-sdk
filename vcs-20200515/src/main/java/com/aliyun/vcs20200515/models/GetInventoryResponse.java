// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInventoryResponseBody body;

    public static GetInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryResponse self = new GetInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInventoryResponse setBody(GetInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInventoryResponseBody getBody() {
        return this.body;
    }

}
