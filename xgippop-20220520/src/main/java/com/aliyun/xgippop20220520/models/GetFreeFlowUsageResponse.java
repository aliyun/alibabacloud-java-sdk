// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeFlowUsageResponseBody body;

    public static GetFreeFlowUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageResponse self = new GetFreeFlowUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeFlowUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFreeFlowUsageResponse setBody(GetFreeFlowUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeFlowUsageResponseBody getBody() {
        return this.body;
    }

}
