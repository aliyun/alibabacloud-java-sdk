// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTaskStatusResponseBody body;

    public static SetTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTaskStatusResponse self = new SetTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTaskStatusResponse setBody(SetTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTaskStatusResponseBody getBody() {
        return this.body;
    }

}
