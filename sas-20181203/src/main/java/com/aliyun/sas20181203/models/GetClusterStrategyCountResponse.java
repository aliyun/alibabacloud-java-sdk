// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterStrategyCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterStrategyCountResponseBody body;

    public static GetClusterStrategyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterStrategyCountResponse self = new GetClusterStrategyCountResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterStrategyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterStrategyCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterStrategyCountResponse setBody(GetClusterStrategyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterStrategyCountResponseBody getBody() {
        return this.body;
    }

}
