// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackEventDetailResponseBody body;

    public static GetAttackEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackEventDetailResponse self = new GetAttackEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackEventDetailResponse setBody(GetAttackEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackEventDetailResponseBody getBody() {
        return this.body;
    }

}
