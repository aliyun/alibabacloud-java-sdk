// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStackInstanceResponseBody body;

    public static GetStackInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceResponse self = new GetStackInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackInstanceResponse setBody(GetStackInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackInstanceResponseBody getBody() {
        return this.body;
    }

}
