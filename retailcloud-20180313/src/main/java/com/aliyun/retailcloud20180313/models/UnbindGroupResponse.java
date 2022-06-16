// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UnbindGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindGroupResponseBody body;

    public static UnbindGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindGroupResponse self = new UnbindGroupResponse();
        return TeaModel.build(map, self);
    }

    public UnbindGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindGroupResponse setBody(UnbindGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindGroupResponseBody getBody() {
        return this.body;
    }

}
