// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeFlowUsageStatisticResponseBody body;

    public static GetFreeFlowUsageStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageStatisticResponse self = new GetFreeFlowUsageStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeFlowUsageStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFreeFlowUsageStatisticResponse setBody(GetFreeFlowUsageStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeFlowUsageStatisticResponseBody getBody() {
        return this.body;
    }

}
