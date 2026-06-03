// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTypeDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogTypeDistributionResponseBody body;

    public static GetLogTypeDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogTypeDistributionResponse self = new GetLogTypeDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetLogTypeDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogTypeDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogTypeDistributionResponse setBody(GetLogTypeDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogTypeDistributionResponseBody getBody() {
        return this.body;
    }

}
