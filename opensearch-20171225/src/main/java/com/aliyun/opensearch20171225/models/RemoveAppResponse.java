// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAppResponseBody body;

    public static RemoveAppResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppResponse self = new RemoveAppResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAppResponse setBody(RemoveAppResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAppResponseBody getBody() {
        return this.body;
    }

}
