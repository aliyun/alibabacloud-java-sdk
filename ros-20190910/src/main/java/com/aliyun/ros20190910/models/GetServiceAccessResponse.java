// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceAccessResponseBody body;

    public static GetServiceAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceAccessResponse self = new GetServiceAccessResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceAccessResponse setBody(GetServiceAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceAccessResponseBody getBody() {
        return this.body;
    }

}
