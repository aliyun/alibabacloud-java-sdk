// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetSlsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServiceStatus body;

    public static GetSlsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsServiceResponse self = new GetSlsServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSlsServiceResponse setBody(ServiceStatus body) {
        this.body = body;
        return this;
    }
    public ServiceStatus getBody() {
        return this.body;
    }

}
