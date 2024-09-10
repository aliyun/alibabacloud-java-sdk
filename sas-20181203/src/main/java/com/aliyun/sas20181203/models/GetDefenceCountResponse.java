// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDefenceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefenceCountResponseBody body;

    public static GetDefenceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefenceCountResponse self = new GetDefenceCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDefenceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefenceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefenceCountResponse setBody(GetDefenceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefenceCountResponseBody getBody() {
        return this.body;
    }

}
