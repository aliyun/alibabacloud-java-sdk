// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspiciousOverallConfigResponseBody body;

    public static DescribeSuspiciousOverallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousOverallConfigResponse self = new DescribeSuspiciousOverallConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousOverallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspiciousOverallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspiciousOverallConfigResponse setBody(DescribeSuspiciousOverallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspiciousOverallConfigResponseBody getBody() {
        return this.body;
    }

}
