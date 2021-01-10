// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnlineBuildpackResponseBody body;

    public static OnlineBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineBuildpackResponse self = new OnlineBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public OnlineBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineBuildpackResponse setBody(OnlineBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineBuildpackResponseBody getBody() {
        return this.body;
    }

}
