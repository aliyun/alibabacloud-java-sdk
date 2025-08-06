// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCustomerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerConfigResponseBody body;

    public static GetCustomerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerConfigResponse self = new GetCustomerConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerConfigResponse setBody(GetCustomerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerConfigResponseBody getBody() {
        return this.body;
    }

}
