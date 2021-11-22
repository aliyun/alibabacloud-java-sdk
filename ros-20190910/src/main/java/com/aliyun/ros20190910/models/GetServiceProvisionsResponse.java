// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetServiceProvisionsResponse setBody(GetServiceProvisionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceProvisionsResponseBody getBody() {
        return this.body;
    }

}
