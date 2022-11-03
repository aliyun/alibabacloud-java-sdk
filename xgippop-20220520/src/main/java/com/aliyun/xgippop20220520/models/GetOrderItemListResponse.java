// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetOrderItemListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrderItemListResponseBody body;

    public static GetOrderItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderItemListResponse self = new GetOrderItemListResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderItemListResponse setBody(GetOrderItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderItemListResponseBody getBody() {
        return this.body;
    }

}
