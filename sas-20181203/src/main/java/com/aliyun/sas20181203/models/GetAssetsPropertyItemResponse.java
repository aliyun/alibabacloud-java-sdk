// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAssetsPropertyItemResponseBody body;

    public static GetAssetsPropertyItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyItemResponse self = new GetAssetsPropertyItemResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetsPropertyItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetsPropertyItemResponse setBody(GetAssetsPropertyItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetsPropertyItemResponseBody getBody() {
        return this.body;
    }

}
