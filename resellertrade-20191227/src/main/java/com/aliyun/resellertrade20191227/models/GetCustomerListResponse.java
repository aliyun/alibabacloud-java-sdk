// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetCustomerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerListResponseBody body;

    public static GetCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponse self = new GetCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerListResponse setBody(GetCustomerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerListResponseBody getBody() {
        return this.body;
    }

}
