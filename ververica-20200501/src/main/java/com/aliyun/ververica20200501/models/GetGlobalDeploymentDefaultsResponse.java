// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetGlobalDeploymentDefaultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGlobalDeploymentDefaultsResponseBody body;

    public static GetGlobalDeploymentDefaultsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalDeploymentDefaultsResponse self = new GetGlobalDeploymentDefaultsResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalDeploymentDefaultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalDeploymentDefaultsResponse setBody(GetGlobalDeploymentDefaultsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalDeploymentDefaultsResponseBody getBody() {
        return this.body;
    }

}
