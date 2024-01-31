// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHoneypotStatisticsResponseBody body;

    public static GetHoneypotStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotStatisticsResponse self = new GetHoneypotStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotStatisticsResponse setBody(GetHoneypotStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotStatisticsResponseBody getBody() {
        return this.body;
    }

}
