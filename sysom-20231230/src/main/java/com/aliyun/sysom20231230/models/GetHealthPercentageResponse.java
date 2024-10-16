// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHealthPercentageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHealthPercentageResponseBody body;

    public static GetHealthPercentageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthPercentageResponse self = new GetHealthPercentageResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthPercentageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHealthPercentageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHealthPercentageResponse setBody(GetHealthPercentageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHealthPercentageResponseBody getBody() {
        return this.body;
    }

}
