// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetItemInstListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetItemInstListResponseBody body;

    public static GetItemInstListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemInstListResponse self = new GetItemInstListResponse();
        return TeaModel.build(map, self);
    }

    public GetItemInstListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemInstListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetItemInstListResponse setBody(GetItemInstListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemInstListResponseBody getBody() {
        return this.body;
    }

}
