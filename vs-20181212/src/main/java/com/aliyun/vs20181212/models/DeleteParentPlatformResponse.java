// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteParentPlatformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteParentPlatformResponseBody body;

    public static DeleteParentPlatformResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParentPlatformResponse self = new DeleteParentPlatformResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParentPlatformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParentPlatformResponse setBody(DeleteParentPlatformResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParentPlatformResponseBody getBody() {
        return this.body;
    }

}
