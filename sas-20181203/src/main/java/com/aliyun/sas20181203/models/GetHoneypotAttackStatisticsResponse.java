// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHoneypotAttackStatisticsResponseBody body;

    public static GetHoneypotAttackStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotAttackStatisticsResponse self = new GetHoneypotAttackStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotAttackStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotAttackStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotAttackStatisticsResponse setBody(GetHoneypotAttackStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotAttackStatisticsResponseBody getBody() {
        return this.body;
    }

}
