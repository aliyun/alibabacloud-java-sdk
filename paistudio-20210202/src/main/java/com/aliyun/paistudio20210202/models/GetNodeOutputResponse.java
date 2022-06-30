// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeOutputResponseBody body;

    public static GetNodeOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOutputResponse self = new GetNodeOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeOutputResponse setBody(GetNodeOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeOutputResponseBody getBody() {
        return this.body;
    }

}
