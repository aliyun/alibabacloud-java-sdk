// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartInstancesResponseBody body;

    public static RestartInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesResponse self = new RestartInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RestartInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartInstancesResponse setBody(RestartInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartInstancesResponseBody getBody() {
        return this.body;
    }

}
