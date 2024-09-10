// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackTypeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackTypeListResponseBody body;

    public static GetAttackTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackTypeListResponse self = new GetAttackTypeListResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackTypeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackTypeListResponse setBody(GetAttackTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackTypeListResponseBody getBody() {
        return this.body;
    }

}
