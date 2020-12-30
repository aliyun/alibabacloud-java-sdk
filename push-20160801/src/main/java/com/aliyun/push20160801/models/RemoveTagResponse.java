// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class RemoveTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTagResponseBody body;

    public static RemoveTagResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagResponse self = new RemoveTagResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTagResponse setBody(RemoveTagResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagResponseBody getBody() {
        return this.body;
    }

}
