// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrendStatisticResponseBody body;

    public static GetTrendStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrendStatisticResponse self = new GetTrendStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetTrendStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrendStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrendStatisticResponse setBody(GetTrendStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrendStatisticResponseBody getBody() {
        return this.body;
    }

}
