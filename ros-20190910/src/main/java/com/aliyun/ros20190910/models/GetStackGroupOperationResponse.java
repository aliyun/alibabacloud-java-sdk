// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackGroupOperationResponseBody body;

    public static GetStackGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationResponse self = new GetStackGroupOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetStackGroupOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackGroupOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackGroupOperationResponse setBody(GetStackGroupOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackGroupOperationResponseBody getBody() {
        return this.body;
    }

}
