// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RemoveEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveEventResponseBody body;

    public static RemoveEventResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEventResponse self = new RemoveEventResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEventResponse setBody(RemoveEventResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEventResponseBody getBody() {
        return this.body;
    }

}
