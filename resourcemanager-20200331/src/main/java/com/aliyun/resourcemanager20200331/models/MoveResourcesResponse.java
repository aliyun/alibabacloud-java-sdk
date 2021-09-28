// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class MoveResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveResourcesResponseBody body;

    public static MoveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveResourcesResponse self = new MoveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public MoveResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveResourcesResponse setBody(MoveResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveResourcesResponseBody getBody() {
        return this.body;
    }

}
