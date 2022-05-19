// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceTypeResponseBody body;

    public static GetResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponse self = new GetResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTypeResponse setBody(GetResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTypeResponseBody getBody() {
        return this.body;
    }

}
