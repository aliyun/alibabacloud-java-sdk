// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetInventoryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInventoryInfoResponseBody body;

    public static GetInventoryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryInfoResponse self = new GetInventoryInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInventoryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInventoryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInventoryInfoResponse setBody(GetInventoryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInventoryInfoResponseBody getBody() {
        return this.body;
    }

}
