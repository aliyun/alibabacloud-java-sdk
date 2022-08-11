// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetItemListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetItemListResponseBody body;

    public static GetItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemListResponse self = new GetItemListResponse();
        return TeaModel.build(map, self);
    }

    public GetItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetItemListResponse setBody(GetItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemListResponseBody getBody() {
        return this.body;
    }

}
