// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetDeploymentDefaultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeploymentDefaultsResponseBody body;

    public static GetDeploymentDefaultsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDefaultsResponse self = new GetDeploymentDefaultsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDefaultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentDefaultsResponse setBody(GetDeploymentDefaultsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentDefaultsResponseBody getBody() {
        return this.body;
    }

}
