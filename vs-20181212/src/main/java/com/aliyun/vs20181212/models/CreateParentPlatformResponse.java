// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateParentPlatformResponseBody body;

    public static CreateParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParentPlatformResponse self = new CreateParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public CreateParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParentPlatformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParentPlatformResponse setBody(CreateParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParentPlatformResponseBody getBody() {
        return this.body;
    }

}
