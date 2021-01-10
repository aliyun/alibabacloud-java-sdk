// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASSlsLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCASSlsLogstoreResponseBody body;

    public static GetCASSlsLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCASSlsLogstoreResponse self = new GetCASSlsLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public GetCASSlsLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCASSlsLogstoreResponse setBody(GetCASSlsLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCASSlsLogstoreResponseBody getBody() {
        return this.body;
    }

}
