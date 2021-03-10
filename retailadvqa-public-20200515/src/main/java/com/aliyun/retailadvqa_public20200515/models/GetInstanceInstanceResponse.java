// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceInstanceResponseBody body;

    public static GetInstanceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceResponse self = new GetInstanceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInstanceResponse setBody(GetInstanceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInstanceResponseBody getBody() {
        return this.body;
    }

}
