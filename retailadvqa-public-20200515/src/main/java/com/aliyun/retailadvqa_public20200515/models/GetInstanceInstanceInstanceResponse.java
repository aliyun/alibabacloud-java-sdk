// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceInstanceInstanceResponseBody body;

    public static GetInstanceInstanceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceInstanceResponse self = new GetInstanceInstanceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInstanceInstanceResponse setBody(GetInstanceInstanceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInstanceInstanceResponseBody getBody() {
        return this.body;
    }

}
