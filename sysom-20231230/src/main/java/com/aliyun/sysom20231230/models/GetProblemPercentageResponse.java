// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetProblemPercentageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProblemPercentageResponseBody body;

    public static GetProblemPercentageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPercentageResponse self = new GetProblemPercentageResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemPercentageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemPercentageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProblemPercentageResponse setBody(GetProblemPercentageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemPercentageResponseBody getBody() {
        return this.body;
    }

}
