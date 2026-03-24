// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousSecurityEventyStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspiciousSecurityEventyStatisticsResponseBody body;

    public static DescribeSuspiciousSecurityEventyStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousSecurityEventyStatisticsResponse self = new DescribeSuspiciousSecurityEventyStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousSecurityEventyStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspiciousSecurityEventyStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspiciousSecurityEventyStatisticsResponse setBody(DescribeSuspiciousSecurityEventyStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspiciousSecurityEventyStatisticsResponseBody getBody() {
        return this.body;
    }

}
