// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeployDeploymentDraftResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeployDeploymentDraftResultResponseBody body;

    public static GetDeployDeploymentDraftResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDeploymentDraftResultResponse self = new GetDeployDeploymentDraftResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDeployDeploymentDraftResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeployDeploymentDraftResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeployDeploymentDraftResultResponse setBody(GetDeployDeploymentDraftResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeployDeploymentDraftResultResponseBody getBody() {
        return this.body;
    }

}
