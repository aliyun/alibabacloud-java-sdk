// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosFlowUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQosFlowUsageResponseBody body;

    public static GetQosFlowUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQosFlowUsageResponse self = new GetQosFlowUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetQosFlowUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQosFlowUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQosFlowUsageResponse setBody(GetQosFlowUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQosFlowUsageResponseBody getBody() {
        return this.body;
    }

}
