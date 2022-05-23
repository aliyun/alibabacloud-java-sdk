// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowProductListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeFlowProductListResponseBody body;

    public static GetFreeFlowProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowProductListResponse self = new GetFreeFlowProductListResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowProductListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeFlowProductListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFreeFlowProductListResponse setBody(GetFreeFlowProductListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeFlowProductListResponseBody getBody() {
        return this.body;
    }

}
