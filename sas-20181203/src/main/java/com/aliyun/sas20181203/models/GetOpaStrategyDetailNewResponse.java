// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaStrategyDetailNewResponseBody body;

    public static GetOpaStrategyDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaStrategyDetailNewResponse self = new GetOpaStrategyDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaStrategyDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaStrategyDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaStrategyDetailNewResponse setBody(GetOpaStrategyDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaStrategyDetailNewResponseBody getBody() {
        return this.body;
    }

}
