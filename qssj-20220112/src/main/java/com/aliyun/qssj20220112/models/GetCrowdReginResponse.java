// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdReginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCrowdReginResponseBody body;

    public static GetCrowdReginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdReginResponse self = new GetCrowdReginResponse();
        return TeaModel.build(map, self);
    }

    public GetCrowdReginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrowdReginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrowdReginResponse setBody(GetCrowdReginResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdReginResponseBody getBody() {
        return this.body;
    }

}
