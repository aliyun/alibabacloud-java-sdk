// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartParentPlatformResponseBody body;

    public static StartParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        StartParentPlatformResponse self = new StartParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public StartParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartParentPlatformResponse setBody(StartParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public StartParentPlatformResponseBody getBody() {
        return this.body;
    }

}
