// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegisteredServiceNamespacesResponseBody body;

    public static GetRegisteredServiceNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceNamespacesResponse self = new GetRegisteredServiceNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegisteredServiceNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegisteredServiceNamespacesResponse setBody(GetRegisteredServiceNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegisteredServiceNamespacesResponseBody getBody() {
        return this.body;
    }

}
