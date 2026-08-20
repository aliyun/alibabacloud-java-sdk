// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelDeploymentResourcesResponseBody body;

    public static GetModelDeploymentResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentResourcesResponse self = new GetModelDeploymentResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelDeploymentResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelDeploymentResourcesResponse setBody(GetModelDeploymentResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelDeploymentResourcesResponseBody getBody() {
        return this.body;
    }

}
