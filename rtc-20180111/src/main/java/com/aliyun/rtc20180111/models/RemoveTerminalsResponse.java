// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveTerminalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTerminalsResponseBody body;

    public static RemoveTerminalsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTerminalsResponse self = new RemoveTerminalsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTerminalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTerminalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTerminalsResponse setBody(RemoveTerminalsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTerminalsResponseBody getBody() {
        return this.body;
    }

}
