// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateParentPlatformResponse setBody(CreateParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParentPlatformResponseBody getBody() {
        return this.body;
    }

}
