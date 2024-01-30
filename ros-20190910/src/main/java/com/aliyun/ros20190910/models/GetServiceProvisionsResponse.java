// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceProvisionsResponseBody body;

    public static GetServiceProvisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvisionsResponse self = new GetServiceProvisionsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceProvisionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceProvisionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceProvisionsResponse setBody(GetServiceProvisionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceProvisionsResponseBody getBody() {
        return this.body;
    }

}
