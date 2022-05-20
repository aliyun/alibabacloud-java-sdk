// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class GetFreeFlowStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeFlowStatusResponseBody body;

    public static GetFreeFlowStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowStatusResponse self = new GetFreeFlowStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeFlowStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFreeFlowStatusResponse setBody(GetFreeFlowStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeFlowStatusResponseBody getBody() {
        return this.body;
    }

}
