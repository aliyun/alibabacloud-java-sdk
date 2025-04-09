// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetBaseStrategyPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBaseStrategyPeriodResponseBody body;

    public static GetBaseStrategyPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaseStrategyPeriodResponse self = new GetBaseStrategyPeriodResponse();
        return TeaModel.build(map, self);
    }

    public GetBaseStrategyPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaseStrategyPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBaseStrategyPeriodResponse setBody(GetBaseStrategyPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaseStrategyPeriodResponseBody getBody() {
        return this.body;
    }

}
