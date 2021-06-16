// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class HeartBeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HeartBeatResponseBody body;

    public static HeartBeatResponse build(java.util.Map<String, ?> map) throws Exception {
        HeartBeatResponse self = new HeartBeatResponse();
        return TeaModel.build(map, self);
    }

    public HeartBeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HeartBeatResponse setBody(HeartBeatResponseBody body) {
        this.body = body;
        return this;
    }
    public HeartBeatResponseBody getBody() {
        return this.body;
    }

}
