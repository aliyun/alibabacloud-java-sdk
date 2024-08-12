// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentDraftResponseBody body;

    public static GetDeploymentDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDraftResponse self = new GetDeploymentDraftResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentDraftResponse setBody(GetDeploymentDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentDraftResponseBody getBody() {
        return this.body;
    }

}
