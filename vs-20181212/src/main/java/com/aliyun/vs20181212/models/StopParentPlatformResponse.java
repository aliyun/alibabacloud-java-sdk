// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopParentPlatformResponseBody body;

    public static StopParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        StopParentPlatformResponse self = new StopParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public StopParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopParentPlatformResponse setBody(StopParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public StopParentPlatformResponseBody getBody() {
        return this.body;
    }

}
