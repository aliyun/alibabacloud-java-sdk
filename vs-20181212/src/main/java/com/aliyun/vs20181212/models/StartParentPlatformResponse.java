// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartParentPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartParentPlatformResponse setBody(StartParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public StartParentPlatformResponseBody getBody() {
        return this.body;
    }

}
