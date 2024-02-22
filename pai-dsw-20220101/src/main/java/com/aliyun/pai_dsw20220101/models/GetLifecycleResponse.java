// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetLifecycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLifecycleResponseBody body;

    public static GetLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleResponse self = new GetLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public GetLifecycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLifecycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLifecycleResponse setBody(GetLifecycleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLifecycleResponseBody getBody() {
        return this.body;
    }

}
