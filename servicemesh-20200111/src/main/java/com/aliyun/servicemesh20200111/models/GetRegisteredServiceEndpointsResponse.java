// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegisteredServiceEndpointsResponseBody body;

    public static GetRegisteredServiceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsResponse self = new GetRegisteredServiceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegisteredServiceEndpointsResponse setBody(GetRegisteredServiceEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegisteredServiceEndpointsResponseBody getBody() {
        return this.body;
    }

}
