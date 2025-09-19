// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackPathEventDetailResponseBody body;

    public static GetAttackPathEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackPathEventDetailResponse self = new GetAttackPathEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackPathEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackPathEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackPathEventDetailResponse setBody(GetAttackPathEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackPathEventDetailResponseBody getBody() {
        return this.body;
    }

}
