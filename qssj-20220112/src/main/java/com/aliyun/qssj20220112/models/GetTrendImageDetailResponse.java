// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendImageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrendImageDetailResponseBody body;

    public static GetTrendImageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendImageDetailResponse self = new GetTrendImageDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendImageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendImageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendImageDetailResponse setBody(GetTrendImageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendImageDetailResponseBody getBody() {
        return this.body;
    }

}
