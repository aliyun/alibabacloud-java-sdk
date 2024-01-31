// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetsPropertyDetailResponseBody body;

    public static GetAssetsPropertyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyDetailResponse self = new GetAssetsPropertyDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetsPropertyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetsPropertyDetailResponse setBody(GetAssetsPropertyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetsPropertyDetailResponseBody getBody() {
        return this.body;
    }

}
