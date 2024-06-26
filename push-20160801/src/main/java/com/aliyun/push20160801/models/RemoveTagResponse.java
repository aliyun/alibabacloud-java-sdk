// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class RemoveTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTagResponse setBody(RemoveTagResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagResponseBody getBody() {
        return this.body;
    }

}
