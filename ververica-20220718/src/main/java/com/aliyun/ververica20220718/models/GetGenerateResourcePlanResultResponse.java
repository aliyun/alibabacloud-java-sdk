// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetGenerateResourcePlanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGenerateResourcePlanResultResponseBody body;

    public static GetGenerateResourcePlanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGenerateResourcePlanResultResponse self = new GetGenerateResourcePlanResultResponse();
        return TeaModel.build(map, self);
    }

    public GetGenerateResourcePlanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGenerateResourcePlanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGenerateResourcePlanResultResponse setBody(GetGenerateResourcePlanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGenerateResourcePlanResultResponseBody getBody() {
        return this.body;
    }

}
