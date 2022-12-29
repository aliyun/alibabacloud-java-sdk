// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetCrowdDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCrowdDataResponseBody body;

    public static GetCrowdDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDataResponse self = new GetCrowdDataResponse();
        return TeaModel.build(map, self);
    }

    public GetCrowdDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrowdDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrowdDataResponse setBody(GetCrowdDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrowdDataResponseBody getBody() {
        return this.body;
    }

}
