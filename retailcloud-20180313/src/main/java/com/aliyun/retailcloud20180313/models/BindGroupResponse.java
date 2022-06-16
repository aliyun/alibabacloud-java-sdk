// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BindGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindGroupResponseBody body;

    public static BindGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BindGroupResponse self = new BindGroupResponse();
        return TeaModel.build(map, self);
    }

    public BindGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindGroupResponse setBody(BindGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BindGroupResponseBody getBody() {
        return this.body;
    }

}
