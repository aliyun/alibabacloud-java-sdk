// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class RestartFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartFileSharesResponseBody body;

    public static RestartFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartFileSharesResponse self = new RestartFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public RestartFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartFileSharesResponse setBody(RestartFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartFileSharesResponseBody getBody() {
        return this.body;
    }

}
