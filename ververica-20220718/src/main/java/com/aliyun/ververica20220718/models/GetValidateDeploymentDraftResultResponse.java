// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetValidateDeploymentDraftResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetValidateDeploymentDraftResultResponseBody body;

    public static GetValidateDeploymentDraftResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidateDeploymentDraftResultResponse self = new GetValidateDeploymentDraftResultResponse();
        return TeaModel.build(map, self);
    }

    public GetValidateDeploymentDraftResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidateDeploymentDraftResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidateDeploymentDraftResultResponse setBody(GetValidateDeploymentDraftResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidateDeploymentDraftResultResponseBody getBody() {
        return this.body;
    }

}
