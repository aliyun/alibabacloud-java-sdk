// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeFlowInstanceResponseBody body;

    public static GetFreeFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowInstanceResponse self = new GetFreeFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFreeFlowInstanceResponse setBody(GetFreeFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
