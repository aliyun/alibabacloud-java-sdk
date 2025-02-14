// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAppAuthDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServerlessAppAuthDetailResponseBody body;

    public static GetServerlessAppAuthDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAppAuthDetailResponse self = new GetServerlessAppAuthDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetServerlessAppAuthDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServerlessAppAuthDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServerlessAppAuthDetailResponse setBody(GetServerlessAppAuthDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServerlessAppAuthDetailResponseBody getBody() {
        return this.body;
    }

}
