// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetObjectTotalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetObjectTotalResponseBody body;

    public static GetObjectTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTotalResponse self = new GetObjectTotalResponse();
        return TeaModel.build(map, self);
    }

    public GetObjectTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetObjectTotalResponse setBody(GetObjectTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetObjectTotalResponseBody getBody() {
        return this.body;
    }

}
