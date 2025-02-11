// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetServiceFuncStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceFuncStatusResponseBody body;

    public static GetServiceFuncStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceFuncStatusResponse self = new GetServiceFuncStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceFuncStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceFuncStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceFuncStatusResponse setBody(GetServiceFuncStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceFuncStatusResponseBody getBody() {
        return this.body;
    }

}
