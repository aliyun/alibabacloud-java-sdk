// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetCrowdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrowdResponseBody body;

    public static GetCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdResponse self = new GetCrowdResponse();
        return TeaModel.build(map, self);
    }

    public GetCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrowdResponse setBody(GetCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdResponseBody getBody() {
        return this.body;
    }

}
